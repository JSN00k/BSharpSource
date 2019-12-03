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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_WS", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'package'", "':'", "'.'", "'From'", "'Import'", "'*'", "'Class'", "'['", "']'", "'('", "')'", "';'", "'<'", "'>'", "','", "'\\u00D7'", "'\\u2192'", "'\\uE102'", "'\\uE100'", "'\\u2194'", "'\\u2916'", "'\\u21F8'", "'\\u21A3'", "'\\u2900'", "'\\u21A0'", "'\\u2119'", "'where'", "'Datatype'", "'|'", "'Extend'", "'{'", "'}'", "'INFIX'", "'match'", "'Theorems'", "'\\u03BB'", "'\\u2200'", "'\\u2203'", "'\\u00B7'", "'\\u00AC'", "'if'", "'else'", "'\\u21D4'", "'\\u21D2'", "'='", "'\\u2260'", "'\\u2227'", "'\\u2228'", "'\\u2208'", "'Instance'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
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
    public static final int T__60=60;
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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalBSharp.g:274:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalBSharp.g:274:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalBSharp.g:275:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalBSharp.g:281:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalBSharp.g:287:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalBSharp.g:288:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalBSharp.g:288:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalBSharp.g:289:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalBSharp.g:296:3: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBSharp.g:297:4: kw= '.' this_ID_2= RULE_ID
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
    // InternalBSharp.g:314:1: entryRuleTopLevelImport returns [EObject current=null] : iv_ruleTopLevelImport= ruleTopLevelImport EOF ;
    public final EObject entryRuleTopLevelImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopLevelImport = null;


        try {
            // InternalBSharp.g:314:55: (iv_ruleTopLevelImport= ruleTopLevelImport EOF )
            // InternalBSharp.g:315:2: iv_ruleTopLevelImport= ruleTopLevelImport EOF
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
    // InternalBSharp.g:321:1: ruleTopLevelImport returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )+ ( (lv_bodyElements_1_0= ruleTopLevelInstance ) )+ ) ;
    public final EObject ruleTopLevelImport() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_bodyElements_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:327:2: ( ( ( (lv_imports_0_0= ruleImport ) )+ ( (lv_bodyElements_1_0= ruleTopLevelInstance ) )+ ) )
            // InternalBSharp.g:328:2: ( ( (lv_imports_0_0= ruleImport ) )+ ( (lv_bodyElements_1_0= ruleTopLevelInstance ) )+ )
            {
            // InternalBSharp.g:328:2: ( ( (lv_imports_0_0= ruleImport ) )+ ( (lv_bodyElements_1_0= ruleTopLevelInstance ) )+ )
            // InternalBSharp.g:329:3: ( (lv_imports_0_0= ruleImport ) )+ ( (lv_bodyElements_1_0= ruleTopLevelInstance ) )+
            {
            // InternalBSharp.g:329:3: ( (lv_imports_0_0= ruleImport ) )+
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
            	    // InternalBSharp.g:330:4: (lv_imports_0_0= ruleImport )
            	    {
            	    // InternalBSharp.g:330:4: (lv_imports_0_0= ruleImport )
            	    // InternalBSharp.g:331:5: lv_imports_0_0= ruleImport
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

            // InternalBSharp.g:348:3: ( (lv_bodyElements_1_0= ruleTopLevelInstance ) )+
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
            	    // InternalBSharp.g:349:4: (lv_bodyElements_1_0= ruleTopLevelInstance )
            	    {
            	    // InternalBSharp.g:349:4: (lv_bodyElements_1_0= ruleTopLevelInstance )
            	    // InternalBSharp.g:350:5: lv_bodyElements_1_0= ruleTopLevelInstance
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
    // InternalBSharp.g:371:1: entryRuleTopLevelInstance returns [EObject current=null] : iv_ruleTopLevelInstance= ruleTopLevelInstance EOF ;
    public final EObject entryRuleTopLevelInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopLevelInstance = null;


        try {
            // InternalBSharp.g:371:57: (iv_ruleTopLevelInstance= ruleTopLevelInstance EOF )
            // InternalBSharp.g:372:2: iv_ruleTopLevelInstance= ruleTopLevelInstance EOF
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
    // InternalBSharp.g:378:1: ruleTopLevelInstance returns [EObject current=null] : (this_ClassDecl_0= ruleClassDecl | this_Extend_1= ruleExtend ) ;
    public final EObject ruleTopLevelInstance() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDecl_0 = null;

        EObject this_Extend_1 = null;



        	enterRule();

        try {
            // InternalBSharp.g:384:2: ( (this_ClassDecl_0= ruleClassDecl | this_Extend_1= ruleExtend ) )
            // InternalBSharp.g:385:2: (this_ClassDecl_0= ruleClassDecl | this_Extend_1= ruleExtend )
            {
            // InternalBSharp.g:385:2: (this_ClassDecl_0= ruleClassDecl | this_Extend_1= ruleExtend )
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
                    // InternalBSharp.g:386:3: this_ClassDecl_0= ruleClassDecl
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
                    // InternalBSharp.g:395:3: this_Extend_1= ruleExtend
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
    // InternalBSharp.g:407:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalBSharp.g:407:47: (iv_ruleImport= ruleImport EOF )
            // InternalBSharp.g:408:2: iv_ruleImport= ruleImport EOF
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
    // InternalBSharp.g:414:1: ruleImport returns [EObject current=null] : (this_GlobalImport_0= ruleGlobalImport | this_LocalImport_1= ruleLocalImport ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        EObject this_GlobalImport_0 = null;

        EObject this_LocalImport_1 = null;



        	enterRule();

        try {
            // InternalBSharp.g:420:2: ( (this_GlobalImport_0= ruleGlobalImport | this_LocalImport_1= ruleLocalImport ) )
            // InternalBSharp.g:421:2: (this_GlobalImport_0= ruleGlobalImport | this_LocalImport_1= ruleLocalImport )
            {
            // InternalBSharp.g:421:2: (this_GlobalImport_0= ruleGlobalImport | this_LocalImport_1= ruleLocalImport )
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
                    // InternalBSharp.g:422:3: this_GlobalImport_0= ruleGlobalImport
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
                    // InternalBSharp.g:431:3: this_LocalImport_1= ruleLocalImport
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
    // InternalBSharp.g:443:1: entryRuleGlobalImport returns [EObject current=null] : iv_ruleGlobalImport= ruleGlobalImport EOF ;
    public final EObject entryRuleGlobalImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalImport = null;


        try {
            // InternalBSharp.g:443:53: (iv_ruleGlobalImport= ruleGlobalImport EOF )
            // InternalBSharp.g:444:2: iv_ruleGlobalImport= ruleGlobalImport EOF
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
    // InternalBSharp.g:450:1: ruleGlobalImport returns [EObject current=null] : (otherlv_0= 'From' ( (lv_project_1_0= ruleQualifiedName ) ) otherlv_2= 'Import' ( (lv_fileImports_3_0= ruleFileImport ) )+ ) ;
    public final EObject ruleGlobalImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_project_1_0 = null;

        EObject lv_fileImports_3_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:456:2: ( (otherlv_0= 'From' ( (lv_project_1_0= ruleQualifiedName ) ) otherlv_2= 'Import' ( (lv_fileImports_3_0= ruleFileImport ) )+ ) )
            // InternalBSharp.g:457:2: (otherlv_0= 'From' ( (lv_project_1_0= ruleQualifiedName ) ) otherlv_2= 'Import' ( (lv_fileImports_3_0= ruleFileImport ) )+ )
            {
            // InternalBSharp.g:457:2: (otherlv_0= 'From' ( (lv_project_1_0= ruleQualifiedName ) ) otherlv_2= 'Import' ( (lv_fileImports_3_0= ruleFileImport ) )+ )
            // InternalBSharp.g:458:3: otherlv_0= 'From' ( (lv_project_1_0= ruleQualifiedName ) ) otherlv_2= 'Import' ( (lv_fileImports_3_0= ruleFileImport ) )+
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGlobalImportAccess().getFromKeyword_0());
            		
            // InternalBSharp.g:462:3: ( (lv_project_1_0= ruleQualifiedName ) )
            // InternalBSharp.g:463:4: (lv_project_1_0= ruleQualifiedName )
            {
            // InternalBSharp.g:463:4: (lv_project_1_0= ruleQualifiedName )
            // InternalBSharp.g:464:5: lv_project_1_0= ruleQualifiedName
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
            		
            // InternalBSharp.g:485:3: ( (lv_fileImports_3_0= ruleFileImport ) )+
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
            	    // InternalBSharp.g:486:4: (lv_fileImports_3_0= ruleFileImport )
            	    {
            	    // InternalBSharp.g:486:4: (lv_fileImports_3_0= ruleFileImport )
            	    // InternalBSharp.g:487:5: lv_fileImports_3_0= ruleFileImport
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
    // InternalBSharp.g:508:1: entryRuleFileImport returns [EObject current=null] : iv_ruleFileImport= ruleFileImport EOF ;
    public final EObject entryRuleFileImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileImport = null;


        try {
            // InternalBSharp.g:508:51: (iv_ruleFileImport= ruleFileImport EOF )
            // InternalBSharp.g:509:2: iv_ruleFileImport= ruleFileImport EOF
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
    // InternalBSharp.g:515:1: ruleFileImport returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' (otherlv_2= '*' | ( (otherlv_3= RULE_ID ) ) ) )? ) ;
    public final EObject ruleFileImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalBSharp.g:521:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' (otherlv_2= '*' | ( (otherlv_3= RULE_ID ) ) ) )? ) )
            // InternalBSharp.g:522:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' (otherlv_2= '*' | ( (otherlv_3= RULE_ID ) ) ) )? )
            {
            // InternalBSharp.g:522:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' (otherlv_2= '*' | ( (otherlv_3= RULE_ID ) ) ) )? )
            // InternalBSharp.g:523:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' (otherlv_2= '*' | ( (otherlv_3= RULE_ID ) ) ) )?
            {
            // InternalBSharp.g:523:3: ( (otherlv_0= RULE_ID ) )
            // InternalBSharp.g:524:4: (otherlv_0= RULE_ID )
            {
            // InternalBSharp.g:524:4: (otherlv_0= RULE_ID )
            // InternalBSharp.g:525:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFileImportRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getFileImportAccess().getFileReferenceTopLevelFileCrossReference_0_0());
            				

            }


            }

            // InternalBSharp.g:536:3: (otherlv_1= '.' (otherlv_2= '*' | ( (otherlv_3= RULE_ID ) ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBSharp.g:537:4: otherlv_1= '.' (otherlv_2= '*' | ( (otherlv_3= RULE_ID ) ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getFileImportAccess().getFullStopKeyword_1_0());
                    			
                    // InternalBSharp.g:541:4: (otherlv_2= '*' | ( (otherlv_3= RULE_ID ) ) )
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
                            // InternalBSharp.g:542:5: otherlv_2= '*'
                            {
                            otherlv_2=(Token)match(input,16,FOLLOW_2); 

                            					newLeafNode(otherlv_2, grammarAccess.getFileImportAccess().getAsteriskKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalBSharp.g:547:5: ( (otherlv_3= RULE_ID ) )
                            {
                            // InternalBSharp.g:547:5: ( (otherlv_3= RULE_ID ) )
                            // InternalBSharp.g:548:6: (otherlv_3= RULE_ID )
                            {
                            // InternalBSharp.g:548:6: (otherlv_3= RULE_ID )
                            // InternalBSharp.g:549:7: otherlv_3= RULE_ID
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
    // InternalBSharp.g:566:1: entryRuleLocalImport returns [EObject current=null] : iv_ruleLocalImport= ruleLocalImport EOF ;
    public final EObject entryRuleLocalImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalImport = null;


        try {
            // InternalBSharp.g:566:52: (iv_ruleLocalImport= ruleLocalImport EOF )
            // InternalBSharp.g:567:2: iv_ruleLocalImport= ruleLocalImport EOF
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
    // InternalBSharp.g:573:1: ruleLocalImport returns [EObject current=null] : (otherlv_0= 'Import' ( (lv_fileImports_1_0= ruleFileImport ) )+ ) ;
    public final EObject ruleLocalImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_fileImports_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:579:2: ( (otherlv_0= 'Import' ( (lv_fileImports_1_0= ruleFileImport ) )+ ) )
            // InternalBSharp.g:580:2: (otherlv_0= 'Import' ( (lv_fileImports_1_0= ruleFileImport ) )+ )
            {
            // InternalBSharp.g:580:2: (otherlv_0= 'Import' ( (lv_fileImports_1_0= ruleFileImport ) )+ )
            // InternalBSharp.g:581:3: otherlv_0= 'Import' ( (lv_fileImports_1_0= ruleFileImport ) )+
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalImportAccess().getImportKeyword_0());
            		
            // InternalBSharp.g:585:3: ( (lv_fileImports_1_0= ruleFileImport ) )+
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
            	    // InternalBSharp.g:586:4: (lv_fileImports_1_0= ruleFileImport )
            	    {
            	    // InternalBSharp.g:586:4: (lv_fileImports_1_0= ruleFileImport )
            	    // InternalBSharp.g:587:5: lv_fileImports_1_0= ruleFileImport
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
    // InternalBSharp.g:608:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalBSharp.g:608:46: (iv_ruleClass= ruleClass EOF )
            // InternalBSharp.g:609:2: iv_ruleClass= ruleClass EOF
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
    // InternalBSharp.g:615:1: ruleClass returns [EObject current=null] : (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rawContext_2_0= rulePolyContext ) )? (otherlv_3= '[' ( (lv_instName_4_0= ruleInstName ) ) otherlv_5= ']' ) ( (lv_supertypes_6_0= ruleSuperTypeList ) )? (otherlv_7= '(' ( (lv_varList_8_0= ruleTypedVariableList ) ) otherlv_9= ')' )? ( (lv_where_10_0= ruleWhere ) )? (otherlv_11= ';' )? ( (lv_block_12_0= ruleBSharpBlock ) ) ) ;
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
            // InternalBSharp.g:621:2: ( (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rawContext_2_0= rulePolyContext ) )? (otherlv_3= '[' ( (lv_instName_4_0= ruleInstName ) ) otherlv_5= ']' ) ( (lv_supertypes_6_0= ruleSuperTypeList ) )? (otherlv_7= '(' ( (lv_varList_8_0= ruleTypedVariableList ) ) otherlv_9= ')' )? ( (lv_where_10_0= ruleWhere ) )? (otherlv_11= ';' )? ( (lv_block_12_0= ruleBSharpBlock ) ) ) )
            // InternalBSharp.g:622:2: (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rawContext_2_0= rulePolyContext ) )? (otherlv_3= '[' ( (lv_instName_4_0= ruleInstName ) ) otherlv_5= ']' ) ( (lv_supertypes_6_0= ruleSuperTypeList ) )? (otherlv_7= '(' ( (lv_varList_8_0= ruleTypedVariableList ) ) otherlv_9= ')' )? ( (lv_where_10_0= ruleWhere ) )? (otherlv_11= ';' )? ( (lv_block_12_0= ruleBSharpBlock ) ) )
            {
            // InternalBSharp.g:622:2: (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rawContext_2_0= rulePolyContext ) )? (otherlv_3= '[' ( (lv_instName_4_0= ruleInstName ) ) otherlv_5= ']' ) ( (lv_supertypes_6_0= ruleSuperTypeList ) )? (otherlv_7= '(' ( (lv_varList_8_0= ruleTypedVariableList ) ) otherlv_9= ')' )? ( (lv_where_10_0= ruleWhere ) )? (otherlv_11= ';' )? ( (lv_block_12_0= ruleBSharpBlock ) ) )
            // InternalBSharp.g:623:3: otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rawContext_2_0= rulePolyContext ) )? (otherlv_3= '[' ( (lv_instName_4_0= ruleInstName ) ) otherlv_5= ']' ) ( (lv_supertypes_6_0= ruleSuperTypeList ) )? (otherlv_7= '(' ( (lv_varList_8_0= ruleTypedVariableList ) ) otherlv_9= ')' )? ( (lv_where_10_0= ruleWhere ) )? (otherlv_11= ';' )? ( (lv_block_12_0= ruleBSharpBlock ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getClassAccess().getClassKeyword_0());
            		
            // InternalBSharp.g:627:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBSharp.g:628:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBSharp.g:628:4: (lv_name_1_0= RULE_ID )
            // InternalBSharp.g:629:5: lv_name_1_0= RULE_ID
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

            // InternalBSharp.g:645:3: ( (lv_rawContext_2_0= rulePolyContext ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBSharp.g:646:4: (lv_rawContext_2_0= rulePolyContext )
                    {
                    // InternalBSharp.g:646:4: (lv_rawContext_2_0= rulePolyContext )
                    // InternalBSharp.g:647:5: lv_rawContext_2_0= rulePolyContext
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

            // InternalBSharp.g:664:3: (otherlv_3= '[' ( (lv_instName_4_0= ruleInstName ) ) otherlv_5= ']' )
            // InternalBSharp.g:665:4: otherlv_3= '[' ( (lv_instName_4_0= ruleInstName ) ) otherlv_5= ']'
            {
            otherlv_3=(Token)match(input,18,FOLLOW_3); 

            				newLeafNode(otherlv_3, grammarAccess.getClassAccess().getLeftSquareBracketKeyword_3_0());
            			
            // InternalBSharp.g:669:4: ( (lv_instName_4_0= ruleInstName ) )
            // InternalBSharp.g:670:5: (lv_instName_4_0= ruleInstName )
            {
            // InternalBSharp.g:670:5: (lv_instName_4_0= ruleInstName )
            // InternalBSharp.g:671:6: lv_instName_4_0= ruleInstName
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

            // InternalBSharp.g:693:3: ( (lv_supertypes_6_0= ruleSuperTypeList ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==12) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBSharp.g:694:4: (lv_supertypes_6_0= ruleSuperTypeList )
                    {
                    // InternalBSharp.g:694:4: (lv_supertypes_6_0= ruleSuperTypeList )
                    // InternalBSharp.g:695:5: lv_supertypes_6_0= ruleSuperTypeList
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

            // InternalBSharp.g:712:3: (otherlv_7= '(' ( (lv_varList_8_0= ruleTypedVariableList ) ) otherlv_9= ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBSharp.g:713:4: otherlv_7= '(' ( (lv_varList_8_0= ruleTypedVariableList ) ) otherlv_9= ')'
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getClassAccess().getLeftParenthesisKeyword_5_0());
                    			
                    // InternalBSharp.g:717:4: ( (lv_varList_8_0= ruleTypedVariableList ) )
                    // InternalBSharp.g:718:5: (lv_varList_8_0= ruleTypedVariableList )
                    {
                    // InternalBSharp.g:718:5: (lv_varList_8_0= ruleTypedVariableList )
                    // InternalBSharp.g:719:6: lv_varList_8_0= ruleTypedVariableList
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

            // InternalBSharp.g:741:3: ( (lv_where_10_0= ruleWhere ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBSharp.g:742:4: (lv_where_10_0= ruleWhere )
                    {
                    // InternalBSharp.g:742:4: (lv_where_10_0= ruleWhere )
                    // InternalBSharp.g:743:5: lv_where_10_0= ruleWhere
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

            // InternalBSharp.g:760:3: (otherlv_11= ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBSharp.g:761:4: otherlv_11= ';'
                    {
                    otherlv_11=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_11, grammarAccess.getClassAccess().getSemicolonKeyword_7());
                    			

                    }
                    break;

            }

            // InternalBSharp.g:766:3: ( (lv_block_12_0= ruleBSharpBlock ) )
            // InternalBSharp.g:767:4: (lv_block_12_0= ruleBSharpBlock )
            {
            // InternalBSharp.g:767:4: (lv_block_12_0= ruleBSharpBlock )
            // InternalBSharp.g:768:5: lv_block_12_0= ruleBSharpBlock
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
    // InternalBSharp.g:789:1: entryRuleInstName returns [EObject current=null] : iv_ruleInstName= ruleInstName EOF ;
    public final EObject entryRuleInstName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstName = null;


        try {
            // InternalBSharp.g:789:49: (iv_ruleInstName= ruleInstName EOF )
            // InternalBSharp.g:790:2: iv_ruleInstName= ruleInstName EOF
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
    // InternalBSharp.g:796:1: ruleInstName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleInstName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBSharp.g:802:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBSharp.g:803:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBSharp.g:803:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBSharp.g:804:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBSharp.g:804:3: (lv_name_0_0= RULE_ID )
            // InternalBSharp.g:805:4: lv_name_0_0= RULE_ID
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
    // InternalBSharp.g:824:1: entryRulePolyContext returns [EObject current=null] : iv_rulePolyContext= rulePolyContext EOF ;
    public final EObject entryRulePolyContext() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyContext = null;


        try {
            // InternalBSharp.g:824:52: (iv_rulePolyContext= rulePolyContext EOF )
            // InternalBSharp.g:825:2: iv_rulePolyContext= rulePolyContext EOF
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
    // InternalBSharp.g:831:1: rulePolyContext returns [EObject current=null] : (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyType ) )+ otherlv_2= '>' ) ;
    public final EObject rulePolyContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_polyTypes_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:837:2: ( (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyType ) )+ otherlv_2= '>' ) )
            // InternalBSharp.g:838:2: (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyType ) )+ otherlv_2= '>' )
            {
            // InternalBSharp.g:838:2: (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyType ) )+ otherlv_2= '>' )
            // InternalBSharp.g:839:3: otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyType ) )+ otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPolyContextAccess().getLessThanSignKeyword_0());
            		
            // InternalBSharp.g:843:3: ( (lv_polyTypes_1_0= rulePolyType ) )+
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
            	    // InternalBSharp.g:844:4: (lv_polyTypes_1_0= rulePolyType )
            	    {
            	    // InternalBSharp.g:844:4: (lv_polyTypes_1_0= rulePolyType )
            	    // InternalBSharp.g:845:5: lv_polyTypes_1_0= rulePolyType
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
    // InternalBSharp.g:870:1: entryRulePolyType returns [EObject current=null] : iv_rulePolyType= rulePolyType EOF ;
    public final EObject entryRulePolyType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyType = null;


        try {
            // InternalBSharp.g:870:49: (iv_rulePolyType= rulePolyType EOF )
            // InternalBSharp.g:871:2: iv_rulePolyType= rulePolyType EOF
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
    // InternalBSharp.g:877:1: rulePolyType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? ) ;
    public final EObject rulePolyType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalBSharp.g:883:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? ) )
            // InternalBSharp.g:884:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? )
            {
            // InternalBSharp.g:884:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? )
            // InternalBSharp.g:885:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )?
            {
            // InternalBSharp.g:885:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBSharp.g:886:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBSharp.g:886:4: (lv_name_0_0= RULE_ID )
            // InternalBSharp.g:887:5: lv_name_0_0= RULE_ID
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

            // InternalBSharp.g:903:3: (otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==12) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBSharp.g:904:4: otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getPolyTypeAccess().getColonKeyword_1_0());
                    			
                    // InternalBSharp.g:908:4: ( ( ruleQualifiedName ) )
                    // InternalBSharp.g:909:5: ( ruleQualifiedName )
                    {
                    // InternalBSharp.g:909:5: ( ruleQualifiedName )
                    // InternalBSharp.g:910:6: ruleQualifiedName
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

                    // InternalBSharp.g:924:4: (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==25) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalBSharp.g:925:5: otherlv_3= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_3=(Token)match(input,25,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getPolyTypeAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalBSharp.g:929:5: ( ( ruleQualifiedName ) )
                    	    // InternalBSharp.g:930:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalBSharp.g:930:6: ( ruleQualifiedName )
                    	    // InternalBSharp.g:931:7: ruleQualifiedName
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
    // InternalBSharp.g:951:1: entryRuleSuperTypeList returns [EObject current=null] : iv_ruleSuperTypeList= ruleSuperTypeList EOF ;
    public final EObject entryRuleSuperTypeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperTypeList = null;


        try {
            // InternalBSharp.g:951:54: (iv_ruleSuperTypeList= ruleSuperTypeList EOF )
            // InternalBSharp.g:952:2: iv_ruleSuperTypeList= ruleSuperTypeList EOF
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
    // InternalBSharp.g:958:1: ruleSuperTypeList returns [EObject current=null] : (otherlv_0= ':' ( (lv_superTypes_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superTypes_3_0= ruleConstructedType ) ) )* ) ;
    public final EObject ruleSuperTypeList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_superTypes_1_0 = null;

        EObject lv_superTypes_3_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:964:2: ( (otherlv_0= ':' ( (lv_superTypes_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superTypes_3_0= ruleConstructedType ) ) )* ) )
            // InternalBSharp.g:965:2: (otherlv_0= ':' ( (lv_superTypes_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superTypes_3_0= ruleConstructedType ) ) )* )
            {
            // InternalBSharp.g:965:2: (otherlv_0= ':' ( (lv_superTypes_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superTypes_3_0= ruleConstructedType ) ) )* )
            // InternalBSharp.g:966:3: otherlv_0= ':' ( (lv_superTypes_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superTypes_3_0= ruleConstructedType ) ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getSuperTypeListAccess().getColonKeyword_0());
            		
            // InternalBSharp.g:970:3: ( (lv_superTypes_1_0= ruleConstructedType ) )
            // InternalBSharp.g:971:4: (lv_superTypes_1_0= ruleConstructedType )
            {
            // InternalBSharp.g:971:4: (lv_superTypes_1_0= ruleConstructedType )
            // InternalBSharp.g:972:5: lv_superTypes_1_0= ruleConstructedType
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

            // InternalBSharp.g:989:3: (otherlv_2= ',' ( (lv_superTypes_3_0= ruleConstructedType ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==25) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalBSharp.g:990:4: otherlv_2= ',' ( (lv_superTypes_3_0= ruleConstructedType ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FOLLOW_21); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSuperTypeListAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalBSharp.g:994:4: ( (lv_superTypes_3_0= ruleConstructedType ) )
            	    // InternalBSharp.g:995:5: (lv_superTypes_3_0= ruleConstructedType )
            	    {
            	    // InternalBSharp.g:995:5: (lv_superTypes_3_0= ruleConstructedType )
            	    // InternalBSharp.g:996:6: lv_superTypes_3_0= ruleConstructedType
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
    // InternalBSharp.g:1018:1: entryRuleBuiltinTypeInfixOp returns [String current=null] : iv_ruleBuiltinTypeInfixOp= ruleBuiltinTypeInfixOp EOF ;
    public final String entryRuleBuiltinTypeInfixOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBuiltinTypeInfixOp = null;


        try {
            // InternalBSharp.g:1018:58: (iv_ruleBuiltinTypeInfixOp= ruleBuiltinTypeInfixOp EOF )
            // InternalBSharp.g:1019:2: iv_ruleBuiltinTypeInfixOp= ruleBuiltinTypeInfixOp EOF
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
    // InternalBSharp.g:1025:1: ruleBuiltinTypeInfixOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\u00D7' | kw= '\\u2192' | kw= '\\uE102' | kw= '\\uE100' | kw= '\\u2194' | kw= '\\u2916' | kw= '\\u21F8' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' ) ;
    public final AntlrDatatypeRuleToken ruleBuiltinTypeInfixOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBSharp.g:1031:2: ( (kw= '\\u00D7' | kw= '\\u2192' | kw= '\\uE102' | kw= '\\uE100' | kw= '\\u2194' | kw= '\\u2916' | kw= '\\u21F8' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' ) )
            // InternalBSharp.g:1032:2: (kw= '\\u00D7' | kw= '\\u2192' | kw= '\\uE102' | kw= '\\uE100' | kw= '\\u2194' | kw= '\\u2916' | kw= '\\u21F8' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' )
            {
            // InternalBSharp.g:1032:2: (kw= '\\u00D7' | kw= '\\u2192' | kw= '\\uE102' | kw= '\\uE100' | kw= '\\u2194' | kw= '\\u2916' | kw= '\\u21F8' | kw= '\\u21A3' | kw= '\\u2900' | kw= '\\u21A0' )
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
                    // InternalBSharp.g:1033:3: kw= '\\u00D7'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBuiltinTypeInfixOpAccess().getMultiplicationSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBSharp.g:1039:3: kw= '\\u2192'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsArrowKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBSharp.g:1045:3: kw= '\\uE102'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBuiltinTypeInfixOpAccess().getPrivateUseAreaE102Keyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalBSharp.g:1051:3: kw= '\\uE100'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBuiltinTypeInfixOpAccess().getPrivateUseAreaE100Keyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalBSharp.g:1057:3: kw= '\\u2194'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBuiltinTypeInfixOpAccess().getLeftRightArrowKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalBSharp.g:1063:3: kw= '\\u2916'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsTwoHeadedArrowWithTailKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalBSharp.g:1069:3: kw= '\\u21F8'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsArrowWithVerticalStrokeKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalBSharp.g:1075:3: kw= '\\u21A3'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsArrowWithTailKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalBSharp.g:1081:3: kw= '\\u2900'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBuiltinTypeInfixOpAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalBSharp.g:1087:3: kw= '\\u21A0'
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
    // InternalBSharp.g:1096:1: entryRuleConstructedType returns [EObject current=null] : iv_ruleConstructedType= ruleConstructedType EOF ;
    public final EObject entryRuleConstructedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructedType = null;


        try {
            // InternalBSharp.g:1096:56: (iv_ruleConstructedType= ruleConstructedType EOF )
            // InternalBSharp.g:1097:2: iv_ruleConstructedType= ruleConstructedType EOF
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
    // InternalBSharp.g:1103:1: ruleConstructedType returns [EObject current=null] : (this_BuilderElem_0= ruleBuilderElem ( () ( (lv_constructor_2_0= ruleBuiltinTypeInfixOp ) ) ( (lv_right_3_0= ruleBuilderElem ) ) )* ) ;
    public final EObject ruleConstructedType() throws RecognitionException {
        EObject current = null;

        EObject this_BuilderElem_0 = null;

        AntlrDatatypeRuleToken lv_constructor_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1109:2: ( (this_BuilderElem_0= ruleBuilderElem ( () ( (lv_constructor_2_0= ruleBuiltinTypeInfixOp ) ) ( (lv_right_3_0= ruleBuilderElem ) ) )* ) )
            // InternalBSharp.g:1110:2: (this_BuilderElem_0= ruleBuilderElem ( () ( (lv_constructor_2_0= ruleBuiltinTypeInfixOp ) ) ( (lv_right_3_0= ruleBuilderElem ) ) )* )
            {
            // InternalBSharp.g:1110:2: (this_BuilderElem_0= ruleBuilderElem ( () ( (lv_constructor_2_0= ruleBuiltinTypeInfixOp ) ) ( (lv_right_3_0= ruleBuilderElem ) ) )* )
            // InternalBSharp.g:1111:3: this_BuilderElem_0= ruleBuilderElem ( () ( (lv_constructor_2_0= ruleBuiltinTypeInfixOp ) ) ( (lv_right_3_0= ruleBuilderElem ) ) )*
            {

            			newCompositeNode(grammarAccess.getConstructedTypeAccess().getBuilderElemParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_BuilderElem_0=ruleBuilderElem();

            state._fsp--;


            			current = this_BuilderElem_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalBSharp.g:1119:3: ( () ( (lv_constructor_2_0= ruleBuiltinTypeInfixOp ) ) ( (lv_right_3_0= ruleBuilderElem ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=26 && LA24_0<=35)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalBSharp.g:1120:4: () ( (lv_constructor_2_0= ruleBuiltinTypeInfixOp ) ) ( (lv_right_3_0= ruleBuilderElem ) )
            	    {
            	    // InternalBSharp.g:1120:4: ()
            	    // InternalBSharp.g:1121:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConstructedTypeAccess().getConstructedTypeLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalBSharp.g:1127:4: ( (lv_constructor_2_0= ruleBuiltinTypeInfixOp ) )
            	    // InternalBSharp.g:1128:5: (lv_constructor_2_0= ruleBuiltinTypeInfixOp )
            	    {
            	    // InternalBSharp.g:1128:5: (lv_constructor_2_0= ruleBuiltinTypeInfixOp )
            	    // InternalBSharp.g:1129:6: lv_constructor_2_0= ruleBuiltinTypeInfixOp
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

            	    // InternalBSharp.g:1146:4: ( (lv_right_3_0= ruleBuilderElem ) )
            	    // InternalBSharp.g:1147:5: (lv_right_3_0= ruleBuilderElem )
            	    {
            	    // InternalBSharp.g:1147:5: (lv_right_3_0= ruleBuilderElem )
            	    // InternalBSharp.g:1148:6: lv_right_3_0= ruleBuilderElem
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
    // InternalBSharp.g:1170:1: entryRuleBuilderElem returns [EObject current=null] : iv_ruleBuilderElem= ruleBuilderElem EOF ;
    public final EObject entryRuleBuilderElem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuilderElem = null;


        try {
            // InternalBSharp.g:1170:52: (iv_ruleBuilderElem= ruleBuilderElem EOF )
            // InternalBSharp.g:1171:2: iv_ruleBuilderElem= ruleBuilderElem EOF
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
    // InternalBSharp.g:1177:1: ruleBuilderElem returns [EObject current=null] : (this_TypeConstructor_0= ruleTypeConstructor | this_TypeConstrBracket_1= ruleTypeConstrBracket | this_TypePowerSet_2= ruleTypePowerSet ) ;
    public final EObject ruleBuilderElem() throws RecognitionException {
        EObject current = null;

        EObject this_TypeConstructor_0 = null;

        EObject this_TypeConstrBracket_1 = null;

        EObject this_TypePowerSet_2 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1183:2: ( (this_TypeConstructor_0= ruleTypeConstructor | this_TypeConstrBracket_1= ruleTypeConstrBracket | this_TypePowerSet_2= ruleTypePowerSet ) )
            // InternalBSharp.g:1184:2: (this_TypeConstructor_0= ruleTypeConstructor | this_TypeConstrBracket_1= ruleTypeConstrBracket | this_TypePowerSet_2= ruleTypePowerSet )
            {
            // InternalBSharp.g:1184:2: (this_TypeConstructor_0= ruleTypeConstructor | this_TypeConstrBracket_1= ruleTypeConstrBracket | this_TypePowerSet_2= ruleTypePowerSet )
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
                    // InternalBSharp.g:1185:3: this_TypeConstructor_0= ruleTypeConstructor
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
                    // InternalBSharp.g:1194:3: this_TypeConstrBracket_1= ruleTypeConstrBracket
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
                    // InternalBSharp.g:1203:3: this_TypePowerSet_2= ruleTypePowerSet
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
    // InternalBSharp.g:1215:1: entryRuleTypeConstructor returns [EObject current=null] : iv_ruleTypeConstructor= ruleTypeConstructor EOF ;
    public final EObject entryRuleTypeConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeConstructor = null;


        try {
            // InternalBSharp.g:1215:56: (iv_ruleTypeConstructor= ruleTypeConstructor EOF )
            // InternalBSharp.g:1216:2: iv_ruleTypeConstructor= ruleTypeConstructor EOF
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
    // InternalBSharp.g:1222:1: ruleTypeConstructor returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )? ) ;
    public final EObject ruleTypeConstructor() throws RecognitionException {
        EObject current = null;

        EObject lv_context_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1228:2: ( ( ( ( ruleQualifiedName ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )? ) )
            // InternalBSharp.g:1229:2: ( ( ( ruleQualifiedName ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )? )
            {
            // InternalBSharp.g:1229:2: ( ( ( ruleQualifiedName ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )? )
            // InternalBSharp.g:1230:3: ( ( ruleQualifiedName ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )?
            {
            // InternalBSharp.g:1230:3: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:1231:4: ( ruleQualifiedName )
            {
            // InternalBSharp.g:1231:4: ( ruleQualifiedName )
            // InternalBSharp.g:1232:5: ruleQualifiedName
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

            // InternalBSharp.g:1246:3: ( (lv_context_1_0= ruleTypeDeclContext ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalBSharp.g:1247:4: (lv_context_1_0= ruleTypeDeclContext )
                    {
                    // InternalBSharp.g:1247:4: (lv_context_1_0= ruleTypeDeclContext )
                    // InternalBSharp.g:1248:5: lv_context_1_0= ruleTypeDeclContext
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
    // InternalBSharp.g:1269:1: entryRuleTypePowerSet returns [EObject current=null] : iv_ruleTypePowerSet= ruleTypePowerSet EOF ;
    public final EObject entryRuleTypePowerSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypePowerSet = null;


        try {
            // InternalBSharp.g:1269:53: (iv_ruleTypePowerSet= ruleTypePowerSet EOF )
            // InternalBSharp.g:1270:2: iv_ruleTypePowerSet= ruleTypePowerSet EOF
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
    // InternalBSharp.g:1276:1: ruleTypePowerSet returns [EObject current=null] : (otherlv_0= '\\u2119' otherlv_1= '(' ( (lv_child_2_0= ruleConstructedType ) ) otherlv_3= ')' ) ;
    public final EObject ruleTypePowerSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_child_2_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1282:2: ( (otherlv_0= '\\u2119' otherlv_1= '(' ( (lv_child_2_0= ruleConstructedType ) ) otherlv_3= ')' ) )
            // InternalBSharp.g:1283:2: (otherlv_0= '\\u2119' otherlv_1= '(' ( (lv_child_2_0= ruleConstructedType ) ) otherlv_3= ')' )
            {
            // InternalBSharp.g:1283:2: (otherlv_0= '\\u2119' otherlv_1= '(' ( (lv_child_2_0= ruleConstructedType ) ) otherlv_3= ')' )
            // InternalBSharp.g:1284:3: otherlv_0= '\\u2119' otherlv_1= '(' ( (lv_child_2_0= ruleConstructedType ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getTypePowerSetAccess().getDoubleStruckCapitalPKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getTypePowerSetAccess().getLeftParenthesisKeyword_1());
            		
            // InternalBSharp.g:1292:3: ( (lv_child_2_0= ruleConstructedType ) )
            // InternalBSharp.g:1293:4: (lv_child_2_0= ruleConstructedType )
            {
            // InternalBSharp.g:1293:4: (lv_child_2_0= ruleConstructedType )
            // InternalBSharp.g:1294:5: lv_child_2_0= ruleConstructedType
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
    // InternalBSharp.g:1319:1: entryRuleTypeConstrBracket returns [EObject current=null] : iv_ruleTypeConstrBracket= ruleTypeConstrBracket EOF ;
    public final EObject entryRuleTypeConstrBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeConstrBracket = null;


        try {
            // InternalBSharp.g:1319:58: (iv_ruleTypeConstrBracket= ruleTypeConstrBracket EOF )
            // InternalBSharp.g:1320:2: iv_ruleTypeConstrBracket= ruleTypeConstrBracket EOF
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
    // InternalBSharp.g:1326:1: ruleTypeConstrBracket returns [EObject current=null] : (otherlv_0= '(' ( (lv_child_1_0= ruleConstructedType ) ) otherlv_2= ')' ) ;
    public final EObject ruleTypeConstrBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_child_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1332:2: ( (otherlv_0= '(' ( (lv_child_1_0= ruleConstructedType ) ) otherlv_2= ')' ) )
            // InternalBSharp.g:1333:2: (otherlv_0= '(' ( (lv_child_1_0= ruleConstructedType ) ) otherlv_2= ')' )
            {
            // InternalBSharp.g:1333:2: (otherlv_0= '(' ( (lv_child_1_0= ruleConstructedType ) ) otherlv_2= ')' )
            // InternalBSharp.g:1334:3: otherlv_0= '(' ( (lv_child_1_0= ruleConstructedType ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeConstrBracketAccess().getLeftParenthesisKeyword_0());
            		
            // InternalBSharp.g:1338:3: ( (lv_child_1_0= ruleConstructedType ) )
            // InternalBSharp.g:1339:4: (lv_child_1_0= ruleConstructedType )
            {
            // InternalBSharp.g:1339:4: (lv_child_1_0= ruleConstructedType )
            // InternalBSharp.g:1340:5: lv_child_1_0= ruleConstructedType
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
    // InternalBSharp.g:1365:1: entryRuleTypeDeclContext returns [EObject current=null] : iv_ruleTypeDeclContext= ruleTypeDeclContext EOF ;
    public final EObject entryRuleTypeDeclContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDeclContext = null;


        try {
            // InternalBSharp.g:1365:56: (iv_ruleTypeDeclContext= ruleTypeDeclContext EOF )
            // InternalBSharp.g:1366:2: iv_ruleTypeDeclContext= ruleTypeDeclContext EOF
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
    // InternalBSharp.g:1372:1: ruleTypeDeclContext returns [EObject current=null] : (otherlv_0= '<' ( (lv_typeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_typeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>' ) ;
    public final EObject ruleTypeDeclContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_typeName_1_0 = null;

        EObject lv_typeName_3_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1378:2: ( (otherlv_0= '<' ( (lv_typeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_typeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>' ) )
            // InternalBSharp.g:1379:2: (otherlv_0= '<' ( (lv_typeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_typeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>' )
            {
            // InternalBSharp.g:1379:2: (otherlv_0= '<' ( (lv_typeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_typeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>' )
            // InternalBSharp.g:1380:3: otherlv_0= '<' ( (lv_typeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_typeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeDeclContextAccess().getLessThanSignKeyword_0());
            		
            // InternalBSharp.g:1384:3: ( (lv_typeName_1_0= ruleConstructedType ) )
            // InternalBSharp.g:1385:4: (lv_typeName_1_0= ruleConstructedType )
            {
            // InternalBSharp.g:1385:4: (lv_typeName_1_0= ruleConstructedType )
            // InternalBSharp.g:1386:5: lv_typeName_1_0= ruleConstructedType
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

            // InternalBSharp.g:1403:3: (otherlv_2= ',' ( (lv_typeName_3_0= ruleConstructedType ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==25) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalBSharp.g:1404:4: otherlv_2= ',' ( (lv_typeName_3_0= ruleConstructedType ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FOLLOW_21); 

            	    				newLeafNode(otherlv_2, grammarAccess.getTypeDeclContextAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalBSharp.g:1408:4: ( (lv_typeName_3_0= ruleConstructedType ) )
            	    // InternalBSharp.g:1409:5: (lv_typeName_3_0= ruleConstructedType )
            	    {
            	    // InternalBSharp.g:1409:5: (lv_typeName_3_0= ruleConstructedType )
            	    // InternalBSharp.g:1410:6: lv_typeName_3_0= ruleConstructedType
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
    // InternalBSharp.g:1436:1: entryRuleWhere returns [EObject current=null] : iv_ruleWhere= ruleWhere EOF ;
    public final EObject entryRuleWhere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhere = null;


        try {
            // InternalBSharp.g:1436:46: (iv_ruleWhere= ruleWhere EOF )
            // InternalBSharp.g:1437:2: iv_ruleWhere= ruleWhere EOF
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
    // InternalBSharp.g:1443:1: ruleWhere returns [EObject current=null] : (otherlv_0= 'where' ( (lv_expressions_1_0= ruleRootExpression ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )* ) ;
    public final EObject ruleWhere() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;

        EObject lv_expressions_3_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1449:2: ( (otherlv_0= 'where' ( (lv_expressions_1_0= ruleRootExpression ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )* ) )
            // InternalBSharp.g:1450:2: (otherlv_0= 'where' ( (lv_expressions_1_0= ruleRootExpression ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )* )
            {
            // InternalBSharp.g:1450:2: (otherlv_0= 'where' ( (lv_expressions_1_0= ruleRootExpression ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )* )
            // InternalBSharp.g:1451:3: otherlv_0= 'where' ( (lv_expressions_1_0= ruleRootExpression ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )*
            {
            otherlv_0=(Token)match(input,37,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getWhereAccess().getWhereKeyword_0());
            		
            // InternalBSharp.g:1455:3: ( (lv_expressions_1_0= ruleRootExpression ) )
            // InternalBSharp.g:1456:4: (lv_expressions_1_0= ruleRootExpression )
            {
            // InternalBSharp.g:1456:4: (lv_expressions_1_0= ruleRootExpression )
            // InternalBSharp.g:1457:5: lv_expressions_1_0= ruleRootExpression
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

            // InternalBSharp.g:1474:3: (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==22) ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1==RULE_ID||LA28_1==18||LA28_1==20||LA28_1==44||(LA28_1>=46 && LA28_1<=48)||(LA28_1>=50 && LA28_1<=51)) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // InternalBSharp.g:1475:4: otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_26); 

            	    				newLeafNode(otherlv_2, grammarAccess.getWhereAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalBSharp.g:1479:4: ( (lv_expressions_3_0= ruleRootExpression ) )
            	    // InternalBSharp.g:1480:5: (lv_expressions_3_0= ruleRootExpression )
            	    {
            	    // InternalBSharp.g:1480:5: (lv_expressions_3_0= ruleRootExpression )
            	    // InternalBSharp.g:1481:6: lv_expressions_3_0= ruleRootExpression
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
    // InternalBSharp.g:1503:1: entryRuleDatatype returns [EObject current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final EObject entryRuleDatatype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatype = null;


        try {
            // InternalBSharp.g:1503:49: (iv_ruleDatatype= ruleDatatype EOF )
            // InternalBSharp.g:1504:2: iv_ruleDatatype= ruleDatatype EOF
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
    // InternalBSharp.g:1510:1: ruleDatatype returns [EObject current=null] : (otherlv_0= 'Datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rawContext_2_0= rulePolyContext ) )? (otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) ) )+ ( (lv_block_5_0= ruleBSharpBlock ) ) ) ;
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
            // InternalBSharp.g:1516:2: ( (otherlv_0= 'Datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rawContext_2_0= rulePolyContext ) )? (otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) ) )+ ( (lv_block_5_0= ruleBSharpBlock ) ) ) )
            // InternalBSharp.g:1517:2: (otherlv_0= 'Datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rawContext_2_0= rulePolyContext ) )? (otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) ) )+ ( (lv_block_5_0= ruleBSharpBlock ) ) )
            {
            // InternalBSharp.g:1517:2: (otherlv_0= 'Datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rawContext_2_0= rulePolyContext ) )? (otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) ) )+ ( (lv_block_5_0= ruleBSharpBlock ) ) )
            // InternalBSharp.g:1518:3: otherlv_0= 'Datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rawContext_2_0= rulePolyContext ) )? (otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) ) )+ ( (lv_block_5_0= ruleBSharpBlock ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDatatypeAccess().getDatatypeKeyword_0());
            		
            // InternalBSharp.g:1522:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBSharp.g:1523:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBSharp.g:1523:4: (lv_name_1_0= RULE_ID )
            // InternalBSharp.g:1524:5: lv_name_1_0= RULE_ID
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

            // InternalBSharp.g:1540:3: ( (lv_rawContext_2_0= rulePolyContext ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalBSharp.g:1541:4: (lv_rawContext_2_0= rulePolyContext )
                    {
                    // InternalBSharp.g:1541:4: (lv_rawContext_2_0= rulePolyContext )
                    // InternalBSharp.g:1542:5: lv_rawContext_2_0= rulePolyContext
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

            // InternalBSharp.g:1559:3: (otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) ) )+
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
            	    // InternalBSharp.g:1560:4: otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) )
            	    {
            	    otherlv_3=(Token)match(input,39,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getDatatypeAccess().getVerticalLineKeyword_3_0());
            	    			
            	    // InternalBSharp.g:1564:4: ( (lv_constructors_4_0= ruleDatatypeConstructor ) )
            	    // InternalBSharp.g:1565:5: (lv_constructors_4_0= ruleDatatypeConstructor )
            	    {
            	    // InternalBSharp.g:1565:5: (lv_constructors_4_0= ruleDatatypeConstructor )
            	    // InternalBSharp.g:1566:6: lv_constructors_4_0= ruleDatatypeConstructor
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

            // InternalBSharp.g:1584:3: ( (lv_block_5_0= ruleBSharpBlock ) )
            // InternalBSharp.g:1585:4: (lv_block_5_0= ruleBSharpBlock )
            {
            // InternalBSharp.g:1585:4: (lv_block_5_0= ruleBSharpBlock )
            // InternalBSharp.g:1586:5: lv_block_5_0= ruleBSharpBlock
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
    // InternalBSharp.g:1607:1: entryRuleDatatypeConstructor returns [EObject current=null] : iv_ruleDatatypeConstructor= ruleDatatypeConstructor EOF ;
    public final EObject entryRuleDatatypeConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatypeConstructor = null;


        try {
            // InternalBSharp.g:1607:60: (iv_ruleDatatypeConstructor= ruleDatatypeConstructor EOF )
            // InternalBSharp.g:1608:2: iv_ruleDatatypeConstructor= ruleDatatypeConstructor EOF
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
    // InternalBSharp.g:1614:1: ruleDatatypeConstructor returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleDatatypeConstructor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_decons_2_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1620:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )? ) )
            // InternalBSharp.g:1621:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )? )
            {
            // InternalBSharp.g:1621:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )? )
            // InternalBSharp.g:1622:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )?
            {
            // InternalBSharp.g:1622:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBSharp.g:1623:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBSharp.g:1623:4: (lv_name_0_0= RULE_ID )
            // InternalBSharp.g:1624:5: lv_name_0_0= RULE_ID
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

            // InternalBSharp.g:1640:3: (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==20) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalBSharp.g:1641:4: otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getDatatypeConstructorAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalBSharp.g:1645:4: ( (lv_decons_2_0= ruleTypedVariableList ) )
                    // InternalBSharp.g:1646:5: (lv_decons_2_0= ruleTypedVariableList )
                    {
                    // InternalBSharp.g:1646:5: (lv_decons_2_0= ruleTypedVariableList )
                    // InternalBSharp.g:1647:6: lv_decons_2_0= ruleTypedVariableList
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
    // InternalBSharp.g:1673:1: entryRuleExtend returns [EObject current=null] : iv_ruleExtend= ruleExtend EOF ;
    public final EObject entryRuleExtend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtend = null;


        try {
            // InternalBSharp.g:1673:47: (iv_ruleExtend= ruleExtend EOF )
            // InternalBSharp.g:1674:2: iv_ruleExtend= ruleExtend EOF
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
    // InternalBSharp.g:1680:1: ruleExtend returns [EObject current=null] : (otherlv_0= 'Extend' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' ( (lv_block_5_0= ruleBSharpBlock ) ) ) ;
    public final EObject ruleExtend() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        EObject lv_block_5_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1686:2: ( (otherlv_0= 'Extend' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' ( (lv_block_5_0= ruleBSharpBlock ) ) ) )
            // InternalBSharp.g:1687:2: (otherlv_0= 'Extend' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' ( (lv_block_5_0= ruleBSharpBlock ) ) )
            {
            // InternalBSharp.g:1687:2: (otherlv_0= 'Extend' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' ( (lv_block_5_0= ruleBSharpBlock ) ) )
            // InternalBSharp.g:1688:3: otherlv_0= 'Extend' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' ( (lv_block_5_0= ruleBSharpBlock ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExtendAccess().getExtendKeyword_0());
            		
            // InternalBSharp.g:1692:3: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:1693:4: ( ruleQualifiedName )
            {
            // InternalBSharp.g:1693:4: ( ruleQualifiedName )
            // InternalBSharp.g:1694:5: ruleQualifiedName
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
            		
            // InternalBSharp.g:1712:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalBSharp.g:1713:4: (lv_name_3_0= RULE_ID )
            {
            // InternalBSharp.g:1713:4: (lv_name_3_0= RULE_ID )
            // InternalBSharp.g:1714:5: lv_name_3_0= RULE_ID
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
            		
            // InternalBSharp.g:1734:3: ( (lv_block_5_0= ruleBSharpBlock ) )
            // InternalBSharp.g:1735:4: (lv_block_5_0= ruleBSharpBlock )
            {
            // InternalBSharp.g:1735:4: (lv_block_5_0= ruleBSharpBlock )
            // InternalBSharp.g:1736:5: lv_block_5_0= ruleBSharpBlock
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
    // InternalBSharp.g:1757:1: entryRuleBSharpBlock returns [EObject current=null] : iv_ruleBSharpBlock= ruleBSharpBlock EOF ;
    public final EObject entryRuleBSharpBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSharpBlock = null;


        try {
            // InternalBSharp.g:1757:52: (iv_ruleBSharpBlock= ruleBSharpBlock EOF )
            // InternalBSharp.g:1758:2: iv_ruleBSharpBlock= ruleBSharpBlock EOF
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
    // InternalBSharp.g:1764:1: ruleBSharpBlock returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDecl ) ) | ( (lv_theorems_3_0= ruleTheoremBody ) ) | ( (lv_theorems_4_0= ruleInstance ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleBSharpBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_functions_2_0 = null;

        EObject lv_theorems_3_0 = null;

        EObject lv_theorems_4_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1770:2: ( ( () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDecl ) ) | ( (lv_theorems_3_0= ruleTheoremBody ) ) | ( (lv_theorems_4_0= ruleInstance ) ) )* otherlv_5= '}' ) )
            // InternalBSharp.g:1771:2: ( () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDecl ) ) | ( (lv_theorems_3_0= ruleTheoremBody ) ) | ( (lv_theorems_4_0= ruleInstance ) ) )* otherlv_5= '}' )
            {
            // InternalBSharp.g:1771:2: ( () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDecl ) ) | ( (lv_theorems_3_0= ruleTheoremBody ) ) | ( (lv_theorems_4_0= ruleInstance ) ) )* otherlv_5= '}' )
            // InternalBSharp.g:1772:3: () otherlv_1= '{' ( ( (lv_functions_2_0= ruleFunctionDecl ) ) | ( (lv_theorems_3_0= ruleTheoremBody ) ) | ( (lv_theorems_4_0= ruleInstance ) ) )* otherlv_5= '}'
            {
            // InternalBSharp.g:1772:3: ()
            // InternalBSharp.g:1773:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBSharpBlockAccess().getBSharpBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getBSharpBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBSharp.g:1783:3: ( ( (lv_functions_2_0= ruleFunctionDecl ) ) | ( (lv_theorems_3_0= ruleTheoremBody ) ) | ( (lv_theorems_4_0= ruleInstance ) ) )*
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
                case 60:
                    {
                    alt32=3;
                    }
                    break;

                }

                switch (alt32) {
            	case 1 :
            	    // InternalBSharp.g:1784:4: ( (lv_functions_2_0= ruleFunctionDecl ) )
            	    {
            	    // InternalBSharp.g:1784:4: ( (lv_functions_2_0= ruleFunctionDecl ) )
            	    // InternalBSharp.g:1785:5: (lv_functions_2_0= ruleFunctionDecl )
            	    {
            	    // InternalBSharp.g:1785:5: (lv_functions_2_0= ruleFunctionDecl )
            	    // InternalBSharp.g:1786:6: lv_functions_2_0= ruleFunctionDecl
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
            	    // InternalBSharp.g:1804:4: ( (lv_theorems_3_0= ruleTheoremBody ) )
            	    {
            	    // InternalBSharp.g:1804:4: ( (lv_theorems_3_0= ruleTheoremBody ) )
            	    // InternalBSharp.g:1805:5: (lv_theorems_3_0= ruleTheoremBody )
            	    {
            	    // InternalBSharp.g:1805:5: (lv_theorems_3_0= ruleTheoremBody )
            	    // InternalBSharp.g:1806:6: lv_theorems_3_0= ruleTheoremBody
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
            	    // InternalBSharp.g:1824:4: ( (lv_theorems_4_0= ruleInstance ) )
            	    {
            	    // InternalBSharp.g:1824:4: ( (lv_theorems_4_0= ruleInstance ) )
            	    // InternalBSharp.g:1825:5: (lv_theorems_4_0= ruleInstance )
            	    {
            	    // InternalBSharp.g:1825:5: (lv_theorems_4_0= ruleInstance )
            	    // InternalBSharp.g:1826:6: lv_theorems_4_0= ruleInstance
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
    // InternalBSharp.g:1852:1: entryRuleFunctionDecl returns [EObject current=null] : iv_ruleFunctionDecl= ruleFunctionDecl EOF ;
    public final EObject entryRuleFunctionDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDecl = null;


        try {
            // InternalBSharp.g:1852:53: (iv_ruleFunctionDecl= ruleFunctionDecl EOF )
            // InternalBSharp.g:1853:2: iv_ruleFunctionDecl= ruleFunctionDecl EOF
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
    // InternalBSharp.g:1859:1: ruleFunctionDecl returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_varList_3_0= ruleTypedVariableList ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleTypeConstructor ) ) ( (lv_infix_7_0= 'INFIX' ) )? ( (lv_precedence_8_0= RULE_INT ) )? ( (lv_expr_9_0= ruleRootExpression ) ) ) ;
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
            // InternalBSharp.g:1865:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_varList_3_0= ruleTypedVariableList ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleTypeConstructor ) ) ( (lv_infix_7_0= 'INFIX' ) )? ( (lv_precedence_8_0= RULE_INT ) )? ( (lv_expr_9_0= ruleRootExpression ) ) ) )
            // InternalBSharp.g:1866:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_varList_3_0= ruleTypedVariableList ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleTypeConstructor ) ) ( (lv_infix_7_0= 'INFIX' ) )? ( (lv_precedence_8_0= RULE_INT ) )? ( (lv_expr_9_0= ruleRootExpression ) ) )
            {
            // InternalBSharp.g:1866:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_varList_3_0= ruleTypedVariableList ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleTypeConstructor ) ) ( (lv_infix_7_0= 'INFIX' ) )? ( (lv_precedence_8_0= RULE_INT ) )? ( (lv_expr_9_0= ruleRootExpression ) ) )
            // InternalBSharp.g:1867:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_varList_3_0= ruleTypedVariableList ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleTypeConstructor ) ) ( (lv_infix_7_0= 'INFIX' ) )? ( (lv_precedence_8_0= RULE_INT ) )? ( (lv_expr_9_0= ruleRootExpression ) )
            {
            // InternalBSharp.g:1867:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBSharp.g:1868:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBSharp.g:1868:4: (lv_name_0_0= RULE_ID )
            // InternalBSharp.g:1869:5: lv_name_0_0= RULE_ID
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

            // InternalBSharp.g:1885:3: ( (lv_context_1_0= rulePolyContext ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==23) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalBSharp.g:1886:4: (lv_context_1_0= rulePolyContext )
                    {
                    // InternalBSharp.g:1886:4: (lv_context_1_0= rulePolyContext )
                    // InternalBSharp.g:1887:5: lv_context_1_0= rulePolyContext
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
            		
            // InternalBSharp.g:1908:3: ( (lv_varList_3_0= ruleTypedVariableList ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalBSharp.g:1909:4: (lv_varList_3_0= ruleTypedVariableList )
                    {
                    // InternalBSharp.g:1909:4: (lv_varList_3_0= ruleTypedVariableList )
                    // InternalBSharp.g:1910:5: lv_varList_3_0= ruleTypedVariableList
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
            		
            // InternalBSharp.g:1935:3: ( (lv_returnType_6_0= ruleTypeConstructor ) )
            // InternalBSharp.g:1936:4: (lv_returnType_6_0= ruleTypeConstructor )
            {
            // InternalBSharp.g:1936:4: (lv_returnType_6_0= ruleTypeConstructor )
            // InternalBSharp.g:1937:5: lv_returnType_6_0= ruleTypeConstructor
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

            // InternalBSharp.g:1954:3: ( (lv_infix_7_0= 'INFIX' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==43) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalBSharp.g:1955:4: (lv_infix_7_0= 'INFIX' )
                    {
                    // InternalBSharp.g:1955:4: (lv_infix_7_0= 'INFIX' )
                    // InternalBSharp.g:1956:5: lv_infix_7_0= 'INFIX'
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

            // InternalBSharp.g:1968:3: ( (lv_precedence_8_0= RULE_INT ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_INT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalBSharp.g:1969:4: (lv_precedence_8_0= RULE_INT )
                    {
                    // InternalBSharp.g:1969:4: (lv_precedence_8_0= RULE_INT )
                    // InternalBSharp.g:1970:5: lv_precedence_8_0= RULE_INT
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

            // InternalBSharp.g:1986:3: ( (lv_expr_9_0= ruleRootExpression ) )
            // InternalBSharp.g:1987:4: (lv_expr_9_0= ruleRootExpression )
            {
            // InternalBSharp.g:1987:4: (lv_expr_9_0= ruleRootExpression )
            // InternalBSharp.g:1988:5: lv_expr_9_0= ruleRootExpression
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
    // InternalBSharp.g:2009:1: entryRuleMatchStatement returns [EObject current=null] : iv_ruleMatchStatement= ruleMatchStatement EOF ;
    public final EObject entryRuleMatchStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchStatement = null;


        try {
            // InternalBSharp.g:2009:55: (iv_ruleMatchStatement= ruleMatchStatement EOF )
            // InternalBSharp.g:2010:2: iv_ruleMatchStatement= ruleMatchStatement EOF
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
    // InternalBSharp.g:2016:1: ruleMatchStatement returns [EObject current=null] : (otherlv_0= 'match' ( (lv_match_1_0= ruleRootExpression ) ) otherlv_2= '{' ( (lv_inductCase_3_0= ruleMatchCase ) ) ( (lv_inductCase_4_0= ruleMatchCase ) )* otherlv_5= '}' ) ;
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
            // InternalBSharp.g:2022:2: ( (otherlv_0= 'match' ( (lv_match_1_0= ruleRootExpression ) ) otherlv_2= '{' ( (lv_inductCase_3_0= ruleMatchCase ) ) ( (lv_inductCase_4_0= ruleMatchCase ) )* otherlv_5= '}' ) )
            // InternalBSharp.g:2023:2: (otherlv_0= 'match' ( (lv_match_1_0= ruleRootExpression ) ) otherlv_2= '{' ( (lv_inductCase_3_0= ruleMatchCase ) ) ( (lv_inductCase_4_0= ruleMatchCase ) )* otherlv_5= '}' )
            {
            // InternalBSharp.g:2023:2: (otherlv_0= 'match' ( (lv_match_1_0= ruleRootExpression ) ) otherlv_2= '{' ( (lv_inductCase_3_0= ruleMatchCase ) ) ( (lv_inductCase_4_0= ruleMatchCase ) )* otherlv_5= '}' )
            // InternalBSharp.g:2024:3: otherlv_0= 'match' ( (lv_match_1_0= ruleRootExpression ) ) otherlv_2= '{' ( (lv_inductCase_3_0= ruleMatchCase ) ) ( (lv_inductCase_4_0= ruleMatchCase ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getMatchStatementAccess().getMatchKeyword_0());
            		
            // InternalBSharp.g:2028:3: ( (lv_match_1_0= ruleRootExpression ) )
            // InternalBSharp.g:2029:4: (lv_match_1_0= ruleRootExpression )
            {
            // InternalBSharp.g:2029:4: (lv_match_1_0= ruleRootExpression )
            // InternalBSharp.g:2030:5: lv_match_1_0= ruleRootExpression
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
            		
            // InternalBSharp.g:2051:3: ( (lv_inductCase_3_0= ruleMatchCase ) )
            // InternalBSharp.g:2052:4: (lv_inductCase_3_0= ruleMatchCase )
            {
            // InternalBSharp.g:2052:4: (lv_inductCase_3_0= ruleMatchCase )
            // InternalBSharp.g:2053:5: lv_inductCase_3_0= ruleMatchCase
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

            // InternalBSharp.g:2070:3: ( (lv_inductCase_4_0= ruleMatchCase ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==39) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalBSharp.g:2071:4: (lv_inductCase_4_0= ruleMatchCase )
            	    {
            	    // InternalBSharp.g:2071:4: (lv_inductCase_4_0= ruleMatchCase )
            	    // InternalBSharp.g:2072:5: lv_inductCase_4_0= ruleMatchCase
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
    // InternalBSharp.g:2097:1: entryRuleMatchCase returns [EObject current=null] : iv_ruleMatchCase= ruleMatchCase EOF ;
    public final EObject entryRuleMatchCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchCase = null;


        try {
            // InternalBSharp.g:2097:50: (iv_ruleMatchCase= ruleMatchCase EOF )
            // InternalBSharp.g:2098:2: iv_ruleMatchCase= ruleMatchCase EOF
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
    // InternalBSharp.g:2104:1: ruleMatchCase returns [EObject current=null] : (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleRootExpression ) ) ) ;
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
            // InternalBSharp.g:2110:2: ( (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleRootExpression ) ) ) )
            // InternalBSharp.g:2111:2: (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleRootExpression ) ) )
            {
            // InternalBSharp.g:2111:2: (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleRootExpression ) ) )
            // InternalBSharp.g:2112:3: otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleRootExpression ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMatchCaseAccess().getVerticalLineKeyword_0());
            		
            // InternalBSharp.g:2116:3: ( (otherlv_1= RULE_ID ) )
            // InternalBSharp.g:2117:4: (otherlv_1= RULE_ID )
            {
            // InternalBSharp.g:2117:4: (otherlv_1= RULE_ID )
            // InternalBSharp.g:2118:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMatchCaseRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_40); 

            					newLeafNode(otherlv_1, grammarAccess.getMatchCaseAccess().getDeconNameDatatypeConstructorCrossReference_1_0());
            				

            }


            }

            // InternalBSharp.g:2129:3: (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==20) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalBSharp.g:2130:4: otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getMatchCaseAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalBSharp.g:2134:4: ( (lv_variables_3_0= ruleTypedVariable ) )
                    // InternalBSharp.g:2135:5: (lv_variables_3_0= ruleTypedVariable )
                    {
                    // InternalBSharp.g:2135:5: (lv_variables_3_0= ruleTypedVariable )
                    // InternalBSharp.g:2136:6: lv_variables_3_0= ruleTypedVariable
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

                    // InternalBSharp.g:2153:4: (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==25) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalBSharp.g:2154:5: otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) )
                    	    {
                    	    otherlv_4=(Token)match(input,25,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMatchCaseAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalBSharp.g:2158:5: ( (lv_variables_5_0= ruleTypedVariable ) )
                    	    // InternalBSharp.g:2159:6: (lv_variables_5_0= ruleTypedVariable )
                    	    {
                    	    // InternalBSharp.g:2159:6: (lv_variables_5_0= ruleTypedVariable )
                    	    // InternalBSharp.g:2160:7: lv_variables_5_0= ruleTypedVariable
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
            		
            // InternalBSharp.g:2187:3: ( (lv_expr_8_0= ruleRootExpression ) )
            // InternalBSharp.g:2188:4: (lv_expr_8_0= ruleRootExpression )
            {
            // InternalBSharp.g:2188:4: (lv_expr_8_0= ruleRootExpression )
            // InternalBSharp.g:2189:5: lv_expr_8_0= ruleRootExpression
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
    // InternalBSharp.g:2210:1: entryRuleTheoremBody returns [EObject current=null] : iv_ruleTheoremBody= ruleTheoremBody EOF ;
    public final EObject entryRuleTheoremBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheoremBody = null;


        try {
            // InternalBSharp.g:2210:52: (iv_ruleTheoremBody= ruleTheoremBody EOF )
            // InternalBSharp.g:2211:2: iv_ruleTheoremBody= ruleTheoremBody EOF
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
    // InternalBSharp.g:2217:1: ruleTheoremBody returns [EObject current=null] : (otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}' ) ;
    public final EObject ruleTheoremBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_theoremDecl_2_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2223:2: ( (otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}' ) )
            // InternalBSharp.g:2224:2: (otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}' )
            {
            // InternalBSharp.g:2224:2: (otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}' )
            // InternalBSharp.g:2225:3: otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getTheoremBodyAccess().getTheoremsKeyword_0());
            		
            otherlv_1=(Token)match(input,41,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTheoremBodyAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBSharp.g:2233:3: ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+
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
            	    // InternalBSharp.g:2234:4: (lv_theoremDecl_2_0= ruleTheoremDecl )
            	    {
            	    // InternalBSharp.g:2234:4: (lv_theoremDecl_2_0= ruleTheoremDecl )
            	    // InternalBSharp.g:2235:5: lv_theoremDecl_2_0= ruleTheoremDecl
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
    // InternalBSharp.g:2260:1: entryRuleTheoremDecl returns [EObject current=null] : iv_ruleTheoremDecl= ruleTheoremDecl EOF ;
    public final EObject entryRuleTheoremDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheoremDecl = null;


        try {
            // InternalBSharp.g:2260:52: (iv_ruleTheoremDecl= ruleTheoremDecl EOF )
            // InternalBSharp.g:2261:2: iv_ruleTheoremDecl= ruleTheoremDecl EOF
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
    // InternalBSharp.g:2267:1: ruleTheoremDecl returns [EObject current=null] : ( ( (lv_name_0_0= ruleTHM_NAME ) ) ( (lv_expr_1_0= ruleRootExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleTheoremDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2273:2: ( ( ( (lv_name_0_0= ruleTHM_NAME ) ) ( (lv_expr_1_0= ruleRootExpression ) ) otherlv_2= ';' ) )
            // InternalBSharp.g:2274:2: ( ( (lv_name_0_0= ruleTHM_NAME ) ) ( (lv_expr_1_0= ruleRootExpression ) ) otherlv_2= ';' )
            {
            // InternalBSharp.g:2274:2: ( ( (lv_name_0_0= ruleTHM_NAME ) ) ( (lv_expr_1_0= ruleRootExpression ) ) otherlv_2= ';' )
            // InternalBSharp.g:2275:3: ( (lv_name_0_0= ruleTHM_NAME ) ) ( (lv_expr_1_0= ruleRootExpression ) ) otherlv_2= ';'
            {
            // InternalBSharp.g:2275:3: ( (lv_name_0_0= ruleTHM_NAME ) )
            // InternalBSharp.g:2276:4: (lv_name_0_0= ruleTHM_NAME )
            {
            // InternalBSharp.g:2276:4: (lv_name_0_0= ruleTHM_NAME )
            // InternalBSharp.g:2277:5: lv_name_0_0= ruleTHM_NAME
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

            // InternalBSharp.g:2294:3: ( (lv_expr_1_0= ruleRootExpression ) )
            // InternalBSharp.g:2295:4: (lv_expr_1_0= ruleRootExpression )
            {
            // InternalBSharp.g:2295:4: (lv_expr_1_0= ruleRootExpression )
            // InternalBSharp.g:2296:5: lv_expr_1_0= ruleRootExpression
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
    // InternalBSharp.g:2321:1: entryRuleTypedVariableList returns [EObject current=null] : iv_ruleTypedVariableList= ruleTypedVariableList EOF ;
    public final EObject entryRuleTypedVariableList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedVariableList = null;


        try {
            // InternalBSharp.g:2321:58: (iv_ruleTypedVariableList= ruleTypedVariableList EOF )
            // InternalBSharp.g:2322:2: iv_ruleTypedVariableList= ruleTypedVariableList EOF
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
    // InternalBSharp.g:2328:1: ruleTypedVariableList returns [EObject current=null] : ( ( (lv_variablesOfType_0_0= ruleVariableTyping ) ) (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )* ) ;
    public final EObject ruleTypedVariableList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variablesOfType_0_0 = null;

        EObject lv_variablesOfType_2_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2334:2: ( ( ( (lv_variablesOfType_0_0= ruleVariableTyping ) ) (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )* ) )
            // InternalBSharp.g:2335:2: ( ( (lv_variablesOfType_0_0= ruleVariableTyping ) ) (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )* )
            {
            // InternalBSharp.g:2335:2: ( ( (lv_variablesOfType_0_0= ruleVariableTyping ) ) (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )* )
            // InternalBSharp.g:2336:3: ( (lv_variablesOfType_0_0= ruleVariableTyping ) ) (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )*
            {
            // InternalBSharp.g:2336:3: ( (lv_variablesOfType_0_0= ruleVariableTyping ) )
            // InternalBSharp.g:2337:4: (lv_variablesOfType_0_0= ruleVariableTyping )
            {
            // InternalBSharp.g:2337:4: (lv_variablesOfType_0_0= ruleVariableTyping )
            // InternalBSharp.g:2338:5: lv_variablesOfType_0_0= ruleVariableTyping
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

            // InternalBSharp.g:2355:3: (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==25) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalBSharp.g:2356:4: otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) )
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getTypedVariableListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalBSharp.g:2360:4: ( (lv_variablesOfType_2_0= ruleVariableTyping ) )
            	    // InternalBSharp.g:2361:5: (lv_variablesOfType_2_0= ruleVariableTyping )
            	    {
            	    // InternalBSharp.g:2361:5: (lv_variablesOfType_2_0= ruleVariableTyping )
            	    // InternalBSharp.g:2362:6: lv_variablesOfType_2_0= ruleVariableTyping
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
    // InternalBSharp.g:2384:1: entryRuleVariableTyping returns [EObject current=null] : iv_ruleVariableTyping= ruleVariableTyping EOF ;
    public final EObject entryRuleVariableTyping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableTyping = null;


        try {
            // InternalBSharp.g:2384:55: (iv_ruleVariableTyping= ruleVariableTyping EOF )
            // InternalBSharp.g:2385:2: iv_ruleVariableTyping= ruleVariableTyping EOF
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
    // InternalBSharp.g:2391:1: ruleVariableTyping returns [EObject current=null] : ( ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleConstructedType ) ) ) ;
    public final EObject ruleVariableTyping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeVar_0_0 = null;

        EObject lv_typeVar_2_0 = null;

        EObject lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2397:2: ( ( ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleConstructedType ) ) ) )
            // InternalBSharp.g:2398:2: ( ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleConstructedType ) ) )
            {
            // InternalBSharp.g:2398:2: ( ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleConstructedType ) ) )
            // InternalBSharp.g:2399:3: ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleConstructedType ) )
            {
            // InternalBSharp.g:2399:3: ( (lv_typeVar_0_0= ruleTypedVariable ) )
            // InternalBSharp.g:2400:4: (lv_typeVar_0_0= ruleTypedVariable )
            {
            // InternalBSharp.g:2400:4: (lv_typeVar_0_0= ruleTypedVariable )
            // InternalBSharp.g:2401:5: lv_typeVar_0_0= ruleTypedVariable
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

            // InternalBSharp.g:2418:3: (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==25) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalBSharp.g:2419:4: otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) )
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getVariableTypingAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalBSharp.g:2423:4: ( (lv_typeVar_2_0= ruleTypedVariable ) )
            	    // InternalBSharp.g:2424:5: (lv_typeVar_2_0= ruleTypedVariable )
            	    {
            	    // InternalBSharp.g:2424:5: (lv_typeVar_2_0= ruleTypedVariable )
            	    // InternalBSharp.g:2425:6: lv_typeVar_2_0= ruleTypedVariable
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
            		
            // InternalBSharp.g:2447:3: ( (lv_type_4_0= ruleConstructedType ) )
            // InternalBSharp.g:2448:4: (lv_type_4_0= ruleConstructedType )
            {
            // InternalBSharp.g:2448:4: (lv_type_4_0= ruleConstructedType )
            // InternalBSharp.g:2449:5: lv_type_4_0= ruleConstructedType
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
    // InternalBSharp.g:2470:1: entryRuleTypedVariable returns [EObject current=null] : iv_ruleTypedVariable= ruleTypedVariable EOF ;
    public final EObject entryRuleTypedVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedVariable = null;


        try {
            // InternalBSharp.g:2470:54: (iv_ruleTypedVariable= ruleTypedVariable EOF )
            // InternalBSharp.g:2471:2: iv_ruleTypedVariable= ruleTypedVariable EOF
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
    // InternalBSharp.g:2477:1: ruleTypedVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleTypedVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBSharp.g:2483:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBSharp.g:2484:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBSharp.g:2484:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBSharp.g:2485:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBSharp.g:2485:3: (lv_name_0_0= RULE_ID )
            // InternalBSharp.g:2486:4: lv_name_0_0= RULE_ID
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
    // InternalBSharp.g:2505:1: entryRuleLambda returns [EObject current=null] : iv_ruleLambda= ruleLambda EOF ;
    public final EObject entryRuleLambda() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLambda = null;


        try {
            // InternalBSharp.g:2505:47: (iv_ruleLambda= ruleLambda EOF )
            // InternalBSharp.g:2506:2: iv_ruleLambda= ruleLambda EOF
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
    // InternalBSharp.g:2512:1: ruleLambda returns [EObject current=null] : ( ( (lv_qType_0_0= '\\u03BB' ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '|' ( (lv_expr_4_0= ruleRootExpression ) ) ) ;
    public final EObject ruleLambda() throws RecognitionException {
        EObject current = null;

        Token lv_qType_0_0=null;
        Token otherlv_3=null;
        EObject lv_context_1_0 = null;

        EObject lv_varList_2_0 = null;

        EObject lv_expr_4_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2518:2: ( ( ( (lv_qType_0_0= '\\u03BB' ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '|' ( (lv_expr_4_0= ruleRootExpression ) ) ) )
            // InternalBSharp.g:2519:2: ( ( (lv_qType_0_0= '\\u03BB' ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '|' ( (lv_expr_4_0= ruleRootExpression ) ) )
            {
            // InternalBSharp.g:2519:2: ( ( (lv_qType_0_0= '\\u03BB' ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '|' ( (lv_expr_4_0= ruleRootExpression ) ) )
            // InternalBSharp.g:2520:3: ( (lv_qType_0_0= '\\u03BB' ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '|' ( (lv_expr_4_0= ruleRootExpression ) )
            {
            // InternalBSharp.g:2520:3: ( (lv_qType_0_0= '\\u03BB' ) )
            // InternalBSharp.g:2521:4: (lv_qType_0_0= '\\u03BB' )
            {
            // InternalBSharp.g:2521:4: (lv_qType_0_0= '\\u03BB' )
            // InternalBSharp.g:2522:5: lv_qType_0_0= '\\u03BB'
            {
            lv_qType_0_0=(Token)match(input,46,FOLLOW_45); 

            					newLeafNode(lv_qType_0_0, grammarAccess.getLambdaAccess().getQTypeGreekSmallLetterLamdaKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLambdaRule());
            					}
            					setWithLastConsumed(current, "qType", lv_qType_0_0, "\u03BB");
            				

            }


            }

            // InternalBSharp.g:2534:3: ( (lv_context_1_0= rulePolyContext ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==23) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalBSharp.g:2535:4: (lv_context_1_0= rulePolyContext )
                    {
                    // InternalBSharp.g:2535:4: (lv_context_1_0= rulePolyContext )
                    // InternalBSharp.g:2536:5: lv_context_1_0= rulePolyContext
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

            // InternalBSharp.g:2553:3: ( (lv_varList_2_0= ruleTypedVariableList ) )
            // InternalBSharp.g:2554:4: (lv_varList_2_0= ruleTypedVariableList )
            {
            // InternalBSharp.g:2554:4: (lv_varList_2_0= ruleTypedVariableList )
            // InternalBSharp.g:2555:5: lv_varList_2_0= ruleTypedVariableList
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
            		
            // InternalBSharp.g:2576:3: ( (lv_expr_4_0= ruleRootExpression ) )
            // InternalBSharp.g:2577:4: (lv_expr_4_0= ruleRootExpression )
            {
            // InternalBSharp.g:2577:4: (lv_expr_4_0= ruleRootExpression )
            // InternalBSharp.g:2578:5: lv_expr_4_0= ruleRootExpression
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
    // InternalBSharp.g:2599:1: entryRuleQuantifier returns [EObject current=null] : iv_ruleQuantifier= ruleQuantifier EOF ;
    public final EObject entryRuleQuantifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantifier = null;


        try {
            // InternalBSharp.g:2599:51: (iv_ruleQuantifier= ruleQuantifier EOF )
            // InternalBSharp.g:2600:2: iv_ruleQuantifier= ruleQuantifier EOF
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
    // InternalBSharp.g:2606:1: ruleQuantifier returns [EObject current=null] : ( ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '\\u00B7' ( (lv_expr_4_0= ruleRootExpression ) ) ) ;
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
            // InternalBSharp.g:2612:2: ( ( ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '\\u00B7' ( (lv_expr_4_0= ruleRootExpression ) ) ) )
            // InternalBSharp.g:2613:2: ( ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '\\u00B7' ( (lv_expr_4_0= ruleRootExpression ) ) )
            {
            // InternalBSharp.g:2613:2: ( ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '\\u00B7' ( (lv_expr_4_0= ruleRootExpression ) ) )
            // InternalBSharp.g:2614:3: ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '\\u00B7' ( (lv_expr_4_0= ruleRootExpression ) )
            {
            // InternalBSharp.g:2614:3: ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) )
            // InternalBSharp.g:2615:4: ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) )
            {
            // InternalBSharp.g:2615:4: ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) )
            // InternalBSharp.g:2616:5: (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' )
            {
            // InternalBSharp.g:2616:5: (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' )
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
                    // InternalBSharp.g:2617:6: lv_qType_0_1= '\\u2200'
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
                    // InternalBSharp.g:2628:6: lv_qType_0_2= '\\u2203'
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

            // InternalBSharp.g:2641:3: ( (lv_context_1_0= rulePolyContext ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==23) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalBSharp.g:2642:4: (lv_context_1_0= rulePolyContext )
                    {
                    // InternalBSharp.g:2642:4: (lv_context_1_0= rulePolyContext )
                    // InternalBSharp.g:2643:5: lv_context_1_0= rulePolyContext
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

            // InternalBSharp.g:2660:3: ( (lv_varList_2_0= ruleTypedVariableList ) )
            // InternalBSharp.g:2661:4: (lv_varList_2_0= ruleTypedVariableList )
            {
            // InternalBSharp.g:2661:4: (lv_varList_2_0= ruleTypedVariableList )
            // InternalBSharp.g:2662:5: lv_varList_2_0= ruleTypedVariableList
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
            		
            // InternalBSharp.g:2683:3: ( (lv_expr_4_0= ruleRootExpression ) )
            // InternalBSharp.g:2684:4: (lv_expr_4_0= ruleRootExpression )
            {
            // InternalBSharp.g:2684:4: (lv_expr_4_0= ruleRootExpression )
            // InternalBSharp.g:2685:5: lv_expr_4_0= ruleRootExpression
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
    // InternalBSharp.g:2706:1: entryRuleRootExpression returns [EObject current=null] : iv_ruleRootExpression= ruleRootExpression EOF ;
    public final EObject entryRuleRootExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootExpression = null;


        try {
            // InternalBSharp.g:2706:55: (iv_ruleRootExpression= ruleRootExpression EOF )
            // InternalBSharp.g:2707:2: iv_ruleRootExpression= ruleRootExpression EOF
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
    // InternalBSharp.g:2713:1: ruleRootExpression returns [EObject current=null] : (this_Lambda_0= ruleLambda | this_Quantifier_1= ruleQuantifier | this_Infix_2= ruleInfix | this_MatchStatement_3= ruleMatchStatement | this_IfElse_4= ruleIfElse ) ;
    public final EObject ruleRootExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Lambda_0 = null;

        EObject this_Quantifier_1 = null;

        EObject this_Infix_2 = null;

        EObject this_MatchStatement_3 = null;

        EObject this_IfElse_4 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2719:2: ( (this_Lambda_0= ruleLambda | this_Quantifier_1= ruleQuantifier | this_Infix_2= ruleInfix | this_MatchStatement_3= ruleMatchStatement | this_IfElse_4= ruleIfElse ) )
            // InternalBSharp.g:2720:2: (this_Lambda_0= ruleLambda | this_Quantifier_1= ruleQuantifier | this_Infix_2= ruleInfix | this_MatchStatement_3= ruleMatchStatement | this_IfElse_4= ruleIfElse )
            {
            // InternalBSharp.g:2720:2: (this_Lambda_0= ruleLambda | this_Quantifier_1= ruleQuantifier | this_Infix_2= ruleInfix | this_MatchStatement_3= ruleMatchStatement | this_IfElse_4= ruleIfElse )
            int alt46=5;
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
            case 51:
                {
                alt46=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalBSharp.g:2721:3: this_Lambda_0= ruleLambda
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
                    // InternalBSharp.g:2730:3: this_Quantifier_1= ruleQuantifier
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
                    // InternalBSharp.g:2739:3: this_Infix_2= ruleInfix
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
                    // InternalBSharp.g:2748:3: this_MatchStatement_3= ruleMatchStatement
                    {

                    			newCompositeNode(grammarAccess.getRootExpressionAccess().getMatchStatementParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MatchStatement_3=ruleMatchStatement();

                    state._fsp--;


                    			current = this_MatchStatement_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalBSharp.g:2757:3: this_IfElse_4= ruleIfElse
                    {

                    			newCompositeNode(grammarAccess.getRootExpressionAccess().getIfElseParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfElse_4=ruleIfElse();

                    state._fsp--;


                    			current = this_IfElse_4;
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
    // InternalBSharp.g:2769:1: entryRulePrefix returns [EObject current=null] : iv_rulePrefix= rulePrefix EOF ;
    public final EObject entryRulePrefix() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefix = null;


        try {
            // InternalBSharp.g:2769:47: (iv_rulePrefix= rulePrefix EOF )
            // InternalBSharp.g:2770:2: iv_rulePrefix= rulePrefix EOF
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
    // InternalBSharp.g:2776:1: rulePrefix returns [EObject current=null] : ( ( (lv_name_0_0= rulePrefixBuiltIn ) ) ( (lv_elem_1_0= ruleElement ) ) ) ;
    public final EObject rulePrefix() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_elem_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2782:2: ( ( ( (lv_name_0_0= rulePrefixBuiltIn ) ) ( (lv_elem_1_0= ruleElement ) ) ) )
            // InternalBSharp.g:2783:2: ( ( (lv_name_0_0= rulePrefixBuiltIn ) ) ( (lv_elem_1_0= ruleElement ) ) )
            {
            // InternalBSharp.g:2783:2: ( ( (lv_name_0_0= rulePrefixBuiltIn ) ) ( (lv_elem_1_0= ruleElement ) ) )
            // InternalBSharp.g:2784:3: ( (lv_name_0_0= rulePrefixBuiltIn ) ) ( (lv_elem_1_0= ruleElement ) )
            {
            // InternalBSharp.g:2784:3: ( (lv_name_0_0= rulePrefixBuiltIn ) )
            // InternalBSharp.g:2785:4: (lv_name_0_0= rulePrefixBuiltIn )
            {
            // InternalBSharp.g:2785:4: (lv_name_0_0= rulePrefixBuiltIn )
            // InternalBSharp.g:2786:5: lv_name_0_0= rulePrefixBuiltIn
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

            // InternalBSharp.g:2803:3: ( (lv_elem_1_0= ruleElement ) )
            // InternalBSharp.g:2804:4: (lv_elem_1_0= ruleElement )
            {
            // InternalBSharp.g:2804:4: (lv_elem_1_0= ruleElement )
            // InternalBSharp.g:2805:5: lv_elem_1_0= ruleElement
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
    // InternalBSharp.g:2826:1: entryRulePrefixBuiltIn returns [String current=null] : iv_rulePrefixBuiltIn= rulePrefixBuiltIn EOF ;
    public final String entryRulePrefixBuiltIn() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrefixBuiltIn = null;


        try {
            // InternalBSharp.g:2826:53: (iv_rulePrefixBuiltIn= rulePrefixBuiltIn EOF )
            // InternalBSharp.g:2827:2: iv_rulePrefixBuiltIn= rulePrefixBuiltIn EOF
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
    // InternalBSharp.g:2833:1: rulePrefixBuiltIn returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '\\u00AC' ;
    public final AntlrDatatypeRuleToken rulePrefixBuiltIn() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBSharp.g:2839:2: (kw= '\\u00AC' )
            // InternalBSharp.g:2840:2: kw= '\\u00AC'
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
    // InternalBSharp.g:2848:1: entryRuleInfix returns [EObject current=null] : iv_ruleInfix= ruleInfix EOF ;
    public final EObject entryRuleInfix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfix = null;


        try {
            // InternalBSharp.g:2848:46: (iv_ruleInfix= ruleInfix EOF )
            // InternalBSharp.g:2849:2: iv_ruleInfix= ruleInfix EOF
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
    // InternalBSharp.g:2855:1: ruleInfix returns [EObject current=null] : (this_Element_0= ruleElement ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )* ) ;
    public final EObject ruleInfix() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Element_0 = null;

        AntlrDatatypeRuleToken lv_opName_3_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2861:2: ( (this_Element_0= ruleElement ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )* ) )
            // InternalBSharp.g:2862:2: (this_Element_0= ruleElement ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )* )
            {
            // InternalBSharp.g:2862:2: (this_Element_0= ruleElement ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )* )
            // InternalBSharp.g:2863:3: this_Element_0= ruleElement ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )*
            {

            			newCompositeNode(grammarAccess.getInfixAccess().getElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_48);
            this_Element_0=ruleElement();

            state._fsp--;


            			current = this_Element_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalBSharp.g:2871:3: ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_ID) ) {
                    int LA48_2 = input.LA(2);

                    if ( (LA48_2==20) ) {
                        int LA48_4 = input.LA(3);

                        if ( (LA48_4==18||LA48_4==20||LA48_4==44||(LA48_4>=46 && LA48_4<=48)||(LA48_4>=50 && LA48_4<=51)) ) {
                            alt48=1;
                        }
                        else if ( (LA48_4==RULE_ID) ) {
                            int LA48_5 = input.LA(4);

                            if ( (LA48_5==RULE_ID||LA48_5==13||(LA48_5>=20 && LA48_5<=21)||LA48_5==23||(LA48_5>=53 && LA48_5<=59)) ) {
                                alt48=1;
                            }


                        }


                    }
                    else if ( (LA48_2==RULE_ID||LA48_2==18||LA48_2==50) ) {
                        alt48=1;
                    }


                }
                else if ( ((LA48_0>=53 && LA48_0<=59)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalBSharp.g:2872:4: () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) )
            	    {
            	    // InternalBSharp.g:2872:4: ()
            	    // InternalBSharp.g:2873:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getInfixAccess().getInfixLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalBSharp.g:2879:4: ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) )
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( (LA47_0==RULE_ID) ) {
            	        alt47=1;
            	    }
            	    else if ( ((LA47_0>=53 && LA47_0<=59)) ) {
            	        alt47=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 47, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // InternalBSharp.g:2880:5: ( (otherlv_2= RULE_ID ) )
            	            {
            	            // InternalBSharp.g:2880:5: ( (otherlv_2= RULE_ID ) )
            	            // InternalBSharp.g:2881:6: (otherlv_2= RULE_ID )
            	            {
            	            // InternalBSharp.g:2881:6: (otherlv_2= RULE_ID )
            	            // InternalBSharp.g:2882:7: otherlv_2= RULE_ID
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
            	            // InternalBSharp.g:2894:5: ( (lv_opName_3_0= ruleInbuiltInfix ) )
            	            {
            	            // InternalBSharp.g:2894:5: ( (lv_opName_3_0= ruleInbuiltInfix ) )
            	            // InternalBSharp.g:2895:6: (lv_opName_3_0= ruleInbuiltInfix )
            	            {
            	            // InternalBSharp.g:2895:6: (lv_opName_3_0= ruleInbuiltInfix )
            	            // InternalBSharp.g:2896:7: lv_opName_3_0= ruleInbuiltInfix
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

            	    // InternalBSharp.g:2914:4: ( (lv_right_4_0= ruleElement ) )
            	    // InternalBSharp.g:2915:5: (lv_right_4_0= ruleElement )
            	    {
            	    // InternalBSharp.g:2915:5: (lv_right_4_0= ruleElement )
            	    // InternalBSharp.g:2916:6: lv_right_4_0= ruleElement
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
    // InternalBSharp.g:2938:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalBSharp.g:2938:48: (iv_ruleElement= ruleElement EOF )
            // InternalBSharp.g:2939:2: iv_ruleElement= ruleElement EOF
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
    // InternalBSharp.g:2945:1: ruleElement returns [EObject current=null] : (this_Bracket_0= ruleBracket | this_Prefix_1= rulePrefix | this_FunctionCall_2= ruleFunctionCall ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Bracket_0 = null;

        EObject this_Prefix_1 = null;

        EObject this_FunctionCall_2 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2951:2: ( (this_Bracket_0= ruleBracket | this_Prefix_1= rulePrefix | this_FunctionCall_2= ruleFunctionCall ) )
            // InternalBSharp.g:2952:2: (this_Bracket_0= ruleBracket | this_Prefix_1= rulePrefix | this_FunctionCall_2= ruleFunctionCall )
            {
            // InternalBSharp.g:2952:2: (this_Bracket_0= ruleBracket | this_Prefix_1= rulePrefix | this_FunctionCall_2= ruleFunctionCall )
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
                    // InternalBSharp.g:2953:3: this_Bracket_0= ruleBracket
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
                    // InternalBSharp.g:2962:3: this_Prefix_1= rulePrefix
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
                    // InternalBSharp.g:2971:3: this_FunctionCall_2= ruleFunctionCall
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
    // InternalBSharp.g:2983:1: entryRuleBracket returns [EObject current=null] : iv_ruleBracket= ruleBracket EOF ;
    public final EObject entryRuleBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBracket = null;


        try {
            // InternalBSharp.g:2983:48: (iv_ruleBracket= ruleBracket EOF )
            // InternalBSharp.g:2984:2: iv_ruleBracket= ruleBracket EOF
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
    // InternalBSharp.g:2990:1: ruleBracket returns [EObject current=null] : (otherlv_0= '(' ( (lv_child_1_0= ruleRootExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_child_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2996:2: ( (otherlv_0= '(' ( (lv_child_1_0= ruleRootExpression ) ) otherlv_2= ')' ) )
            // InternalBSharp.g:2997:2: (otherlv_0= '(' ( (lv_child_1_0= ruleRootExpression ) ) otherlv_2= ')' )
            {
            // InternalBSharp.g:2997:2: (otherlv_0= '(' ( (lv_child_1_0= ruleRootExpression ) ) otherlv_2= ')' )
            // InternalBSharp.g:2998:3: otherlv_0= '(' ( (lv_child_1_0= ruleRootExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getBracketAccess().getLeftParenthesisKeyword_0());
            		
            // InternalBSharp.g:3002:3: ( (lv_child_1_0= ruleRootExpression ) )
            // InternalBSharp.g:3003:4: (lv_child_1_0= ruleRootExpression )
            {
            // InternalBSharp.g:3003:4: (lv_child_1_0= ruleRootExpression )
            // InternalBSharp.g:3004:5: lv_child_1_0= ruleRootExpression
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
    // InternalBSharp.g:3029:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalBSharp.g:3029:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalBSharp.g:3030:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalBSharp.g:3036:1: ruleFunctionCall returns [EObject current=null] : ( ( (lv_wrapped_0_0= ruleWrappedInfix ) ) | ( ( ( (otherlv_1= RULE_ID ) ) | ( (lv_classVarDecl_2_0= ruleClassVarDecl ) ) ) ( (lv_context_3_0= ruleTypeDeclContext ) )? ( (lv_funcCallArgs_4_0= ruleFuncCallArgs ) )* ) ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_wrapped_0_0 = null;

        EObject lv_classVarDecl_2_0 = null;

        EObject lv_context_3_0 = null;

        EObject lv_funcCallArgs_4_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:3042:2: ( ( ( (lv_wrapped_0_0= ruleWrappedInfix ) ) | ( ( ( (otherlv_1= RULE_ID ) ) | ( (lv_classVarDecl_2_0= ruleClassVarDecl ) ) ) ( (lv_context_3_0= ruleTypeDeclContext ) )? ( (lv_funcCallArgs_4_0= ruleFuncCallArgs ) )* ) ) )
            // InternalBSharp.g:3043:2: ( ( (lv_wrapped_0_0= ruleWrappedInfix ) ) | ( ( ( (otherlv_1= RULE_ID ) ) | ( (lv_classVarDecl_2_0= ruleClassVarDecl ) ) ) ( (lv_context_3_0= ruleTypeDeclContext ) )? ( (lv_funcCallArgs_4_0= ruleFuncCallArgs ) )* ) )
            {
            // InternalBSharp.g:3043:2: ( ( (lv_wrapped_0_0= ruleWrappedInfix ) ) | ( ( ( (otherlv_1= RULE_ID ) ) | ( (lv_classVarDecl_2_0= ruleClassVarDecl ) ) ) ( (lv_context_3_0= ruleTypeDeclContext ) )? ( (lv_funcCallArgs_4_0= ruleFuncCallArgs ) )* ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==18) ) {
                alt53=1;
            }
            else if ( (LA53_0==RULE_ID) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalBSharp.g:3044:3: ( (lv_wrapped_0_0= ruleWrappedInfix ) )
                    {
                    // InternalBSharp.g:3044:3: ( (lv_wrapped_0_0= ruleWrappedInfix ) )
                    // InternalBSharp.g:3045:4: (lv_wrapped_0_0= ruleWrappedInfix )
                    {
                    // InternalBSharp.g:3045:4: (lv_wrapped_0_0= ruleWrappedInfix )
                    // InternalBSharp.g:3046:5: lv_wrapped_0_0= ruleWrappedInfix
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
                    // InternalBSharp.g:3064:3: ( ( ( (otherlv_1= RULE_ID ) ) | ( (lv_classVarDecl_2_0= ruleClassVarDecl ) ) ) ( (lv_context_3_0= ruleTypeDeclContext ) )? ( (lv_funcCallArgs_4_0= ruleFuncCallArgs ) )* )
                    {
                    // InternalBSharp.g:3064:3: ( ( ( (otherlv_1= RULE_ID ) ) | ( (lv_classVarDecl_2_0= ruleClassVarDecl ) ) ) ( (lv_context_3_0= ruleTypeDeclContext ) )? ( (lv_funcCallArgs_4_0= ruleFuncCallArgs ) )* )
                    // InternalBSharp.g:3065:4: ( ( (otherlv_1= RULE_ID ) ) | ( (lv_classVarDecl_2_0= ruleClassVarDecl ) ) ) ( (lv_context_3_0= ruleTypeDeclContext ) )? ( (lv_funcCallArgs_4_0= ruleFuncCallArgs ) )*
                    {
                    // InternalBSharp.g:3065:4: ( ( (otherlv_1= RULE_ID ) ) | ( (lv_classVarDecl_2_0= ruleClassVarDecl ) ) )
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==RULE_ID) ) {
                        int LA50_1 = input.LA(2);

                        if ( (LA50_1==EOF||LA50_1==RULE_ID||(LA50_1>=20 && LA50_1<=23)||LA50_1==25||LA50_1==39||(LA50_1>=41 && LA50_1<=42)||LA50_1==45||(LA50_1>=53 && LA50_1<=60)) ) {
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
                            // InternalBSharp.g:3066:5: ( (otherlv_1= RULE_ID ) )
                            {
                            // InternalBSharp.g:3066:5: ( (otherlv_1= RULE_ID ) )
                            // InternalBSharp.g:3067:6: (otherlv_1= RULE_ID )
                            {
                            // InternalBSharp.g:3067:6: (otherlv_1= RULE_ID )
                            // InternalBSharp.g:3068:7: otherlv_1= RULE_ID
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
                            // InternalBSharp.g:3080:5: ( (lv_classVarDecl_2_0= ruleClassVarDecl ) )
                            {
                            // InternalBSharp.g:3080:5: ( (lv_classVarDecl_2_0= ruleClassVarDecl ) )
                            // InternalBSharp.g:3081:6: (lv_classVarDecl_2_0= ruleClassVarDecl )
                            {
                            // InternalBSharp.g:3081:6: (lv_classVarDecl_2_0= ruleClassVarDecl )
                            // InternalBSharp.g:3082:7: lv_classVarDecl_2_0= ruleClassVarDecl
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

                    // InternalBSharp.g:3100:4: ( (lv_context_3_0= ruleTypeDeclContext ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==23) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalBSharp.g:3101:5: (lv_context_3_0= ruleTypeDeclContext )
                            {
                            // InternalBSharp.g:3101:5: (lv_context_3_0= ruleTypeDeclContext )
                            // InternalBSharp.g:3102:6: lv_context_3_0= ruleTypeDeclContext
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

                    // InternalBSharp.g:3119:4: ( (lv_funcCallArgs_4_0= ruleFuncCallArgs ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==20) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalBSharp.g:3120:5: (lv_funcCallArgs_4_0= ruleFuncCallArgs )
                    	    {
                    	    // InternalBSharp.g:3120:5: (lv_funcCallArgs_4_0= ruleFuncCallArgs )
                    	    // InternalBSharp.g:3121:6: lv_funcCallArgs_4_0= ruleFuncCallArgs
                    	    {

                    	    						newCompositeNode(grammarAccess.getFunctionCallAccess().getFuncCallArgsFuncCallArgsParserRuleCall_1_2_0());
                    	    					
                    	    pushFollow(FOLLOW_31);
                    	    lv_funcCallArgs_4_0=ruleFuncCallArgs();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"funcCallArgs",
                    	    							lv_funcCallArgs_4_0,
                    	    							"ac.soton.bsharp.BSharp.FuncCallArgs");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleFuncCallArgs"
    // InternalBSharp.g:3143:1: entryRuleFuncCallArgs returns [EObject current=null] : iv_ruleFuncCallArgs= ruleFuncCallArgs EOF ;
    public final EObject entryRuleFuncCallArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncCallArgs = null;


        try {
            // InternalBSharp.g:3143:53: (iv_ruleFuncCallArgs= ruleFuncCallArgs EOF )
            // InternalBSharp.g:3144:2: iv_ruleFuncCallArgs= ruleFuncCallArgs EOF
            {
             newCompositeNode(grammarAccess.getFuncCallArgsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncCallArgs=ruleFuncCallArgs();

            state._fsp--;

             current =iv_ruleFuncCallArgs; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuncCallArgs"


    // $ANTLR start "ruleFuncCallArgs"
    // InternalBSharp.g:3150:1: ruleFuncCallArgs returns [EObject current=null] : ( () (otherlv_1= '(' ( (lv_arguments_2_0= ruleRootExpression ) )? (otherlv_3= ',' ( (lv_arguments_4_0= ruleRootExpression ) ) )* otherlv_5= ')' ) ) ;
    public final EObject ruleFuncCallArgs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:3156:2: ( ( () (otherlv_1= '(' ( (lv_arguments_2_0= ruleRootExpression ) )? (otherlv_3= ',' ( (lv_arguments_4_0= ruleRootExpression ) ) )* otherlv_5= ')' ) ) )
            // InternalBSharp.g:3157:2: ( () (otherlv_1= '(' ( (lv_arguments_2_0= ruleRootExpression ) )? (otherlv_3= ',' ( (lv_arguments_4_0= ruleRootExpression ) ) )* otherlv_5= ')' ) )
            {
            // InternalBSharp.g:3157:2: ( () (otherlv_1= '(' ( (lv_arguments_2_0= ruleRootExpression ) )? (otherlv_3= ',' ( (lv_arguments_4_0= ruleRootExpression ) ) )* otherlv_5= ')' ) )
            // InternalBSharp.g:3158:3: () (otherlv_1= '(' ( (lv_arguments_2_0= ruleRootExpression ) )? (otherlv_3= ',' ( (lv_arguments_4_0= ruleRootExpression ) ) )* otherlv_5= ')' )
            {
            // InternalBSharp.g:3158:3: ()
            // InternalBSharp.g:3159:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFuncCallArgsAccess().getFuncCallArgsAction_0(),
            					current);
            			

            }

            // InternalBSharp.g:3165:3: (otherlv_1= '(' ( (lv_arguments_2_0= ruleRootExpression ) )? (otherlv_3= ',' ( (lv_arguments_4_0= ruleRootExpression ) ) )* otherlv_5= ')' )
            // InternalBSharp.g:3166:4: otherlv_1= '(' ( (lv_arguments_2_0= ruleRootExpression ) )? (otherlv_3= ',' ( (lv_arguments_4_0= ruleRootExpression ) ) )* otherlv_5= ')'
            {
            otherlv_1=(Token)match(input,20,FOLLOW_50); 

            				newLeafNode(otherlv_1, grammarAccess.getFuncCallArgsAccess().getLeftParenthesisKeyword_1_0());
            			
            // InternalBSharp.g:3170:4: ( (lv_arguments_2_0= ruleRootExpression ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID||LA54_0==18||LA54_0==20||LA54_0==44||(LA54_0>=46 && LA54_0<=48)||(LA54_0>=50 && LA54_0<=51)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalBSharp.g:3171:5: (lv_arguments_2_0= ruleRootExpression )
                    {
                    // InternalBSharp.g:3171:5: (lv_arguments_2_0= ruleRootExpression )
                    // InternalBSharp.g:3172:6: lv_arguments_2_0= ruleRootExpression
                    {

                    						newCompositeNode(grammarAccess.getFuncCallArgsAccess().getArgumentsRootExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_arguments_2_0=ruleRootExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFuncCallArgsRule());
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

            // InternalBSharp.g:3189:4: (otherlv_3= ',' ( (lv_arguments_4_0= ruleRootExpression ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==25) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalBSharp.g:3190:5: otherlv_3= ',' ( (lv_arguments_4_0= ruleRootExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,25,FOLLOW_26); 

            	    					newLeafNode(otherlv_3, grammarAccess.getFuncCallArgsAccess().getCommaKeyword_1_2_0());
            	    				
            	    // InternalBSharp.g:3194:5: ( (lv_arguments_4_0= ruleRootExpression ) )
            	    // InternalBSharp.g:3195:6: (lv_arguments_4_0= ruleRootExpression )
            	    {
            	    // InternalBSharp.g:3195:6: (lv_arguments_4_0= ruleRootExpression )
            	    // InternalBSharp.g:3196:7: lv_arguments_4_0= ruleRootExpression
            	    {

            	    							newCompositeNode(grammarAccess.getFuncCallArgsAccess().getArgumentsRootExpressionParserRuleCall_1_2_1_0());
            	    						
            	    pushFollow(FOLLOW_41);
            	    lv_arguments_4_0=ruleRootExpression();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getFuncCallArgsRule());
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
            	    break loop55;
                }
            } while (true);

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            				newLeafNode(otherlv_5, grammarAccess.getFuncCallArgsAccess().getRightParenthesisKeyword_1_3());
            			

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
    // $ANTLR end "ruleFuncCallArgs"


    // $ANTLR start "entryRuleIfElse"
    // InternalBSharp.g:3223:1: entryRuleIfElse returns [EObject current=null] : iv_ruleIfElse= ruleIfElse EOF ;
    public final EObject entryRuleIfElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfElse = null;


        try {
            // InternalBSharp.g:3223:47: (iv_ruleIfElse= ruleIfElse EOF )
            // InternalBSharp.g:3224:2: iv_ruleIfElse= ruleIfElse EOF
            {
             newCompositeNode(grammarAccess.getIfElseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfElse=ruleIfElse();

            state._fsp--;

             current =iv_ruleIfElse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfElse"


    // $ANTLR start "ruleIfElse"
    // InternalBSharp.g:3230:1: ruleIfElse returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleRootExpression ) ) otherlv_2= '{' ( (lv_ifTrueExpr_3_0= ruleRootExpression ) ) otherlv_4= '}' otherlv_5= 'else' otherlv_6= '{' ( (lv_ifFalseExpr_7_0= ruleRootExpression ) ) otherlv_8= '}' ) ;
    public final EObject ruleIfElse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_condition_1_0 = null;

        EObject lv_ifTrueExpr_3_0 = null;

        EObject lv_ifFalseExpr_7_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:3236:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleRootExpression ) ) otherlv_2= '{' ( (lv_ifTrueExpr_3_0= ruleRootExpression ) ) otherlv_4= '}' otherlv_5= 'else' otherlv_6= '{' ( (lv_ifFalseExpr_7_0= ruleRootExpression ) ) otherlv_8= '}' ) )
            // InternalBSharp.g:3237:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleRootExpression ) ) otherlv_2= '{' ( (lv_ifTrueExpr_3_0= ruleRootExpression ) ) otherlv_4= '}' otherlv_5= 'else' otherlv_6= '{' ( (lv_ifFalseExpr_7_0= ruleRootExpression ) ) otherlv_8= '}' )
            {
            // InternalBSharp.g:3237:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleRootExpression ) ) otherlv_2= '{' ( (lv_ifTrueExpr_3_0= ruleRootExpression ) ) otherlv_4= '}' otherlv_5= 'else' otherlv_6= '{' ( (lv_ifFalseExpr_7_0= ruleRootExpression ) ) otherlv_8= '}' )
            // InternalBSharp.g:3238:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleRootExpression ) ) otherlv_2= '{' ( (lv_ifTrueExpr_3_0= ruleRootExpression ) ) otherlv_4= '}' otherlv_5= 'else' otherlv_6= '{' ( (lv_ifFalseExpr_7_0= ruleRootExpression ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getIfElseAccess().getIfKeyword_0());
            		
            // InternalBSharp.g:3242:3: ( (lv_condition_1_0= ruleRootExpression ) )
            // InternalBSharp.g:3243:4: (lv_condition_1_0= ruleRootExpression )
            {
            // InternalBSharp.g:3243:4: (lv_condition_1_0= ruleRootExpression )
            // InternalBSharp.g:3244:5: lv_condition_1_0= ruleRootExpression
            {

            					newCompositeNode(grammarAccess.getIfElseAccess().getConditionRootExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_38);
            lv_condition_1_0=ruleRootExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfElseRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"ac.soton.bsharp.BSharp.RootExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,41,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getIfElseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBSharp.g:3265:3: ( (lv_ifTrueExpr_3_0= ruleRootExpression ) )
            // InternalBSharp.g:3266:4: (lv_ifTrueExpr_3_0= ruleRootExpression )
            {
            // InternalBSharp.g:3266:4: (lv_ifTrueExpr_3_0= ruleRootExpression )
            // InternalBSharp.g:3267:5: lv_ifTrueExpr_3_0= ruleRootExpression
            {

            					newCompositeNode(grammarAccess.getIfElseAccess().getIfTrueExprRootExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_51);
            lv_ifTrueExpr_3_0=ruleRootExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfElseRule());
            					}
            					set(
            						current,
            						"ifTrueExpr",
            						lv_ifTrueExpr_3_0,
            						"ac.soton.bsharp.BSharp.RootExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,42,FOLLOW_52); 

            			newLeafNode(otherlv_4, grammarAccess.getIfElseAccess().getRightCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,52,FOLLOW_38); 

            			newLeafNode(otherlv_5, grammarAccess.getIfElseAccess().getElseKeyword_5());
            		
            otherlv_6=(Token)match(input,41,FOLLOW_26); 

            			newLeafNode(otherlv_6, grammarAccess.getIfElseAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalBSharp.g:3296:3: ( (lv_ifFalseExpr_7_0= ruleRootExpression ) )
            // InternalBSharp.g:3297:4: (lv_ifFalseExpr_7_0= ruleRootExpression )
            {
            // InternalBSharp.g:3297:4: (lv_ifFalseExpr_7_0= ruleRootExpression )
            // InternalBSharp.g:3298:5: lv_ifFalseExpr_7_0= ruleRootExpression
            {

            					newCompositeNode(grammarAccess.getIfElseAccess().getIfFalseExprRootExpressionParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_51);
            lv_ifFalseExpr_7_0=ruleRootExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfElseRule());
            					}
            					set(
            						current,
            						"ifFalseExpr",
            						lv_ifFalseExpr_7_0,
            						"ac.soton.bsharp.BSharp.RootExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,42,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getIfElseAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfElse"


    // $ANTLR start "entryRuleClassVarDecl"
    // InternalBSharp.g:3323:1: entryRuleClassVarDecl returns [EObject current=null] : iv_ruleClassVarDecl= ruleClassVarDecl EOF ;
    public final EObject entryRuleClassVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassVarDecl = null;


        try {
            // InternalBSharp.g:3323:53: (iv_ruleClassVarDecl= ruleClassVarDecl EOF )
            // InternalBSharp.g:3324:2: iv_ruleClassVarDecl= ruleClassVarDecl EOF
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
    // InternalBSharp.g:3330:1: ruleClassVarDecl returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleClassVarDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalBSharp.g:3336:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalBSharp.g:3337:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalBSharp.g:3337:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalBSharp.g:3338:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // InternalBSharp.g:3338:3: ( (otherlv_0= RULE_ID ) )
            // InternalBSharp.g:3339:4: (otherlv_0= RULE_ID )
            {
            // InternalBSharp.g:3339:4: (otherlv_0= RULE_ID )
            // InternalBSharp.g:3340:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassVarDeclRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_53); 

            					newLeafNode(otherlv_0, grammarAccess.getClassVarDeclAccess().getOwnerTypeGenNameCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getClassVarDeclAccess().getFullStopKeyword_1());
            		
            // InternalBSharp.g:3355:3: ( (otherlv_2= RULE_ID ) )
            // InternalBSharp.g:3356:4: (otherlv_2= RULE_ID )
            {
            // InternalBSharp.g:3356:4: (otherlv_2= RULE_ID )
            // InternalBSharp.g:3357:5: otherlv_2= RULE_ID
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
    // InternalBSharp.g:3372:1: entryRuleInbuiltInfix returns [String current=null] : iv_ruleInbuiltInfix= ruleInbuiltInfix EOF ;
    public final String entryRuleInbuiltInfix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInbuiltInfix = null;


        try {
            // InternalBSharp.g:3372:52: (iv_ruleInbuiltInfix= ruleInbuiltInfix EOF )
            // InternalBSharp.g:3373:2: iv_ruleInbuiltInfix= ruleInbuiltInfix EOF
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
    // InternalBSharp.g:3379:1: ruleInbuiltInfix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\u21D4' | kw= '\\u21D2' | kw= '=' | kw= '\\u2260' | kw= '\\u2227' | kw= '\\u2228' | kw= '\\u2208' ) ;
    public final AntlrDatatypeRuleToken ruleInbuiltInfix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBSharp.g:3385:2: ( (kw= '\\u21D4' | kw= '\\u21D2' | kw= '=' | kw= '\\u2260' | kw= '\\u2227' | kw= '\\u2228' | kw= '\\u2208' ) )
            // InternalBSharp.g:3386:2: (kw= '\\u21D4' | kw= '\\u21D2' | kw= '=' | kw= '\\u2260' | kw= '\\u2227' | kw= '\\u2228' | kw= '\\u2208' )
            {
            // InternalBSharp.g:3386:2: (kw= '\\u21D4' | kw= '\\u21D2' | kw= '=' | kw= '\\u2260' | kw= '\\u2227' | kw= '\\u2228' | kw= '\\u2208' )
            int alt56=7;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt56=1;
                }
                break;
            case 54:
                {
                alt56=2;
                }
                break;
            case 55:
                {
                alt56=3;
                }
                break;
            case 56:
                {
                alt56=4;
                }
                break;
            case 57:
                {
                alt56=5;
                }
                break;
            case 58:
                {
                alt56=6;
                }
                break;
            case 59:
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
                    // InternalBSharp.g:3387:3: kw= '\\u21D4'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getLeftRightDoubleArrowKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBSharp.g:3393:3: kw= '\\u21D2'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getRightwardsDoubleArrowKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBSharp.g:3399:3: kw= '='
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalBSharp.g:3405:3: kw= '\\u2260'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getNotEqualToKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalBSharp.g:3411:3: kw= '\\u2227'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getLogicalAndKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalBSharp.g:3417:3: kw= '\\u2228'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getLogicalOrKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalBSharp.g:3423:3: kw= '\\u2208'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

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
    // InternalBSharp.g:3432:1: entryRuleWrappedInfix returns [EObject current=null] : iv_ruleWrappedInfix= ruleWrappedInfix EOF ;
    public final EObject entryRuleWrappedInfix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWrappedInfix = null;


        try {
            // InternalBSharp.g:3432:53: (iv_ruleWrappedInfix= ruleWrappedInfix EOF )
            // InternalBSharp.g:3433:2: iv_ruleWrappedInfix= ruleWrappedInfix EOF
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
    // InternalBSharp.g:3439:1: ruleWrappedInfix returns [EObject current=null] : (otherlv_0= '[' ( ( (lv_inbuilt_1_0= ruleInbuiltInfix ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= ']' ) ;
    public final EObject ruleWrappedInfix() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_inbuilt_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:3445:2: ( (otherlv_0= '[' ( ( (lv_inbuilt_1_0= ruleInbuiltInfix ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= ']' ) )
            // InternalBSharp.g:3446:2: (otherlv_0= '[' ( ( (lv_inbuilt_1_0= ruleInbuiltInfix ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= ']' )
            {
            // InternalBSharp.g:3446:2: (otherlv_0= '[' ( ( (lv_inbuilt_1_0= ruleInbuiltInfix ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= ']' )
            // InternalBSharp.g:3447:3: otherlv_0= '[' ( ( (lv_inbuilt_1_0= ruleInbuiltInfix ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_54); 

            			newLeafNode(otherlv_0, grammarAccess.getWrappedInfixAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalBSharp.g:3451:3: ( ( (lv_inbuilt_1_0= ruleInbuiltInfix ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=53 && LA57_0<=59)) ) {
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
                    // InternalBSharp.g:3452:4: ( (lv_inbuilt_1_0= ruleInbuiltInfix ) )
                    {
                    // InternalBSharp.g:3452:4: ( (lv_inbuilt_1_0= ruleInbuiltInfix ) )
                    // InternalBSharp.g:3453:5: (lv_inbuilt_1_0= ruleInbuiltInfix )
                    {
                    // InternalBSharp.g:3453:5: (lv_inbuilt_1_0= ruleInbuiltInfix )
                    // InternalBSharp.g:3454:6: lv_inbuilt_1_0= ruleInbuiltInfix
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
                    // InternalBSharp.g:3472:4: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalBSharp.g:3472:4: ( (otherlv_2= RULE_ID ) )
                    // InternalBSharp.g:3473:5: (otherlv_2= RULE_ID )
                    {
                    // InternalBSharp.g:3473:5: (otherlv_2= RULE_ID )
                    // InternalBSharp.g:3474:6: otherlv_2= RULE_ID
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
    // InternalBSharp.g:3494:1: entryRuleInstance returns [EObject current=null] : iv_ruleInstance= ruleInstance EOF ;
    public final EObject entryRuleInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstance = null;


        try {
            // InternalBSharp.g:3494:49: (iv_ruleInstance= ruleInstance EOF )
            // InternalBSharp.g:3495:2: iv_ruleInstance= ruleInstance EOF
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
    // InternalBSharp.g:3501:1: ruleInstance returns [EObject current=null] : (otherlv_0= 'Instance' ( ( ruleQualifiedName ) ) otherlv_2= '<' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '>' otherlv_5= '(' ( (lv_arguments_6_0= ruleRootExpression ) )? (otherlv_7= ',' ( (lv_arguments_8_0= ruleRootExpression ) ) )* otherlv_9= ')' ( (lv_name_10_0= RULE_ID ) )? (otherlv_11= '(' ( (lv_referencingFuncs_12_0= ruleReferencingFunc ) ) otherlv_13= ')' )* ) ;
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
            // InternalBSharp.g:3507:2: ( (otherlv_0= 'Instance' ( ( ruleQualifiedName ) ) otherlv_2= '<' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '>' otherlv_5= '(' ( (lv_arguments_6_0= ruleRootExpression ) )? (otherlv_7= ',' ( (lv_arguments_8_0= ruleRootExpression ) ) )* otherlv_9= ')' ( (lv_name_10_0= RULE_ID ) )? (otherlv_11= '(' ( (lv_referencingFuncs_12_0= ruleReferencingFunc ) ) otherlv_13= ')' )* ) )
            // InternalBSharp.g:3508:2: (otherlv_0= 'Instance' ( ( ruleQualifiedName ) ) otherlv_2= '<' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '>' otherlv_5= '(' ( (lv_arguments_6_0= ruleRootExpression ) )? (otherlv_7= ',' ( (lv_arguments_8_0= ruleRootExpression ) ) )* otherlv_9= ')' ( (lv_name_10_0= RULE_ID ) )? (otherlv_11= '(' ( (lv_referencingFuncs_12_0= ruleReferencingFunc ) ) otherlv_13= ')' )* )
            {
            // InternalBSharp.g:3508:2: (otherlv_0= 'Instance' ( ( ruleQualifiedName ) ) otherlv_2= '<' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '>' otherlv_5= '(' ( (lv_arguments_6_0= ruleRootExpression ) )? (otherlv_7= ',' ( (lv_arguments_8_0= ruleRootExpression ) ) )* otherlv_9= ')' ( (lv_name_10_0= RULE_ID ) )? (otherlv_11= '(' ( (lv_referencingFuncs_12_0= ruleReferencingFunc ) ) otherlv_13= ')' )* )
            // InternalBSharp.g:3509:3: otherlv_0= 'Instance' ( ( ruleQualifiedName ) ) otherlv_2= '<' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '>' otherlv_5= '(' ( (lv_arguments_6_0= ruleRootExpression ) )? (otherlv_7= ',' ( (lv_arguments_8_0= ruleRootExpression ) ) )* otherlv_9= ')' ( (lv_name_10_0= RULE_ID ) )? (otherlv_11= '(' ( (lv_referencingFuncs_12_0= ruleReferencingFunc ) ) otherlv_13= ')' )*
            {
            otherlv_0=(Token)match(input,60,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInstanceAccess().getInstanceKeyword_0());
            		
            // InternalBSharp.g:3513:3: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:3514:4: ( ruleQualifiedName )
            {
            // InternalBSharp.g:3514:4: ( ruleQualifiedName )
            // InternalBSharp.g:3515:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInstanceAccess().getClassNameBSClassCrossReference_1_0());
            				
            pushFollow(FOLLOW_55);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getInstanceAccess().getLessThanSignKeyword_2());
            		
            // InternalBSharp.g:3533:3: ( (otherlv_3= RULE_ID ) )+
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
            	    // InternalBSharp.g:3534:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalBSharp.g:3534:4: (otherlv_3= RULE_ID )
            	    // InternalBSharp.g:3535:5: otherlv_3= RULE_ID
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
            		
            // InternalBSharp.g:3554:3: ( (lv_arguments_6_0= ruleRootExpression ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID||LA59_0==18||LA59_0==20||LA59_0==44||(LA59_0>=46 && LA59_0<=48)||(LA59_0>=50 && LA59_0<=51)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalBSharp.g:3555:4: (lv_arguments_6_0= ruleRootExpression )
                    {
                    // InternalBSharp.g:3555:4: (lv_arguments_6_0= ruleRootExpression )
                    // InternalBSharp.g:3556:5: lv_arguments_6_0= ruleRootExpression
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

            // InternalBSharp.g:3573:3: (otherlv_7= ',' ( (lv_arguments_8_0= ruleRootExpression ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==25) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalBSharp.g:3574:4: otherlv_7= ',' ( (lv_arguments_8_0= ruleRootExpression ) )
            	    {
            	    otherlv_7=(Token)match(input,25,FOLLOW_26); 

            	    				newLeafNode(otherlv_7, grammarAccess.getInstanceAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalBSharp.g:3578:4: ( (lv_arguments_8_0= ruleRootExpression ) )
            	    // InternalBSharp.g:3579:5: (lv_arguments_8_0= ruleRootExpression )
            	    {
            	    // InternalBSharp.g:3579:5: (lv_arguments_8_0= ruleRootExpression )
            	    // InternalBSharp.g:3580:6: lv_arguments_8_0= ruleRootExpression
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

            otherlv_9=(Token)match(input,21,FOLLOW_56); 

            			newLeafNode(otherlv_9, grammarAccess.getInstanceAccess().getRightParenthesisKeyword_8());
            		
            // InternalBSharp.g:3602:3: ( (lv_name_10_0= RULE_ID ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                int LA61_1 = input.LA(2);

                if ( (LA61_1==20) ) {
                    int LA61_3 = input.LA(3);

                    if ( (LA61_3==RULE_ID) ) {
                        int LA61_5 = input.LA(4);

                        if ( (LA61_5==55) ) {
                            alt61=1;
                        }
                    }
                }
                else if ( (LA61_1==EOF||LA61_1==RULE_ID||LA61_1==42||LA61_1==45||LA61_1==60) ) {
                    alt61=1;
                }
            }
            switch (alt61) {
                case 1 :
                    // InternalBSharp.g:3603:4: (lv_name_10_0= RULE_ID )
                    {
                    // InternalBSharp.g:3603:4: (lv_name_10_0= RULE_ID )
                    // InternalBSharp.g:3604:5: lv_name_10_0= RULE_ID
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

            // InternalBSharp.g:3620:3: (otherlv_11= '(' ( (lv_referencingFuncs_12_0= ruleReferencingFunc ) ) otherlv_13= ')' )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==20) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalBSharp.g:3621:4: otherlv_11= '(' ( (lv_referencingFuncs_12_0= ruleReferencingFunc ) ) otherlv_13= ')'
            	    {
            	    otherlv_11=(Token)match(input,20,FOLLOW_3); 

            	    				newLeafNode(otherlv_11, grammarAccess.getInstanceAccess().getLeftParenthesisKeyword_10_0());
            	    			
            	    // InternalBSharp.g:3625:4: ( (lv_referencingFuncs_12_0= ruleReferencingFunc ) )
            	    // InternalBSharp.g:3626:5: (lv_referencingFuncs_12_0= ruleReferencingFunc )
            	    {
            	    // InternalBSharp.g:3626:5: (lv_referencingFuncs_12_0= ruleReferencingFunc )
            	    // InternalBSharp.g:3627:6: lv_referencingFuncs_12_0= ruleReferencingFunc
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
    // InternalBSharp.g:3653:1: entryRuleReferencingFunc returns [EObject current=null] : iv_ruleReferencingFunc= ruleReferencingFunc EOF ;
    public final EObject entryRuleReferencingFunc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferencingFunc = null;


        try {
            // InternalBSharp.g:3653:56: (iv_ruleReferencingFunc= ruleReferencingFunc EOF )
            // InternalBSharp.g:3654:2: iv_ruleReferencingFunc= ruleReferencingFunc EOF
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
    // InternalBSharp.g:3660:1: ruleReferencingFunc returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleReferencingFunc() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalBSharp.g:3666:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalBSharp.g:3667:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalBSharp.g:3667:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            // InternalBSharp.g:3668:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) )
            {
            // InternalBSharp.g:3668:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBSharp.g:3669:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBSharp.g:3669:4: (lv_name_0_0= RULE_ID )
            // InternalBSharp.g:3670:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_57); 

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

            otherlv_1=(Token)match(input,55,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getReferencingFuncAccess().getEqualsSignKeyword_1());
            		
            // InternalBSharp.g:3690:3: ( (otherlv_2= RULE_ID ) )
            // InternalBSharp.g:3691:4: (otherlv_2= RULE_ID )
            {
            // InternalBSharp.g:3691:4: (otherlv_2= RULE_ID )
            // InternalBSharp.g:3692:5: otherlv_2= RULE_ID
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
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000DD00000140020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000800000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000002A000501000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x1000240000000020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000DD80000140030L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000DD00000140030L});
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
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0FE0000000000022L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000900002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x000DD00002340020L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0FE0000000000020L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000100022L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0080000000000000L});

}