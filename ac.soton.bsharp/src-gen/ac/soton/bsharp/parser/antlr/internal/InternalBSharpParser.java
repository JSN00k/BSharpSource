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
    // InternalBSharp.g:181:1: ruleTopLevelFile returns [EObject current=null] : ( () ( ( (lv_globalImports_1_0= ruleGlobalImport ) ) | ( (lv_localImports_2_0= ruleLocalImport ) ) | ( (lv_classes_3_0= ruleClassDecl ) ) | ( (lv_extends_4_0= ruleExtend ) ) | ( (lv_instances_5_0= ruleInstance ) ) )* ) ;
    public final EObject ruleTopLevelFile() throws RecognitionException {
        EObject current = null;

        EObject lv_globalImports_1_0 = null;

        EObject lv_localImports_2_0 = null;

        EObject lv_classes_3_0 = null;

        EObject lv_extends_4_0 = null;

        EObject lv_instances_5_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:187:2: ( ( () ( ( (lv_globalImports_1_0= ruleGlobalImport ) ) | ( (lv_localImports_2_0= ruleLocalImport ) ) | ( (lv_classes_3_0= ruleClassDecl ) ) | ( (lv_extends_4_0= ruleExtend ) ) | ( (lv_instances_5_0= ruleInstance ) ) )* ) )
            // InternalBSharp.g:188:2: ( () ( ( (lv_globalImports_1_0= ruleGlobalImport ) ) | ( (lv_localImports_2_0= ruleLocalImport ) ) | ( (lv_classes_3_0= ruleClassDecl ) ) | ( (lv_extends_4_0= ruleExtend ) ) | ( (lv_instances_5_0= ruleInstance ) ) )* )
            {
            // InternalBSharp.g:188:2: ( () ( ( (lv_globalImports_1_0= ruleGlobalImport ) ) | ( (lv_localImports_2_0= ruleLocalImport ) ) | ( (lv_classes_3_0= ruleClassDecl ) ) | ( (lv_extends_4_0= ruleExtend ) ) | ( (lv_instances_5_0= ruleInstance ) ) )* )
            // InternalBSharp.g:189:3: () ( ( (lv_globalImports_1_0= ruleGlobalImport ) ) | ( (lv_localImports_2_0= ruleLocalImport ) ) | ( (lv_classes_3_0= ruleClassDecl ) ) | ( (lv_extends_4_0= ruleExtend ) ) | ( (lv_instances_5_0= ruleInstance ) ) )*
            {
            // InternalBSharp.g:189:3: ()
            // InternalBSharp.g:190:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTopLevelFileAccess().getTopLevelFileAction_0(),
            					current);
            			

            }

            // InternalBSharp.g:196:3: ( ( (lv_globalImports_1_0= ruleGlobalImport ) ) | ( (lv_localImports_2_0= ruleLocalImport ) ) | ( (lv_classes_3_0= ruleClassDecl ) ) | ( (lv_extends_4_0= ruleExtend ) ) | ( (lv_instances_5_0= ruleInstance ) ) )*
            loop2:
            do {
                int alt2=6;
                switch ( input.LA(1) ) {
                case 14:
                    {
                    alt2=1;
                    }
                    break;
                case 15:
                    {
                    alt2=2;
                    }
                    break;
                case 17:
                case 35:
                    {
                    alt2=3;
                    }
                    break;
                case 37:
                    {
                    alt2=4;
                    }
                    break;
                case 54:
                    {
                    alt2=5;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // InternalBSharp.g:197:4: ( (lv_globalImports_1_0= ruleGlobalImport ) )
            	    {
            	    // InternalBSharp.g:197:4: ( (lv_globalImports_1_0= ruleGlobalImport ) )
            	    // InternalBSharp.g:198:5: (lv_globalImports_1_0= ruleGlobalImport )
            	    {
            	    // InternalBSharp.g:198:5: (lv_globalImports_1_0= ruleGlobalImport )
            	    // InternalBSharp.g:199:6: lv_globalImports_1_0= ruleGlobalImport
            	    {

            	    						newCompositeNode(grammarAccess.getTopLevelFileAccess().getGlobalImportsGlobalImportParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_globalImports_1_0=ruleGlobalImport();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTopLevelFileRule());
            	    						}
            	    						add(
            	    							current,
            	    							"globalImports",
            	    							lv_globalImports_1_0,
            	    							"ac.soton.bsharp.BSharp.GlobalImport");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBSharp.g:217:4: ( (lv_localImports_2_0= ruleLocalImport ) )
            	    {
            	    // InternalBSharp.g:217:4: ( (lv_localImports_2_0= ruleLocalImport ) )
            	    // InternalBSharp.g:218:5: (lv_localImports_2_0= ruleLocalImport )
            	    {
            	    // InternalBSharp.g:218:5: (lv_localImports_2_0= ruleLocalImport )
            	    // InternalBSharp.g:219:6: lv_localImports_2_0= ruleLocalImport
            	    {

            	    						newCompositeNode(grammarAccess.getTopLevelFileAccess().getLocalImportsLocalImportParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_localImports_2_0=ruleLocalImport();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTopLevelFileRule());
            	    						}
            	    						add(
            	    							current,
            	    							"localImports",
            	    							lv_localImports_2_0,
            	    							"ac.soton.bsharp.BSharp.LocalImport");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalBSharp.g:237:4: ( (lv_classes_3_0= ruleClassDecl ) )
            	    {
            	    // InternalBSharp.g:237:4: ( (lv_classes_3_0= ruleClassDecl ) )
            	    // InternalBSharp.g:238:5: (lv_classes_3_0= ruleClassDecl )
            	    {
            	    // InternalBSharp.g:238:5: (lv_classes_3_0= ruleClassDecl )
            	    // InternalBSharp.g:239:6: lv_classes_3_0= ruleClassDecl
            	    {

            	    						newCompositeNode(grammarAccess.getTopLevelFileAccess().getClassesClassDeclParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_classes_3_0=ruleClassDecl();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTopLevelFileRule());
            	    						}
            	    						add(
            	    							current,
            	    							"classes",
            	    							lv_classes_3_0,
            	    							"ac.soton.bsharp.BSharp.ClassDecl");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalBSharp.g:257:4: ( (lv_extends_4_0= ruleExtend ) )
            	    {
            	    // InternalBSharp.g:257:4: ( (lv_extends_4_0= ruleExtend ) )
            	    // InternalBSharp.g:258:5: (lv_extends_4_0= ruleExtend )
            	    {
            	    // InternalBSharp.g:258:5: (lv_extends_4_0= ruleExtend )
            	    // InternalBSharp.g:259:6: lv_extends_4_0= ruleExtend
            	    {

            	    						newCompositeNode(grammarAccess.getTopLevelFileAccess().getExtendsExtendParserRuleCall_1_3_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_extends_4_0=ruleExtend();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTopLevelFileRule());
            	    						}
            	    						add(
            	    							current,
            	    							"extends",
            	    							lv_extends_4_0,
            	    							"ac.soton.bsharp.BSharp.Extend");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalBSharp.g:277:4: ( (lv_instances_5_0= ruleInstance ) )
            	    {
            	    // InternalBSharp.g:277:4: ( (lv_instances_5_0= ruleInstance ) )
            	    // InternalBSharp.g:278:5: (lv_instances_5_0= ruleInstance )
            	    {
            	    // InternalBSharp.g:278:5: (lv_instances_5_0= ruleInstance )
            	    // InternalBSharp.g:279:6: lv_instances_5_0= ruleInstance
            	    {

            	    						newCompositeNode(grammarAccess.getTopLevelFileAccess().getInstancesInstanceParserRuleCall_1_4_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_instances_5_0=ruleInstance();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTopLevelFileRule());
            	    						}
            	    						add(
            	    							current,
            	    							"instances",
            	    							lv_instances_5_0,
            	    							"ac.soton.bsharp.BSharp.Instance");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // InternalBSharp.g:301:1: entryRuleClassDecl returns [EObject current=null] : iv_ruleClassDecl= ruleClassDecl EOF ;
    public final EObject entryRuleClassDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDecl = null;


        try {
            // InternalBSharp.g:301:50: (iv_ruleClassDecl= ruleClassDecl EOF )
            // InternalBSharp.g:302:2: iv_ruleClassDecl= ruleClassDecl EOF
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
    // InternalBSharp.g:308:1: ruleClassDecl returns [EObject current=null] : (this_Class_0= ruleClass | this_Datatype_1= ruleDatatype ) ;
    public final EObject ruleClassDecl() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_Datatype_1 = null;



        	enterRule();

        try {
            // InternalBSharp.g:314:2: ( (this_Class_0= ruleClass | this_Datatype_1= ruleDatatype ) )
            // InternalBSharp.g:315:2: (this_Class_0= ruleClass | this_Datatype_1= ruleDatatype )
            {
            // InternalBSharp.g:315:2: (this_Class_0= ruleClass | this_Datatype_1= ruleDatatype )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==35) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBSharp.g:316:3: this_Class_0= ruleClass
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
                    // InternalBSharp.g:325:3: this_Datatype_1= ruleDatatype
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
    // InternalBSharp.g:337:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalBSharp.g:337:45: (iv_ruleType= ruleType EOF )
            // InternalBSharp.g:338:2: iv_ruleType= ruleType EOF
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
    // InternalBSharp.g:344:1: ruleType returns [EObject current=null] : this_ClassDecl_0= ruleClassDecl ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDecl_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:350:2: (this_ClassDecl_0= ruleClassDecl )
            // InternalBSharp.g:351:2: this_ClassDecl_0= ruleClassDecl
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
    // InternalBSharp.g:362:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalBSharp.g:362:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalBSharp.g:363:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalBSharp.g:369:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalBSharp.g:375:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalBSharp.g:376:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalBSharp.g:376:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalBSharp.g:377:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalBSharp.g:384:3: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBSharp.g:385:4: kw= '.' this_ID_2= RULE_ID
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
            	    break loop4;
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


    // $ANTLR start "entryRuleGlobalImport"
    // InternalBSharp.g:402:1: entryRuleGlobalImport returns [EObject current=null] : iv_ruleGlobalImport= ruleGlobalImport EOF ;
    public final EObject entryRuleGlobalImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalImport = null;


        try {
            // InternalBSharp.g:402:53: (iv_ruleGlobalImport= ruleGlobalImport EOF )
            // InternalBSharp.g:403:2: iv_ruleGlobalImport= ruleGlobalImport EOF
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
    // InternalBSharp.g:409:1: ruleGlobalImport returns [EObject current=null] : (otherlv_0= 'From' ( (lv_project_1_0= ruleQualifiedName ) ) otherlv_2= 'Import' ( (lv_fileImports_3_0= ruleFileImport ) )+ ) ;
    public final EObject ruleGlobalImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_project_1_0 = null;

        EObject lv_fileImports_3_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:415:2: ( (otherlv_0= 'From' ( (lv_project_1_0= ruleQualifiedName ) ) otherlv_2= 'Import' ( (lv_fileImports_3_0= ruleFileImport ) )+ ) )
            // InternalBSharp.g:416:2: (otherlv_0= 'From' ( (lv_project_1_0= ruleQualifiedName ) ) otherlv_2= 'Import' ( (lv_fileImports_3_0= ruleFileImport ) )+ )
            {
            // InternalBSharp.g:416:2: (otherlv_0= 'From' ( (lv_project_1_0= ruleQualifiedName ) ) otherlv_2= 'Import' ( (lv_fileImports_3_0= ruleFileImport ) )+ )
            // InternalBSharp.g:417:3: otherlv_0= 'From' ( (lv_project_1_0= ruleQualifiedName ) ) otherlv_2= 'Import' ( (lv_fileImports_3_0= ruleFileImport ) )+
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGlobalImportAccess().getFromKeyword_0());
            		
            // InternalBSharp.g:421:3: ( (lv_project_1_0= ruleQualifiedName ) )
            // InternalBSharp.g:422:4: (lv_project_1_0= ruleQualifiedName )
            {
            // InternalBSharp.g:422:4: (lv_project_1_0= ruleQualifiedName )
            // InternalBSharp.g:423:5: lv_project_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getGlobalImportAccess().getProjectQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
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
            		
            // InternalBSharp.g:444:3: ( (lv_fileImports_3_0= ruleFileImport ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBSharp.g:445:4: (lv_fileImports_3_0= ruleFileImport )
            	    {
            	    // InternalBSharp.g:445:4: (lv_fileImports_3_0= ruleFileImport )
            	    // InternalBSharp.g:446:5: lv_fileImports_3_0= ruleFileImport
            	    {

            	    					newCompositeNode(grammarAccess.getGlobalImportAccess().getFileImportsFileImportParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
    // InternalBSharp.g:467:1: entryRuleFileImport returns [EObject current=null] : iv_ruleFileImport= ruleFileImport EOF ;
    public final EObject entryRuleFileImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileImport = null;


        try {
            // InternalBSharp.g:467:51: (iv_ruleFileImport= ruleFileImport EOF )
            // InternalBSharp.g:468:2: iv_ruleFileImport= ruleFileImport EOF
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
    // InternalBSharp.g:474:1: ruleFileImport returns [EObject current=null] : ( ( (lv_fileName_0_0= RULE_ID ) ) (otherlv_1= '.' (otherlv_2= '*' | ( (lv_type_3_0= RULE_ID ) ) ) )? ) ;
    public final EObject ruleFileImport() throws RecognitionException {
        EObject current = null;

        Token lv_fileName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;


        	enterRule();

        try {
            // InternalBSharp.g:480:2: ( ( ( (lv_fileName_0_0= RULE_ID ) ) (otherlv_1= '.' (otherlv_2= '*' | ( (lv_type_3_0= RULE_ID ) ) ) )? ) )
            // InternalBSharp.g:481:2: ( ( (lv_fileName_0_0= RULE_ID ) ) (otherlv_1= '.' (otherlv_2= '*' | ( (lv_type_3_0= RULE_ID ) ) ) )? )
            {
            // InternalBSharp.g:481:2: ( ( (lv_fileName_0_0= RULE_ID ) ) (otherlv_1= '.' (otherlv_2= '*' | ( (lv_type_3_0= RULE_ID ) ) ) )? )
            // InternalBSharp.g:482:3: ( (lv_fileName_0_0= RULE_ID ) ) (otherlv_1= '.' (otherlv_2= '*' | ( (lv_type_3_0= RULE_ID ) ) ) )?
            {
            // InternalBSharp.g:482:3: ( (lv_fileName_0_0= RULE_ID ) )
            // InternalBSharp.g:483:4: (lv_fileName_0_0= RULE_ID )
            {
            // InternalBSharp.g:483:4: (lv_fileName_0_0= RULE_ID )
            // InternalBSharp.g:484:5: lv_fileName_0_0= RULE_ID
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

            // InternalBSharp.g:500:3: (otherlv_1= '.' (otherlv_2= '*' | ( (lv_type_3_0= RULE_ID ) ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBSharp.g:501:4: otherlv_1= '.' (otherlv_2= '*' | ( (lv_type_3_0= RULE_ID ) ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getFileImportAccess().getFullStopKeyword_1_0());
                    			
                    // InternalBSharp.g:505:4: (otherlv_2= '*' | ( (lv_type_3_0= RULE_ID ) ) )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==16) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==RULE_ID) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalBSharp.g:506:5: otherlv_2= '*'
                            {
                            otherlv_2=(Token)match(input,16,FOLLOW_2); 

                            					newLeafNode(otherlv_2, grammarAccess.getFileImportAccess().getAsteriskKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalBSharp.g:511:5: ( (lv_type_3_0= RULE_ID ) )
                            {
                            // InternalBSharp.g:511:5: ( (lv_type_3_0= RULE_ID ) )
                            // InternalBSharp.g:512:6: (lv_type_3_0= RULE_ID )
                            {
                            // InternalBSharp.g:512:6: (lv_type_3_0= RULE_ID )
                            // InternalBSharp.g:513:7: lv_type_3_0= RULE_ID
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
    // InternalBSharp.g:535:1: entryRuleLocalImport returns [EObject current=null] : iv_ruleLocalImport= ruleLocalImport EOF ;
    public final EObject entryRuleLocalImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalImport = null;


        try {
            // InternalBSharp.g:535:52: (iv_ruleLocalImport= ruleLocalImport EOF )
            // InternalBSharp.g:536:2: iv_ruleLocalImport= ruleLocalImport EOF
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
    // InternalBSharp.g:542:1: ruleLocalImport returns [EObject current=null] : (otherlv_0= 'Import' ( (lv_fileImports_1_0= ruleFileImport ) )+ ) ;
    public final EObject ruleLocalImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_fileImports_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:548:2: ( (otherlv_0= 'Import' ( (lv_fileImports_1_0= ruleFileImport ) )+ ) )
            // InternalBSharp.g:549:2: (otherlv_0= 'Import' ( (lv_fileImports_1_0= ruleFileImport ) )+ )
            {
            // InternalBSharp.g:549:2: (otherlv_0= 'Import' ( (lv_fileImports_1_0= ruleFileImport ) )+ )
            // InternalBSharp.g:550:3: otherlv_0= 'Import' ( (lv_fileImports_1_0= ruleFileImport ) )+
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalImportAccess().getImportKeyword_0());
            		
            // InternalBSharp.g:554:3: ( (lv_fileImports_1_0= ruleFileImport ) )+
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
            	    // InternalBSharp.g:555:4: (lv_fileImports_1_0= ruleFileImport )
            	    {
            	    // InternalBSharp.g:555:4: (lv_fileImports_1_0= ruleFileImport )
            	    // InternalBSharp.g:556:5: lv_fileImports_1_0= ruleFileImport
            	    {

            	    					newCompositeNode(grammarAccess.getLocalImportAccess().getFileImportsFileImportParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_9);
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
    // $ANTLR end "ruleLocalImport"


    // $ANTLR start "entryRuleClass"
    // InternalBSharp.g:577:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalBSharp.g:577:46: (iv_ruleClass= ruleClass EOF )
            // InternalBSharp.g:578:2: iv_ruleClass= ruleClass EOF
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
    // InternalBSharp.g:584:1: ruleClass returns [EObject current=null] : (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_supertypes_3_0= ruleSuperTypeList ) )? ( (lv_varList_4_0= ruleTypeStructure ) )? ( (lv_where_5_0= ruleWhere ) )? (otherlv_6= ';' )? ( (lv_block_7_0= ruleBSharpBlock ) ) ) ;
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
            // InternalBSharp.g:590:2: ( (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_supertypes_3_0= ruleSuperTypeList ) )? ( (lv_varList_4_0= ruleTypeStructure ) )? ( (lv_where_5_0= ruleWhere ) )? (otherlv_6= ';' )? ( (lv_block_7_0= ruleBSharpBlock ) ) ) )
            // InternalBSharp.g:591:2: (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_supertypes_3_0= ruleSuperTypeList ) )? ( (lv_varList_4_0= ruleTypeStructure ) )? ( (lv_where_5_0= ruleWhere ) )? (otherlv_6= ';' )? ( (lv_block_7_0= ruleBSharpBlock ) ) )
            {
            // InternalBSharp.g:591:2: (otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_supertypes_3_0= ruleSuperTypeList ) )? ( (lv_varList_4_0= ruleTypeStructure ) )? ( (lv_where_5_0= ruleWhere ) )? (otherlv_6= ';' )? ( (lv_block_7_0= ruleBSharpBlock ) ) )
            // InternalBSharp.g:592:3: otherlv_0= 'Class' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? ( (lv_supertypes_3_0= ruleSuperTypeList ) )? ( (lv_varList_4_0= ruleTypeStructure ) )? ( (lv_where_5_0= ruleWhere ) )? (otherlv_6= ';' )? ( (lv_block_7_0= ruleBSharpBlock ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getClassAccess().getClassKeyword_0());
            		
            // InternalBSharp.g:596:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBSharp.g:597:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBSharp.g:597:4: (lv_name_1_0= RULE_ID )
            // InternalBSharp.g:598:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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

            // InternalBSharp.g:614:3: ( (lv_context_2_0= rulePolyContext ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBSharp.g:615:4: (lv_context_2_0= rulePolyContext )
                    {
                    // InternalBSharp.g:615:4: (lv_context_2_0= rulePolyContext )
                    // InternalBSharp.g:616:5: lv_context_2_0= rulePolyContext
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getContextPolyContextParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_11);
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

            // InternalBSharp.g:633:3: ( (lv_supertypes_3_0= ruleSuperTypeList ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBSharp.g:634:4: (lv_supertypes_3_0= ruleSuperTypeList )
                    {
                    // InternalBSharp.g:634:4: (lv_supertypes_3_0= ruleSuperTypeList )
                    // InternalBSharp.g:635:5: lv_supertypes_3_0= ruleSuperTypeList
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

            // InternalBSharp.g:652:3: ( (lv_varList_4_0= ruleTypeStructure ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBSharp.g:653:4: (lv_varList_4_0= ruleTypeStructure )
                    {
                    // InternalBSharp.g:653:4: (lv_varList_4_0= ruleTypeStructure )
                    // InternalBSharp.g:654:5: lv_varList_4_0= ruleTypeStructure
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getVarListTypeStructureParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_11);
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

            // InternalBSharp.g:671:3: ( (lv_where_5_0= ruleWhere ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==34) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBSharp.g:672:4: (lv_where_5_0= ruleWhere )
                    {
                    // InternalBSharp.g:672:4: (lv_where_5_0= ruleWhere )
                    // InternalBSharp.g:673:5: lv_where_5_0= ruleWhere
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
                    						"ac.soton.bsharp.BSharp.Where");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBSharp.g:690:3: (otherlv_6= ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBSharp.g:691:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getClassAccess().getSemicolonKeyword_6());
                    			

                    }
                    break;

            }

            // InternalBSharp.g:696:3: ( (lv_block_7_0= ruleBSharpBlock ) )
            // InternalBSharp.g:697:4: (lv_block_7_0= ruleBSharpBlock )
            {
            // InternalBSharp.g:697:4: (lv_block_7_0= ruleBSharpBlock )
            // InternalBSharp.g:698:5: lv_block_7_0= ruleBSharpBlock
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
    // InternalBSharp.g:719:1: entryRulePolyContext returns [EObject current=null] : iv_rulePolyContext= rulePolyContext EOF ;
    public final EObject entryRulePolyContext() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyContext = null;


        try {
            // InternalBSharp.g:719:52: (iv_rulePolyContext= rulePolyContext EOF )
            // InternalBSharp.g:720:2: iv_rulePolyContext= rulePolyContext EOF
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
    // InternalBSharp.g:726:1: rulePolyContext returns [EObject current=null] : (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyType ) )+ otherlv_2= '>' ) ;
    public final EObject rulePolyContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_polyTypes_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:732:2: ( (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyType ) )+ otherlv_2= '>' ) )
            // InternalBSharp.g:733:2: (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyType ) )+ otherlv_2= '>' )
            {
            // InternalBSharp.g:733:2: (otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyType ) )+ otherlv_2= '>' )
            // InternalBSharp.g:734:3: otherlv_0= '<' ( (lv_polyTypes_1_0= rulePolyType ) )+ otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPolyContextAccess().getLessThanSignKeyword_0());
            		
            // InternalBSharp.g:738:3: ( (lv_polyTypes_1_0= rulePolyType ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalBSharp.g:739:4: (lv_polyTypes_1_0= rulePolyType )
            	    {
            	    // InternalBSharp.g:739:4: (lv_polyTypes_1_0= rulePolyType )
            	    // InternalBSharp.g:740:5: lv_polyTypes_1_0= rulePolyType
            	    {

            	    					newCompositeNode(grammarAccess.getPolyContextAccess().getPolyTypesPolyTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_12);
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
    // InternalBSharp.g:765:1: entryRulePolyType returns [EObject current=null] : iv_rulePolyType= rulePolyType EOF ;
    public final EObject entryRulePolyType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyType = null;


        try {
            // InternalBSharp.g:765:49: (iv_rulePolyType= rulePolyType EOF )
            // InternalBSharp.g:766:2: iv_rulePolyType= rulePolyType EOF
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
    // InternalBSharp.g:772:1: rulePolyType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? ) ;
    public final EObject rulePolyType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalBSharp.g:778:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? ) )
            // InternalBSharp.g:779:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? )
            {
            // InternalBSharp.g:779:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? )
            // InternalBSharp.g:780:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )?
            {
            // InternalBSharp.g:780:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBSharp.g:781:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBSharp.g:781:4: (lv_name_0_0= RULE_ID )
            // InternalBSharp.g:782:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            // InternalBSharp.g:798:3: (otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==12) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBSharp.g:799:4: otherlv_1= ':' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getPolyTypeAccess().getColonKeyword_1_0());
                    			
                    // InternalBSharp.g:803:4: ( ( ruleQualifiedName ) )
                    // InternalBSharp.g:804:5: ( ruleQualifiedName )
                    {
                    // InternalBSharp.g:804:5: ( ruleQualifiedName )
                    // InternalBSharp.g:805:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPolyTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPolyTypeAccess().getSuperTypesClassDeclCrossReference_1_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBSharp.g:819:4: (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==21) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalBSharp.g:820:5: otherlv_3= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getPolyTypeAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalBSharp.g:824:5: ( ( ruleQualifiedName ) )
                    	    // InternalBSharp.g:825:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalBSharp.g:825:6: ( ruleQualifiedName )
                    	    // InternalBSharp.g:826:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPolyTypeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getPolyTypeAccess().getSuperTypesClassDeclCrossReference_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
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
    // InternalBSharp.g:846:1: entryRuleSuperTypeList returns [EObject current=null] : iv_ruleSuperTypeList= ruleSuperTypeList EOF ;
    public final EObject entryRuleSuperTypeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperTypeList = null;


        try {
            // InternalBSharp.g:846:54: (iv_ruleSuperTypeList= ruleSuperTypeList EOF )
            // InternalBSharp.g:847:2: iv_ruleSuperTypeList= ruleSuperTypeList EOF
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
    // InternalBSharp.g:853:1: ruleSuperTypeList returns [EObject current=null] : (otherlv_0= ':' ( (lv_superType_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superType_3_0= ruleConstructedType ) ) )* ) ;
    public final EObject ruleSuperTypeList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_superType_1_0 = null;

        EObject lv_superType_3_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:859:2: ( (otherlv_0= ':' ( (lv_superType_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superType_3_0= ruleConstructedType ) ) )* ) )
            // InternalBSharp.g:860:2: (otherlv_0= ':' ( (lv_superType_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superType_3_0= ruleConstructedType ) ) )* )
            {
            // InternalBSharp.g:860:2: (otherlv_0= ':' ( (lv_superType_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superType_3_0= ruleConstructedType ) ) )* )
            // InternalBSharp.g:861:3: otherlv_0= ':' ( (lv_superType_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_superType_3_0= ruleConstructedType ) ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSuperTypeListAccess().getColonKeyword_0());
            		
            // InternalBSharp.g:865:3: ( (lv_superType_1_0= ruleConstructedType ) )
            // InternalBSharp.g:866:4: (lv_superType_1_0= ruleConstructedType )
            {
            // InternalBSharp.g:866:4: (lv_superType_1_0= ruleConstructedType )
            // InternalBSharp.g:867:5: lv_superType_1_0= ruleConstructedType
            {

            					newCompositeNode(grammarAccess.getSuperTypeListAccess().getSuperTypeConstructedTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalBSharp.g:884:3: (otherlv_2= ',' ( (lv_superType_3_0= ruleConstructedType ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==21) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBSharp.g:885:4: otherlv_2= ',' ( (lv_superType_3_0= ruleConstructedType ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSuperTypeListAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalBSharp.g:889:4: ( (lv_superType_3_0= ruleConstructedType ) )
            	    // InternalBSharp.g:890:5: (lv_superType_3_0= ruleConstructedType )
            	    {
            	    // InternalBSharp.g:890:5: (lv_superType_3_0= ruleConstructedType )
            	    // InternalBSharp.g:891:6: lv_superType_3_0= ruleConstructedType
            	    {

            	    						newCompositeNode(grammarAccess.getSuperTypeListAccess().getSuperTypeConstructedTypeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
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
    // $ANTLR end "ruleSuperTypeList"


    // $ANTLR start "entryRuleConstructedType"
    // InternalBSharp.g:913:1: entryRuleConstructedType returns [EObject current=null] : iv_ruleConstructedType= ruleConstructedType EOF ;
    public final EObject entryRuleConstructedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructedType = null;


        try {
            // InternalBSharp.g:913:56: (iv_ruleConstructedType= ruleConstructedType EOF )
            // InternalBSharp.g:914:2: iv_ruleConstructedType= ruleConstructedType EOF
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
    // InternalBSharp.g:920:1: ruleConstructedType returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeConstructor ) ) ( ( ( (lv_constructors_1_1= '\\u00D7' | lv_constructors_1_2= '\\u2192' | lv_constructors_1_3= '\\uE102' | lv_constructors_1_4= '\\uE100' | lv_constructors_1_5= '\\u2194' | lv_constructors_1_6= '\\u2916' | lv_constructors_1_7= '\\u21F8' | lv_constructors_1_8= '\\u21A3' | lv_constructors_1_9= '\\u2900' | lv_constructors_1_10= '\\u21A0' ) ) ) ( (lv_type_2_0= ruleConstructedType ) ) )? ) ;
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
            // InternalBSharp.g:926:2: ( ( ( (lv_type_0_0= ruleTypeConstructor ) ) ( ( ( (lv_constructors_1_1= '\\u00D7' | lv_constructors_1_2= '\\u2192' | lv_constructors_1_3= '\\uE102' | lv_constructors_1_4= '\\uE100' | lv_constructors_1_5= '\\u2194' | lv_constructors_1_6= '\\u2916' | lv_constructors_1_7= '\\u21F8' | lv_constructors_1_8= '\\u21A3' | lv_constructors_1_9= '\\u2900' | lv_constructors_1_10= '\\u21A0' ) ) ) ( (lv_type_2_0= ruleConstructedType ) ) )? ) )
            // InternalBSharp.g:927:2: ( ( (lv_type_0_0= ruleTypeConstructor ) ) ( ( ( (lv_constructors_1_1= '\\u00D7' | lv_constructors_1_2= '\\u2192' | lv_constructors_1_3= '\\uE102' | lv_constructors_1_4= '\\uE100' | lv_constructors_1_5= '\\u2194' | lv_constructors_1_6= '\\u2916' | lv_constructors_1_7= '\\u21F8' | lv_constructors_1_8= '\\u21A3' | lv_constructors_1_9= '\\u2900' | lv_constructors_1_10= '\\u21A0' ) ) ) ( (lv_type_2_0= ruleConstructedType ) ) )? )
            {
            // InternalBSharp.g:927:2: ( ( (lv_type_0_0= ruleTypeConstructor ) ) ( ( ( (lv_constructors_1_1= '\\u00D7' | lv_constructors_1_2= '\\u2192' | lv_constructors_1_3= '\\uE102' | lv_constructors_1_4= '\\uE100' | lv_constructors_1_5= '\\u2194' | lv_constructors_1_6= '\\u2916' | lv_constructors_1_7= '\\u21F8' | lv_constructors_1_8= '\\u21A3' | lv_constructors_1_9= '\\u2900' | lv_constructors_1_10= '\\u21A0' ) ) ) ( (lv_type_2_0= ruleConstructedType ) ) )? )
            // InternalBSharp.g:928:3: ( (lv_type_0_0= ruleTypeConstructor ) ) ( ( ( (lv_constructors_1_1= '\\u00D7' | lv_constructors_1_2= '\\u2192' | lv_constructors_1_3= '\\uE102' | lv_constructors_1_4= '\\uE100' | lv_constructors_1_5= '\\u2194' | lv_constructors_1_6= '\\u2916' | lv_constructors_1_7= '\\u21F8' | lv_constructors_1_8= '\\u21A3' | lv_constructors_1_9= '\\u2900' | lv_constructors_1_10= '\\u21A0' ) ) ) ( (lv_type_2_0= ruleConstructedType ) ) )?
            {
            // InternalBSharp.g:928:3: ( (lv_type_0_0= ruleTypeConstructor ) )
            // InternalBSharp.g:929:4: (lv_type_0_0= ruleTypeConstructor )
            {
            // InternalBSharp.g:929:4: (lv_type_0_0= ruleTypeConstructor )
            // InternalBSharp.g:930:5: lv_type_0_0= ruleTypeConstructor
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
            						"ac.soton.bsharp.BSharp.TypeConstructor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBSharp.g:947:3: ( ( ( (lv_constructors_1_1= '\\u00D7' | lv_constructors_1_2= '\\u2192' | lv_constructors_1_3= '\\uE102' | lv_constructors_1_4= '\\uE100' | lv_constructors_1_5= '\\u2194' | lv_constructors_1_6= '\\u2916' | lv_constructors_1_7= '\\u21F8' | lv_constructors_1_8= '\\u21A3' | lv_constructors_1_9= '\\u2900' | lv_constructors_1_10= '\\u21A0' ) ) ) ( (lv_type_2_0= ruleConstructedType ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=22 && LA19_0<=31)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBSharp.g:948:4: ( ( (lv_constructors_1_1= '\\u00D7' | lv_constructors_1_2= '\\u2192' | lv_constructors_1_3= '\\uE102' | lv_constructors_1_4= '\\uE100' | lv_constructors_1_5= '\\u2194' | lv_constructors_1_6= '\\u2916' | lv_constructors_1_7= '\\u21F8' | lv_constructors_1_8= '\\u21A3' | lv_constructors_1_9= '\\u2900' | lv_constructors_1_10= '\\u21A0' ) ) ) ( (lv_type_2_0= ruleConstructedType ) )
                    {
                    // InternalBSharp.g:948:4: ( ( (lv_constructors_1_1= '\\u00D7' | lv_constructors_1_2= '\\u2192' | lv_constructors_1_3= '\\uE102' | lv_constructors_1_4= '\\uE100' | lv_constructors_1_5= '\\u2194' | lv_constructors_1_6= '\\u2916' | lv_constructors_1_7= '\\u21F8' | lv_constructors_1_8= '\\u21A3' | lv_constructors_1_9= '\\u2900' | lv_constructors_1_10= '\\u21A0' ) ) )
                    // InternalBSharp.g:949:5: ( (lv_constructors_1_1= '\\u00D7' | lv_constructors_1_2= '\\u2192' | lv_constructors_1_3= '\\uE102' | lv_constructors_1_4= '\\uE100' | lv_constructors_1_5= '\\u2194' | lv_constructors_1_6= '\\u2916' | lv_constructors_1_7= '\\u21F8' | lv_constructors_1_8= '\\u21A3' | lv_constructors_1_9= '\\u2900' | lv_constructors_1_10= '\\u21A0' ) )
                    {
                    // InternalBSharp.g:949:5: ( (lv_constructors_1_1= '\\u00D7' | lv_constructors_1_2= '\\u2192' | lv_constructors_1_3= '\\uE102' | lv_constructors_1_4= '\\uE100' | lv_constructors_1_5= '\\u2194' | lv_constructors_1_6= '\\u2916' | lv_constructors_1_7= '\\u21F8' | lv_constructors_1_8= '\\u21A3' | lv_constructors_1_9= '\\u2900' | lv_constructors_1_10= '\\u21A0' ) )
                    // InternalBSharp.g:950:6: (lv_constructors_1_1= '\\u00D7' | lv_constructors_1_2= '\\u2192' | lv_constructors_1_3= '\\uE102' | lv_constructors_1_4= '\\uE100' | lv_constructors_1_5= '\\u2194' | lv_constructors_1_6= '\\u2916' | lv_constructors_1_7= '\\u21F8' | lv_constructors_1_8= '\\u21A3' | lv_constructors_1_9= '\\u2900' | lv_constructors_1_10= '\\u21A0' )
                    {
                    // InternalBSharp.g:950:6: (lv_constructors_1_1= '\\u00D7' | lv_constructors_1_2= '\\u2192' | lv_constructors_1_3= '\\uE102' | lv_constructors_1_4= '\\uE100' | lv_constructors_1_5= '\\u2194' | lv_constructors_1_6= '\\u2916' | lv_constructors_1_7= '\\u21F8' | lv_constructors_1_8= '\\u21A3' | lv_constructors_1_9= '\\u2900' | lv_constructors_1_10= '\\u21A0' )
                    int alt18=10;
                    switch ( input.LA(1) ) {
                    case 22:
                        {
                        alt18=1;
                        }
                        break;
                    case 23:
                        {
                        alt18=2;
                        }
                        break;
                    case 24:
                        {
                        alt18=3;
                        }
                        break;
                    case 25:
                        {
                        alt18=4;
                        }
                        break;
                    case 26:
                        {
                        alt18=5;
                        }
                        break;
                    case 27:
                        {
                        alt18=6;
                        }
                        break;
                    case 28:
                        {
                        alt18=7;
                        }
                        break;
                    case 29:
                        {
                        alt18=8;
                        }
                        break;
                    case 30:
                        {
                        alt18=9;
                        }
                        break;
                    case 31:
                        {
                        alt18=10;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }

                    switch (alt18) {
                        case 1 :
                            // InternalBSharp.g:951:7: lv_constructors_1_1= '\\u00D7'
                            {
                            lv_constructors_1_1=(Token)match(input,22,FOLLOW_3); 

                            							newLeafNode(lv_constructors_1_1, grammarAccess.getConstructedTypeAccess().getConstructorsMultiplicationSignKeyword_1_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConstructedTypeRule());
                            							}
                            							addWithLastConsumed(current, "constructors", lv_constructors_1_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalBSharp.g:962:7: lv_constructors_1_2= '\\u2192'
                            {
                            lv_constructors_1_2=(Token)match(input,23,FOLLOW_3); 

                            							newLeafNode(lv_constructors_1_2, grammarAccess.getConstructedTypeAccess().getConstructorsRightwardsArrowKeyword_1_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConstructedTypeRule());
                            							}
                            							addWithLastConsumed(current, "constructors", lv_constructors_1_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalBSharp.g:973:7: lv_constructors_1_3= '\\uE102'
                            {
                            lv_constructors_1_3=(Token)match(input,24,FOLLOW_3); 

                            							newLeafNode(lv_constructors_1_3, grammarAccess.getConstructedTypeAccess().getConstructorsPrivateUseAreaE102Keyword_1_0_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConstructedTypeRule());
                            							}
                            							addWithLastConsumed(current, "constructors", lv_constructors_1_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalBSharp.g:984:7: lv_constructors_1_4= '\\uE100'
                            {
                            lv_constructors_1_4=(Token)match(input,25,FOLLOW_3); 

                            							newLeafNode(lv_constructors_1_4, grammarAccess.getConstructedTypeAccess().getConstructorsPrivateUseAreaE100Keyword_1_0_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConstructedTypeRule());
                            							}
                            							addWithLastConsumed(current, "constructors", lv_constructors_1_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalBSharp.g:995:7: lv_constructors_1_5= '\\u2194'
                            {
                            lv_constructors_1_5=(Token)match(input,26,FOLLOW_3); 

                            							newLeafNode(lv_constructors_1_5, grammarAccess.getConstructedTypeAccess().getConstructorsLeftRightArrowKeyword_1_0_0_4());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConstructedTypeRule());
                            							}
                            							addWithLastConsumed(current, "constructors", lv_constructors_1_5, null);
                            						

                            }
                            break;
                        case 6 :
                            // InternalBSharp.g:1006:7: lv_constructors_1_6= '\\u2916'
                            {
                            lv_constructors_1_6=(Token)match(input,27,FOLLOW_3); 

                            							newLeafNode(lv_constructors_1_6, grammarAccess.getConstructedTypeAccess().getConstructorsRightwardsTwoHeadedArrowWithTailKeyword_1_0_0_5());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConstructedTypeRule());
                            							}
                            							addWithLastConsumed(current, "constructors", lv_constructors_1_6, null);
                            						

                            }
                            break;
                        case 7 :
                            // InternalBSharp.g:1017:7: lv_constructors_1_7= '\\u21F8'
                            {
                            lv_constructors_1_7=(Token)match(input,28,FOLLOW_3); 

                            							newLeafNode(lv_constructors_1_7, grammarAccess.getConstructedTypeAccess().getConstructorsRightwardsArrowWithVerticalStrokeKeyword_1_0_0_6());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConstructedTypeRule());
                            							}
                            							addWithLastConsumed(current, "constructors", lv_constructors_1_7, null);
                            						

                            }
                            break;
                        case 8 :
                            // InternalBSharp.g:1028:7: lv_constructors_1_8= '\\u21A3'
                            {
                            lv_constructors_1_8=(Token)match(input,29,FOLLOW_3); 

                            							newLeafNode(lv_constructors_1_8, grammarAccess.getConstructedTypeAccess().getConstructorsRightwardsArrowWithTailKeyword_1_0_0_7());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConstructedTypeRule());
                            							}
                            							addWithLastConsumed(current, "constructors", lv_constructors_1_8, null);
                            						

                            }
                            break;
                        case 9 :
                            // InternalBSharp.g:1039:7: lv_constructors_1_9= '\\u2900'
                            {
                            lv_constructors_1_9=(Token)match(input,30,FOLLOW_3); 

                            							newLeafNode(lv_constructors_1_9, grammarAccess.getConstructedTypeAccess().getConstructorsRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_1_0_0_8());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConstructedTypeRule());
                            							}
                            							addWithLastConsumed(current, "constructors", lv_constructors_1_9, null);
                            						

                            }
                            break;
                        case 10 :
                            // InternalBSharp.g:1050:7: lv_constructors_1_10= '\\u21A0'
                            {
                            lv_constructors_1_10=(Token)match(input,31,FOLLOW_3); 

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

                    // InternalBSharp.g:1063:4: ( (lv_type_2_0= ruleConstructedType ) )
                    // InternalBSharp.g:1064:5: (lv_type_2_0= ruleConstructedType )
                    {
                    // InternalBSharp.g:1064:5: (lv_type_2_0= ruleConstructedType )
                    // InternalBSharp.g:1065:6: lv_type_2_0= ruleConstructedType
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
    // InternalBSharp.g:1087:1: entryRuleTypeConstructor returns [EObject current=null] : iv_ruleTypeConstructor= ruleTypeConstructor EOF ;
    public final EObject entryRuleTypeConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeConstructor = null;


        try {
            // InternalBSharp.g:1087:56: (iv_ruleTypeConstructor= ruleTypeConstructor EOF )
            // InternalBSharp.g:1088:2: iv_ruleTypeConstructor= ruleTypeConstructor EOF
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
    // InternalBSharp.g:1094:1: ruleTypeConstructor returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )? ) ;
    public final EObject ruleTypeConstructor() throws RecognitionException {
        EObject current = null;

        EObject lv_context_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1100:2: ( ( ( ( ruleQualifiedName ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )? ) )
            // InternalBSharp.g:1101:2: ( ( ( ruleQualifiedName ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )? )
            {
            // InternalBSharp.g:1101:2: ( ( ( ruleQualifiedName ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )? )
            // InternalBSharp.g:1102:3: ( ( ruleQualifiedName ) ) ( (lv_context_1_0= ruleTypeDeclContext ) )?
            {
            // InternalBSharp.g:1102:3: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:1103:4: ( ruleQualifiedName )
            {
            // InternalBSharp.g:1103:4: ( ruleQualifiedName )
            // InternalBSharp.g:1104:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeConstructorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTypeConstructorAccess().getTypeNameGenNameCrossReference_0_0());
            				
            pushFollow(FOLLOW_16);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBSharp.g:1118:3: ( (lv_context_1_0= ruleTypeDeclContext ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==19) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalBSharp.g:1119:4: (lv_context_1_0= ruleTypeDeclContext )
                    {
                    // InternalBSharp.g:1119:4: (lv_context_1_0= ruleTypeDeclContext )
                    // InternalBSharp.g:1120:5: lv_context_1_0= ruleTypeDeclContext
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
    // InternalBSharp.g:1141:1: entryRuleTypeDeclContext returns [EObject current=null] : iv_ruleTypeDeclContext= ruleTypeDeclContext EOF ;
    public final EObject entryRuleTypeDeclContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDeclContext = null;


        try {
            // InternalBSharp.g:1141:56: (iv_ruleTypeDeclContext= ruleTypeDeclContext EOF )
            // InternalBSharp.g:1142:2: iv_ruleTypeDeclContext= ruleTypeDeclContext EOF
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
    // InternalBSharp.g:1148:1: ruleTypeDeclContext returns [EObject current=null] : (otherlv_0= '<' ( (lv_TypeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_TypeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>' ) ;
    public final EObject ruleTypeDeclContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_TypeName_1_0 = null;

        EObject lv_TypeName_3_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1154:2: ( (otherlv_0= '<' ( (lv_TypeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_TypeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>' ) )
            // InternalBSharp.g:1155:2: (otherlv_0= '<' ( (lv_TypeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_TypeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>' )
            {
            // InternalBSharp.g:1155:2: (otherlv_0= '<' ( (lv_TypeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_TypeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>' )
            // InternalBSharp.g:1156:3: otherlv_0= '<' ( (lv_TypeName_1_0= ruleConstructedType ) ) (otherlv_2= ',' ( (lv_TypeName_3_0= ruleConstructedType ) ) )* otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeDeclContextAccess().getLessThanSignKeyword_0());
            		
            // InternalBSharp.g:1160:3: ( (lv_TypeName_1_0= ruleConstructedType ) )
            // InternalBSharp.g:1161:4: (lv_TypeName_1_0= ruleConstructedType )
            {
            // InternalBSharp.g:1161:4: (lv_TypeName_1_0= ruleConstructedType )
            // InternalBSharp.g:1162:5: lv_TypeName_1_0= ruleConstructedType
            {

            					newCompositeNode(grammarAccess.getTypeDeclContextAccess().getTypeNameConstructedTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalBSharp.g:1179:3: (otherlv_2= ',' ( (lv_TypeName_3_0= ruleConstructedType ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==21) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalBSharp.g:1180:4: otherlv_2= ',' ( (lv_TypeName_3_0= ruleConstructedType ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getTypeDeclContextAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalBSharp.g:1184:4: ( (lv_TypeName_3_0= ruleConstructedType ) )
            	    // InternalBSharp.g:1185:5: (lv_TypeName_3_0= ruleConstructedType )
            	    {
            	    // InternalBSharp.g:1185:5: (lv_TypeName_3_0= ruleConstructedType )
            	    // InternalBSharp.g:1186:6: lv_TypeName_3_0= ruleConstructedType
            	    {

            	    						newCompositeNode(grammarAccess.getTypeDeclContextAccess().getTypeNameConstructedTypeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
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
            	    break loop21;
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
    // InternalBSharp.g:1212:1: entryRuleTypeStructure returns [EObject current=null] : iv_ruleTypeStructure= ruleTypeStructure EOF ;
    public final EObject entryRuleTypeStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeStructure = null;


        try {
            // InternalBSharp.g:1212:54: (iv_ruleTypeStructure= ruleTypeStructure EOF )
            // InternalBSharp.g:1213:2: iv_ruleTypeStructure= ruleTypeStructure EOF
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
    // InternalBSharp.g:1219:1: ruleTypeStructure returns [EObject current=null] : (otherlv_0= '(' ( (lv_variables_1_0= ruleTypedVariableList ) ) otherlv_2= ')' ) ;
    public final EObject ruleTypeStructure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_variables_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1225:2: ( (otherlv_0= '(' ( (lv_variables_1_0= ruleTypedVariableList ) ) otherlv_2= ')' ) )
            // InternalBSharp.g:1226:2: (otherlv_0= '(' ( (lv_variables_1_0= ruleTypedVariableList ) ) otherlv_2= ')' )
            {
            // InternalBSharp.g:1226:2: (otherlv_0= '(' ( (lv_variables_1_0= ruleTypedVariableList ) ) otherlv_2= ')' )
            // InternalBSharp.g:1227:3: otherlv_0= '(' ( (lv_variables_1_0= ruleTypedVariableList ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeStructureAccess().getLeftParenthesisKeyword_0());
            		
            // InternalBSharp.g:1231:3: ( (lv_variables_1_0= ruleTypedVariableList ) )
            // InternalBSharp.g:1232:4: (lv_variables_1_0= ruleTypedVariableList )
            {
            // InternalBSharp.g:1232:4: (lv_variables_1_0= ruleTypedVariableList )
            // InternalBSharp.g:1233:5: lv_variables_1_0= ruleTypedVariableList
            {

            					newCompositeNode(grammarAccess.getTypeStructureAccess().getVariablesTypedVariableListParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
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
    // InternalBSharp.g:1258:1: entryRuleWhere returns [EObject current=null] : iv_ruleWhere= ruleWhere EOF ;
    public final EObject entryRuleWhere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhere = null;


        try {
            // InternalBSharp.g:1258:46: (iv_ruleWhere= ruleWhere EOF )
            // InternalBSharp.g:1259:2: iv_ruleWhere= ruleWhere EOF
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
    // InternalBSharp.g:1265:1: ruleWhere returns [EObject current=null] : (otherlv_0= 'where' ( (lv_expessions_1_0= ruleQuantifier ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )* ) ;
    public final EObject ruleWhere() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expessions_1_0 = null;

        EObject lv_expressions_3_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1271:2: ( (otherlv_0= 'where' ( (lv_expessions_1_0= ruleQuantifier ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )* ) )
            // InternalBSharp.g:1272:2: (otherlv_0= 'where' ( (lv_expessions_1_0= ruleQuantifier ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )* )
            {
            // InternalBSharp.g:1272:2: (otherlv_0= 'where' ( (lv_expessions_1_0= ruleQuantifier ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )* )
            // InternalBSharp.g:1273:3: otherlv_0= 'where' ( (lv_expessions_1_0= ruleQuantifier ) ) (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )*
            {
            otherlv_0=(Token)match(input,34,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getWhereAccess().getWhereKeyword_0());
            		
            // InternalBSharp.g:1277:3: ( (lv_expessions_1_0= ruleQuantifier ) )
            // InternalBSharp.g:1278:4: (lv_expessions_1_0= ruleQuantifier )
            {
            // InternalBSharp.g:1278:4: (lv_expessions_1_0= ruleQuantifier )
            // InternalBSharp.g:1279:5: lv_expessions_1_0= ruleQuantifier
            {

            					newCompositeNode(grammarAccess.getWhereAccess().getExpessionsQuantifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalBSharp.g:1296:3: (otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==18) ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==RULE_ID||LA22_1==32||LA22_1==41||(LA22_1>=43 && LA22_1<=45)||LA22_1==47) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // InternalBSharp.g:1297:4: otherlv_2= ';' ( (lv_expressions_3_0= ruleRootExpression ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_21); 

            	    				newLeafNode(otherlv_2, grammarAccess.getWhereAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalBSharp.g:1301:4: ( (lv_expressions_3_0= ruleRootExpression ) )
            	    // InternalBSharp.g:1302:5: (lv_expressions_3_0= ruleRootExpression )
            	    {
            	    // InternalBSharp.g:1302:5: (lv_expressions_3_0= ruleRootExpression )
            	    // InternalBSharp.g:1303:6: lv_expressions_3_0= ruleRootExpression
            	    {

            	    						newCompositeNode(grammarAccess.getWhereAccess().getExpressionsRootExpressionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
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
    // $ANTLR end "ruleWhere"


    // $ANTLR start "entryRuleDatatype"
    // InternalBSharp.g:1325:1: entryRuleDatatype returns [EObject current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final EObject entryRuleDatatype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatype = null;


        try {
            // InternalBSharp.g:1325:49: (iv_ruleDatatype= ruleDatatype EOF )
            // InternalBSharp.g:1326:2: iv_ruleDatatype= ruleDatatype EOF
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
    // InternalBSharp.g:1332:1: ruleDatatype returns [EObject current=null] : (otherlv_0= 'Datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? (otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) ) )+ ( (lv_block_5_0= ruleBSharpBlock ) ) ) ;
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
            // InternalBSharp.g:1338:2: ( (otherlv_0= 'Datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? (otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) ) )+ ( (lv_block_5_0= ruleBSharpBlock ) ) ) )
            // InternalBSharp.g:1339:2: (otherlv_0= 'Datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? (otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) ) )+ ( (lv_block_5_0= ruleBSharpBlock ) ) )
            {
            // InternalBSharp.g:1339:2: (otherlv_0= 'Datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? (otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) ) )+ ( (lv_block_5_0= ruleBSharpBlock ) ) )
            // InternalBSharp.g:1340:3: otherlv_0= 'Datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_context_2_0= rulePolyContext ) )? (otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) ) )+ ( (lv_block_5_0= ruleBSharpBlock ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDatatypeAccess().getDatatypeKeyword_0());
            		
            // InternalBSharp.g:1344:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBSharp.g:1345:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBSharp.g:1345:4: (lv_name_1_0= RULE_ID )
            // InternalBSharp.g:1346:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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

            // InternalBSharp.g:1362:3: ( (lv_context_2_0= rulePolyContext ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==19) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBSharp.g:1363:4: (lv_context_2_0= rulePolyContext )
                    {
                    // InternalBSharp.g:1363:4: (lv_context_2_0= rulePolyContext )
                    // InternalBSharp.g:1364:5: lv_context_2_0= rulePolyContext
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
                    						"ac.soton.bsharp.BSharp.PolyContext");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBSharp.g:1381:3: (otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==36) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalBSharp.g:1382:4: otherlv_3= '|' ( (lv_constructors_4_0= ruleDatatypeConstructor ) )
            	    {
            	    otherlv_3=(Token)match(input,36,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getDatatypeAccess().getVerticalLineKeyword_3_0());
            	    			
            	    // InternalBSharp.g:1386:4: ( (lv_constructors_4_0= ruleDatatypeConstructor ) )
            	    // InternalBSharp.g:1387:5: (lv_constructors_4_0= ruleDatatypeConstructor )
            	    {
            	    // InternalBSharp.g:1387:5: (lv_constructors_4_0= ruleDatatypeConstructor )
            	    // InternalBSharp.g:1388:6: lv_constructors_4_0= ruleDatatypeConstructor
            	    {

            	    						newCompositeNode(grammarAccess.getDatatypeAccess().getConstructorsDatatypeConstructorParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
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
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            // InternalBSharp.g:1406:3: ( (lv_block_5_0= ruleBSharpBlock ) )
            // InternalBSharp.g:1407:4: (lv_block_5_0= ruleBSharpBlock )
            {
            // InternalBSharp.g:1407:4: (lv_block_5_0= ruleBSharpBlock )
            // InternalBSharp.g:1408:5: lv_block_5_0= ruleBSharpBlock
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
    // InternalBSharp.g:1429:1: entryRuleDatatypeConstructor returns [EObject current=null] : iv_ruleDatatypeConstructor= ruleDatatypeConstructor EOF ;
    public final EObject entryRuleDatatypeConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatypeConstructor = null;


        try {
            // InternalBSharp.g:1429:60: (iv_ruleDatatypeConstructor= ruleDatatypeConstructor EOF )
            // InternalBSharp.g:1430:2: iv_ruleDatatypeConstructor= ruleDatatypeConstructor EOF
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
    // InternalBSharp.g:1436:1: ruleDatatypeConstructor returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleDatatypeConstructor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_decons_2_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1442:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )? ) )
            // InternalBSharp.g:1443:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )? )
            {
            // InternalBSharp.g:1443:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )? )
            // InternalBSharp.g:1444:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )?
            {
            // InternalBSharp.g:1444:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBSharp.g:1445:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBSharp.g:1445:4: (lv_name_0_0= RULE_ID )
            // InternalBSharp.g:1446:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_25); 

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

            // InternalBSharp.g:1462:3: (otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==32) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBSharp.g:1463:4: otherlv_1= '(' ( (lv_decons_2_0= ruleTypedVariableList ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getDatatypeConstructorAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalBSharp.g:1467:4: ( (lv_decons_2_0= ruleTypedVariableList ) )
                    // InternalBSharp.g:1468:5: (lv_decons_2_0= ruleTypedVariableList )
                    {
                    // InternalBSharp.g:1468:5: (lv_decons_2_0= ruleTypedVariableList )
                    // InternalBSharp.g:1469:6: lv_decons_2_0= ruleTypedVariableList
                    {

                    						newCompositeNode(grammarAccess.getDatatypeConstructorAccess().getDeconsTypedVariableListParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_18);
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
    // InternalBSharp.g:1495:1: entryRuleExtend returns [EObject current=null] : iv_ruleExtend= ruleExtend EOF ;
    public final EObject entryRuleExtend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtend = null;


        try {
            // InternalBSharp.g:1495:47: (iv_ruleExtend= ruleExtend EOF )
            // InternalBSharp.g:1496:2: iv_ruleExtend= ruleExtend EOF
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
    // InternalBSharp.g:1502:1: ruleExtend returns [EObject current=null] : (otherlv_0= 'Extend' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' ( (lv_block_5_0= ruleBSharpBlock ) ) ) ;
    public final EObject ruleExtend() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        EObject lv_block_5_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1508:2: ( (otherlv_0= 'Extend' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' ( (lv_block_5_0= ruleBSharpBlock ) ) ) )
            // InternalBSharp.g:1509:2: (otherlv_0= 'Extend' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' ( (lv_block_5_0= ruleBSharpBlock ) ) )
            {
            // InternalBSharp.g:1509:2: (otherlv_0= 'Extend' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' ( (lv_block_5_0= ruleBSharpBlock ) ) )
            // InternalBSharp.g:1510:3: otherlv_0= 'Extend' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' ( (lv_block_5_0= ruleBSharpBlock ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExtendAccess().getExtendKeyword_0());
            		
            // InternalBSharp.g:1514:3: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:1515:4: ( ruleQualifiedName )
            {
            // InternalBSharp.g:1515:4: ( ruleQualifiedName )
            // InternalBSharp.g:1516:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExtendAccess().getExtendedClassClassDeclCrossReference_1_0());
            				
            pushFollow(FOLLOW_26);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getExtendAccess().getLeftParenthesisKeyword_2());
            		
            // InternalBSharp.g:1534:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalBSharp.g:1535:4: (lv_name_3_0= RULE_ID )
            {
            // InternalBSharp.g:1535:4: (lv_name_3_0= RULE_ID )
            // InternalBSharp.g:1536:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_18); 

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

            otherlv_4=(Token)match(input,33,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getExtendAccess().getRightParenthesisKeyword_4());
            		
            // InternalBSharp.g:1556:3: ( (lv_block_5_0= ruleBSharpBlock ) )
            // InternalBSharp.g:1557:4: (lv_block_5_0= ruleBSharpBlock )
            {
            // InternalBSharp.g:1557:4: (lv_block_5_0= ruleBSharpBlock )
            // InternalBSharp.g:1558:5: lv_block_5_0= ruleBSharpBlock
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
    // InternalBSharp.g:1579:1: entryRuleBSharpBlock returns [EObject current=null] : iv_ruleBSharpBlock= ruleBSharpBlock EOF ;
    public final EObject entryRuleBSharpBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSharpBlock = null;


        try {
            // InternalBSharp.g:1579:52: (iv_ruleBSharpBlock= ruleBSharpBlock EOF )
            // InternalBSharp.g:1580:2: iv_ruleBSharpBlock= ruleBSharpBlock EOF
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
    // InternalBSharp.g:1586:1: ruleBSharpBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_bodyElements_2_0= ruleTypeBodyElements ) )* otherlv_3= '}' ) ;
    public final EObject ruleBSharpBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_bodyElements_2_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1592:2: ( ( () otherlv_1= '{' ( (lv_bodyElements_2_0= ruleTypeBodyElements ) )* otherlv_3= '}' ) )
            // InternalBSharp.g:1593:2: ( () otherlv_1= '{' ( (lv_bodyElements_2_0= ruleTypeBodyElements ) )* otherlv_3= '}' )
            {
            // InternalBSharp.g:1593:2: ( () otherlv_1= '{' ( (lv_bodyElements_2_0= ruleTypeBodyElements ) )* otherlv_3= '}' )
            // InternalBSharp.g:1594:3: () otherlv_1= '{' ( (lv_bodyElements_2_0= ruleTypeBodyElements ) )* otherlv_3= '}'
            {
            // InternalBSharp.g:1594:3: ()
            // InternalBSharp.g:1595:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBSharpBlockAccess().getBSharpBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getBSharpBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBSharp.g:1605:3: ( (lv_bodyElements_2_0= ruleTypeBodyElements ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||LA26_0==42) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalBSharp.g:1606:4: (lv_bodyElements_2_0= ruleTypeBodyElements )
            	    {
            	    // InternalBSharp.g:1606:4: (lv_bodyElements_2_0= ruleTypeBodyElements )
            	    // InternalBSharp.g:1607:5: lv_bodyElements_2_0= ruleTypeBodyElements
            	    {

            	    					newCompositeNode(grammarAccess.getBSharpBlockAccess().getBodyElementsTypeBodyElementsParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_27);
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
            	    break loop26;
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
    // InternalBSharp.g:1632:1: entryRuleTypeBodyElements returns [EObject current=null] : iv_ruleTypeBodyElements= ruleTypeBodyElements EOF ;
    public final EObject entryRuleTypeBodyElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeBodyElements = null;


        try {
            // InternalBSharp.g:1632:57: (iv_ruleTypeBodyElements= ruleTypeBodyElements EOF )
            // InternalBSharp.g:1633:2: iv_ruleTypeBodyElements= ruleTypeBodyElements EOF
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
    // InternalBSharp.g:1639:1: ruleTypeBodyElements returns [EObject current=null] : ( ( (lv_functions_0_0= ruleFunctionDecl ) ) | ( (lv_theorems_1_0= ruleTheoremBody ) ) ) ;
    public final EObject ruleTypeBodyElements() throws RecognitionException {
        EObject current = null;

        EObject lv_functions_0_0 = null;

        EObject lv_theorems_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:1645:2: ( ( ( (lv_functions_0_0= ruleFunctionDecl ) ) | ( (lv_theorems_1_0= ruleTheoremBody ) ) ) )
            // InternalBSharp.g:1646:2: ( ( (lv_functions_0_0= ruleFunctionDecl ) ) | ( (lv_theorems_1_0= ruleTheoremBody ) ) )
            {
            // InternalBSharp.g:1646:2: ( ( (lv_functions_0_0= ruleFunctionDecl ) ) | ( (lv_theorems_1_0= ruleTheoremBody ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            else if ( (LA27_0==42) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalBSharp.g:1647:3: ( (lv_functions_0_0= ruleFunctionDecl ) )
                    {
                    // InternalBSharp.g:1647:3: ( (lv_functions_0_0= ruleFunctionDecl ) )
                    // InternalBSharp.g:1648:4: (lv_functions_0_0= ruleFunctionDecl )
                    {
                    // InternalBSharp.g:1648:4: (lv_functions_0_0= ruleFunctionDecl )
                    // InternalBSharp.g:1649:5: lv_functions_0_0= ruleFunctionDecl
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
                    // InternalBSharp.g:1667:3: ( (lv_theorems_1_0= ruleTheoremBody ) )
                    {
                    // InternalBSharp.g:1667:3: ( (lv_theorems_1_0= ruleTheoremBody ) )
                    // InternalBSharp.g:1668:4: (lv_theorems_1_0= ruleTheoremBody )
                    {
                    // InternalBSharp.g:1668:4: (lv_theorems_1_0= ruleTheoremBody )
                    // InternalBSharp.g:1669:5: lv_theorems_1_0= ruleTheoremBody
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
    // InternalBSharp.g:1690:1: entryRuleFunctionDecl returns [EObject current=null] : iv_ruleFunctionDecl= ruleFunctionDecl EOF ;
    public final EObject entryRuleFunctionDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDecl = null;


        try {
            // InternalBSharp.g:1690:53: (iv_ruleFunctionDecl= ruleFunctionDecl EOF )
            // InternalBSharp.g:1691:2: iv_ruleFunctionDecl= ruleFunctionDecl EOF
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
    // InternalBSharp.g:1697:1: ruleFunctionDecl returns [EObject current=null] : ( ( (lv_name_0_0= ruleFunctionName ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_varList_3_0= ruleTypedVariableList ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleTypeConstructor ) ) ( (lv_infix_7_0= 'INFIX' ) )? ( (lv_precedence_8_0= RULE_INT ) )? ( (lv_expr_9_0= ruleRootExpression ) ) ) ;
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
            // InternalBSharp.g:1703:2: ( ( ( (lv_name_0_0= ruleFunctionName ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_varList_3_0= ruleTypedVariableList ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleTypeConstructor ) ) ( (lv_infix_7_0= 'INFIX' ) )? ( (lv_precedence_8_0= RULE_INT ) )? ( (lv_expr_9_0= ruleRootExpression ) ) ) )
            // InternalBSharp.g:1704:2: ( ( (lv_name_0_0= ruleFunctionName ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_varList_3_0= ruleTypedVariableList ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleTypeConstructor ) ) ( (lv_infix_7_0= 'INFIX' ) )? ( (lv_precedence_8_0= RULE_INT ) )? ( (lv_expr_9_0= ruleRootExpression ) ) )
            {
            // InternalBSharp.g:1704:2: ( ( (lv_name_0_0= ruleFunctionName ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_varList_3_0= ruleTypedVariableList ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleTypeConstructor ) ) ( (lv_infix_7_0= 'INFIX' ) )? ( (lv_precedence_8_0= RULE_INT ) )? ( (lv_expr_9_0= ruleRootExpression ) ) )
            // InternalBSharp.g:1705:3: ( (lv_name_0_0= ruleFunctionName ) ) ( (lv_context_1_0= rulePolyContext ) )? otherlv_2= '(' ( (lv_varList_3_0= ruleTypedVariableList ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleTypeConstructor ) ) ( (lv_infix_7_0= 'INFIX' ) )? ( (lv_precedence_8_0= RULE_INT ) )? ( (lv_expr_9_0= ruleRootExpression ) )
            {
            // InternalBSharp.g:1705:3: ( (lv_name_0_0= ruleFunctionName ) )
            // InternalBSharp.g:1706:4: (lv_name_0_0= ruleFunctionName )
            {
            // InternalBSharp.g:1706:4: (lv_name_0_0= ruleFunctionName )
            // InternalBSharp.g:1707:5: lv_name_0_0= ruleFunctionName
            {

            					newCompositeNode(grammarAccess.getFunctionDeclAccess().getNameFunctionNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_28);
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

            // InternalBSharp.g:1724:3: ( (lv_context_1_0= rulePolyContext ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==19) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalBSharp.g:1725:4: (lv_context_1_0= rulePolyContext )
                    {
                    // InternalBSharp.g:1725:4: (lv_context_1_0= rulePolyContext )
                    // InternalBSharp.g:1726:5: lv_context_1_0= rulePolyContext
                    {

                    					newCompositeNode(grammarAccess.getFunctionDeclAccess().getContextPolyContextParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_26);
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

            otherlv_2=(Token)match(input,32,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionDeclAccess().getLeftParenthesisKeyword_2());
            		
            // InternalBSharp.g:1747:3: ( (lv_varList_3_0= ruleTypedVariableList ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalBSharp.g:1748:4: (lv_varList_3_0= ruleTypedVariableList )
                    {
                    // InternalBSharp.g:1748:4: (lv_varList_3_0= ruleTypedVariableList )
                    // InternalBSharp.g:1749:5: lv_varList_3_0= ruleTypedVariableList
                    {

                    					newCompositeNode(grammarAccess.getFunctionDeclAccess().getVarListTypedVariableListParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_18);
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

            otherlv_4=(Token)match(input,33,FOLLOW_30); 

            			newLeafNode(otherlv_4, grammarAccess.getFunctionDeclAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getFunctionDeclAccess().getColonKeyword_5());
            		
            // InternalBSharp.g:1774:3: ( (lv_returnType_6_0= ruleTypeConstructor ) )
            // InternalBSharp.g:1775:4: (lv_returnType_6_0= ruleTypeConstructor )
            {
            // InternalBSharp.g:1775:4: (lv_returnType_6_0= ruleTypeConstructor )
            // InternalBSharp.g:1776:5: lv_returnType_6_0= ruleTypeConstructor
            {

            					newCompositeNode(grammarAccess.getFunctionDeclAccess().getReturnTypeTypeConstructorParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_31);
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

            // InternalBSharp.g:1793:3: ( (lv_infix_7_0= 'INFIX' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==40) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalBSharp.g:1794:4: (lv_infix_7_0= 'INFIX' )
                    {
                    // InternalBSharp.g:1794:4: (lv_infix_7_0= 'INFIX' )
                    // InternalBSharp.g:1795:5: lv_infix_7_0= 'INFIX'
                    {
                    lv_infix_7_0=(Token)match(input,40,FOLLOW_32); 

                    					newLeafNode(lv_infix_7_0, grammarAccess.getFunctionDeclAccess().getInfixINFIXKeyword_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFunctionDeclRule());
                    					}
                    					setWithLastConsumed(current, "infix", lv_infix_7_0, "INFIX");
                    				

                    }


                    }
                    break;

            }

            // InternalBSharp.g:1807:3: ( (lv_precedence_8_0= RULE_INT ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_INT) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalBSharp.g:1808:4: (lv_precedence_8_0= RULE_INT )
                    {
                    // InternalBSharp.g:1808:4: (lv_precedence_8_0= RULE_INT )
                    // InternalBSharp.g:1809:5: lv_precedence_8_0= RULE_INT
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

            // InternalBSharp.g:1825:3: ( (lv_expr_9_0= ruleRootExpression ) )
            // InternalBSharp.g:1826:4: (lv_expr_9_0= ruleRootExpression )
            {
            // InternalBSharp.g:1826:4: (lv_expr_9_0= ruleRootExpression )
            // InternalBSharp.g:1827:5: lv_expr_9_0= ruleRootExpression
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
    // InternalBSharp.g:1848:1: entryRuleFunctionName returns [EObject current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final EObject entryRuleFunctionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionName = null;


        try {
            // InternalBSharp.g:1848:53: (iv_ruleFunctionName= ruleFunctionName EOF )
            // InternalBSharp.g:1849:2: iv_ruleFunctionName= ruleFunctionName EOF
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
    // InternalBSharp.g:1855:1: ruleFunctionName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFunctionName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBSharp.g:1861:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBSharp.g:1862:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBSharp.g:1862:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBSharp.g:1863:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBSharp.g:1863:3: (lv_name_0_0= RULE_ID )
            // InternalBSharp.g:1864:4: lv_name_0_0= RULE_ID
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
    // $ANTLR end "ruleFunctionName"


    // $ANTLR start "entryRuleMatchStatement"
    // InternalBSharp.g:1883:1: entryRuleMatchStatement returns [EObject current=null] : iv_ruleMatchStatement= ruleMatchStatement EOF ;
    public final EObject entryRuleMatchStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchStatement = null;


        try {
            // InternalBSharp.g:1883:55: (iv_ruleMatchStatement= ruleMatchStatement EOF )
            // InternalBSharp.g:1884:2: iv_ruleMatchStatement= ruleMatchStatement EOF
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
    // InternalBSharp.g:1890:1: ruleMatchStatement returns [EObject current=null] : (otherlv_0= 'match' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_inductCase_3_0= ruleMatchCase ) ) ( (lv_inductCase_4_0= ruleMatchCase ) )* otherlv_5= '}' ) ;
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
            // InternalBSharp.g:1896:2: ( (otherlv_0= 'match' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_inductCase_3_0= ruleMatchCase ) ) ( (lv_inductCase_4_0= ruleMatchCase ) )* otherlv_5= '}' ) )
            // InternalBSharp.g:1897:2: (otherlv_0= 'match' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_inductCase_3_0= ruleMatchCase ) ) ( (lv_inductCase_4_0= ruleMatchCase ) )* otherlv_5= '}' )
            {
            // InternalBSharp.g:1897:2: (otherlv_0= 'match' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_inductCase_3_0= ruleMatchCase ) ) ( (lv_inductCase_4_0= ruleMatchCase ) )* otherlv_5= '}' )
            // InternalBSharp.g:1898:3: otherlv_0= 'match' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_inductCase_3_0= ruleMatchCase ) ) ( (lv_inductCase_4_0= ruleMatchCase ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMatchStatementAccess().getMatchKeyword_0());
            		
            // InternalBSharp.g:1902:3: ( (otherlv_1= RULE_ID ) )
            // InternalBSharp.g:1903:4: (otherlv_1= RULE_ID )
            {
            // InternalBSharp.g:1903:4: (otherlv_1= RULE_ID )
            // InternalBSharp.g:1904:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMatchStatementRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(otherlv_1, grammarAccess.getMatchStatementAccess().getMatchDatatypeConstructorCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getMatchStatementAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBSharp.g:1919:3: ( (lv_inductCase_3_0= ruleMatchCase ) )
            // InternalBSharp.g:1920:4: (lv_inductCase_3_0= ruleMatchCase )
            {
            // InternalBSharp.g:1920:4: (lv_inductCase_3_0= ruleMatchCase )
            // InternalBSharp.g:1921:5: lv_inductCase_3_0= ruleMatchCase
            {

            					newCompositeNode(grammarAccess.getMatchStatementAccess().getInductCaseMatchCaseParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_34);
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

            // InternalBSharp.g:1938:3: ( (lv_inductCase_4_0= ruleMatchCase ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==36) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalBSharp.g:1939:4: (lv_inductCase_4_0= ruleMatchCase )
            	    {
            	    // InternalBSharp.g:1939:4: (lv_inductCase_4_0= ruleMatchCase )
            	    // InternalBSharp.g:1940:5: lv_inductCase_4_0= ruleMatchCase
            	    {

            	    					newCompositeNode(grammarAccess.getMatchStatementAccess().getInductCaseMatchCaseParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_34);
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
            	    break loop32;
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
    // InternalBSharp.g:1965:1: entryRuleMatchCase returns [EObject current=null] : iv_ruleMatchCase= ruleMatchCase EOF ;
    public final EObject entryRuleMatchCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchCase = null;


        try {
            // InternalBSharp.g:1965:50: (iv_ruleMatchCase= ruleMatchCase EOF )
            // InternalBSharp.g:1966:2: iv_ruleMatchCase= ruleMatchCase EOF
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
    // InternalBSharp.g:1972:1: ruleMatchCase returns [EObject current=null] : (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleRootExpression ) ) ) ;
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
            // InternalBSharp.g:1978:2: ( (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleRootExpression ) ) ) )
            // InternalBSharp.g:1979:2: (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleRootExpression ) ) )
            {
            // InternalBSharp.g:1979:2: (otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleRootExpression ) ) )
            // InternalBSharp.g:1980:3: otherlv_0= '|' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )? otherlv_7= ':' ( (lv_expr_8_0= ruleRootExpression ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMatchCaseAccess().getVerticalLineKeyword_0());
            		
            // InternalBSharp.g:1984:3: ( (otherlv_1= RULE_ID ) )
            // InternalBSharp.g:1985:4: (otherlv_1= RULE_ID )
            {
            // InternalBSharp.g:1985:4: (otherlv_1= RULE_ID )
            // InternalBSharp.g:1986:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMatchCaseRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(otherlv_1, grammarAccess.getMatchCaseAccess().getDeconNameTypedVariableCrossReference_1_0());
            				

            }


            }

            // InternalBSharp.g:1997:3: (otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==32) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalBSharp.g:1998:4: otherlv_2= '(' ( (lv_variables_3_0= ruleTypedVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getMatchCaseAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalBSharp.g:2002:4: ( (lv_variables_3_0= ruleTypedVariable ) )
                    // InternalBSharp.g:2003:5: (lv_variables_3_0= ruleTypedVariable )
                    {
                    // InternalBSharp.g:2003:5: (lv_variables_3_0= ruleTypedVariable )
                    // InternalBSharp.g:2004:6: lv_variables_3_0= ruleTypedVariable
                    {

                    						newCompositeNode(grammarAccess.getMatchCaseAccess().getVariablesTypedVariableParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_36);
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

                    // InternalBSharp.g:2021:4: (otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==21) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalBSharp.g:2022:5: otherlv_4= ',' ( (lv_variables_5_0= ruleTypedVariable ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMatchCaseAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalBSharp.g:2026:5: ( (lv_variables_5_0= ruleTypedVariable ) )
                    	    // InternalBSharp.g:2027:6: (lv_variables_5_0= ruleTypedVariable )
                    	    {
                    	    // InternalBSharp.g:2027:6: (lv_variables_5_0= ruleTypedVariable )
                    	    // InternalBSharp.g:2028:7: lv_variables_5_0= ruleTypedVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getMatchCaseAccess().getVariablesTypedVariableParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
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
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,33,FOLLOW_30); 

                    				newLeafNode(otherlv_6, grammarAccess.getMatchCaseAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_7, grammarAccess.getMatchCaseAccess().getColonKeyword_3());
            		
            // InternalBSharp.g:2055:3: ( (lv_expr_8_0= ruleRootExpression ) )
            // InternalBSharp.g:2056:4: (lv_expr_8_0= ruleRootExpression )
            {
            // InternalBSharp.g:2056:4: (lv_expr_8_0= ruleRootExpression )
            // InternalBSharp.g:2057:5: lv_expr_8_0= ruleRootExpression
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
    // InternalBSharp.g:2078:1: entryRuleTheoremBody returns [EObject current=null] : iv_ruleTheoremBody= ruleTheoremBody EOF ;
    public final EObject entryRuleTheoremBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheoremBody = null;


        try {
            // InternalBSharp.g:2078:52: (iv_ruleTheoremBody= ruleTheoremBody EOF )
            // InternalBSharp.g:2079:2: iv_ruleTheoremBody= ruleTheoremBody EOF
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
    // InternalBSharp.g:2085:1: ruleTheoremBody returns [EObject current=null] : (otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}' ) ;
    public final EObject ruleTheoremBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_theoremDecl_2_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2091:2: ( (otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}' ) )
            // InternalBSharp.g:2092:2: (otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}' )
            {
            // InternalBSharp.g:2092:2: (otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}' )
            // InternalBSharp.g:2093:3: otherlv_0= 'Theorems' otherlv_1= '{' ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getTheoremBodyAccess().getTheoremsKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTheoremBodyAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBSharp.g:2101:3: ( (lv_theoremDecl_2_0= ruleTheoremDecl ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=RULE_INT && LA35_0<=RULE_WS)||LA35_0==12) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalBSharp.g:2102:4: (lv_theoremDecl_2_0= ruleTheoremDecl )
            	    {
            	    // InternalBSharp.g:2102:4: (lv_theoremDecl_2_0= ruleTheoremDecl )
            	    // InternalBSharp.g:2103:5: lv_theoremDecl_2_0= ruleTheoremDecl
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
            	    						"ac.soton.bsharp.BSharp.TheoremDecl");
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
    // InternalBSharp.g:2128:1: entryRuleTheoremDecl returns [EObject current=null] : iv_ruleTheoremDecl= ruleTheoremDecl EOF ;
    public final EObject entryRuleTheoremDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheoremDecl = null;


        try {
            // InternalBSharp.g:2128:52: (iv_ruleTheoremDecl= ruleTheoremDecl EOF )
            // InternalBSharp.g:2129:2: iv_ruleTheoremDecl= ruleTheoremDecl EOF
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
    // InternalBSharp.g:2135:1: ruleTheoremDecl returns [EObject current=null] : ( ( (lv_name_0_0= ruleTHM_NAME ) ) ( (lv_expr_1_0= ruleRootExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleTheoremDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2141:2: ( ( ( (lv_name_0_0= ruleTHM_NAME ) ) ( (lv_expr_1_0= ruleRootExpression ) ) otherlv_2= ';' ) )
            // InternalBSharp.g:2142:2: ( ( (lv_name_0_0= ruleTHM_NAME ) ) ( (lv_expr_1_0= ruleRootExpression ) ) otherlv_2= ';' )
            {
            // InternalBSharp.g:2142:2: ( ( (lv_name_0_0= ruleTHM_NAME ) ) ( (lv_expr_1_0= ruleRootExpression ) ) otherlv_2= ';' )
            // InternalBSharp.g:2143:3: ( (lv_name_0_0= ruleTHM_NAME ) ) ( (lv_expr_1_0= ruleRootExpression ) ) otherlv_2= ';'
            {
            // InternalBSharp.g:2143:3: ( (lv_name_0_0= ruleTHM_NAME ) )
            // InternalBSharp.g:2144:4: (lv_name_0_0= ruleTHM_NAME )
            {
            // InternalBSharp.g:2144:4: (lv_name_0_0= ruleTHM_NAME )
            // InternalBSharp.g:2145:5: lv_name_0_0= ruleTHM_NAME
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

            // InternalBSharp.g:2162:3: ( (lv_expr_1_0= ruleRootExpression ) )
            // InternalBSharp.g:2163:4: (lv_expr_1_0= ruleRootExpression )
            {
            // InternalBSharp.g:2163:4: (lv_expr_1_0= ruleRootExpression )
            // InternalBSharp.g:2164:5: lv_expr_1_0= ruleRootExpression
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
    // InternalBSharp.g:2189:1: entryRuleTypedVariableList returns [EObject current=null] : iv_ruleTypedVariableList= ruleTypedVariableList EOF ;
    public final EObject entryRuleTypedVariableList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedVariableList = null;


        try {
            // InternalBSharp.g:2189:58: (iv_ruleTypedVariableList= ruleTypedVariableList EOF )
            // InternalBSharp.g:2190:2: iv_ruleTypedVariableList= ruleTypedVariableList EOF
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
    // InternalBSharp.g:2196:1: ruleTypedVariableList returns [EObject current=null] : ( ( (lv_variablesOfType_0_0= ruleVariableTyping ) ) (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )* ) ;
    public final EObject ruleTypedVariableList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variablesOfType_0_0 = null;

        EObject lv_variablesOfType_2_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2202:2: ( ( ( (lv_variablesOfType_0_0= ruleVariableTyping ) ) (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )* ) )
            // InternalBSharp.g:2203:2: ( ( (lv_variablesOfType_0_0= ruleVariableTyping ) ) (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )* )
            {
            // InternalBSharp.g:2203:2: ( ( (lv_variablesOfType_0_0= ruleVariableTyping ) ) (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )* )
            // InternalBSharp.g:2204:3: ( (lv_variablesOfType_0_0= ruleVariableTyping ) ) (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )*
            {
            // InternalBSharp.g:2204:3: ( (lv_variablesOfType_0_0= ruleVariableTyping ) )
            // InternalBSharp.g:2205:4: (lv_variablesOfType_0_0= ruleVariableTyping )
            {
            // InternalBSharp.g:2205:4: (lv_variablesOfType_0_0= ruleVariableTyping )
            // InternalBSharp.g:2206:5: lv_variablesOfType_0_0= ruleVariableTyping
            {

            					newCompositeNode(grammarAccess.getTypedVariableListAccess().getVariablesOfTypeVariableTypingParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalBSharp.g:2223:3: (otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==21) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalBSharp.g:2224:4: otherlv_1= ',' ( (lv_variablesOfType_2_0= ruleVariableTyping ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getTypedVariableListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalBSharp.g:2228:4: ( (lv_variablesOfType_2_0= ruleVariableTyping ) )
            	    // InternalBSharp.g:2229:5: (lv_variablesOfType_2_0= ruleVariableTyping )
            	    {
            	    // InternalBSharp.g:2229:5: (lv_variablesOfType_2_0= ruleVariableTyping )
            	    // InternalBSharp.g:2230:6: lv_variablesOfType_2_0= ruleVariableTyping
            	    {

            	    						newCompositeNode(grammarAccess.getTypedVariableListAccess().getVariablesOfTypeVariableTypingParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
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
    // InternalBSharp.g:2252:1: entryRuleVariableTyping returns [EObject current=null] : iv_ruleVariableTyping= ruleVariableTyping EOF ;
    public final EObject entryRuleVariableTyping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableTyping = null;


        try {
            // InternalBSharp.g:2252:55: (iv_ruleVariableTyping= ruleVariableTyping EOF )
            // InternalBSharp.g:2253:2: iv_ruleVariableTyping= ruleVariableTyping EOF
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
    // InternalBSharp.g:2259:1: ruleVariableTyping returns [EObject current=null] : ( ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleConstructedType ) ) ) ;
    public final EObject ruleVariableTyping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeVar_0_0 = null;

        EObject lv_typeVar_2_0 = null;

        EObject lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2265:2: ( ( ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleConstructedType ) ) ) )
            // InternalBSharp.g:2266:2: ( ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleConstructedType ) ) )
            {
            // InternalBSharp.g:2266:2: ( ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleConstructedType ) ) )
            // InternalBSharp.g:2267:3: ( (lv_typeVar_0_0= ruleTypedVariable ) ) (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )* otherlv_3= ':' ( (lv_type_4_0= ruleConstructedType ) )
            {
            // InternalBSharp.g:2267:3: ( (lv_typeVar_0_0= ruleTypedVariable ) )
            // InternalBSharp.g:2268:4: (lv_typeVar_0_0= ruleTypedVariable )
            {
            // InternalBSharp.g:2268:4: (lv_typeVar_0_0= ruleTypedVariable )
            // InternalBSharp.g:2269:5: lv_typeVar_0_0= ruleTypedVariable
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
            						"ac.soton.bsharp.BSharp.TypedVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBSharp.g:2286:3: (otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==21) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalBSharp.g:2287:4: otherlv_1= ',' ( (lv_typeVar_2_0= ruleTypedVariable ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getVariableTypingAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalBSharp.g:2291:4: ( (lv_typeVar_2_0= ruleTypedVariable ) )
            	    // InternalBSharp.g:2292:5: (lv_typeVar_2_0= ruleTypedVariable )
            	    {
            	    // InternalBSharp.g:2292:5: (lv_typeVar_2_0= ruleTypedVariable )
            	    // InternalBSharp.g:2293:6: lv_typeVar_2_0= ruleTypedVariable
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

            otherlv_3=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableTypingAccess().getColonKeyword_2());
            		
            // InternalBSharp.g:2315:3: ( (lv_type_4_0= ruleConstructedType ) )
            // InternalBSharp.g:2316:4: (lv_type_4_0= ruleConstructedType )
            {
            // InternalBSharp.g:2316:4: (lv_type_4_0= ruleConstructedType )
            // InternalBSharp.g:2317:5: lv_type_4_0= ruleConstructedType
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
    // InternalBSharp.g:2338:1: entryRuleTypedVariable returns [EObject current=null] : iv_ruleTypedVariable= ruleTypedVariable EOF ;
    public final EObject entryRuleTypedVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedVariable = null;


        try {
            // InternalBSharp.g:2338:54: (iv_ruleTypedVariable= ruleTypedVariable EOF )
            // InternalBSharp.g:2339:2: iv_ruleTypedVariable= ruleTypedVariable EOF
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
    // InternalBSharp.g:2345:1: ruleTypedVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleTypedVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBSharp.g:2351:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBSharp.g:2352:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBSharp.g:2352:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBSharp.g:2353:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBSharp.g:2353:3: (lv_name_0_0= RULE_ID )
            // InternalBSharp.g:2354:4: lv_name_0_0= RULE_ID
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
    // InternalBSharp.g:2373:1: entryRuleLambda returns [EObject current=null] : iv_ruleLambda= ruleLambda EOF ;
    public final EObject entryRuleLambda() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLambda = null;


        try {
            // InternalBSharp.g:2373:47: (iv_ruleLambda= ruleLambda EOF )
            // InternalBSharp.g:2374:2: iv_ruleLambda= ruleLambda EOF
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
    // InternalBSharp.g:2380:1: ruleLambda returns [EObject current=null] : ( ( (lv_qType_0_0= '\\u03BB' ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '|' ( (lv_expr_4_0= ruleRootExpression ) ) ) ;
    public final EObject ruleLambda() throws RecognitionException {
        EObject current = null;

        Token lv_qType_0_0=null;
        Token otherlv_3=null;
        EObject lv_context_1_0 = null;

        EObject lv_varList_2_0 = null;

        EObject lv_expr_4_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2386:2: ( ( ( (lv_qType_0_0= '\\u03BB' ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '|' ( (lv_expr_4_0= ruleRootExpression ) ) ) )
            // InternalBSharp.g:2387:2: ( ( (lv_qType_0_0= '\\u03BB' ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '|' ( (lv_expr_4_0= ruleRootExpression ) ) )
            {
            // InternalBSharp.g:2387:2: ( ( (lv_qType_0_0= '\\u03BB' ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '|' ( (lv_expr_4_0= ruleRootExpression ) ) )
            // InternalBSharp.g:2388:3: ( (lv_qType_0_0= '\\u03BB' ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '|' ( (lv_expr_4_0= ruleRootExpression ) )
            {
            // InternalBSharp.g:2388:3: ( (lv_qType_0_0= '\\u03BB' ) )
            // InternalBSharp.g:2389:4: (lv_qType_0_0= '\\u03BB' )
            {
            // InternalBSharp.g:2389:4: (lv_qType_0_0= '\\u03BB' )
            // InternalBSharp.g:2390:5: lv_qType_0_0= '\\u03BB'
            {
            lv_qType_0_0=(Token)match(input,43,FOLLOW_40); 

            					newLeafNode(lv_qType_0_0, grammarAccess.getLambdaAccess().getQTypeGreekSmallLetterLamdaKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLambdaRule());
            					}
            					setWithLastConsumed(current, "qType", lv_qType_0_0, "\u03BB");
            				

            }


            }

            // InternalBSharp.g:2402:3: ( (lv_context_1_0= rulePolyContext ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==19) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalBSharp.g:2403:4: (lv_context_1_0= rulePolyContext )
                    {
                    // InternalBSharp.g:2403:4: (lv_context_1_0= rulePolyContext )
                    // InternalBSharp.g:2404:5: lv_context_1_0= rulePolyContext
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

            // InternalBSharp.g:2421:3: ( (lv_varList_2_0= ruleTypedVariableList ) )
            // InternalBSharp.g:2422:4: (lv_varList_2_0= ruleTypedVariableList )
            {
            // InternalBSharp.g:2422:4: (lv_varList_2_0= ruleTypedVariableList )
            // InternalBSharp.g:2423:5: lv_varList_2_0= ruleTypedVariableList
            {

            					newCompositeNode(grammarAccess.getLambdaAccess().getVarListTypedVariableListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
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
            		
            // InternalBSharp.g:2444:3: ( (lv_expr_4_0= ruleRootExpression ) )
            // InternalBSharp.g:2445:4: (lv_expr_4_0= ruleRootExpression )
            {
            // InternalBSharp.g:2445:4: (lv_expr_4_0= ruleRootExpression )
            // InternalBSharp.g:2446:5: lv_expr_4_0= ruleRootExpression
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
    // InternalBSharp.g:2467:1: entryRuleQuantifier returns [EObject current=null] : iv_ruleQuantifier= ruleQuantifier EOF ;
    public final EObject entryRuleQuantifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantifier = null;


        try {
            // InternalBSharp.g:2467:51: (iv_ruleQuantifier= ruleQuantifier EOF )
            // InternalBSharp.g:2468:2: iv_ruleQuantifier= ruleQuantifier EOF
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
    // InternalBSharp.g:2474:1: ruleQuantifier returns [EObject current=null] : ( ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '\\u00B7' ( (lv_expr_4_0= ruleRootExpression ) ) ) ;
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
            // InternalBSharp.g:2480:2: ( ( ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '\\u00B7' ( (lv_expr_4_0= ruleRootExpression ) ) ) )
            // InternalBSharp.g:2481:2: ( ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '\\u00B7' ( (lv_expr_4_0= ruleRootExpression ) ) )
            {
            // InternalBSharp.g:2481:2: ( ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '\\u00B7' ( (lv_expr_4_0= ruleRootExpression ) ) )
            // InternalBSharp.g:2482:3: ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) ) ( (lv_context_1_0= rulePolyContext ) )? ( (lv_varList_2_0= ruleTypedVariableList ) ) otherlv_3= '\\u00B7' ( (lv_expr_4_0= ruleRootExpression ) )
            {
            // InternalBSharp.g:2482:3: ( ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) ) )
            // InternalBSharp.g:2483:4: ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) )
            {
            // InternalBSharp.g:2483:4: ( (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' ) )
            // InternalBSharp.g:2484:5: (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' )
            {
            // InternalBSharp.g:2484:5: (lv_qType_0_1= '\\u2200' | lv_qType_0_2= '\\u2203' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==44) ) {
                alt39=1;
            }
            else if ( (LA39_0==45) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalBSharp.g:2485:6: lv_qType_0_1= '\\u2200'
                    {
                    lv_qType_0_1=(Token)match(input,44,FOLLOW_40); 

                    						newLeafNode(lv_qType_0_1, grammarAccess.getQuantifierAccess().getQTypeForAllKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQuantifierRule());
                    						}
                    						setWithLastConsumed(current, "qType", lv_qType_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalBSharp.g:2496:6: lv_qType_0_2= '\\u2203'
                    {
                    lv_qType_0_2=(Token)match(input,45,FOLLOW_40); 

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

            // InternalBSharp.g:2509:3: ( (lv_context_1_0= rulePolyContext ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==19) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBSharp.g:2510:4: (lv_context_1_0= rulePolyContext )
                    {
                    // InternalBSharp.g:2510:4: (lv_context_1_0= rulePolyContext )
                    // InternalBSharp.g:2511:5: lv_context_1_0= rulePolyContext
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

            // InternalBSharp.g:2528:3: ( (lv_varList_2_0= ruleTypedVariableList ) )
            // InternalBSharp.g:2529:4: (lv_varList_2_0= ruleTypedVariableList )
            {
            // InternalBSharp.g:2529:4: (lv_varList_2_0= ruleTypedVariableList )
            // InternalBSharp.g:2530:5: lv_varList_2_0= ruleTypedVariableList
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
            						"ac.soton.bsharp.BSharp.TypedVariableList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,46,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getQuantifierAccess().getMiddleDotKeyword_3());
            		
            // InternalBSharp.g:2551:3: ( (lv_expr_4_0= ruleRootExpression ) )
            // InternalBSharp.g:2552:4: (lv_expr_4_0= ruleRootExpression )
            {
            // InternalBSharp.g:2552:4: (lv_expr_4_0= ruleRootExpression )
            // InternalBSharp.g:2553:5: lv_expr_4_0= ruleRootExpression
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
    // InternalBSharp.g:2574:1: entryRuleRootExpression returns [EObject current=null] : iv_ruleRootExpression= ruleRootExpression EOF ;
    public final EObject entryRuleRootExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootExpression = null;


        try {
            // InternalBSharp.g:2574:55: (iv_ruleRootExpression= ruleRootExpression EOF )
            // InternalBSharp.g:2575:2: iv_ruleRootExpression= ruleRootExpression EOF
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
    // InternalBSharp.g:2581:1: ruleRootExpression returns [EObject current=null] : (this_Lambda_0= ruleLambda | this_Quantifier_1= ruleQuantifier | this_Infix_2= ruleInfix | this_MatchStatement_3= ruleMatchStatement ) ;
    public final EObject ruleRootExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Lambda_0 = null;

        EObject this_Quantifier_1 = null;

        EObject this_Infix_2 = null;

        EObject this_MatchStatement_3 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2587:2: ( (this_Lambda_0= ruleLambda | this_Quantifier_1= ruleQuantifier | this_Infix_2= ruleInfix | this_MatchStatement_3= ruleMatchStatement ) )
            // InternalBSharp.g:2588:2: (this_Lambda_0= ruleLambda | this_Quantifier_1= ruleQuantifier | this_Infix_2= ruleInfix | this_MatchStatement_3= ruleMatchStatement )
            {
            // InternalBSharp.g:2588:2: (this_Lambda_0= ruleLambda | this_Quantifier_1= ruleQuantifier | this_Infix_2= ruleInfix | this_MatchStatement_3= ruleMatchStatement )
            int alt41=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt41=1;
                }
                break;
            case 44:
            case 45:
                {
                alt41=2;
                }
                break;
            case RULE_ID:
            case 32:
            case 47:
                {
                alt41=3;
                }
                break;
            case 41:
                {
                alt41=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalBSharp.g:2589:3: this_Lambda_0= ruleLambda
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
                    // InternalBSharp.g:2598:3: this_Quantifier_1= ruleQuantifier
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
                    // InternalBSharp.g:2607:3: this_Infix_2= ruleInfix
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
                    // InternalBSharp.g:2616:3: this_MatchStatement_3= ruleMatchStatement
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
    // InternalBSharp.g:2628:1: entryRulePrefix returns [EObject current=null] : iv_rulePrefix= rulePrefix EOF ;
    public final EObject entryRulePrefix() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefix = null;


        try {
            // InternalBSharp.g:2628:47: (iv_rulePrefix= rulePrefix EOF )
            // InternalBSharp.g:2629:2: iv_rulePrefix= rulePrefix EOF
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
    // InternalBSharp.g:2635:1: rulePrefix returns [EObject current=null] : ( ( (lv_name_0_0= rulePrefixBuiltIn ) ) ( (lv_elem_1_0= ruleElement ) ) ) ;
    public final EObject rulePrefix() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_elem_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2641:2: ( ( ( (lv_name_0_0= rulePrefixBuiltIn ) ) ( (lv_elem_1_0= ruleElement ) ) ) )
            // InternalBSharp.g:2642:2: ( ( (lv_name_0_0= rulePrefixBuiltIn ) ) ( (lv_elem_1_0= ruleElement ) ) )
            {
            // InternalBSharp.g:2642:2: ( ( (lv_name_0_0= rulePrefixBuiltIn ) ) ( (lv_elem_1_0= ruleElement ) ) )
            // InternalBSharp.g:2643:3: ( (lv_name_0_0= rulePrefixBuiltIn ) ) ( (lv_elem_1_0= ruleElement ) )
            {
            // InternalBSharp.g:2643:3: ( (lv_name_0_0= rulePrefixBuiltIn ) )
            // InternalBSharp.g:2644:4: (lv_name_0_0= rulePrefixBuiltIn )
            {
            // InternalBSharp.g:2644:4: (lv_name_0_0= rulePrefixBuiltIn )
            // InternalBSharp.g:2645:5: lv_name_0_0= rulePrefixBuiltIn
            {

            					newCompositeNode(grammarAccess.getPrefixAccess().getNamePrefixBuiltInParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_42);
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

            // InternalBSharp.g:2662:3: ( (lv_elem_1_0= ruleElement ) )
            // InternalBSharp.g:2663:4: (lv_elem_1_0= ruleElement )
            {
            // InternalBSharp.g:2663:4: (lv_elem_1_0= ruleElement )
            // InternalBSharp.g:2664:5: lv_elem_1_0= ruleElement
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
    // InternalBSharp.g:2685:1: entryRulePrefixBuiltIn returns [String current=null] : iv_rulePrefixBuiltIn= rulePrefixBuiltIn EOF ;
    public final String entryRulePrefixBuiltIn() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrefixBuiltIn = null;


        try {
            // InternalBSharp.g:2685:53: (iv_rulePrefixBuiltIn= rulePrefixBuiltIn EOF )
            // InternalBSharp.g:2686:2: iv_rulePrefixBuiltIn= rulePrefixBuiltIn EOF
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
    // InternalBSharp.g:2692:1: rulePrefixBuiltIn returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '\\u00AC' ;
    public final AntlrDatatypeRuleToken rulePrefixBuiltIn() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBSharp.g:2698:2: (kw= '\\u00AC' )
            // InternalBSharp.g:2699:2: kw= '\\u00AC'
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
    // InternalBSharp.g:2707:1: entryRuleInfix returns [EObject current=null] : iv_ruleInfix= ruleInfix EOF ;
    public final EObject entryRuleInfix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfix = null;


        try {
            // InternalBSharp.g:2707:46: (iv_ruleInfix= ruleInfix EOF )
            // InternalBSharp.g:2708:2: iv_ruleInfix= ruleInfix EOF
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
    // InternalBSharp.g:2714:1: ruleInfix returns [EObject current=null] : (this_Element_0= ruleElement ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )* ) ;
    public final EObject ruleInfix() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Element_0 = null;

        AntlrDatatypeRuleToken lv_opName_3_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2720:2: ( (this_Element_0= ruleElement ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )* ) )
            // InternalBSharp.g:2721:2: (this_Element_0= ruleElement ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )* )
            {
            // InternalBSharp.g:2721:2: (this_Element_0= ruleElement ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )* )
            // InternalBSharp.g:2722:3: this_Element_0= ruleElement ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )*
            {

            			newCompositeNode(grammarAccess.getInfixAccess().getElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_43);
            this_Element_0=ruleElement();

            state._fsp--;


            			current = this_Element_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalBSharp.g:2730:3: ( () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID) ) {
                    int LA43_2 = input.LA(2);

                    if ( (LA43_2==32) ) {
                        int LA43_4 = input.LA(3);

                        if ( (LA43_4==32||LA43_4==41||(LA43_4>=43 && LA43_4<=45)||LA43_4==47) ) {
                            alt43=1;
                        }
                        else if ( (LA43_4==RULE_ID) ) {
                            int LA43_5 = input.LA(4);

                            if ( (LA43_5==RULE_ID||LA43_5==13||(LA43_5>=32 && LA43_5<=33)||(LA43_5>=48 && LA43_5<=53)) ) {
                                alt43=1;
                            }


                        }


                    }
                    else if ( (LA43_2==RULE_ID||LA43_2==47) ) {
                        alt43=1;
                    }


                }
                else if ( ((LA43_0>=48 && LA43_0<=53)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalBSharp.g:2731:4: () ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) ) ( (lv_right_4_0= ruleElement ) )
            	    {
            	    // InternalBSharp.g:2731:4: ()
            	    // InternalBSharp.g:2732:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getInfixAccess().getInfixLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalBSharp.g:2738:4: ( ( (otherlv_2= RULE_ID ) ) | ( (lv_opName_3_0= ruleInbuiltInfix ) ) )
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==RULE_ID) ) {
            	        alt42=1;
            	    }
            	    else if ( ((LA42_0>=48 && LA42_0<=53)) ) {
            	        alt42=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 42, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // InternalBSharp.g:2739:5: ( (otherlv_2= RULE_ID ) )
            	            {
            	            // InternalBSharp.g:2739:5: ( (otherlv_2= RULE_ID ) )
            	            // InternalBSharp.g:2740:6: (otherlv_2= RULE_ID )
            	            {
            	            // InternalBSharp.g:2740:6: (otherlv_2= RULE_ID )
            	            // InternalBSharp.g:2741:7: otherlv_2= RULE_ID
            	            {

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getInfixRule());
            	            							}
            	            						
            	            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_42); 

            	            							newLeafNode(otherlv_2, grammarAccess.getInfixAccess().getFuncNameFunctionNameCrossReference_1_1_0_0());
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalBSharp.g:2753:5: ( (lv_opName_3_0= ruleInbuiltInfix ) )
            	            {
            	            // InternalBSharp.g:2753:5: ( (lv_opName_3_0= ruleInbuiltInfix ) )
            	            // InternalBSharp.g:2754:6: (lv_opName_3_0= ruleInbuiltInfix )
            	            {
            	            // InternalBSharp.g:2754:6: (lv_opName_3_0= ruleInbuiltInfix )
            	            // InternalBSharp.g:2755:7: lv_opName_3_0= ruleInbuiltInfix
            	            {

            	            							newCompositeNode(grammarAccess.getInfixAccess().getOpNameInbuiltInfixParserRuleCall_1_1_1_0());
            	            						
            	            pushFollow(FOLLOW_42);
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

            	    // InternalBSharp.g:2773:4: ( (lv_right_4_0= ruleElement ) )
            	    // InternalBSharp.g:2774:5: (lv_right_4_0= ruleElement )
            	    {
            	    // InternalBSharp.g:2774:5: (lv_right_4_0= ruleElement )
            	    // InternalBSharp.g:2775:6: lv_right_4_0= ruleElement
            	    {

            	    						newCompositeNode(grammarAccess.getInfixAccess().getRightElementParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_43);
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
    // InternalBSharp.g:2797:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalBSharp.g:2797:48: (iv_ruleElement= ruleElement EOF )
            // InternalBSharp.g:2798:2: iv_ruleElement= ruleElement EOF
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
    // InternalBSharp.g:2804:1: ruleElement returns [EObject current=null] : (this_Bracket_0= ruleBracket | this_Prefix_1= rulePrefix | this_FunctionCall_2= ruleFunctionCall ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Bracket_0 = null;

        EObject this_Prefix_1 = null;

        EObject this_FunctionCall_2 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2810:2: ( (this_Bracket_0= ruleBracket | this_Prefix_1= rulePrefix | this_FunctionCall_2= ruleFunctionCall ) )
            // InternalBSharp.g:2811:2: (this_Bracket_0= ruleBracket | this_Prefix_1= rulePrefix | this_FunctionCall_2= ruleFunctionCall )
            {
            // InternalBSharp.g:2811:2: (this_Bracket_0= ruleBracket | this_Prefix_1= rulePrefix | this_FunctionCall_2= ruleFunctionCall )
            int alt44=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt44=1;
                }
                break;
            case 47:
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
                    // InternalBSharp.g:2812:3: this_Bracket_0= ruleBracket
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
                    // InternalBSharp.g:2821:3: this_Prefix_1= rulePrefix
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
                    // InternalBSharp.g:2830:3: this_FunctionCall_2= ruleFunctionCall
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
    // InternalBSharp.g:2842:1: entryRuleBracket returns [EObject current=null] : iv_ruleBracket= ruleBracket EOF ;
    public final EObject entryRuleBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBracket = null;


        try {
            // InternalBSharp.g:2842:48: (iv_ruleBracket= ruleBracket EOF )
            // InternalBSharp.g:2843:2: iv_ruleBracket= ruleBracket EOF
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
    // InternalBSharp.g:2849:1: ruleBracket returns [EObject current=null] : (otherlv_0= '(' ( (lv_child_1_0= ruleRootExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_child_1_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2855:2: ( (otherlv_0= '(' ( (lv_child_1_0= ruleRootExpression ) ) otherlv_2= ')' ) )
            // InternalBSharp.g:2856:2: (otherlv_0= '(' ( (lv_child_1_0= ruleRootExpression ) ) otherlv_2= ')' )
            {
            // InternalBSharp.g:2856:2: (otherlv_0= '(' ( (lv_child_1_0= ruleRootExpression ) ) otherlv_2= ')' )
            // InternalBSharp.g:2857:3: otherlv_0= '(' ( (lv_child_1_0= ruleRootExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getBracketAccess().getLeftParenthesisKeyword_0());
            		
            // InternalBSharp.g:2861:3: ( (lv_child_1_0= ruleRootExpression ) )
            // InternalBSharp.g:2862:4: (lv_child_1_0= ruleRootExpression )
            {
            // InternalBSharp.g:2862:4: (lv_child_1_0= ruleRootExpression )
            // InternalBSharp.g:2863:5: lv_child_1_0= ruleRootExpression
            {

            					newCompositeNode(grammarAccess.getBracketAccess().getChildRootExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
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
    // InternalBSharp.g:2888:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalBSharp.g:2888:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalBSharp.g:2889:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalBSharp.g:2895:1: ruleFunctionCall returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_classVarDecl_1_0= ruleClassVarDecl ) ) ) (otherlv_2= '(' ( (lv_arguments_3_0= ruleRootExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleRootExpression ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_classVarDecl_1_0 = null;

        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;



        	enterRule();

        try {
            // InternalBSharp.g:2901:2: ( ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_classVarDecl_1_0= ruleClassVarDecl ) ) ) (otherlv_2= '(' ( (lv_arguments_3_0= ruleRootExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleRootExpression ) ) )* otherlv_6= ')' )? ) )
            // InternalBSharp.g:2902:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_classVarDecl_1_0= ruleClassVarDecl ) ) ) (otherlv_2= '(' ( (lv_arguments_3_0= ruleRootExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleRootExpression ) ) )* otherlv_6= ')' )? )
            {
            // InternalBSharp.g:2902:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_classVarDecl_1_0= ruleClassVarDecl ) ) ) (otherlv_2= '(' ( (lv_arguments_3_0= ruleRootExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleRootExpression ) ) )* otherlv_6= ')' )? )
            // InternalBSharp.g:2903:3: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_classVarDecl_1_0= ruleClassVarDecl ) ) ) (otherlv_2= '(' ( (lv_arguments_3_0= ruleRootExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleRootExpression ) ) )* otherlv_6= ')' )?
            {
            // InternalBSharp.g:2903:3: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_classVarDecl_1_0= ruleClassVarDecl ) ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==EOF||LA45_1==RULE_ID||LA45_1==18||LA45_1==21||(LA45_1>=32 && LA45_1<=33)||LA45_1==36||(LA45_1>=38 && LA45_1<=39)||LA45_1==42||(LA45_1>=48 && LA45_1<=53)) ) {
                    alt45=1;
                }
                else if ( (LA45_1==13) ) {
                    alt45=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalBSharp.g:2904:4: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalBSharp.g:2904:4: ( (otherlv_0= RULE_ID ) )
                    // InternalBSharp.g:2905:5: (otherlv_0= RULE_ID )
                    {
                    // InternalBSharp.g:2905:5: (otherlv_0= RULE_ID )
                    // InternalBSharp.g:2906:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunctionCallRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    						newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getTypeInstExpressionVariableCrossReference_0_0_0());
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBSharp.g:2918:4: ( (lv_classVarDecl_1_0= ruleClassVarDecl ) )
                    {
                    // InternalBSharp.g:2918:4: ( (lv_classVarDecl_1_0= ruleClassVarDecl ) )
                    // InternalBSharp.g:2919:5: (lv_classVarDecl_1_0= ruleClassVarDecl )
                    {
                    // InternalBSharp.g:2919:5: (lv_classVarDecl_1_0= ruleClassVarDecl )
                    // InternalBSharp.g:2920:6: lv_classVarDecl_1_0= ruleClassVarDecl
                    {

                    						newCompositeNode(grammarAccess.getFunctionCallAccess().getClassVarDeclClassVarDeclParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_25);
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

            // InternalBSharp.g:2938:3: (otherlv_2= '(' ( (lv_arguments_3_0= ruleRootExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleRootExpression ) ) )* otherlv_6= ')' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==32) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalBSharp.g:2939:4: otherlv_2= '(' ( (lv_arguments_3_0= ruleRootExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleRootExpression ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_44); 

                    				newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalBSharp.g:2943:4: ( (lv_arguments_3_0= ruleRootExpression ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==RULE_ID||LA46_0==32||LA46_0==41||(LA46_0>=43 && LA46_0<=45)||LA46_0==47) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalBSharp.g:2944:5: (lv_arguments_3_0= ruleRootExpression )
                            {
                            // InternalBSharp.g:2944:5: (lv_arguments_3_0= ruleRootExpression )
                            // InternalBSharp.g:2945:6: lv_arguments_3_0= ruleRootExpression
                            {

                            						newCompositeNode(grammarAccess.getFunctionCallAccess().getArgumentsRootExpressionParserRuleCall_1_1_0());
                            					
                            pushFollow(FOLLOW_36);
                            lv_arguments_3_0=ruleRootExpression();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                            						}
                            						add(
                            							current,
                            							"arguments",
                            							lv_arguments_3_0,
                            							"ac.soton.bsharp.BSharp.RootExpression");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalBSharp.g:2962:4: (otherlv_4= ',' ( (lv_arguments_5_0= ruleRootExpression ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==21) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalBSharp.g:2963:5: otherlv_4= ',' ( (lv_arguments_5_0= ruleRootExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_21); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalBSharp.g:2967:5: ( (lv_arguments_5_0= ruleRootExpression ) )
                    	    // InternalBSharp.g:2968:6: (lv_arguments_5_0= ruleRootExpression )
                    	    {
                    	    // InternalBSharp.g:2968:6: (lv_arguments_5_0= ruleRootExpression )
                    	    // InternalBSharp.g:2969:7: lv_arguments_5_0= ruleRootExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionCallAccess().getArgumentsRootExpressionParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_1_3());
                    			

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
    // InternalBSharp.g:2996:1: entryRuleClassVarDecl returns [EObject current=null] : iv_ruleClassVarDecl= ruleClassVarDecl EOF ;
    public final EObject entryRuleClassVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassVarDecl = null;


        try {
            // InternalBSharp.g:2996:53: (iv_ruleClassVarDecl= ruleClassVarDecl EOF )
            // InternalBSharp.g:2997:2: iv_ruleClassVarDecl= ruleClassVarDecl EOF
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
    // InternalBSharp.g:3003:1: ruleClassVarDecl returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleClassVarDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalBSharp.g:3009:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalBSharp.g:3010:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalBSharp.g:3010:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalBSharp.g:3011:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // InternalBSharp.g:3011:3: ( (otherlv_0= RULE_ID ) )
            // InternalBSharp.g:3012:4: (otherlv_0= RULE_ID )
            {
            // InternalBSharp.g:3012:4: (otherlv_0= RULE_ID )
            // InternalBSharp.g:3013:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassVarDeclRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_45); 

            					newLeafNode(otherlv_0, grammarAccess.getClassVarDeclAccess().getOwnerTypeGenNameCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getClassVarDeclAccess().getFullStopKeyword_1());
            		
            // InternalBSharp.g:3028:3: ( (otherlv_2= RULE_ID ) )
            // InternalBSharp.g:3029:4: (otherlv_2= RULE_ID )
            {
            // InternalBSharp.g:3029:4: (otherlv_2= RULE_ID )
            // InternalBSharp.g:3030:5: otherlv_2= RULE_ID
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
    // InternalBSharp.g:3045:1: entryRuleInbuiltInfix returns [String current=null] : iv_ruleInbuiltInfix= ruleInbuiltInfix EOF ;
    public final String entryRuleInbuiltInfix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInbuiltInfix = null;


        try {
            // InternalBSharp.g:3045:52: (iv_ruleInbuiltInfix= ruleInbuiltInfix EOF )
            // InternalBSharp.g:3046:2: iv_ruleInbuiltInfix= ruleInbuiltInfix EOF
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
    // InternalBSharp.g:3052:1: ruleInbuiltInfix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\u21D4' | kw= '\\u21D2' | kw= '=' | kw= '\\u2260' | kw= '\\u2227' | kw= '\\u2228' ) ;
    public final AntlrDatatypeRuleToken ruleInbuiltInfix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBSharp.g:3058:2: ( (kw= '\\u21D4' | kw= '\\u21D2' | kw= '=' | kw= '\\u2260' | kw= '\\u2227' | kw= '\\u2228' ) )
            // InternalBSharp.g:3059:2: (kw= '\\u21D4' | kw= '\\u21D2' | kw= '=' | kw= '\\u2260' | kw= '\\u2227' | kw= '\\u2228' )
            {
            // InternalBSharp.g:3059:2: (kw= '\\u21D4' | kw= '\\u21D2' | kw= '=' | kw= '\\u2260' | kw= '\\u2227' | kw= '\\u2228' )
            int alt49=6;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt49=1;
                }
                break;
            case 49:
                {
                alt49=2;
                }
                break;
            case 50:
                {
                alt49=3;
                }
                break;
            case 51:
                {
                alt49=4;
                }
                break;
            case 52:
                {
                alt49=5;
                }
                break;
            case 53:
                {
                alt49=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalBSharp.g:3060:3: kw= '\\u21D4'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getLeftRightDoubleArrowKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBSharp.g:3066:3: kw= '\\u21D2'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getRightwardsDoubleArrowKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBSharp.g:3072:3: kw= '='
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalBSharp.g:3078:3: kw= '\\u2260'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getNotEqualToKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalBSharp.g:3084:3: kw= '\\u2227'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInbuiltInfixAccess().getLogicalAndKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalBSharp.g:3090:3: kw= '\\u2228'
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
    // InternalBSharp.g:3099:1: entryRuleInstance returns [EObject current=null] : iv_ruleInstance= ruleInstance EOF ;
    public final EObject entryRuleInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstance = null;


        try {
            // InternalBSharp.g:3099:49: (iv_ruleInstance= ruleInstance EOF )
            // InternalBSharp.g:3100:2: iv_ruleInstance= ruleInstance EOF
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
    // InternalBSharp.g:3106:1: ruleInstance returns [EObject current=null] : (otherlv_0= 'Instance' ( ( ruleQualifiedName ) ) ( (lv_context_2_0= ruleTypeDeclContext ) ) otherlv_3= '(' ( (lv_arguments_4_0= ruleRootExpression ) )? (otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) ) )* otherlv_7= ')' ) ;
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
            // InternalBSharp.g:3112:2: ( (otherlv_0= 'Instance' ( ( ruleQualifiedName ) ) ( (lv_context_2_0= ruleTypeDeclContext ) ) otherlv_3= '(' ( (lv_arguments_4_0= ruleRootExpression ) )? (otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) ) )* otherlv_7= ')' ) )
            // InternalBSharp.g:3113:2: (otherlv_0= 'Instance' ( ( ruleQualifiedName ) ) ( (lv_context_2_0= ruleTypeDeclContext ) ) otherlv_3= '(' ( (lv_arguments_4_0= ruleRootExpression ) )? (otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) ) )* otherlv_7= ')' )
            {
            // InternalBSharp.g:3113:2: (otherlv_0= 'Instance' ( ( ruleQualifiedName ) ) ( (lv_context_2_0= ruleTypeDeclContext ) ) otherlv_3= '(' ( (lv_arguments_4_0= ruleRootExpression ) )? (otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) ) )* otherlv_7= ')' )
            // InternalBSharp.g:3114:3: otherlv_0= 'Instance' ( ( ruleQualifiedName ) ) ( (lv_context_2_0= ruleTypeDeclContext ) ) otherlv_3= '(' ( (lv_arguments_4_0= ruleRootExpression ) )? (otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInstanceAccess().getInstanceKeyword_0());
            		
            // InternalBSharp.g:3118:3: ( ( ruleQualifiedName ) )
            // InternalBSharp.g:3119:4: ( ruleQualifiedName )
            {
            // InternalBSharp.g:3119:4: ( ruleQualifiedName )
            // InternalBSharp.g:3120:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInstanceAccess().getClassNameClassDeclCrossReference_1_0());
            				
            pushFollow(FOLLOW_46);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBSharp.g:3134:3: ( (lv_context_2_0= ruleTypeDeclContext ) )
            // InternalBSharp.g:3135:4: (lv_context_2_0= ruleTypeDeclContext )
            {
            // InternalBSharp.g:3135:4: (lv_context_2_0= ruleTypeDeclContext )
            // InternalBSharp.g:3136:5: lv_context_2_0= ruleTypeDeclContext
            {

            					newCompositeNode(grammarAccess.getInstanceAccess().getContextTypeDeclContextParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_3=(Token)match(input,32,FOLLOW_44); 

            			newLeafNode(otherlv_3, grammarAccess.getInstanceAccess().getLeftParenthesisKeyword_3());
            		
            // InternalBSharp.g:3157:3: ( (lv_arguments_4_0= ruleRootExpression ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID||LA50_0==32||LA50_0==41||(LA50_0>=43 && LA50_0<=45)||LA50_0==47) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalBSharp.g:3158:4: (lv_arguments_4_0= ruleRootExpression )
                    {
                    // InternalBSharp.g:3158:4: (lv_arguments_4_0= ruleRootExpression )
                    // InternalBSharp.g:3159:5: lv_arguments_4_0= ruleRootExpression
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
                    						"ac.soton.bsharp.BSharp.RootExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBSharp.g:3176:3: (otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==21) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalBSharp.g:3177:4: otherlv_5= ',' ( (lv_arguments_6_0= ruleRootExpression ) )
            	    {
            	    otherlv_5=(Token)match(input,21,FOLLOW_21); 

            	    				newLeafNode(otherlv_5, grammarAccess.getInstanceAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalBSharp.g:3181:4: ( (lv_arguments_6_0= ruleRootExpression ) )
            	    // InternalBSharp.g:3182:5: (lv_arguments_6_0= ruleRootExpression )
            	    {
            	    // InternalBSharp.g:3182:5: (lv_arguments_6_0= ruleRootExpression )
            	    // InternalBSharp.g:3183:6: lv_arguments_6_0= ruleRootExpression
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
            	    							"ac.soton.bsharp.BSharp.RootExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x004000280002C002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000045000C1000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000FFC00002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000BA0100000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000055000C1000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000048000000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000BB0100000030L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000BA0100000030L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000100001000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000200200000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000001070L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000800100000020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x003F000000000022L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000BA0300200020L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000080000L});

}