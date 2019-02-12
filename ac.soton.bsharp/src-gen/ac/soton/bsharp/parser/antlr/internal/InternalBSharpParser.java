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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_WS", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'package'", "':'", "'.'", "'From'", "'Import'", "'*'", "'Class'", "'['", "']'", "'('", "')'", "';'", "'<'", "'>'", "','", "'\\u00D7'", "'\\u2192'", "'\\uE102'", "'\\uE100'", "'\\u2194'", "'\\u2916'", "'\\u21F8'", "'\\u21A3'", "'\\u2900'", "'\\u21A0'", "'\\u2119'", "'where'", "'Datatype'", "'|'", "'Extend'", "'{'", "'}'", "'INFIX'", "'match'", "'Theorems'", "'\\u03BB'", "'\\u2200'", "'\\u2203'", "'\\u00B7'", "'\\u00AC'", "'\\u21D4'", "'\\u21D2'", "'='", "'\\u2260'", "'\\u2227'", "'\\u2228'", "'\\u2208'", "'Instance'"
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
    public static final int T__58=58;
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
    // InternalBSharp.g:346:1: ruleTopLevelImport returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )+ ( (lv_bodyElements_1_0= ruleTopLevelInstance ) )+ ) ;
    public final EObject ruleTopLevelImport() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_bodyElements_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:352:2: ( ( ( (lv_imports_0_0= ruleImport ) )+ ( (lv_bodyElements_1_0= ruleTopLevelInstance ) )+ ) )
            // InternalBSharp.g:353:2: ( ( (lv_imports_0_0= ruleImport ) )+ ( (lv_bodyElements_1_0= ruleTopLevelInstance ) )+ )
            {
            // InternalBSharp.g:353:2: ( ( (lv_imports_0_0= ruleImport ) )+ ( (lv_bodyElements_1_0= ruleTopLevelInstance ) )+ )
            // InternalBSharp.g:354:3: ( (lv_imports_0_0= ruleImport ) )+ ( (lv_bodyElements_1_0= ruleTopLevelInstance ) )+
            {
            // InternalBSharp.g:354:3: ( (lv_imports_0_0= ruleImport ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=14 && LA6_0<=15)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBSharp.g:355:4: (lv_imports_0_0= ruleImport )
            	    {
            	    // InternalBSharp.g:355:4: (lv_imports_0_0= ruleImport )
            	    // InternalBSharp.g:356:5: lv_imports_0_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getTopLevelImportAccess().getImportsImportParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTopLevelImportRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_0_0,
            	    						"ac.soton.bsharp.BSharp.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

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

            // InternalBSharp.g:373:3: ( (lv_bodyElements_1_0= ruleTopLevelInstance ) )+
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
            	    // InternalBSharp.g:374:4: (lv_bodyElements_1_0= ruleTopLevelInstance )
            	    {
            	    // InternalBSharp.g:374:4: (lv_bodyElements_1_0= ruleTopLevelInstance )
            	    // InternalBSharp.g:375:5: lv_bodyElements_1_0= ruleTopLevelInstance
            	    {

            	    					newCompositeNode(grammarAccess.getTopLevelImportAccess().getBodyElementsTopLevelInstanceParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_bodyElements_1_0=ruleTopLevelInstance();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTopLevelImportRule());
            	    					}
            	    					add(
            	    						current,
            	    						"bodyElements",
            	    						lv_bodyElements_1_0,
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
    // InternalBSharp.g:396:1: entryRuleTopLevelInstance returns [EObject current=null] : iv_ruleTopLevelInstance= ruleTopLevelInstance EOF ;
    public final EObject entryRuleTopLevelInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopLevelInstance = null;


        try {
            // InternalBSharp.g:396:57: (iv_ruleTopLevelInstance= ruleTopLevelInstance EOF )
            // InternalBSharp.g:397:2: iv_ruleTopLevelInstance= ruleTopLevelInstance EOF
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
    // InternalBSharp.g:403:1: ruleTopLevelInstance returns [EObject current=null] : (this_ClassDecl_0= ruleClassDecl | this_Extend_1= ruleExtend ) ;
    public final EObject ruleTopLevelInstance() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDecl_0 = null;

        EObject this_Extend_1 = null;



        	enterRule();

        try {
            // InternalBSharp.g:409:2: ( (this_ClassDecl_0= ruleClassDecl | this_Extend_1= ruleExtend ) )
            // InternalBSharp.g:410:2: (this_ClassDecl_0= ruleClassDecl | this_Extend_1= ruleExtend )
            {
            // InternalBSharp.g:410:2: (this_ClassDecl_0= ruleClassDecl | this_Extend_1= ruleExtend )
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
                    // InternalBSharp.g:411:3: this_ClassDecl_0= ruleClassDecl
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
                    // InternalBSharp.g:420:3: this_Extend_1= ruleExtend
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


    // $ANTLR start "entryRuleImport"
    // InternalBSharp.g:432:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalBSharp.g:432:47: (iv_ruleImport= ruleImport EOF )
            // InternalBSharp.g:433:2: iv_ruleImport= ruleImport EOF
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
    // InternalBSharp.g:439:1: ruleImport returns [EObject current=null] : (this_GlobalImport_0= ruleGlobalImport | this_LocalImport_1= ruleLocalImport ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        EObject this_GlobalImport_0 = null;

        EObject this_LocalImport_1 = null;



        	enterRule();

        try {
            // InternalBSharp.g:445:2: ( (this_GlobalImport_0= ruleGlobalImport | this_LocalImport_1= ruleLocalImport ) )
            // InternalBSharp.g:446:2: (this_GlobalImport_0= ruleGlobalImport | this_LocalImport_1= ruleLocalImport )
            {
            // InternalBSharp.g:446:2: (this_GlobalImport_0= ruleGlobalImport | this_LocalImport_1= ruleLocalImport )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            else if ( (LA9_0==15) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalBSharp.g:447:3: this_GlobalImport_0= ruleGlobalImport
                    {

                    			newCompositeNode(grammarAccess.getImportAccess().getGlobalImportParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GlobalImport_0=ruleGlobalImport();

                    state._fsp--;


                    			current = this_GlobalImport_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBSharp.g:456:3: this_LocalImport_1= ruleLocalImport
                    {

                    			newCompositeNode(grammarAccess.getImportAccess().getLocalImportParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LocalImport_1=ruleLocalImport();

                    state._fsp--;


                    			current = this_LocalImport_1;
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleGlobalImport"
    // InternalBSharp.g:468:1: entryRuleGlobalImport returns [EObject current=null] : iv_ruleGlobalImport= ruleGlobalImport EOF ;
    public final EObject entryRuleGlobalImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalImport = null;


        try {
            // InternalBSharp.g:468:53: (iv_ruleGlobalImport= ruleGlobalImport EOF )
            // InternalBSharp.g:469:2: iv_ruleGlobalImport= ruleGlobalImport EOF
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
    // InternalBSharp.g:475:1: ruleGlobalImport returns [EObject current=null] : (otherlv_0= 'From' ( (lv_project_1_0= ruleQualifiedName ) ) otherlv_2= 'Import' ( (lv_fileImports_3_0= ruleFileImport ) )+ ) ;
    public final EObject ruleGlobalImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_project_1_0 = null;

        EObject lv_fileImports_3_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:481:2: ( (otherlv_0= 'From' ( (lv_project_1_0= ruleQualifiedName ) ) otherlv_2= 'Import' ( (lv_fileImports_3_0= ruleFileImport ) )+ ) )
            // InternalBSharp.g:482:2: (otherlv_0= 'From' ( (lv_project_1_0= ruleQualifiedName ) ) otherlv_2= 'Import' ( (lv_fileImports_3_0= ruleFileImport ) )+ )
            {
            // InternalBSharp.g:482:2: (otherlv_0= 'From' ( (lv_project_1_0= ruleQualifiedName ) ) otherlv_2= 'Import' ( (lv_fileImports_3_0= ruleFileImport ) )+ )
            // InternalBSharp.g:483:3: otherlv_0= 'From' ( (lv_project_1_0= ruleQualifiedName ) ) otherlv_2= 'Import' ( (lv_fileImports_3_0= ruleFileImport ) )+
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGlobalImportAccess().getFromKeyword_0());
            		
            // InternalBSharp.g:487:3: ( (lv_project_1_0= ruleQualifiedName ) )
            // InternalBSharp.g:488:4: (lv_project_1_0= ruleQualifiedName )
            {
            // InternalBSharp.g:488:4: (lv_project_1_0= ruleQualifiedName )
            // InternalBSharp.g:489:5: lv_project_1_0= ruleQualifiedName
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
            		
            // InternalBSharp.g:510:3: ( (lv_fileImports_3_0= ruleFileImport ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBSharp.g:511:4: (lv_fileImports_3_0= ruleFileImport )
            	    {
            	    // InternalBSharp.g:511:4: (lv_fileImports_3_0= ruleFileImport )
            	    // InternalBSharp.g:512:5: lv_fileImports_3_0= ruleFileImport
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
    // InternalBSharp.g:533:1: entryRuleFileImport returns [EObject current=null] : iv_ruleFileImport= ruleFileImport EOF ;
    public final EObject entryRuleFileImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileImport = null;


        try {
            // InternalBSharp.g:533:51: (iv_ruleFileImport= ruleFileImport EOF )
            // InternalBSharp.g:534:2: iv_ruleFileImport= ruleFileImport EOF
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
    // InternalBSharp.g:540:1: ruleFileImport returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' (otherlv_2= '*' | ( (otherlv_3= RULE_ID ) ) ) )? ) ;
    public final EObject ruleFileImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalBSharp.g:546:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' (otherlv_2= '*' | ( (otherlv_3= RULE_ID ) ) ) )? ) )
            // InternalBSharp.g:547:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' (otherlv_2= '*' | ( (otherlv_3= RULE_ID ) ) ) )? )
            {
            // InternalBSharp.g:547:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' (otherlv_2= '*' | ( (otherlv_3= RULE_ID ) ) ) )? )
            // InternalBSharp.g:548:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' (otherlv_2= '*' | ( (otherlv_3= RULE_ID ) ) ) )?
            {
            // InternalBSharp.g:548:3: ( (otherlv_0= RULE_ID ) )
            // InternalBSharp.g:549:4: (otherlv_0= RULE_ID )
            {
            // InternalBSharp.g:549:4: (otherlv_0= RULE_ID )
            // InternalBSharp.g:550:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFileImportRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getFileImportAccess().getFileReferenceTopLevelFileCrossReference_0_0());
            				

            }


            }

            // InternalBSharp.g:561:3: (otherlv_1= '.' (otherlv_2= '*' | ( (otherlv_3= RULE_ID ) ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBSharp.g:562:4: otherlv_1= '.' (otherlv_2= '*' | ( (otherlv_3= RULE_ID ) ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getFileImportAccess().getFullStopKeyword_1_0());
                    			
                    // InternalBSharp.g:566:4: (otherlv_2= '*' | ( (otherlv_3= RULE_ID ) ) )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==16) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==RULE_ID) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalBSharp.g:567:5: otherlv_2= '*'
                            {
                            otherlv_2=(Token)match(input,16,FOLLOW_2); 

                            					newLeafNode(otherlv_2, grammarAccess.getFileImportAccess().getAsteriskKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalBSharp.g:572:5: ( (otherlv_3= RULE_ID ) )
                            {
                            // InternalBSharp.g:572:5: ( (otherlv_3= RULE_ID ) )
                            // InternalBSharp.g:573:6: (otherlv_3= RULE_ID )
                            {
                            // InternalBSharp.g:573:6: (otherlv_3= RULE_ID )
                            // InternalBSharp.g:574:7: otherlv_3= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getFileImportRule());
                            							}
                            						
                            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                            							newLeafNode(otherlv_3, grammarAccess.getFileImportAccess().getTypeTopLevelInstanceCrossReference_1_1_1_0());
                            						

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
    // InternalBSharp.g:591:1: entryRuleLocalImport returns [EObject current=null] : iv_ruleLocalImport= ruleLocalImport EOF ;
    public final EObject entryRuleLocalImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalImport = null;


        try {
            // InternalBSharp.g:591:52: (iv_ruleLocalImport= ruleLocalImport EOF )
            // InternalBSharp.g:592:2: iv_ruleLocalImport= ruleLocalImport EOF
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
    // InternalBSharp.g:598:1: ruleLocalImport returns [EObject current=null] : (otherlv_0= 'Import' ( (lv_fileImports_1_0= ruleFileImport ) )+ ) ;
    public final EObject ruleLocalImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_fileImports_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:604:2: ( (otherlv_0= 'Import' ( (lv_fileImports_1_0= ruleFileImport ) )+ ) )
            // InternalBSharp.g:605:2: (otherlv_0= 'Import' ( (lv_fileImports_1_0= ruleFileImport ) )+ )
            {
            // InternalBSharp.g:605:2: (otherlv_0= 'Import' ( (lv_fileImports_1_0= ruleFileImport ) )+ )
            // InternalBSharp.g:606:3: otherlv_0= 'Import' ( (lv_fileImports_1_0= ruleFileImport ) )+
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalImportAccess().getImportKeyword_0());
            		
            // InternalBSharp.g:610:3: ( (lv_fileImports_1_0= ruleFileImport ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalBSharp.g:611:4: (lv_fileImports_1_0= ruleFileImport )
            	    {
            	    // InternalBSharp.g:611:4: (lv_fileImports_1_0= ruleFileImport )
            	    // InternalBSharp.g:612:5: lv_fileImports_1_0= ruleFileImport
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
    // InternalBSharp.g:633:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalBSharp.g:633:46: (iv_ruleClass= ruleClass EOF )
            // InternalBSharp.g:634:2: iv_ruleClass= ruleClass EOF
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
    // InternalBSharp.g:640:1: ruleClass returns [EObject current=null] : (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rawContext_2_0= rulePolyContext ) )? (otherlv_3= '[' ( (lv_instName_4_0= ruleInstName ) ) otherlv_5= ']' ) ( (lv_supertypes_6_0= ruleSuperTypeList ) )? (otherlv_7= '(' ( (lv_varList_8_0= ruleTypedVariableList ) ) otherlv_9= ')' )? ( (lv_where_10_0= ruleWhere ) )? (otherlv_11= ';' )? ( (lv_block_12_0= ruleBSharpBlock ) ) ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_rawContext_2_0 = null;

        EObject lv_instName_4_0 = null;

        EObject lv_supertypes_6_0 = null;

        EObject lv_varList_8_0 = null;

        EObject lv_where_10_0 = null;

        EObject lv_block_12_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:646:2: ( (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rawContext_2_0= rulePolyContext ) )? (otherlv_3= '[' ( (lv_instName_4_0= ruleInstName ) ) otherlv_5= ']' ) ( (lv_supertypes_6_0= ruleSuperTypeList ) )? (otherlv_7= '(' ( (lv_varList_8_0= ruleTypedVariableList ) ) otherlv_9= ')' )? ( (lv_where_10_0= ruleWhere ) )? (otherlv_11= ';' )? ( (lv_block_12_0= ruleBSharpBlock ) ) ) )
            // InternalBSharp.g:647:2: (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rawContext_2_0= rulePolyContext ) )? (otherlv_3= '[' ( (lv_instName_4_0= ruleInstName ) ) otherlv_5= ']' ) ( (lv_supertypes_6_0= ruleSuperTypeList ) )? (otherlv_7= '(' ( (lv_varList_8_0= ruleTypedVariableList ) ) otherlv_9= ')' )? ( (lv_where_10_0= ruleWhere ) )? (otherlv_11= ';' )? ( (lv_block_12_0= ruleBSharpBlock ) ) )
            {
            // InternalBSharp.g:647:2: (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rawContext_2_0= rulePolyContext ) )? (otherlv_3= '[' ( (lv_instName_4_0= ruleInstName ) ) otherlv_5= ']' ) ( (lv_supertypes_6_0= ruleSuperTypeList ) )? (otherlv_7= '(' ( (lv_varList_8_0= ruleTypedVariableList ) ) otherlv_9= ')' )? ( (lv_where_10_0= ruleWhere ) )? (otherlv_11= ';' )? ( (lv_block_12_0= ruleBSharpBlock ) ) )
            // InternalBSharp.g:648:3: otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rawContext_2_0= rulePolyContext ) )? (otherlv_3= '[' ( (lv_instName_4_0= ruleInstName ) ) otherlv_5= ']' ) ( (lv_supertypes_6_0= ruleSuperTypeList ) )? (otherlv_7= '(' ( (lv_varList_8_0= ruleTypedVariableList ) ) otherlv_9= ')' )? ( (lv_where_10_0= ruleWhere ) )? (otherlv_11= ';' )? ( (lv_block_12_0= ruleBSharpBlock ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getClassAccess().getClassKeyword_0());
            		
            // InternalBSharp.g:652:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBSharp.g:653:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBSharp.g:653:4: (lv_name_1_0= RULE_ID )
            // InternalBSharp.g:654:5: lv_name_1_0= RULE_ID
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

            // InternalBSharp.g:670:3: ( (lv_rawContext_2_0= rulePolyContext ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBSharp.g:671:4: (lv_rawContext_2_0= rulePolyContext )
                    {
                    // InternalBSharp.g:671:4: (lv_rawContext_2_0= rulePolyContext )
                    // InternalBSharp.g:672:5: lv_rawContext_2_0= rulePolyContext
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getRawContextPolyContextParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_rawContext_2_0=rulePolyContext();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClassRule());
                    					}
                    					set(
                    						current,
                    						"rawContext",
                    						lv_rawContext_2_0,
                    						"ac.soton.bsharp.BSharp.PolyContext");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBSharp.g:689:3: (otherlv_3= '[' ( (lv_instName_4_0= ruleInstName ) ) otherlv_5= ']' )
            // InternalBSharp.g:690:4: otherlv_3= '[' ( (lv_instName_4_0= ruleInstName ) ) otherlv_5= ']'
            {
            otherlv_3=(Token)match(input,18,FOLLOW_3); 

            				newLeafNode(otherlv_3, grammarAccess.getClassAccess().getLeftSquareBracketKeyword_3_0());
            			
            // InternalBSharp.g:694:4: ( (lv_instName_4_0= ruleInstName ) )
            // InternalBSharp.g:695:5: (lv_instName_4_0= ruleInstName )
            {
            // InternalBSharp.g:695:5: (lv_instName_4_0= ruleInstName )
            // InternalBSharp.g:696:6: lv_instName_4_0= ruleInstName
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

            // InternalBSharp.g:718:3: ( (lv_supertypes_6_0= ruleSuperTypeList ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==12) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBSharp.g:719:4: (lv_supertypes_6_0= ruleSuperTypeList )
                    {
                    // InternalBSharp.g:719:4: (lv_supertypes_6_0= ruleSuperTypeList )
                    // InternalBSharp.g:720:5: lv_supertypes_6_0= ruleSuperTypeList
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

            // InternalBSharp.g:737:3: (otherlv_7= '(' ( (lv_varList_8_0= ruleTypedVariableList ) ) otherlv_9= ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBSharp.g:738:4: otherlv_7= '(' ( (lv_varList_8_0= ruleTypedVariableList ) ) otherlv_9= ')'
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getClassAccess().getLeftParenthesisKeyword_5_0());
                    			
                    // InternalBSharp.g:742:4: ( (lv_varList_8_0= ruleTypedVariableList ) )
                    // InternalBSharp.g:743:5: (lv_varList_8_0= ruleTypedVariableList )
                    {
                    // InternalBSharp.g:743:5: (lv_varList_8_0= ruleTypedVariableList )
                    // InternalBSharp.g:744:6: lv_varList_8_0= ruleTypedVariableList
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

            // InternalBSharp.g:766:3: ( (lv_where_10_0= ruleWhere ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBSharp.g:767:4: (lv_where_10_0= ruleWhere )
                    {
                    // InternalBSharp.g:767:4: (lv_where_10_0= ruleWhere )
                    // InternalBSharp.g:768:5: lv_where_10_0= ruleWhere
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

            // InternalBSharp.g:785:3: (otherlv_11= ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBSharp.g:786:4: otherlv_11= ';'
                    {
                    otherlv_11=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_11, grammarAccess.getClassAccess().getSemicolonKeyword_7());
                    			

                    }
                    break;

            }

            // InternalBSharp.g:791:3: ( (lv_block_12_0= ruleBSharpBlock ) )
            // InternalBSharp.g:792:4: (lv_block_12_0= ruleBSharpBlock )
            {
            // InternalBSharp.g:792:4: (lv_block_12_0= ruleBSharpBlock )
            // InternalBSharp.g:793:5: lv_block_12_0= ruleBSharpBlock
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
    // InternalBSharp.g:814:1: entryRuleInstName returns [EObject current=null] : iv_ruleInstName= ruleInstName EOF ;
    public final EObject entryRuleInstName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstName = null;


        try {
            // InternalBSharp.g:814:49: (iv_ruleInstName= ruleInstName EOF )
            // InternalBSharp.g:815:2: iv_ruleInstName= ruleInstName EOF
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
    // InternalBSharp.g:821:1: ruleInstName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleInstName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBSharp.g:827:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBSharp.g:828:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBSharp.g:828:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBSharp.g:829:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBSharp.g:829:3: (lv_name_0_0= RULE_ID )
            // InternalBSharp.g:830:4: lv_name_0_0= RULE_ID
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
    // InternalBSharp.g:849:1: entryRulePolyContext returns [EObject current=null] : iv_rulePolyContext= rulePolyContext EOF ;
    public final EObject entryRulePolyContext() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyContext = null;


        try {
            // InternalBSharp.g:849:52: (iv_rulePolyContext= rulePolyContext EOF )
            // InternalBSharp.g:850:2: iv_rulePolyContext= rulePolyContext EOF
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
    // InternalBSharp.g:856:1: rulePolyContext returns [EObject current=null] : (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyType ) )+ otherlv_2= '>' ) ;
    public final EObject rulePolyContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_polyTypes_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:862:2: ( (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyType ) )+ otherlv_2= '>' ) )
            // InternalBSharp.g:863:2: (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyType ) )+ otherlv_2= '>' )
            {
            // InternalBSharp.g:863:2: (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyType ) )+ otherlv_2= '>' )
            // InternalBSharp.g:864:3: otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyType ) )+ otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPolyContextAccess().getLessThanSignKeyword_0());
            		
            // InternalBSharp.g:868:3: ( (lv_polyTypes_1_0= rulePolyType ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBSharp.g:869:4: (lv_polyTypes_1_0= rulePolyType )
            	    {
            	    // InternalBSharp.g:869:4: (lv_polyTypes_1_0= rulePolyType )
            	    // InternalBSharp.g:870:5: lv_polyTypes_1_0= rulePolyType
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
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
    // InternalBSharp.g:895:1: entryRulePolyType returns [EObject current=null] : iv_rulePolyType= rulePolyType EOF ;
    public final EObject entryRulePolyType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyType = null;


        try {
            // InternalBSharp.g:895:49: (iv_rulePolyType= rulePolyType EOF )
            // InternalBSharp.g:896:2: iv_rulePolyType= rulePolyType EOF
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
    // InternalBSharp.g:902:1: rulePolyType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? ) ;
    public final EObject rulePolyType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalBSharp.g:908:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? ) )
            // InternalBSharp.g:909:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? )
            {
            // InternalBSharp.g:909:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? )
            // InternalBSharp.g:910:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )?
            {
            // InternalBSharp.g:910:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBSharp.g:911:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBSharp.g:911:4: (lv_name_0_0= RULE_ID )
            // InternalBSharp.g:912:5: lv_name_0_0= RULE_ID
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

            // InternalBSharp.g:928:3: (otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==12) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBSharp.g:929:4: otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getPolyTypeAccess().getColonKeyword_1_0());
                    			
                    // InternalBSharp.g:933:4: ( ( ruleQualifiedName ) )
                    // InternalBSharp.g:934:5: ( ruleQualifiedName )
                    {
                    // InternalBSharp.g:934:5: ( ruleQualifiedName )
                    // InternalBSharp.g:935:6: ruleQualifiedName
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

                    // InternalBSharp.g:949:4: (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==25) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalBSharp.g:950:5: otherlv_3= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_3=(Token)match(input,25,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getPolyTypeAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalBSharp.g:954:5: ( ( ruleQualifiedName ) )
                    	    // InternalBSharp.g:955:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalBSharp.g:955:6: ( ruleQualifiedName )
                    	    // InternalBSharp.g:956:7: ruleQualifiedName
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
                    	    break loop20;
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
    // InternalBSharp.g:976:1: entryRuleSuperTypeList returns [EObject current=null] : iv_ruleSuperTypeList= ruleSuperTypeList EOF ;
    public final EObject entryRuleSuperTypeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperTypeList = null;


        try {
            // InternalBSharp.g:976:54: (iv_ruleSuperTypeList= ruleSuperTypeList EOF )
            // InternalBSharp.g:977:2: iv_ruleSuperTypeList= ruleSuperTypeList EOF
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
    // InternalBSharp.g:983:1: ruleSuperTypeList returns [EObject current=null] : (otherlv_0= ':' ( (lv_superTypes_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superTypes_3_0= ruleConstructedType ) ) )* ) ;
    public final EObject ruleSuperTypeList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_superTypes_1_0 = null;

        EObject lv_superTypes_3_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:989:2: ( (otherlv_0= ':' ( (lv_superTypes_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superTypes_3_0= ruleConstructedType ) ) )* ) )
            // InternalBSharp.g:990:2: (otherlv_0= ':' ( (lv_superTypes_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superTypes_3_0= ruleConstructedType ) ) )* )
            {
            // InternalBSharp.g:990:2: (otherlv_0= ':' ( (lv_superTypes_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superTypes_3_0= ruleConstructedType ) ) )* )
            // InternalBSharp.g:991:3: otherlv_0= ':' ( (lv_superTypes_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superTypes_3_0= ruleConstructedType ) ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getSuperTypeListAccess().getColonKeyword_0());
            		
            // InternalBSharp.g:995:3: ( (lv_superTypes_1_0= ruleConstructedType ) )
            // InternalBSharp.g:996:4: (lv_superTypes_1_0= ruleConstructedType )
            {
            // InternalBSharp.g:996:4: (lv_superTypes_1_0= ruleConstructedType )
            // InternalBSharp.g:997:5: lv_superTypes_1_0= ruleConstructedType
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

            // InternalBSharp.g:1014:3: (otherlv_2= ',' ( (lv_superTypes_3_0= ruleConstructedType ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==25) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalBSharp.g:1015:4: otherlv_2= ',' ( (lv_superTypes_3_0= ruleConstructedType ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FOLLOW_21); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSuperTypeListAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalBSharp.g:1019:4: ( (lv_superTypes_3_0= ruleConstructedType ) )
            	    // InternalBSharp.g:1020:5: (lv_superTypes_3_0= ruleConstructedType )
            	    {
            	    // InternalBSharp.g:1020:5: (lv_superTypes_3_0= ruleConstructedType )
            	    // InternalBSharp.g:1021:6: lv_superTypes_3_0= ruleConstructedType
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
            	    break loop22;
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
    // InternalBSharp.g:1043:1: entryRuleBuiltinTypeInfixOp returns [String current=null] : iv_ruleBuiltinTypeInfixOp= ruleBuiltinTypeInfixOp EOF ;
    public final String entryRuleBuiltinTypeInfixOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBuiltinTypeInfixOp = null;


        try {
            // InternalBSharp.g:1043:58: (iv_ruleBuiltinTypeInfixOp= ruleBuiltinTypeInfixOp EOF )
            // InternalBSharp.g:1044:2: iv_ruleBuiltinTypeInfixOp= ruleBuiltinTypeInfixOp EOF
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
    // InternalBSharp.g:1050:1: ruleBuiltinTypeInfixOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\u00D7' | kw= '\\u2192' | kw= '\\uE102' | kw= '\\uE100' | kw= '\\u2194' | kw= '\\u2916' | kw= '\\u21F8' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' ) ;
    public final AntlrDatatypeRuleToken ruleBuiltinTypeInfixOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBSharp.g:1056:2: ( (kw= '\\u00D7' | kw= '\\u2192' | kw= '\\uE102' | kw= '\\uE100' | kw= '\\u2194' | kw= '\\u2916' | kw= '\\u21F8' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' ) )
            // InternalBSharp.g:1057:2: (kw= '\\u00D7' | kw= '\\u2192' | kw= '\\uE102' | kw= '\\uE100' | kw= '\\u2194' | kw= '\\u2916' | kw= '\\u21F8' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' )
            {
            // InternalBSharp.g:1057:2: (kw= '\\u00D7' | kw= '\\u2192' | kw= '\\uE102' | kw= '\\uE100' | kw= '\\u2194' | kw= '\\u2916' | kw= '\\u21F8' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' )
            int alt23=10;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt23=1;
                }
                break;
            case 27:
                {
                alt23=2;
                }
                break;
            case 28:
                {
                alt23=3;
                }
                break;
            case 29:
                {
                alt23=4;
                }
                break;
            case 30:
                {
                alt23=5;
                }
                break;
            case 31:
                {
                alt23=6;
                }
                break;
            case 32:
                {
                alt23=7;
                }
                break;
            case 33:
                {
                alt23=8;
                }
                break;
            case 34:
                {
                alt23=9;
                }
                break;
            case 35:
                {
                alt23=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalBSharp.g:1058:3: kw= '\\u00D7'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBuiltinTypeInfixOpAccess().getMultiplicationSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1064:3: kw= '\\u2192'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsArrowKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBSharp.g:1070:3: kw= '\\uE102'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBuiltinTypeInfixOpAccess().getPrivateUseAreaE102Keyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalBSharp.g:1076:3: kw= '\\uE100'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBuiltinTypeInfixOpAccess().getPrivateUseAreaE100Keyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalBSharp.g:1082:3: kw= '\\u2194'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBuiltinTypeInfixOpAccess().getLeftRightArrowKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalBSharp.g:1088:3: kw= '\\u2916'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsTwoHeadedArrowWithTailKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalBSharp.g:1094:3: kw= '\\u21F8'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsArrowWithVerticalStrokeKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalBSharp.g:1100:3: kw= '\\u21A3'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsArrowWithTailKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalBSharp.g:1106:3: kw= '\\u2900'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalBSharp.g:1112:3: kw= '\\u21A0'
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
    // InternalBSharp.g:1121:1: entryRuleConstructedType returns [EObject current=null] : iv_ruleConstructedType= ruleConstructedType EOF ;
    public final EObject entryRuleConstructedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructedType = null;


        try {
            // InternalBSharp.g:1121:56: (iv_ruleConstructedType= ruleConstructedType EOF )
            // InternalBSharp.g:1122:2: iv_ruleConstructedType= ruleConstructedType EOF
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
    // InternalBSharp.g:1128:1: ruleConstructedType returns [EObject current=null] : (this_BuilderElem_0= ruleBuilderElem ( () ( (lv_constructor_2_0= ruleBuiltinTypeInfixOp ) ) ( (lv_right_3_0= ruleBuilderElem ) ) )* ) ;
    public final EObject ruleConstructedType() throws RecognitionException {
        EObject current = null;

        EObject this_BuilderElem_0 = null;

        AntlrDatatypeRuleToken lv_constructor_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1134:2: ( (this_BuilderElem_0= ruleBuilderElem ( () ( (lv_constructor_2_0= ruleBuiltinTypeInfixOp ) ) ( (lv_right_3_0= ruleBuilderElem ) ) )* ) )
            // InternalBSharp.g:1135:2: (this_BuilderElem_0= ruleBuilderElem ( () ( (lv_constructor_2_0= ruleBuiltinTypeInfixOp ) ) ( (lv_right_3_0= ruleBuilderElem ) ) )* )
            {
            // InternalBSharp.g:1135:2: (this_BuilderElem_0= ruleBuilderElem ( () ( (lv_constructor_2_0= ruleBuiltinTypeInfixOp ) ) ( (lv_right_3_0= ruleBuilderElem ) ) )* )
            // InternalBSharp.g:1136:3: this_BuilderElem_0= ruleBuilderElem ( () ( (lv_constructor_2_0= ruleBuiltinTypeInfixOp ) ) ( (lv_right_3_0= ruleBuilderElem ) ) )*
            {

            			newCompositeNode(grammarAccess.getConstructedTypeAccess().getBuilderElemParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_BuilderElem_0=ruleBuilderElem();

            state._fsp--;


            			current = this_BuilderElem_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalBSharp.g:1144:3: ( () ( (lv_constructor_2_0= ruleBuiltinTypeInfixOp ) ) ( (lv_right_3_0= ruleBuilderElem ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=26 && LA24_0<=35)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalBSharp.g:1145:4: () ( (lv_constructor_2_0= ruleBuiltinTypeInfixOp ) ) ( (lv_right_3_0= ruleBuilderElem ) )
            	    {
            	    // InternalBSharp.g:1145:4: ()
            	    // InternalBSharp.g:1146:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConstructedTypeAccess().getConstructedTypeLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalBSharp.g:1152:4: ( (lv_constructor_2_0= ruleBuiltinTypeInfixOp ) )
            	    // InternalBSharp.g:1153:5: (lv_constructor_2_0= ruleBuiltinTypeInfixOp )
            	    {
            	    // InternalBSharp.g:1153:5: (lv_constructor_2_0= ruleBuiltinTypeInfixOp )
            	    // InternalBSharp.g:1154:6: lv_constructor_2_0= ruleBuiltinTypeInfixOp
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

            	    // InternalBSharp.g:1171:4: ( (lv_right_3_0= ruleBuilderElem ) )
            	    // InternalBSharp.g:1172:5: (lv_right_3_0= ruleBuilderElem )
            	    {
            	    // InternalBSharp.g:1172:5: (lv_right_3_0= ruleBuilderElem )
            	    // InternalBSharp.g:1173:6: lv_right_3_0= ruleBuilderElem
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


    // $ANTLR start "entryRuleBuilderElem"
    // InternalBSharp.g:1195:1: entryRuleBuilderElem returns [EObject current=null] : iv_ruleBuilderElem= ruleBuilderElem EOF ;
    public final EObject entryRuleBuilderElem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuilderElem = null;


        try {
            // InternalBSharp.g:1195:52: (iv_ruleBuilderElem= ruleBuilderElem EOF )
            // InternalBSharp.g:1196:2: iv_ruleBuilderElem= ruleBuilderElem EOF
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
    // InternalBSharp.g:1202:1: ruleBuilderElem returns [EObject current=null] : (this_TypeConstructor_0= ruleTypeConstructor | this_TypeConstrBracket_1= ruleTypeConstrBracket | this_TypePowerSet_2= ruleTypePowerSet ) ;
    public final EObject ruleBuilderElem() throws RecognitionException {
        EObject current = null;

        EObject this_TypeConstructor_0 = null;

        EObject this_TypeConstrBracket_1 = null;

        EObject this_TypePowerSet_2 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1208:2: ( (this_TypeConstructor_0= ruleTypeConstructor | this_TypeConstrBracket_1= ruleTypeConstrBracket | this_TypePowerSet_2= ruleTypePowerSet ) )
            // InternalBSharp.g:1209:2: (this_TypeConstructor_0= ruleTypeConstructor | this_TypeConstrBracket_1= ruleTypeConstrBracket | this_TypePowerSet_2= ruleTypePowerSet )
            {
            // InternalBSharp.g:1209:2: (this_TypeConstructor_0= ruleTypeConstructor | this_TypeConstrBracket_1= ruleTypeConstrBracket | this_TypePowerSet_2= ruleTypePowerSet )
            int alt25=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt25=1;
                }
                break;
            case 20:
                {
                alt25=2;
                }
                break;
            case 36:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalBSharp.g:1210:3: this_TypeConstructor_0= ruleTypeConstructor
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
                    // InternalBSharp.g:1219:3: this_TypeConstrBracket_1= ruleTypeConstrBracket
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
                    // InternalBSharp.g:1228:3: this_TypePowerSet_2= ruleTypePowerSet
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
    // InternalBSharp.g:1240:1: entryRuleTypeConstructor returns [EObject current=null] : iv_ruleTypeConstructor= ruleTypeConstructor EOF ;
    public final EObject entryRuleTypeConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeConstructor = null;


        try {
            // InternalBSharp.g:1240:56: (iv_ruleTypeConstructor= ruleTypeConstructor EOF )
            // InternalBSharp.g:1241:2: iv_ruleTypeConstructor= ruleTypeConstructor EOF
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
    // InternalBSharp.g:1247:1: ruleTypeConstructor returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )? ) ;
    public final EObject ruleTypeConstructor() throws RecognitionException {
        EObject current = null;

        EObject lv_context_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1253:2: ( ( ( ( ruleQualifiedName ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )? ) )
            // InternalBSharp.g:1254:2: ( ( ( ruleQualifiedName ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )? )
            {
            // InternalBSharp.g:1254:2: ( ( ( ruleQualifiedName ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )? )
            // InternalBSharp.g:1255:3: ( ( ruleQualifiedName ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )?
            {
            // InternalBSharp.g:1255:3: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:1256:4: ( ruleQualifiedName )
            {
            // InternalBSharp.g:1256:4: ( ruleQualifiedName )
            // InternalBSharp.g:1257:5: ruleQualifiedName
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

            // InternalBSharp.g:1271:3: ( (lv_context_1_0= ruleTypeDeclContext ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalBSharp.g:1272:4: (lv_context_1_0= ruleTypeDeclContext )
                    {
                    // InternalBSharp.g:1272:4: (lv_context_1_0= ruleTypeDeclContext )
                    // InternalBSharp.g:1273:5: lv_context_1_0= ruleTypeDeclContext
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
    // InternalBSharp.g:1294:1: entryRuleTypePowerSet returns [EObject current=null] : iv_ruleTypePowerSet= ruleTypePowerSet EOF ;
    public final EObject entryRuleTypePowerSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypePowerSet = null;


        try {
            // InternalBSharp.g:1294:53: (iv_ruleTypePowerSet= ruleTypePowerSet EOF )
            // InternalBSharp.g:1295:2: iv_ruleTypePowerSet= ruleTypePowerSet EOF
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
    // InternalBSharp.g:1301:1: ruleTypePowerSet returns [EObject current=null] : (otherlv_0= '\\u2119' otherlv_1= '(' ( (lv_child_2_0= ruleConstructedType ) ) otherlv_3= ')' ) ;
    public final EObject ruleTypePowerSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_child_2_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1307:2: ( (otherlv_0= '\\u2119' otherlv_1= '(' ( (lv_child_2_0= ruleConstructedType ) ) otherlv_3= ')' ) )
            // InternalBSharp.g:1308:2: (otherlv_0= '\\u2119' otherlv_1= '(' ( (lv_child_2_0= ruleConstructedType ) ) otherlv_3= ')' )
            {
            // InternalBSharp.g:1308:2: (otherlv_0= '\\u2119' otherlv_1= '(' ( (lv_child_2_0= ruleConstructedType ) ) otherlv_3= ')' )
            // InternalBSharp.g:1309:3: otherlv_0= '\\u2119' otherlv_1= '(' ( (lv_child_2_0= ruleConstructedType ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getTypePowerSetAccess().getDoubleStruckCapitalPKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getTypePowerSetAccess().getLeftParenthesisKeyword_1());
            		
            // InternalBSharp.g:1317:3: ( (lv_child_2_0= ruleConstructedType ) )
            // InternalBSharp.g:1318:4: (lv_child_2_0= ruleConstructedType )
            {
            // InternalBSharp.g:1318:4: (lv_child_2_0= ruleConstructedType )
            // InternalBSharp.g:1319:5: lv_child_2_0= ruleConstructedType
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
    // InternalBSharp.g:1344:1: entryRuleTypeConstrBracket returns [EObject current=null] : iv_ruleTypeConstrBracket= ruleTypeConstrBracket EOF ;
    public final EObject entryRuleTypeConstrBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeConstrBracket = null;


        try {
            // InternalBSharp.g:1344:58: (iv_ruleTypeConstrBracket= ruleTypeConstrBracket EOF )
            // InternalBSharp.g:1345:2: iv_ruleTypeConstrBracket= ruleTypeConstrBracket EOF
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
    // InternalBSharp.g:1351:1: ruleTypeConstrBracket returns [EObject current=null] : (otherlv_0= '(' ( (lv_child_1_0= ruleConstructedType ) ) otherlv_2= ')' ) ;
    public final EObject ruleTypeConstrBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_child_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1357:2: ( (otherlv_0= '(' ( (lv_child_1_0= ruleConstructedType ) ) otherlv_2= ')' ) )
            // InternalBSharp.g:1358:2: (otherlv_0= '(' ( (lv_child_1_0= ruleConstructedType ) ) otherlv_2= ')' )
            {
            // InternalBSharp.g:1358:2: (otherlv_0= '(' ( (lv_child_1_0= ruleConstructedType ) ) otherlv_2= ')' )
            // InternalBSharp.g:1359:3: otherlv_0= '(' ( (lv_child_1_0= ruleConstructedType ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeConstrBracketAccess().getLeftParenthesisKeyword_0());
            		
            // InternalBSharp.g:1363:3: ( (lv_child_1_0= ruleConstructedType ) )
            // InternalBSharp.g:1364:4: (lv_child_1_0= ruleConstructedType )
            {
            // InternalBSharp.g:1364:4: (lv_child_1_0= ruleConstructedType )
            // InternalBSharp.g:1365:5: lv_child_1_0= ruleConstructedType
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
    // InternalBSharp.g:1390:1: entryRuleTypeDeclContext returns [EObject current=null] : iv_ruleTypeDeclContext= ruleTypeDeclContext EOF ;
    public final EObject entryRuleTypeDeclContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDeclContext = null;


        try {
            // InternalBSharp.g:1390:56: (iv_ruleTypeDeclContext= ruleTypeDeclContext EOF )
            // InternalBSharp.g:1391:2: iv_ruleTypeDeclContext= ruleTypeDeclContext EOF
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
    // InternalBSharp.g:1397:1: ruleTypeDeclContext returns [EObject current=null] : (otherlv_0= '<' ( (lv_typeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_typeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>' ) ;
    public final EObject ruleTypeDeclContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_typeName_1_0 = null;

        EObject lv_typeName_3_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1403:2: ( (otherlv_0= '<' ( (lv_typeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_typeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>' ) )
            // InternalBSharp.g:1404:2: (otherlv_0= '<' ( (lv_typeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_typeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>' )
            {
            // InternalBSharp.g:1404:2: (otherlv_0= '<' ( (lv_typeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_typeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>' )
            // InternalBSharp.g:1405:3: otherlv_0= '<' ( (lv_typeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_typeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeDeclContextAccess().getLessThanSignKeyword_0());
            		
            // InternalBSharp.g:1409:3: ( (lv_typeName_1_0= ruleConstructedType ) )
            // InternalBSharp.g:1410:4: (lv_typeName_1_0= ruleConstructedType )
            {
            // InternalBSharp.g:1410:4: (lv_typeName_1_0= ruleConstructedType )
            // InternalBSharp.g:1411:5: lv_typeName_1_0= ruleConstructedType
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

            // InternalBSharp.g:1428:3: (otherlv_2= ',' ( (lv_typeName_3_0= ruleConstructedType ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==25) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalBSharp.g:1429:4: otherlv_2= ',' ( (lv_typeName_3_0= ruleConstructedType ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FOLLOW_21); 

            	    				newLeafNode(otherlv_2, grammarAccess.getTypeDeclContextAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalBSharp.g:1433:4: ( (lv_typeName_3_0= ruleConstructedType ) )
            	    // InternalBSharp.g:1434:5: (lv_typeName_3_0= ruleConstructedType )
            	    {
            	    // InternalBSharp.g:1434:5: (lv_typeName_3_0= ruleConstructedType )
            	    // InternalBSharp.g:1435:6: lv_typeName_3_0= ruleConstructedType
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
            	    break loop27;
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
    // InternalBSharp.g:1461:1: entryRuleWhere returns [EObject current=null] : iv_ruleWhere= ruleWhere EOF ;
    public final EObject entryRuleWhere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhere = null;


        try {
            // InternalBSharp.g:1461:46: (iv_ruleWhere= ruleWhere EOF )
            // InternalBSharp.g:1462:2: iv_ruleWhere= ruleWhere EOF
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
    // InternalBSharp.g:1468:1: ruleWhere returns [EObject current=null] : (otherlv_0= 'where' ( (lv_expressions_1_0= ruleRootExpression ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )* ) ;
    public final EObject ruleWhere() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;

        EObject lv_expressions_3_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1474:2: ( (otherlv_0= 'where' ( (lv_expressions_1_0= ruleRootExpression ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )* ) )
            // InternalBSharp.g:1475:2: (otherlv_0= 'where' ( (lv_expressions_1_0= ruleRootExpression ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )* )
            {
            // InternalBSharp.g:1475:2: (otherlv_0= 'where' ( (lv_expressions_1_0= ruleRootExpression ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )* )
            // InternalBSharp.g:1476:3: otherlv_0= 'where' ( (lv_expressions_1_0= ruleRootExpression ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )*
            {
            otherlv_0=(Token)match(input,37,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getWhereAccess().getWhereKeyword_0());
            		
            // InternalBSharp.g:1480:3: ( (lv_expressions_1_0= ruleRootExpression ) )
            // InternalBSharp.g:1481:4: (lv_expressions_1_0= ruleRootExpression )
            {
            // InternalBSharp.g:1481:4: (lv_expressions_1_0= ruleRootExpression )
            // InternalBSharp.g:1482:5: lv_expressions_1_0= ruleRootExpression
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

            // InternalBSharp.g:1499:3: (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==22) ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1==RULE_ID||LA28_1==18||LA28_1==20||LA28_1==44||(LA28_1>=46 && LA28_1<=48)||LA28_1==50) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // InternalBSharp.g:1500:4: otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_26); 

            	    				newLeafNode(otherlv_2, grammarAccess.getWhereAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalBSharp.g:1504:4: ( (lv_expressions_3_0= ruleRootExpression ) )
            	    // InternalBSharp.g:1505:5: (lv_expressions_3_0= ruleRootExpression )
            	    {
            	    // InternalBSharp.g:1505:5: (lv_expressions_3_0= ruleRootExpression )
            	    // InternalBSharp.g:1506:6: lv_expressions_3_0= ruleRootExpression
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
            	    break loop28;
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
    // InternalBSharp.g:1528:1: entryRuleDatatype returns [EObject current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final EObject entryRuleDatatype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatype = null;


        try {
            // InternalBSharp.g:1528:49: (iv_ruleDatatype= ruleDatatype EOF )
            // InternalBSharp.g:1529:2: iv_ruleDatatype= ruleDatatype EOF
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
    // InternalBSharp.g:1535:1: ruleDatatype returns [EObject current=null] : (otherlv_0= 'Datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rawContext_2_0= rulePolyContext ) )? (otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) ) )+ ( (lv_block_5_0= ruleBSharpBlock ) ) ) ;
    public final EObject ruleDatatype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_rawContext_2_0 = null;

        EObject lv_constructors_4_0 = null;

        EObject lv_block_5_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1541:2: ( (otherlv_0= 'Datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rawContext_2_0= rulePolyContext ) )? (otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) ) )+ ( (lv_block_5_0= ruleBSharpBlock ) ) ) )
            // InternalBSharp.g:1542:2: (otherlv_0= 'Datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rawContext_2_0= rulePolyContext ) )? (otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) ) )+ ( (lv_block_5_0= ruleBSharpBlock ) ) )
            {
            // InternalBSharp.g:1542:2: (otherlv_0= 'Datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rawContext_2_0= rulePolyContext ) )? (otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) ) )+ ( (lv_block_5_0= ruleBSharpBlock ) ) )
            // InternalBSharp.g:1543:3: otherlv_0= 'Datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rawContext_2_0= rulePolyContext ) )? (otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) ) )+ ( (lv_block_5_0= ruleBSharpBlock ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDatatypeAccess().getDatatypeKeyword_0());
            		
            // InternalBSharp.g:1547:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBSharp.g:1548:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBSharp.g:1548:4: (lv_name_1_0= RULE_ID )
            // InternalBSharp.g:1549:5: lv_name_1_0= RULE_ID
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

            // InternalBSharp.g:1565:3: ( (lv_rawContext_2_0= rulePolyContext ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalBSharp.g:1566:4: (lv_rawContext_2_0= rulePolyContext )
                    {
                    // InternalBSharp.g:1566:4: (lv_rawContext_2_0= rulePolyContext )
                    // InternalBSharp.g:1567:5: lv_rawContext_2_0= rulePolyContext
                    {

                    					newCompositeNode(grammarAccess.getDatatypeAccess().getRawContextPolyContextParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_29);
                    lv_rawContext_2_0=rulePolyContext();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDatatypeRule());
                    					}
                    					set(
                    						current,
                    						"rawContext",
                    						lv_rawContext_2_0,
                    						"ac.soton.bsharp.BSharp.PolyContext");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBSharp.g:1584:3: (otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==39) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalBSharp.g:1585:4: otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) )
            	    {
            	    otherlv_3=(Token)match(input,39,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getDatatypeAccess().getVerticalLineKeyword_3_0());
            	    			
            	    // InternalBSharp.g:1589:4: ( (lv_constructors_4_0= ruleDatatypeConstructor ) )
            	    // InternalBSharp.g:1590:5: (lv_constructors_4_0= ruleDatatypeConstructor )
            	    {
            	    // InternalBSharp.g:1590:5: (lv_constructors_4_0= ruleDatatypeConstructor )
            	    // InternalBSharp.g:1591:6: lv_constructors_4_0= ruleDatatypeConstructor
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
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            // InternalBSharp.g:1609:3: ( (lv_block_5_0= ruleBSharpBlock ) )
            // InternalBSharp.g:1610:4: (lv_block_5_0= ruleBSharpBlock )
            {
            // InternalBSharp.g:1610:4: (lv_block_5_0= ruleBSharpBlock )
            // InternalBSharp.g:1611:5: lv_block_5_0= ruleBSharpBlock
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
    // InternalBSharp.g:1632:1: entryRuleDatatypeConstructor returns [EObject current=null] : iv_ruleDatatypeConstructor= ruleDatatypeConstructor EOF ;
    public final EObject entryRuleDatatypeConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatypeConstructor = null;


        try {
            // InternalBSharp.g:1632:60: (iv_ruleDatatypeConstructor= ruleDatatypeConstructor EOF )
            // InternalBSharp.g:1633:2: iv_ruleDatatypeConstructor= ruleDatatypeConstructor EOF
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
    // InternalBSharp.g:1639:1: ruleDatatypeConstructor returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleDatatypeConstructor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_decons_2_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1645:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )? ) )
            // InternalBSharp.g:1646:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )? )
            {
            // InternalBSharp.g:1646:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )? )
            // InternalBSharp.g:1647:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )?
            {
            // InternalBSharp.g:1647:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBSharp.g:1648:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBSharp.g:1648:4: (lv_name_0_0= RULE_ID )
            // InternalBSharp.g:1649:5: lv_name_0_0= RULE_ID
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

            // InternalBSharp.g:1665:3: (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==20) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalBSharp.g:1666:4: otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getDatatypeConstructorAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalBSharp.g:1670:4: ( (lv_decons_2_0= ruleTypedVariableList ) )
                    // InternalBSharp.g:1671:5: (lv_decons_2_0= ruleTypedVariableList )
                    {
                    // InternalBSharp.g:1671:5: (lv_decons_2_0= ruleTypedVariableList )
                    // InternalBSharp.g:1672:6: lv_decons_2_0= ruleTypedVariableList
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
    // InternalBSharp.g:1698:1: entryRuleExtend returns [EObject current=null] : iv_ruleExtend= ruleExtend EOF ;
    public final EObject entryRuleExtend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtend = null;


        try {
            // InternalBSharp.g:1698:47: (iv_ruleExtend= ruleExtend EOF )
            // InternalBSharp.g:1699:2: iv_ruleExtend= ruleExtend EOF
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
    // InternalBSharp.g:1705:1: ruleExtend returns [EObject current=null] : (otherlv_0= 'Extend' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' ( (lv_block_5_0= ruleBSharpBlock ) ) ) ;
    public final EObject ruleExtend() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        EObject lv_block_5_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1711:2: ( (otherlv_0= 'Extend' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' ( (lv_block_5_0= ruleBSharpBlock ) ) ) )
            // InternalBSharp.g:1712:2: (otherlv_0= 'Extend' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' ( (lv_block_5_0= ruleBSharpBlock ) ) )
            {
            // InternalBSharp.g:1712:2: (otherlv_0= 'Extend' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' ( (lv_block_5_0= ruleBSharpBlock ) ) )
            // InternalBSharp.g:1713:3: otherlv_0= 'Extend' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' ( (lv_block_5_0= ruleBSharpBlock ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExtendAccess().getExtendKeyword_0());
            		
            // InternalBSharp.g:1717:3: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:1718:4: ( ruleQualifiedName )
            {
            // InternalBSharp.g:1718:4: ( ruleQualifiedName )
            // InternalBSharp.g:1719:5: ruleQualifiedName
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
            		
            // InternalBSharp.g:1737:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalBSharp.g:1738:4: (lv_name_3_0= RULE_ID )
            {
            // InternalBSharp.g:1738:4: (lv_name_3_0= RULE_ID )
            // InternalBSharp.g:1739:5: lv_name_3_0= RULE_ID
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
            		
            // InternalBSharp.g:1759:3: ( (lv_block_5_0= ruleBSharpBlock ) )
            // InternalBSharp.g:1760:4: (lv_block_5_0= ruleBSharpBlock )
            {
            // InternalBSharp.g:1760:4: (lv_block_5_0= ruleBSharpBlock )
            // InternalBSharp.g:1761:5: lv_block_5_0= ruleBSharpBlock
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
    // InternalBSharp.g:1782:1: entryRuleBSharpBlock returns [EObject current=null] : iv_ruleBSharpBlock= ruleBSharpBlock EOF ;
    public final EObject entryRuleBSharpBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSharpBlock = null;


        try {
            // InternalBSharp.g:1782:52: (iv_ruleBSharpBlock= ruleBSharpBlock EOF )
            // InternalBSharp.g:1783:2: iv_ruleBSharpBlock= ruleBSharpBlock EOF
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
    // InternalBSharp.g:1789:1: ruleBSharpBlock returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDecl ) ) | ( (lv_theorems_3_0= ruleTheoremBody ) ) | ( (lv_theorems_4_0= ruleInstance ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleBSharpBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_functions_2_0 = null;

        EObject lv_theorems_3_0 = null;

        EObject lv_theorems_4_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1795:2: ( ( () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDecl ) ) | ( (lv_theorems_3_0= ruleTheoremBody ) ) | ( (lv_theorems_4_0= ruleInstance ) ) )* otherlv_5= '}' ) )
            // InternalBSharp.g:1796:2: ( () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDecl ) ) | ( (lv_theorems_3_0= ruleTheoremBody ) ) | ( (lv_theorems_4_0= ruleInstance ) ) )* otherlv_5= '}' )
            {
            // InternalBSharp.g:1796:2: ( () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDecl ) ) | ( (lv_theorems_3_0= ruleTheoremBody ) ) | ( (lv_theorems_4_0= ruleInstance ) ) )* otherlv_5= '}' )
            // InternalBSharp.g:1797:3: () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDecl ) ) | ( (lv_theorems_3_0= ruleTheoremBody ) ) | ( (lv_theorems_4_0= ruleInstance ) ) )* otherlv_5= '}'
            {
            // InternalBSharp.g:1797:3: ()
            // InternalBSharp.g:1798:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBSharpBlockAccess().getBSharpBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getBSharpBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBSharp.g:1808:3: ( ( (lv_functions_2_0= ruleFunctionDecl ) ) | ( (lv_theorems_3_0= ruleTheoremBody ) ) | ( (lv_theorems_4_0= ruleInstance ) ) )*
            loop32:
            do {
                int alt32=4;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt32=1;
                    }
                    break;
                case 45:
                    {
                    alt32=2;
                    }
                    break;
                case 58:
                    {
                    alt32=3;
                    }
                    break;

                }

                switch (alt32) {
            	case 1 :
            	    // InternalBSharp.g:1809:4: ( (lv_functions_2_0= ruleFunctionDecl ) )
            	    {
            	    // InternalBSharp.g:1809:4: ( (lv_functions_2_0= ruleFunctionDecl ) )
            	    // InternalBSharp.g:1810:5: (lv_functions_2_0= ruleFunctionDecl )
            	    {
            	    // InternalBSharp.g:1810:5: (lv_functions_2_0= ruleFunctionDecl )
            	    // InternalBSharp.g:1811:6: lv_functions_2_0= ruleFunctionDecl
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
            	    // InternalBSharp.g:1829:4: ( (lv_theorems_3_0= ruleTheoremBody ) )
            	    {
            	    // InternalBSharp.g:1829:4: ( (lv_theorems_3_0= ruleTheoremBody ) )
            	    // InternalBSharp.g:1830:5: (lv_theorems_3_0= ruleTheoremBody )
            	    {
            	    // InternalBSharp.g:1830:5: (lv_theorems_3_0= ruleTheoremBody )
            	    // InternalBSharp.g:1831:6: lv_theorems_3_0= ruleTheoremBody
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
            	    // InternalBSharp.g:1849:4: ( (lv_theorems_4_0= ruleInstance ) )
            	    {
            	    // InternalBSharp.g:1849:4: ( (lv_theorems_4_0= ruleInstance ) )
            	    // InternalBSharp.g:1850:5: (lv_theorems_4_0= ruleInstance )
            	    {
            	    // InternalBSharp.g:1850:5: (lv_theorems_4_0= ruleInstance )
            	    // InternalBSharp.g:1851:6: lv_theorems_4_0= ruleInstance
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
            	    break loop32;
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
    // InternalBSharp.g:1877:1: entryRuleFunctionDecl returns [EObject current=null] : iv_ruleFunctionDecl= ruleFunctionDecl EOF ;
    public final EObject entryRuleFunctionDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDecl = null;


        try {
            // InternalBSharp.g:1877:53: (iv_ruleFunctionDecl= ruleFunctionDecl EOF )
            // InternalBSharp.g:1878:2: iv_ruleFunctionDecl= ruleFunctionDecl EOF
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
    // InternalBSharp.g:1884:1: ruleFunctionDecl returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_varList_3_0= ruleTypedVariableList ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleTypeConstructor ) ) ( (lv_infix_7_0= 'INFIX' ) )? ( (lv_precedence_8_0= RULE_INT ) )? ( (lv_expr_9_0= ruleRootExpression ) ) ) ;
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
            // InternalBSharp.g:1890:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_varList_3_0= ruleTypedVariableList ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleTypeConstructor ) ) ( (lv_infix_7_0= 'INFIX' ) )? ( (lv_precedence_8_0= RULE_INT ) )? ( (lv_expr_9_0= ruleRootExpression ) ) ) )
            // InternalBSharp.g:1891:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_varList_3_0= ruleTypedVariableList ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleTypeConstructor ) ) ( (lv_infix_7_0= 'INFIX' ) )? ( (lv_precedence_8_0= RULE_INT ) )? ( (lv_expr_9_0= ruleRootExpression ) ) )
            {
            // InternalBSharp.g:1891:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_varList_3_0= ruleTypedVariableList ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleTypeConstructor ) ) ( (lv_infix_7_0= 'INFIX' ) )? ( (lv_precedence_8_0= RULE_INT ) )? ( (lv_expr_9_0= ruleRootExpression ) ) )
            // InternalBSharp.g:1892:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_varList_3_0= ruleTypedVariableList ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleTypeConstructor ) ) ( (lv_infix_7_0= 'INFIX' ) )? ( (lv_precedence_8_0= RULE_INT ) )? ( (lv_expr_9_0= ruleRootExpression ) )
            {
            // InternalBSharp.g:1892:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBSharp.g:1893:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBSharp.g:1893:4: (lv_name_0_0= RULE_ID )
            // InternalBSharp.g:1894:5: lv_name_0_0= RULE_ID
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

            // InternalBSharp.g:1910:3: ( (lv_context_1_0= rulePolyContext ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==23) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalBSharp.g:1911:4: (lv_context_1_0= rulePolyContext )
                    {
                    // InternalBSharp.g:1911:4: (lv_context_1_0= rulePolyContext )
                    // InternalBSharp.g:1912:5: lv_context_1_0= rulePolyContext
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
            		
            // InternalBSharp.g:1933:3: ( (lv_varList_3_0= ruleTypedVariableList ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalBSharp.g:1934:4: (lv_varList_3_0= ruleTypedVariableList )
                    {
                    // InternalBSharp.g:1934:4: (lv_varList_3_0= ruleTypedVariableList )
                    // InternalBSharp.g:1935:5: lv_varList_3_0= ruleTypedVariableList
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
            		
            // InternalBSharp.g:1960:3: ( (lv_returnType_6_0= ruleTypeConstructor ) )
            // InternalBSharp.g:1961:4: (lv_returnType_6_0= ruleTypeConstructor )
            {
            // InternalBSharp.g:1961:4: (lv_returnType_6_0= ruleTypeConstructor )
            // InternalBSharp.g:1962:5: lv_returnType_6_0= ruleTypeConstructor
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

            // InternalBSharp.g:1979:3: ( (lv_infix_7_0= 'INFIX' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==43) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalBSharp.g:1980:4: (lv_infix_7_0= 'INFIX' )
                    {
                    // InternalBSharp.g:1980:4: (lv_infix_7_0= 'INFIX' )
                    // InternalBSharp.g:1981:5: lv_infix_7_0= 'INFIX'
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

            // InternalBSharp.g:1993:3: ( (lv_precedence_8_0= RULE_INT ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_INT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalBSharp.g:1994:4: (lv_precedence_8_0= RULE_INT )
                    {
                    // InternalBSharp.g:1994:4: (lv_precedence_8_0= RULE_INT )
                    // InternalBSharp.g:1995:5: lv_precedence_8_0= RULE_INT
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

            // InternalBSharp.g:2011:3: ( (lv_expr_9_0= ruleRootExpression ) )
            // InternalBSharp.g:2012:4: (lv_expr_9_0= ruleRootExpression )
            {
            // InternalBSharp.g:2012:4: (lv_expr_9_0= ruleRootExpression )
            // InternalBSharp.g:2013:5: lv_expr_9_0= ruleRootExpression
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
    // InternalBSharp.g:2034:1: entryRuleMatchStatement returns [EObject current=null] : iv_ruleMatchStatement= ruleMatchStatement EOF ;
    public final EObject entryRuleMatchStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchStatement = null;


        try {
            // InternalBSharp.g:2034:55: (iv_ruleMatchStatement= ruleMatchStatement EOF )
            // InternalBSharp.g:2035:2: iv_ruleMatchStatement= ruleMatchStatement EOF
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
    // InternalBSharp.g:2041:1: ruleMatchStatement returns [EObject current=null] : (otherlv_0= 'match' ( (lv_match_1_0= ruleRootExpression ) ) otherlv_2= '{' ( (lv_inductCase_3_0= ruleMatchCase ) ) ( (lv_inductCase_4_0= ruleMatchCase ) )* otherlv_5= '}' ) ;
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
            // InternalBSharp.g:2047:2: ( (otherlv_0= 'match' ( (lv_match_1_0= ruleRootExpression ) ) otherlv_2= '{' ( (lv_inductCase_3_0= ruleMatchCase ) ) ( (lv_inductCase_4_0= ruleMatchCase ) )* otherlv_5= '}' ) )
            // InternalBSharp.g:2048:2: (otherlv_0= 'match' ( (lv_match_1_0= ruleRootExpression ) ) otherlv_2= '{' ( (lv_inductCase_3_0= ruleMatchCase ) ) ( (lv_inductCase_4_0= ruleMatchCase ) )* otherlv_5= '}' )
            {
            // InternalBSharp.g:2048:2: (otherlv_0= 'match' ( (lv_match_1_0= ruleRootExpression ) ) otherlv_2= '{' ( (lv_inductCase_3_0= ruleMatchCase ) ) ( (lv_inductCase_4_0= ruleMatchCase ) )* otherlv_5= '}' )
            // InternalBSharp.g:2049:3: otherlv_0= 'match' ( (lv_match_1_0= ruleRootExpression ) ) otherlv_2= '{' ( (lv_inductCase_3_0= ruleMatchCase ) ) ( (lv_inductCase_4_0= ruleMatchCase ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getMatchStatementAccess().getMatchKeyword_0());
            		
            // InternalBSharp.g:2053:3: ( (lv_match_1_0= ruleRootExpression ) )
            // InternalBSharp.g:2054:4: (lv_match_1_0= ruleRootExpression )
            {
            // InternalBSharp.g:2054:4: (lv_match_1_0= ruleRootExpression )
            // InternalBSharp.g:2055:5: lv_match_1_0= ruleRootExpression
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
            		
            // InternalBSharp.g:2076:3: ( (lv_inductCase_3_0= ruleMatchCase ) )
            // InternalBSharp.g:2077:4: (lv_inductCase_3_0= ruleMatchCase )
            {
            // InternalBSharp.g:2077:4: (lv_inductCase_3_0= ruleMatchCase )
            // InternalBSharp.g:2078:5: lv_inductCase_3_0= ruleMatchCase
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

            // InternalBSharp.g:2095:3: ( (lv_inductCase_4_0= ruleMatchCase ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==39) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalBSharp.g:2096:4: (lv_inductCase_4_0= ruleMatchCase )
            	    {
            	    // InternalBSharp.g:2096:4: (lv_inductCase_4_0= ruleMatchCase )
            	    // InternalBSharp.g:2097:5: lv_inductCase_4_0= ruleMatchCase
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
            	    break loop37;
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
    // InternalBSharp.g:2122:1: entryRuleMatchCase returns [EObject current=null] : iv_ruleMatchCase= ruleMatchCase EOF ;
    public final EObject entryRuleMatchCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchCase = null;


        try {
            // InternalBSharp.g:2122:50: (iv_ruleMatchCase= ruleMatchCase EOF )
            // InternalBSharp.g:2123:2: iv_ruleMatchCase= ruleMatchCase EOF
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
    // InternalBSharp.g:2129:1: ruleMatchCase returns [EObject current=null] : (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleRootExpression ) ) ) ;
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
            // InternalBSharp.g:2135:2: ( (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleRootExpression ) ) ) )
            // InternalBSharp.g:2136:2: (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleRootExpression ) ) )
            {
            // InternalBSharp.g:2136:2: (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleRootExpression ) ) )
            // InternalBSharp.g:2137:3: otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleRootExpression ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMatchCaseAccess().getVerticalLineKeyword_0());
            		
            // InternalBSharp.g:2141:3: ( (otherlv_1= RULE_ID ) )
            // InternalBSharp.g:2142:4: (otherlv_1= RULE_ID )
            {
            // InternalBSharp.g:2142:4: (otherlv_1= RULE_ID )
            // InternalBSharp.g:2143:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMatchCaseRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_40); 

            					newLeafNode(otherlv_1, grammarAccess.getMatchCaseAccess().getDeconNameDatatypeConstructorCrossReference_1_0());
            				

            }


            }

            // InternalBSharp.g:2154:3: (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==20) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalBSharp.g:2155:4: otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getMatchCaseAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalBSharp.g:2159:4: ( (lv_variables_3_0= ruleTypedVariable ) )
                    // InternalBSharp.g:2160:5: (lv_variables_3_0= ruleTypedVariable )
                    {
                    // InternalBSharp.g:2160:5: (lv_variables_3_0= ruleTypedVariable )
                    // InternalBSharp.g:2161:6: lv_variables_3_0= ruleTypedVariable
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

                    // InternalBSharp.g:2178:4: (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==25) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalBSharp.g:2179:5: otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) )
                    	    {
                    	    otherlv_4=(Token)match(input,25,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMatchCaseAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalBSharp.g:2183:5: ( (lv_variables_5_0= ruleTypedVariable ) )
                    	    // InternalBSharp.g:2184:6: (lv_variables_5_0= ruleTypedVariable )
                    	    {
                    	    // InternalBSharp.g:2184:6: (lv_variables_5_0= ruleTypedVariable )
                    	    // InternalBSharp.g:2185:7: lv_variables_5_0= ruleTypedVariable
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
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,21,FOLLOW_35); 

                    				newLeafNode(otherlv_6, grammarAccess.getMatchCaseAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getMatchCaseAccess().getColonKeyword_3());
            		
            // InternalBSharp.g:2212:3: ( (lv_expr_8_0= ruleRootExpression ) )
            // InternalBSharp.g:2213:4: (lv_expr_8_0= ruleRootExpression )
            {
            // InternalBSharp.g:2213:4: (lv_expr_8_0= ruleRootExpression )
            // InternalBSharp.g:2214:5: lv_expr_8_0= ruleRootExpression
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
    // InternalBSharp.g:2235:1: entryRuleTheoremBody returns [EObject current=null] : iv_ruleTheoremBody= ruleTheoremBody EOF ;
    public final EObject entryRuleTheoremBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheoremBody = null;


        try {
            // InternalBSharp.g:2235:52: (iv_ruleTheoremBody= ruleTheoremBody EOF )
            // InternalBSharp.g:2236:2: iv_ruleTheoremBody= ruleTheoremBody EOF
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
    // InternalBSharp.g:2242:1: ruleTheoremBody returns [EObject current=null] : (otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}' ) ;
    public final EObject ruleTheoremBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_theoremDecl_2_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2248:2: ( (otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}' ) )
            // InternalBSharp.g:2249:2: (otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}' )
            {
            // InternalBSharp.g:2249:2: (otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}' )
            // InternalBSharp.g:2250:3: otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getTheoremBodyAccess().getTheoremsKeyword_0());
            		
            otherlv_1=(Token)match(input,41,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTheoremBodyAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBSharp.g:2258:3: ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+
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
            	    // InternalBSharp.g:2259:4: (lv_theoremDecl_2_0= ruleTheoremDecl )
            	    {
            	    // InternalBSharp.g:2259:4: (lv_theoremDecl_2_0= ruleTheoremDecl )
            	    // InternalBSharp.g:2260:5: lv_theoremDecl_2_0= ruleTheoremDecl
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
            	    if ( cnt40 >= 1 ) break loop40;
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
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
    // InternalBSharp.g:2285:1: entryRuleTheoremDecl returns [EObject current=null] : iv_ruleTheoremDecl= ruleTheoremDecl EOF ;
    public final EObject entryRuleTheoremDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheoremDecl = null;


        try {
            // InternalBSharp.g:2285:52: (iv_ruleTheoremDecl= ruleTheoremDecl EOF )
            // InternalBSharp.g:2286:2: iv_ruleTheoremDecl= ruleTheoremDecl EOF
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
    // InternalBSharp.g:2292:1: ruleTheoremDecl returns [EObject current=null] : ( ( (lv_name_0_0= ruleTHM_NAME ) ) ( (lv_expr_1_0= ruleRootExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleTheoremDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2298:2: ( ( ( (lv_name_0_0= ruleTHM_NAME ) ) ( (lv_expr_1_0= ruleRootExpression ) ) otherlv_2= ';' ) )
            // InternalBSharp.g:2299:2: ( ( (lv_name_0_0= ruleTHM_NAME ) ) ( (lv_expr_1_0= ruleRootExpression ) ) otherlv_2= ';' )
            {
            // InternalBSharp.g:2299:2: ( ( (lv_name_0_0= ruleTHM_NAME ) ) ( (lv_expr_1_0= ruleRootExpression ) ) otherlv_2= ';' )
            // InternalBSharp.g:2300:3: ( (lv_name_0_0= ruleTHM_NAME ) ) ( (lv_expr_1_0= ruleRootExpression ) ) otherlv_2= ';'
            {
            // InternalBSharp.g:2300:3: ( (lv_name_0_0= ruleTHM_NAME ) )
            // InternalBSharp.g:2301:4: (lv_name_0_0= ruleTHM_NAME )
            {
            // InternalBSharp.g:2301:4: (lv_name_0_0= ruleTHM_NAME )
            // InternalBSharp.g:2302:5: lv_name_0_0= ruleTHM_NAME
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

            // InternalBSharp.g:2319:3: ( (lv_expr_1_0= ruleRootExpression ) )
            // InternalBSharp.g:2320:4: (lv_expr_1_0= ruleRootExpression )
            {
            // InternalBSharp.g:2320:4: (lv_expr_1_0= ruleRootExpression )
            // InternalBSharp.g:2321:5: lv_expr_1_0= ruleRootExpression
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
    // InternalBSharp.g:2346:1: entryRuleTypedVariableList returns [EObject current=null] : iv_ruleTypedVariableList= ruleTypedVariableList EOF ;
    public final EObject entryRuleTypedVariableList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedVariableList = null;


        try {
            // InternalBSharp.g:2346:58: (iv_ruleTypedVariableList= ruleTypedVariableList EOF )
            // InternalBSharp.g:2347:2: iv_ruleTypedVariableList= ruleTypedVariableList EOF
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
    // InternalBSharp.g:2353:1: ruleTypedVariableList returns [EObject current=null] : ( ( (lv_variablesOfType_0_0= ruleVariableTyping ) ) (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )* ) ;
    public final EObject ruleTypedVariableList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variablesOfType_0_0 = null;

        EObject lv_variablesOfType_2_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2359:2: ( ( ( (lv_variablesOfType_0_0= ruleVariableTyping ) ) (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )* ) )
            // InternalBSharp.g:2360:2: ( ( (lv_variablesOfType_0_0= ruleVariableTyping ) ) (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )* )
            {
            // InternalBSharp.g:2360:2: ( ( (lv_variablesOfType_0_0= ruleVariableTyping ) ) (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )* )
            // InternalBSharp.g:2361:3: ( (lv_variablesOfType_0_0= ruleVariableTyping ) ) (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )*
            {
            // InternalBSharp.g:2361:3: ( (lv_variablesOfType_0_0= ruleVariableTyping ) )
            // InternalBSharp.g:2362:4: (lv_variablesOfType_0_0= ruleVariableTyping )
            {
            // InternalBSharp.g:2362:4: (lv_variablesOfType_0_0= ruleVariableTyping )
            // InternalBSharp.g:2363:5: lv_variablesOfType_0_0= ruleVariableTyping
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

            // InternalBSharp.g:2380:3: (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==25) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalBSharp.g:2381:4: otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) )
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getTypedVariableListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalBSharp.g:2385:4: ( (lv_variablesOfType_2_0= ruleVariableTyping ) )
            	    // InternalBSharp.g:2386:5: (lv_variablesOfType_2_0= ruleVariableTyping )
            	    {
            	    // InternalBSharp.g:2386:5: (lv_variablesOfType_2_0= ruleVariableTyping )
            	    // InternalBSharp.g:2387:6: lv_variablesOfType_2_0= ruleVariableTyping
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
    // InternalBSharp.g:2409:1: entryRuleVariableTyping returns [EObject current=null] : iv_ruleVariableTyping= ruleVariableTyping EOF ;
    public final EObject entryRuleVariableTyping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableTyping = null;


        try {
            // InternalBSharp.g:2409:55: (iv_ruleVariableTyping= ruleVariableTyping EOF )
            // InternalBSharp.g:2410:2: iv_ruleVariableTyping= ruleVariableTyping EOF
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
    // InternalBSharp.g:2416:1: ruleVariableTyping returns [EObject current=null] : ( ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleConstructedType ) ) ) ;
    public final EObject ruleVariableTyping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeVar_0_0 = null;

        EObject lv_typeVar_2_0 = null;

        EObject lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2422:2: ( ( ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleConstructedType ) ) ) )
            // InternalBSharp.g:2423:2: ( ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleConstructedType ) ) )
            {
            // InternalBSharp.g:2423:2: ( ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleConstructedType ) ) )
            // InternalBSharp.g:2424:3: ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleConstructedType ) )
            {
            // InternalBSharp.g:2424:3: ( (lv_typeVar_0_0= ruleTypedVariable ) )
            // InternalBSharp.g:2425:4: (lv_typeVar_0_0= ruleTypedVariable )
            {
            // InternalBSharp.g:2425:4: (lv_typeVar_0_0= ruleTypedVariable )
            // InternalBSharp.g:2426:5: lv_typeVar_0_0= ruleTypedVariable
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

            // InternalBSharp.g:2443:3: (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==25) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalBSharp.g:2444:4: otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) )
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getVariableTypingAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalBSharp.g:2448:4: ( (lv_typeVar_2_0= ruleTypedVariable ) )
            	    // InternalBSharp.g:2449:5: (lv_typeVar_2_0= ruleTypedVariable )
            	    {
            	    // InternalBSharp.g:2449:5: (lv_typeVar_2_0= ruleTypedVariable )
            	    // InternalBSharp.g:2450:6: lv_typeVar_2_0= ruleTypedVariable
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
            	    break loop42;
                }
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableTypingAccess().getColonKeyword_2());
            		
            // InternalBSharp.g:2472:3: ( (lv_type_4_0= ruleConstructedType ) )
            // InternalBSharp.g:2473:4: (lv_type_4_0= ruleConstructedType )
            {
            // InternalBSharp.g:2473:4: (lv_type_4_0= ruleConstructedType )
            // InternalBSharp.g:2474:5: lv_type_4_0= ruleConstructedType
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
    // InternalBSharp.g:2495:1: entryRuleTypedVariable returns [EObject current=null] : iv_ruleTypedVariable= ruleTypedVariable EOF ;
    public final EObject entryRuleTypedVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedVariable = null;


        try {
            // InternalBSharp.g:2495:54: (iv_ruleTypedVariable= ruleTypedVariable EOF )
            // InternalBSharp.g:2496:2: iv_ruleTypedVariable= ruleTypedVariable EOF
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
    // InternalBSharp.g:2502:1: ruleTypedVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleTypedVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBSharp.g:2508:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBSharp.g:2509:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBSharp.g:2509:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBSharp.g:2510:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBSharp.g:2510:3: (lv_name_0_0= RULE_ID )
            // InternalBSharp.g:2511:4: lv_name_0_0= RULE_ID
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
    // InternalBSharp.g:2530:1: entryRuleLambda returns [EObject current=null] : iv_ruleLambda= ruleLambda EOF ;
    public final EObject entryRuleLambda() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLambda = null;


        try {
            // InternalBSharp.g:2530:47: (iv_ruleLambda= ruleLambda EOF )
            // InternalBSharp.g:2531:2: iv_ruleLambda= ruleLambda EOF
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
    // InternalBSharp.g:2537:1: ruleLambda returns [EObject current=null] : ( ( (lv_qType_0_0= '\\u03BB' ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '|' ( (lv_expr_4_0= ruleRootExpression ) ) ) ;
    public final EObject ruleLambda() throws RecognitionException {
        EObject current = null;

        Token lv_qType_0_0=null;
        Token otherlv_3=null;
        EObject lv_context_1_0 = null;

        EObject lv_varList_2_0 = null;

        EObject lv_expr_4_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2543:2: ( ( ( (lv_qType_0_0= '\\u03BB' ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '|' ( (lv_expr_4_0= ruleRootExpression ) ) ) )
            // InternalBSharp.g:2544:2: ( ( (lv_qType_0_0= '\\u03BB' ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '|' ( (lv_expr_4_0= ruleRootExpression ) ) )
            {
            // InternalBSharp.g:2544:2: ( ( (lv_qType_0_0= '\\u03BB' ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '|' ( (lv_expr_4_0= ruleRootExpression ) ) )
            // InternalBSharp.g:2545:3: ( (lv_qType_0_0= '\\u03BB' ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '|' ( (lv_expr_4_0= ruleRootExpression ) )
            {
            // InternalBSharp.g:2545:3: ( (lv_qType_0_0= '\\u03BB' ) )
            // InternalBSharp.g:2546:4: (lv_qType_0_0= '\\u03BB' )
            {
            // InternalBSharp.g:2546:4: (lv_qType_0_0= '\\u03BB' )
            // InternalBSharp.g:2547:5: lv_qType_0_0= '\\u03BB'
            {
            lv_qType_0_0=(Token)match(input,46,FOLLOW_45); 

            					newLeafNode(lv_qType_0_0, grammarAccess.getLambdaAccess().getQTypeGreekSmallLetterLamdaKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLambdaRule());
            					}
            					setWithLastConsumed(current, "qType", lv_qType_0_0, "\u03BB");
            				

            }


            }

            // InternalBSharp.g:2559:3: ( (lv_context_1_0= rulePolyContext ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==23) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalBSharp.g:2560:4: (lv_context_1_0= rulePolyContext )
                    {
                    // InternalBSharp.g:2560:4: (lv_context_1_0= rulePolyContext )
                    // InternalBSharp.g:2561:5: lv_context_1_0= rulePolyContext
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

            // InternalBSharp.g:2578:3: ( (lv_varList_2_0= ruleTypedVariableList ) )
            // InternalBSharp.g:2579:4: (lv_varList_2_0= ruleTypedVariableList )
            {
            // InternalBSharp.g:2579:4: (lv_varList_2_0= ruleTypedVariableList )
            // InternalBSharp.g:2580:5: lv_varList_2_0= ruleTypedVariableList
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
            		
            // InternalBSharp.g:2601:3: ( (lv_expr_4_0= ruleRootExpression ) )
            // InternalBSharp.g:2602:4: (lv_expr_4_0= ruleRootExpression )
            {
            // InternalBSharp.g:2602:4: (lv_expr_4_0= ruleRootExpression )
            // InternalBSharp.g:2603:5: lv_expr_4_0= ruleRootExpression
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
    // InternalBSharp.g:2624:1: entryRuleQuantifier returns [EObject current=null] : iv_ruleQuantifier= ruleQuantifier EOF ;
    public final EObject entryRuleQuantifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantifier = null;


        try {
            // InternalBSharp.g:2624:51: (iv_ruleQuantifier= ruleQuantifier EOF )
            // InternalBSharp.g:2625:2: iv_ruleQuantifier= ruleQuantifier EOF
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
    // InternalBSharp.g:2631:1: ruleQuantifier returns [EObject current=null] : ( ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '\\u00B7' ( (lv_expr_4_0= ruleRootExpression ) ) ) ;
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
            // InternalBSharp.g:2637:2: ( ( ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '\\u00B7' ( (lv_expr_4_0= ruleRootExpression ) ) ) )
            // InternalBSharp.g:2638:2: ( ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '\\u00B7' ( (lv_expr_4_0= ruleRootExpression ) ) )
            {
            // InternalBSharp.g:2638:2: ( ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '\\u00B7' ( (lv_expr_4_0= ruleRootExpression ) ) )
            // InternalBSharp.g:2639:3: ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '\\u00B7' ( (lv_expr_4_0= ruleRootExpression ) )
            {
            // InternalBSharp.g:2639:3: ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) )
            // InternalBSharp.g:2640:4: ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) )
            {
            // InternalBSharp.g:2640:4: ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) )
            // InternalBSharp.g:2641:5: (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' )
            {
            // InternalBSharp.g:2641:5: (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==47) ) {
                alt44=1;
            }
            else if ( (LA44_0==48) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalBSharp.g:2642:6: lv_qType_0_1= '\\u2200'
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
                    // InternalBSharp.g:2653:6: lv_qType_0_2= '\\u2203'
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

            // InternalBSharp.g:2666:3: ( (lv_context_1_0= rulePolyContext ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==23) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalBSharp.g:2667:4: (lv_context_1_0= rulePolyContext )
                    {
                    // InternalBSharp.g:2667:4: (lv_context_1_0= rulePolyContext )
                    // InternalBSharp.g:2668:5: lv_context_1_0= rulePolyContext
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

            // InternalBSharp.g:2685:3: ( (lv_varList_2_0= ruleTypedVariableList ) )
            // InternalBSharp.g:2686:4: (lv_varList_2_0= ruleTypedVariableList )
            {
            // InternalBSharp.g:2686:4: (lv_varList_2_0= ruleTypedVariableList )
            // InternalBSharp.g:2687:5: lv_varList_2_0= ruleTypedVariableList
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
            		
            // InternalBSharp.g:2708:3: ( (lv_expr_4_0= ruleRootExpression ) )
            // InternalBSharp.g:2709:4: (lv_expr_4_0= ruleRootExpression )
            {
            // InternalBSharp.g:2709:4: (lv_expr_4_0= ruleRootExpression )
            // InternalBSharp.g:2710:5: lv_expr_4_0= ruleRootExpression
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
    // InternalBSharp.g:2731:1: entryRuleRootExpression returns [EObject current=null] : iv_ruleRootExpression= ruleRootExpression EOF ;
    public final EObject entryRuleRootExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootExpression = null;


        try {
            // InternalBSharp.g:2731:55: (iv_ruleRootExpression= ruleRootExpression EOF )
            // InternalBSharp.g:2732:2: iv_ruleRootExpression= ruleRootExpression EOF
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
    // InternalBSharp.g:2738:1: ruleRootExpression returns [EObject current=null] : (this_Lambda_0= ruleLambda | this_Quantifier_1= ruleQuantifier | this_Infix_2= ruleInfix | this_MatchStatement_3= ruleMatchStatement ) ;
    public final EObject ruleRootExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Lambda_0 = null;

        EObject this_Quantifier_1 = null;

        EObject this_Infix_2 = null;

        EObject this_MatchStatement_3 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2744:2: ( (this_Lambda_0= ruleLambda | this_Quantifier_1= ruleQuantifier | this_Infix_2= ruleInfix | this_MatchStatement_3= ruleMatchStatement ) )
            // InternalBSharp.g:2745:2: (this_Lambda_0= ruleLambda | this_Quantifier_1= ruleQuantifier | this_Infix_2= ruleInfix | this_MatchStatement_3= ruleMatchStatement )
            {
            // InternalBSharp.g:2745:2: (this_Lambda_0= ruleLambda | this_Quantifier_1= ruleQuantifier | this_Infix_2= ruleInfix | this_MatchStatement_3= ruleMatchStatement )
            int alt46=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt46=1;
                }
                break;
            case 47:
            case 48:
                {
                alt46=2;
                }
                break;
            case RULE_ID:
            case 18:
            case 20:
            case 50:
                {
                alt46=3;
                }
                break;
            case 44:
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
                    // InternalBSharp.g:2746:3: this_Lambda_0= ruleLambda
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
                    // InternalBSharp.g:2755:3: this_Quantifier_1= ruleQuantifier
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
                    // InternalBSharp.g:2764:3: this_Infix_2= ruleInfix
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
                    // InternalBSharp.g:2773:3: this_MatchStatement_3= ruleMatchStatement
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
    // InternalBSharp.g:2785:1: entryRulePrefix returns [EObject current=null] : iv_rulePrefix= rulePrefix EOF ;
    public final EObject entryRulePrefix() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefix = null;


        try {
            // InternalBSharp.g:2785:47: (iv_rulePrefix= rulePrefix EOF )
            // InternalBSharp.g:2786:2: iv_rulePrefix= rulePrefix EOF
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
    // InternalBSharp.g:2792:1: rulePrefix returns [EObject current=null] : ( ( (lv_name_0_0= rulePrefixBuiltIn ) ) ( (lv_elem_1_0= ruleElement ) ) ) ;
    public final EObject rulePrefix() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_elem_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2798:2: ( ( ( (lv_name_0_0= rulePrefixBuiltIn ) ) ( (lv_elem_1_0= ruleElement ) ) ) )
            // InternalBSharp.g:2799:2: ( ( (lv_name_0_0= rulePrefixBuiltIn ) ) ( (lv_elem_1_0= ruleElement ) ) )
            {
            // InternalBSharp.g:2799:2: ( ( (lv_name_0_0= rulePrefixBuiltIn ) ) ( (lv_elem_1_0= ruleElement ) ) )
            // InternalBSharp.g:2800:3: ( (lv_name_0_0= rulePrefixBuiltIn ) ) ( (lv_elem_1_0= ruleElement ) )
            {
            // InternalBSharp.g:2800:3: ( (lv_name_0_0= rulePrefixBuiltIn ) )
            // InternalBSharp.g:2801:4: (lv_name_0_0= rulePrefixBuiltIn )
            {
            // InternalBSharp.g:2801:4: (lv_name_0_0= rulePrefixBuiltIn )
            // InternalBSharp.g:2802:5: lv_name_0_0= rulePrefixBuiltIn
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

            // InternalBSharp.g:2819:3: ( (lv_elem_1_0= ruleElement ) )
            // InternalBSharp.g:2820:4: (lv_elem_1_0= ruleElement )
            {
            // InternalBSharp.g:2820:4: (lv_elem_1_0= ruleElement )
            // InternalBSharp.g:2821:5: lv_elem_1_0= ruleElement
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
    // InternalBSharp.g:2842:1: entryRulePrefixBuiltIn returns [String current=null] : iv_rulePrefixBuiltIn= rulePrefixBuiltIn EOF ;
    public final String entryRulePrefixBuiltIn() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrefixBuiltIn = null;


        try {
            // InternalBSharp.g:2842:53: (iv_rulePrefixBuiltIn= rulePrefixBuiltIn EOF )
            // InternalBSharp.g:2843:2: iv_rulePrefixBuiltIn= rulePrefixBuiltIn EOF
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
    // InternalBSharp.g:2849:1: rulePrefixBuiltIn returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '\\u00AC' ;
    public final AntlrDatatypeRuleToken rulePrefixBuiltIn() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBSharp.g:2855:2: (kw= '\\u00AC' )
            // InternalBSharp.g:2856:2: kw= '\\u00AC'
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
    // InternalBSharp.g:2864:1: entryRuleInfix returns [EObject current=null] : iv_ruleInfix= ruleInfix EOF ;
    public final EObject entryRuleInfix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfix = null;


        try {
            // InternalBSharp.g:2864:46: (iv_ruleInfix= ruleInfix EOF )
            // InternalBSharp.g:2865:2: iv_ruleInfix= ruleInfix EOF
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
    // InternalBSharp.g:2871:1: ruleInfix returns [EObject current=null] : (this_Element_0= ruleElement ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )* ) ;
    public final EObject ruleInfix() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Element_0 = null;

        AntlrDatatypeRuleToken lv_opName_3_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2877:2: ( (this_Element_0= ruleElement ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )* ) )
            // InternalBSharp.g:2878:2: (this_Element_0= ruleElement ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )* )
            {
            // InternalBSharp.g:2878:2: (this_Element_0= ruleElement ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )* )
            // InternalBSharp.g:2879:3: this_Element_0= ruleElement ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )*
            {

            			newCompositeNode(grammarAccess.getInfixAccess().getElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_48);
            this_Element_0=ruleElement();

            state._fsp--;


            			current = this_Element_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalBSharp.g:2887:3: ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_ID) ) {
                    int LA48_2 = input.LA(2);

                    if ( (LA48_2==20) ) {
                        int LA48_4 = input.LA(3);

                        if ( (LA48_4==RULE_ID) ) {
                            int LA48_5 = input.LA(4);

                            if ( (LA48_5==RULE_ID||LA48_5==13||(LA48_5>=20 && LA48_5<=21)||LA48_5==23||(LA48_5>=51 && LA48_5<=57)) ) {
                                alt48=1;
                            }


                        }
                        else if ( (LA48_4==18||LA48_4==20||LA48_4==44||(LA48_4>=46 && LA48_4<=48)||LA48_4==50) ) {
                            alt48=1;
                        }


                    }
                    else if ( (LA48_2==RULE_ID||LA48_2==18||LA48_2==50) ) {
                        alt48=1;
                    }


                }
                else if ( ((LA48_0>=51 && LA48_0<=57)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalBSharp.g:2888:4: () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) )
            	    {
            	    // InternalBSharp.g:2888:4: ()
            	    // InternalBSharp.g:2889:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getInfixAccess().getInfixLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalBSharp.g:2895:4: ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) )
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( (LA47_0==RULE_ID) ) {
            	        alt47=1;
            	    }
            	    else if ( ((LA47_0>=51 && LA47_0<=57)) ) {
            	        alt47=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 47, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // InternalBSharp.g:2896:5: ( (otherlv_2= RULE_ID ) )
            	            {
            	            // InternalBSharp.g:2896:5: ( (otherlv_2= RULE_ID ) )
            	            // InternalBSharp.g:2897:6: (otherlv_2= RULE_ID )
            	            {
            	            // InternalBSharp.g:2897:6: (otherlv_2= RULE_ID )
            	            // InternalBSharp.g:2898:7: otherlv_2= RULE_ID
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
            	            // InternalBSharp.g:2910:5: ( (lv_opName_3_0= ruleInbuiltInfix ) )
            	            {
            	            // InternalBSharp.g:2910:5: ( (lv_opName_3_0= ruleInbuiltInfix ) )
            	            // InternalBSharp.g:2911:6: (lv_opName_3_0= ruleInbuiltInfix )
            	            {
            	            // InternalBSharp.g:2911:6: (lv_opName_3_0= ruleInbuiltInfix )
            	            // InternalBSharp.g:2912:7: lv_opName_3_0= ruleInbuiltInfix
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

            	    // InternalBSharp.g:2930:4: ( (lv_right_4_0= ruleElement ) )
            	    // InternalBSharp.g:2931:5: (lv_right_4_0= ruleElement )
            	    {
            	    // InternalBSharp.g:2931:5: (lv_right_4_0= ruleElement )
            	    // InternalBSharp.g:2932:6: lv_right_4_0= ruleElement
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
    // InternalBSharp.g:2954:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalBSharp.g:2954:48: (iv_ruleElement= ruleElement EOF )
            // InternalBSharp.g:2955:2: iv_ruleElement= ruleElement EOF
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
    // InternalBSharp.g:2961:1: ruleElement returns [EObject current=null] : (this_Bracket_0= ruleBracket | this_Prefix_1= rulePrefix | this_FunctionCall_2= ruleFunctionCall ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Bracket_0 = null;

        EObject this_Prefix_1 = null;

        EObject this_FunctionCall_2 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2967:2: ( (this_Bracket_0= ruleBracket | this_Prefix_1= rulePrefix | this_FunctionCall_2= ruleFunctionCall ) )
            // InternalBSharp.g:2968:2: (this_Bracket_0= ruleBracket | this_Prefix_1= rulePrefix | this_FunctionCall_2= ruleFunctionCall )
            {
            // InternalBSharp.g:2968:2: (this_Bracket_0= ruleBracket | this_Prefix_1= rulePrefix | this_FunctionCall_2= ruleFunctionCall )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt49=1;
                }
                break;
            case 50:
                {
                alt49=2;
                }
                break;
            case RULE_ID:
            case 18:
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
                    // InternalBSharp.g:2969:3: this_Bracket_0= ruleBracket
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
                    // InternalBSharp.g:2978:3: this_Prefix_1= rulePrefix
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
                    // InternalBSharp.g:2987:3: this_FunctionCall_2= ruleFunctionCall
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
    // InternalBSharp.g:2999:1: entryRuleBracket returns [EObject current=null] : iv_ruleBracket= ruleBracket EOF ;
    public final EObject entryRuleBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBracket = null;


        try {
            // InternalBSharp.g:2999:48: (iv_ruleBracket= ruleBracket EOF )
            // InternalBSharp.g:3000:2: iv_ruleBracket= ruleBracket EOF
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
    // InternalBSharp.g:3006:1: ruleBracket returns [EObject current=null] : (otherlv_0= '(' ( (lv_child_1_0= ruleRootExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_child_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:3012:2: ( (otherlv_0= '(' ( (lv_child_1_0= ruleRootExpression ) ) otherlv_2= ')' ) )
            // InternalBSharp.g:3013:2: (otherlv_0= '(' ( (lv_child_1_0= ruleRootExpression ) ) otherlv_2= ')' )
            {
            // InternalBSharp.g:3013:2: (otherlv_0= '(' ( (lv_child_1_0= ruleRootExpression ) ) otherlv_2= ')' )
            // InternalBSharp.g:3014:3: otherlv_0= '(' ( (lv_child_1_0= ruleRootExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getBracketAccess().getLeftParenthesisKeyword_0());
            		
            // InternalBSharp.g:3018:3: ( (lv_child_1_0= ruleRootExpression ) )
            // InternalBSharp.g:3019:4: (lv_child_1_0= ruleRootExpression )
            {
            // InternalBSharp.g:3019:4: (lv_child_1_0= ruleRootExpression )
            // InternalBSharp.g:3020:5: lv_child_1_0= ruleRootExpression
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
    // InternalBSharp.g:3045:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalBSharp.g:3045:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalBSharp.g:3046:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalBSharp.g:3052:1: ruleFunctionCall returns [EObject current=null] : ( ( (lv_wrapped_0_0= ruleWrappedInfix ) ) | ( ( ( (otherlv_1= RULE_ID ) ) | ( (lv_classVarDecl_2_0= ruleClassVarDecl ) ) ) ( (lv_context_3_0= ruleTypeDeclContext ) )? (otherlv_4= '(' ( (lv_arguments_5_0= ruleRootExpression ) )? (otherlv_6= ',' ( (lv_arguments_7_0= ruleRootExpression ) ) )* otherlv_8= ')' )? ) ) ;
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
            // InternalBSharp.g:3058:2: ( ( ( (lv_wrapped_0_0= ruleWrappedInfix ) ) | ( ( ( (otherlv_1= RULE_ID ) ) | ( (lv_classVarDecl_2_0= ruleClassVarDecl ) ) ) ( (lv_context_3_0= ruleTypeDeclContext ) )? (otherlv_4= '(' ( (lv_arguments_5_0= ruleRootExpression ) )? (otherlv_6= ',' ( (lv_arguments_7_0= ruleRootExpression ) ) )* otherlv_8= ')' )? ) ) )
            // InternalBSharp.g:3059:2: ( ( (lv_wrapped_0_0= ruleWrappedInfix ) ) | ( ( ( (otherlv_1= RULE_ID ) ) | ( (lv_classVarDecl_2_0= ruleClassVarDecl ) ) ) ( (lv_context_3_0= ruleTypeDeclContext ) )? (otherlv_4= '(' ( (lv_arguments_5_0= ruleRootExpression ) )? (otherlv_6= ',' ( (lv_arguments_7_0= ruleRootExpression ) ) )* otherlv_8= ')' )? ) )
            {
            // InternalBSharp.g:3059:2: ( ( (lv_wrapped_0_0= ruleWrappedInfix ) ) | ( ( ( (otherlv_1= RULE_ID ) ) | ( (lv_classVarDecl_2_0= ruleClassVarDecl ) ) ) ( (lv_context_3_0= ruleTypeDeclContext ) )? (otherlv_4= '(' ( (lv_arguments_5_0= ruleRootExpression ) )? (otherlv_6= ',' ( (lv_arguments_7_0= ruleRootExpression ) ) )* otherlv_8= ')' )? ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==18) ) {
                alt55=1;
            }
            else if ( (LA55_0==RULE_ID) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalBSharp.g:3060:3: ( (lv_wrapped_0_0= ruleWrappedInfix ) )
                    {
                    // InternalBSharp.g:3060:3: ( (lv_wrapped_0_0= ruleWrappedInfix ) )
                    // InternalBSharp.g:3061:4: (lv_wrapped_0_0= ruleWrappedInfix )
                    {
                    // InternalBSharp.g:3061:4: (lv_wrapped_0_0= ruleWrappedInfix )
                    // InternalBSharp.g:3062:5: lv_wrapped_0_0= ruleWrappedInfix
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
                    // InternalBSharp.g:3080:3: ( ( ( (otherlv_1= RULE_ID ) ) | ( (lv_classVarDecl_2_0= ruleClassVarDecl ) ) ) ( (lv_context_3_0= ruleTypeDeclContext ) )? (otherlv_4= '(' ( (lv_arguments_5_0= ruleRootExpression ) )? (otherlv_6= ',' ( (lv_arguments_7_0= ruleRootExpression ) ) )* otherlv_8= ')' )? )
                    {
                    // InternalBSharp.g:3080:3: ( ( ( (otherlv_1= RULE_ID ) ) | ( (lv_classVarDecl_2_0= ruleClassVarDecl ) ) ) ( (lv_context_3_0= ruleTypeDeclContext ) )? (otherlv_4= '(' ( (lv_arguments_5_0= ruleRootExpression ) )? (otherlv_6= ',' ( (lv_arguments_7_0= ruleRootExpression ) ) )* otherlv_8= ')' )? )
                    // InternalBSharp.g:3081:4: ( ( (otherlv_1= RULE_ID ) ) | ( (lv_classVarDecl_2_0= ruleClassVarDecl ) ) ) ( (lv_context_3_0= ruleTypeDeclContext ) )? (otherlv_4= '(' ( (lv_arguments_5_0= ruleRootExpression ) )? (otherlv_6= ',' ( (lv_arguments_7_0= ruleRootExpression ) ) )* otherlv_8= ')' )?
                    {
                    // InternalBSharp.g:3081:4: ( ( (otherlv_1= RULE_ID ) ) | ( (lv_classVarDecl_2_0= ruleClassVarDecl ) ) )
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==RULE_ID) ) {
                        int LA50_1 = input.LA(2);

                        if ( (LA50_1==13) ) {
                            alt50=2;
                        }
                        else if ( (LA50_1==EOF||LA50_1==RULE_ID||(LA50_1>=20 && LA50_1<=23)||LA50_1==25||LA50_1==39||(LA50_1>=41 && LA50_1<=42)||LA50_1==45||(LA50_1>=51 && LA50_1<=58)) ) {
                            alt50=1;
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
                            // InternalBSharp.g:3082:5: ( (otherlv_1= RULE_ID ) )
                            {
                            // InternalBSharp.g:3082:5: ( (otherlv_1= RULE_ID ) )
                            // InternalBSharp.g:3083:6: (otherlv_1= RULE_ID )
                            {
                            // InternalBSharp.g:3083:6: (otherlv_1= RULE_ID )
                            // InternalBSharp.g:3084:7: otherlv_1= RULE_ID
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
                            // InternalBSharp.g:3096:5: ( (lv_classVarDecl_2_0= ruleClassVarDecl ) )
                            {
                            // InternalBSharp.g:3096:5: ( (lv_classVarDecl_2_0= ruleClassVarDecl ) )
                            // InternalBSharp.g:3097:6: (lv_classVarDecl_2_0= ruleClassVarDecl )
                            {
                            // InternalBSharp.g:3097:6: (lv_classVarDecl_2_0= ruleClassVarDecl )
                            // InternalBSharp.g:3098:7: lv_classVarDecl_2_0= ruleClassVarDecl
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

                    // InternalBSharp.g:3116:4: ( (lv_context_3_0= ruleTypeDeclContext ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==23) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalBSharp.g:3117:5: (lv_context_3_0= ruleTypeDeclContext )
                            {
                            // InternalBSharp.g:3117:5: (lv_context_3_0= ruleTypeDeclContext )
                            // InternalBSharp.g:3118:6: lv_context_3_0= ruleTypeDeclContext
                            {

                            						newCompositeNode(grammarAccess.getFunctionCallAccess().getContextTypeDeclContextParserRuleCall_1_1_0());
                            					
                            pushFollow(FOLLOW_31);
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

                    // InternalBSharp.g:3135:4: (otherlv_4= '(' ( (lv_arguments_5_0= ruleRootExpression ) )? (otherlv_6= ',' ( (lv_arguments_7_0= ruleRootExpression ) ) )* otherlv_8= ')' )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==20) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalBSharp.g:3136:5: otherlv_4= '(' ( (lv_arguments_5_0= ruleRootExpression ) )? (otherlv_6= ',' ( (lv_arguments_7_0= ruleRootExpression ) ) )* otherlv_8= ')'
                            {
                            otherlv_4=(Token)match(input,20,FOLLOW_50); 

                            					newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1_2_0());
                            				
                            // InternalBSharp.g:3140:5: ( (lv_arguments_5_0= ruleRootExpression ) )?
                            int alt52=2;
                            int LA52_0 = input.LA(1);

                            if ( (LA52_0==RULE_ID||LA52_0==18||LA52_0==20||LA52_0==44||(LA52_0>=46 && LA52_0<=48)||LA52_0==50) ) {
                                alt52=1;
                            }
                            switch (alt52) {
                                case 1 :
                                    // InternalBSharp.g:3141:6: (lv_arguments_5_0= ruleRootExpression )
                                    {
                                    // InternalBSharp.g:3141:6: (lv_arguments_5_0= ruleRootExpression )
                                    // InternalBSharp.g:3142:7: lv_arguments_5_0= ruleRootExpression
                                    {

                                    							newCompositeNode(grammarAccess.getFunctionCallAccess().getArgumentsRootExpressionParserRuleCall_1_2_1_0());
                                    						
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

                            // InternalBSharp.g:3159:5: (otherlv_6= ',' ( (lv_arguments_7_0= ruleRootExpression ) ) )*
                            loop53:
                            do {
                                int alt53=2;
                                int LA53_0 = input.LA(1);

                                if ( (LA53_0==25) ) {
                                    alt53=1;
                                }


                                switch (alt53) {
                            	case 1 :
                            	    // InternalBSharp.g:3160:6: otherlv_6= ',' ( (lv_arguments_7_0= ruleRootExpression ) )
                            	    {
                            	    otherlv_6=(Token)match(input,25,FOLLOW_26); 

                            	    						newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getCommaKeyword_1_2_2_0());
                            	    					
                            	    // InternalBSharp.g:3164:6: ( (lv_arguments_7_0= ruleRootExpression ) )
                            	    // InternalBSharp.g:3165:7: (lv_arguments_7_0= ruleRootExpression )
                            	    {
                            	    // InternalBSharp.g:3165:7: (lv_arguments_7_0= ruleRootExpression )
                            	    // InternalBSharp.g:3166:8: lv_arguments_7_0= ruleRootExpression
                            	    {

                            	    								newCompositeNode(grammarAccess.getFunctionCallAccess().getArgumentsRootExpressionParserRuleCall_1_2_2_1_0());
                            	    							
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
                            	    break loop53;
                                }
                            } while (true);

                            otherlv_8=(Token)match(input,21,FOLLOW_2); 

                            					newLeafNode(otherlv_8, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_1_2_3());
                            				

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
    // InternalBSharp.g:3194:1: entryRuleClassVarDecl returns [EObject current=null] : iv_ruleClassVarDecl= ruleClassVarDecl EOF ;
    public final EObject entryRuleClassVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassVarDecl = null;


        try {
            // InternalBSharp.g:3194:53: (iv_ruleClassVarDecl= ruleClassVarDecl EOF )
            // InternalBSharp.g:3195:2: iv_ruleClassVarDecl= ruleClassVarDecl EOF
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
    // InternalBSharp.g:3201:1: ruleClassVarDecl returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleClassVarDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalBSharp.g:3207:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalBSharp.g:3208:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalBSharp.g:3208:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalBSharp.g:3209:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // InternalBSharp.g:3209:3: ( (otherlv_0= RULE_ID ) )
            // InternalBSharp.g:3210:4: (otherlv_0= RULE_ID )
            {
            // InternalBSharp.g:3210:4: (otherlv_0= RULE_ID )
            // InternalBSharp.g:3211:5: otherlv_0= RULE_ID
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
            		
            // InternalBSharp.g:3226:3: ( (otherlv_2= RULE_ID ) )
            // InternalBSharp.g:3227:4: (otherlv_2= RULE_ID )
            {
            // InternalBSharp.g:3227:4: (otherlv_2= RULE_ID )
            // InternalBSharp.g:3228:5: otherlv_2= RULE_ID
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
    // InternalBSharp.g:3243:1: entryRuleInbuiltInfix returns [String current=null] : iv_ruleInbuiltInfix= ruleInbuiltInfix EOF ;
    public final String entryRuleInbuiltInfix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInbuiltInfix = null;


        try {
            // InternalBSharp.g:3243:52: (iv_ruleInbuiltInfix= ruleInbuiltInfix EOF )
            // InternalBSharp.g:3244:2: iv_ruleInbuiltInfix= ruleInbuiltInfix EOF
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
    // InternalBSharp.g:3250:1: ruleInbuiltInfix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\u21D4' | kw= '\\u21D2' | kw= '=' | kw= '\\u2260' | kw= '\\u2227' | kw= '\\u2228' | kw= '\\u2208' ) ;
    public final AntlrDatatypeRuleToken ruleInbuiltInfix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBSharp.g:3256:2: ( (kw= '\\u21D4' | kw= '\\u21D2' | kw= '=' | kw= '\\u2260' | kw= '\\u2227' | kw= '\\u2228' | kw= '\\u2208' ) )
            // InternalBSharp.g:3257:2: (kw= '\\u21D4' | kw= '\\u21D2' | kw= '=' | kw= '\\u2260' | kw= '\\u2227' | kw= '\\u2228' | kw= '\\u2208' )
            {
            // InternalBSharp.g:3257:2: (kw= '\\u21D4' | kw= '\\u21D2' | kw= '=' | kw= '\\u2260' | kw= '\\u2227' | kw= '\\u2228' | kw= '\\u2208' )
            int alt56=7;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt56=1;
                }
                break;
            case 52:
                {
                alt56=2;
                }
                break;
            case 53:
                {
                alt56=3;
                }
                break;
            case 54:
                {
                alt56=4;
                }
                break;
            case 55:
                {
                alt56=5;
                }
                break;
            case 56:
                {
                alt56=6;
                }
                break;
            case 57:
                {
                alt56=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalBSharp.g:3258:3: kw= '\\u21D4'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getLeftRightDoubleArrowKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBSharp.g:3264:3: kw= '\\u21D2'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getRightwardsDoubleArrowKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBSharp.g:3270:3: kw= '='
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalBSharp.g:3276:3: kw= '\\u2260'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getNotEqualToKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalBSharp.g:3282:3: kw= '\\u2227'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getLogicalAndKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalBSharp.g:3288:3: kw= '\\u2228'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getLogicalOrKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalBSharp.g:3294:3: kw= '\\u2208'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getElementOfKeyword_6());
                    		

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
    // InternalBSharp.g:3303:1: entryRuleWrappedInfix returns [EObject current=null] : iv_ruleWrappedInfix= ruleWrappedInfix EOF ;
    public final EObject entryRuleWrappedInfix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWrappedInfix = null;


        try {
            // InternalBSharp.g:3303:53: (iv_ruleWrappedInfix= ruleWrappedInfix EOF )
            // InternalBSharp.g:3304:2: iv_ruleWrappedInfix= ruleWrappedInfix EOF
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
    // InternalBSharp.g:3310:1: ruleWrappedInfix returns [EObject current=null] : (otherlv_0= '[' ( ( (lv_inbuilt_1_0= ruleInbuiltInfix ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= ']' ) ;
    public final EObject ruleWrappedInfix() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_inbuilt_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:3316:2: ( (otherlv_0= '[' ( ( (lv_inbuilt_1_0= ruleInbuiltInfix ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= ']' ) )
            // InternalBSharp.g:3317:2: (otherlv_0= '[' ( ( (lv_inbuilt_1_0= ruleInbuiltInfix ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= ']' )
            {
            // InternalBSharp.g:3317:2: (otherlv_0= '[' ( ( (lv_inbuilt_1_0= ruleInbuiltInfix ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= ']' )
            // InternalBSharp.g:3318:3: otherlv_0= '[' ( ( (lv_inbuilt_1_0= ruleInbuiltInfix ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_52); 

            			newLeafNode(otherlv_0, grammarAccess.getWrappedInfixAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalBSharp.g:3322:3: ( ( (lv_inbuilt_1_0= ruleInbuiltInfix ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=51 && LA57_0<=57)) ) {
                alt57=1;
            }
            else if ( (LA57_0==RULE_ID) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalBSharp.g:3323:4: ( (lv_inbuilt_1_0= ruleInbuiltInfix ) )
                    {
                    // InternalBSharp.g:3323:4: ( (lv_inbuilt_1_0= ruleInbuiltInfix ) )
                    // InternalBSharp.g:3324:5: (lv_inbuilt_1_0= ruleInbuiltInfix )
                    {
                    // InternalBSharp.g:3324:5: (lv_inbuilt_1_0= ruleInbuiltInfix )
                    // InternalBSharp.g:3325:6: lv_inbuilt_1_0= ruleInbuiltInfix
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
                    // InternalBSharp.g:3343:4: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalBSharp.g:3343:4: ( (otherlv_2= RULE_ID ) )
                    // InternalBSharp.g:3344:5: (otherlv_2= RULE_ID )
                    {
                    // InternalBSharp.g:3344:5: (otherlv_2= RULE_ID )
                    // InternalBSharp.g:3345:6: otherlv_2= RULE_ID
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
    // InternalBSharp.g:3365:1: entryRuleInstance returns [EObject current=null] : iv_ruleInstance= ruleInstance EOF ;
    public final EObject entryRuleInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstance = null;


        try {
            // InternalBSharp.g:3365:49: (iv_ruleInstance= ruleInstance EOF )
            // InternalBSharp.g:3366:2: iv_ruleInstance= ruleInstance EOF
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
    // InternalBSharp.g:3372:1: ruleInstance returns [EObject current=null] : (otherlv_0= 'Instance' ( ( ruleQualifiedName ) ) otherlv_2= '<' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '>' otherlv_5= '(' ( (lv_arguments_6_0= ruleRootExpression ) )? (otherlv_7= ',' ( (lv_arguments_8_0= ruleRootExpression ) ) )* otherlv_9= ')' ( (lv_name_10_0= RULE_ID ) )? (otherlv_11= '(' ( (lv_referencingFuncs_12_0= ruleReferencingFunc ) ) otherlv_13= ')' )* ) ;
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
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_arguments_6_0 = null;

        EObject lv_arguments_8_0 = null;

        EObject lv_referencingFuncs_12_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:3378:2: ( (otherlv_0= 'Instance' ( ( ruleQualifiedName ) ) otherlv_2= '<' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '>' otherlv_5= '(' ( (lv_arguments_6_0= ruleRootExpression ) )? (otherlv_7= ',' ( (lv_arguments_8_0= ruleRootExpression ) ) )* otherlv_9= ')' ( (lv_name_10_0= RULE_ID ) )? (otherlv_11= '(' ( (lv_referencingFuncs_12_0= ruleReferencingFunc ) ) otherlv_13= ')' )* ) )
            // InternalBSharp.g:3379:2: (otherlv_0= 'Instance' ( ( ruleQualifiedName ) ) otherlv_2= '<' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '>' otherlv_5= '(' ( (lv_arguments_6_0= ruleRootExpression ) )? (otherlv_7= ',' ( (lv_arguments_8_0= ruleRootExpression ) ) )* otherlv_9= ')' ( (lv_name_10_0= RULE_ID ) )? (otherlv_11= '(' ( (lv_referencingFuncs_12_0= ruleReferencingFunc ) ) otherlv_13= ')' )* )
            {
            // InternalBSharp.g:3379:2: (otherlv_0= 'Instance' ( ( ruleQualifiedName ) ) otherlv_2= '<' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '>' otherlv_5= '(' ( (lv_arguments_6_0= ruleRootExpression ) )? (otherlv_7= ',' ( (lv_arguments_8_0= ruleRootExpression ) ) )* otherlv_9= ')' ( (lv_name_10_0= RULE_ID ) )? (otherlv_11= '(' ( (lv_referencingFuncs_12_0= ruleReferencingFunc ) ) otherlv_13= ')' )* )
            // InternalBSharp.g:3380:3: otherlv_0= 'Instance' ( ( ruleQualifiedName ) ) otherlv_2= '<' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '>' otherlv_5= '(' ( (lv_arguments_6_0= ruleRootExpression ) )? (otherlv_7= ',' ( (lv_arguments_8_0= ruleRootExpression ) ) )* otherlv_9= ')' ( (lv_name_10_0= RULE_ID ) )? (otherlv_11= '(' ( (lv_referencingFuncs_12_0= ruleReferencingFunc ) ) otherlv_13= ')' )*
            {
            otherlv_0=(Token)match(input,58,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInstanceAccess().getInstanceKeyword_0());
            		
            // InternalBSharp.g:3384:3: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:3385:4: ( ruleQualifiedName )
            {
            // InternalBSharp.g:3385:4: ( ruleQualifiedName )
            // InternalBSharp.g:3386:5: ruleQualifiedName
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
            		
            // InternalBSharp.g:3404:3: ( (otherlv_3= RULE_ID ) )+
            int cnt58=0;
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_ID) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalBSharp.g:3405:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalBSharp.g:3405:4: (otherlv_3= RULE_ID )
            	    // InternalBSharp.g:3406:5: otherlv_3= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getInstanceRule());
            	    					}
            	    				
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_18); 

            	    					newLeafNode(otherlv_3, grammarAccess.getInstanceAccess().getContextIClassInstanceCrossReference_3_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt58 >= 1 ) break loop58;
                        EarlyExitException eee =
                            new EarlyExitException(58, input);
                        throw eee;
                }
                cnt58++;
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getInstanceAccess().getGreaterThanSignKeyword_4());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_50); 

            			newLeafNode(otherlv_5, grammarAccess.getInstanceAccess().getLeftParenthesisKeyword_5());
            		
            // InternalBSharp.g:3425:3: ( (lv_arguments_6_0= ruleRootExpression ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID||LA59_0==18||LA59_0==20||LA59_0==44||(LA59_0>=46 && LA59_0<=48)||LA59_0==50) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalBSharp.g:3426:4: (lv_arguments_6_0= ruleRootExpression )
                    {
                    // InternalBSharp.g:3426:4: (lv_arguments_6_0= ruleRootExpression )
                    // InternalBSharp.g:3427:5: lv_arguments_6_0= ruleRootExpression
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

            // InternalBSharp.g:3444:3: (otherlv_7= ',' ( (lv_arguments_8_0= ruleRootExpression ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==25) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalBSharp.g:3445:4: otherlv_7= ',' ( (lv_arguments_8_0= ruleRootExpression ) )
            	    {
            	    otherlv_7=(Token)match(input,25,FOLLOW_26); 

            	    				newLeafNode(otherlv_7, grammarAccess.getInstanceAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalBSharp.g:3449:4: ( (lv_arguments_8_0= ruleRootExpression ) )
            	    // InternalBSharp.g:3450:5: (lv_arguments_8_0= ruleRootExpression )
            	    {
            	    // InternalBSharp.g:3450:5: (lv_arguments_8_0= ruleRootExpression )
            	    // InternalBSharp.g:3451:6: lv_arguments_8_0= ruleRootExpression
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
            	    break loop60;
                }
            } while (true);

            otherlv_9=(Token)match(input,21,FOLLOW_54); 

            			newLeafNode(otherlv_9, grammarAccess.getInstanceAccess().getRightParenthesisKeyword_8());
            		
            // InternalBSharp.g:3473:3: ( (lv_name_10_0= RULE_ID ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                int LA61_1 = input.LA(2);

                if ( (LA61_1==20) ) {
                    int LA61_3 = input.LA(3);

                    if ( (LA61_3==RULE_ID) ) {
                        int LA61_5 = input.LA(4);

                        if ( (LA61_5==53) ) {
                            alt61=1;
                        }
                    }
                }
                else if ( (LA61_1==EOF||LA61_1==RULE_ID||LA61_1==42||LA61_1==45||LA61_1==58) ) {
                    alt61=1;
                }
            }
            switch (alt61) {
                case 1 :
                    // InternalBSharp.g:3474:4: (lv_name_10_0= RULE_ID )
                    {
                    // InternalBSharp.g:3474:4: (lv_name_10_0= RULE_ID )
                    // InternalBSharp.g:3475:5: lv_name_10_0= RULE_ID
                    {
                    lv_name_10_0=(Token)match(input,RULE_ID,FOLLOW_31); 

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

            // InternalBSharp.g:3491:3: (otherlv_11= '(' ( (lv_referencingFuncs_12_0= ruleReferencingFunc ) ) otherlv_13= ')' )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==20) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalBSharp.g:3492:4: otherlv_11= '(' ( (lv_referencingFuncs_12_0= ruleReferencingFunc ) ) otherlv_13= ')'
            	    {
            	    otherlv_11=(Token)match(input,20,FOLLOW_3); 

            	    				newLeafNode(otherlv_11, grammarAccess.getInstanceAccess().getLeftParenthesisKeyword_10_0());
            	    			
            	    // InternalBSharp.g:3496:4: ( (lv_referencingFuncs_12_0= ruleReferencingFunc ) )
            	    // InternalBSharp.g:3497:5: (lv_referencingFuncs_12_0= ruleReferencingFunc )
            	    {
            	    // InternalBSharp.g:3497:5: (lv_referencingFuncs_12_0= ruleReferencingFunc )
            	    // InternalBSharp.g:3498:6: lv_referencingFuncs_12_0= ruleReferencingFunc
            	    {

            	    						newCompositeNode(grammarAccess.getInstanceAccess().getReferencingFuncsReferencingFuncParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_referencingFuncs_12_0=ruleReferencingFunc();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInstanceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"referencingFuncs",
            	    							lv_referencingFuncs_12_0,
            	    							"ac.soton.bsharp.BSharp.ReferencingFunc");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_13=(Token)match(input,21,FOLLOW_31); 

            	    				newLeafNode(otherlv_13, grammarAccess.getInstanceAccess().getRightParenthesisKeyword_10_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop62;
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
    // $ANTLR end "ruleInstance"


    // $ANTLR start "entryRuleReferencingFunc"
    // InternalBSharp.g:3524:1: entryRuleReferencingFunc returns [EObject current=null] : iv_ruleReferencingFunc= ruleReferencingFunc EOF ;
    public final EObject entryRuleReferencingFunc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferencingFunc = null;


        try {
            // InternalBSharp.g:3524:56: (iv_ruleReferencingFunc= ruleReferencingFunc EOF )
            // InternalBSharp.g:3525:2: iv_ruleReferencingFunc= ruleReferencingFunc EOF
            {
             newCompositeNode(grammarAccess.getReferencingFuncRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferencingFunc=ruleReferencingFunc();

            state._fsp--;

             current =iv_ruleReferencingFunc; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferencingFunc"


    // $ANTLR start "ruleReferencingFunc"
    // InternalBSharp.g:3531:1: ruleReferencingFunc returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleReferencingFunc() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalBSharp.g:3537:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalBSharp.g:3538:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalBSharp.g:3538:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            // InternalBSharp.g:3539:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) )
            {
            // InternalBSharp.g:3539:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBSharp.g:3540:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBSharp.g:3540:4: (lv_name_0_0= RULE_ID )
            // InternalBSharp.g:3541:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_55); 

            					newLeafNode(lv_name_0_0, grammarAccess.getReferencingFuncAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferencingFuncRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"ac.soton.bsharp.BSharp.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,53,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getReferencingFuncAccess().getEqualsSignKeyword_1());
            		
            // InternalBSharp.g:3561:3: ( (otherlv_2= RULE_ID ) )
            // InternalBSharp.g:3562:4: (otherlv_2= RULE_ID )
            {
            // InternalBSharp.g:3562:4: (otherlv_2= RULE_ID )
            // InternalBSharp.g:3563:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferencingFuncRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getReferencingFuncAccess().getReferencedFuncFunctionDeclCrossReference_2_0());
            				

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
    // $ANTLR end "ruleReferencingFunc"

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
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0400240000000020L});
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
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x03F8000000000022L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000900002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0005D00002340020L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x03F8000000000020L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000100022L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0020000000000000L});

}