package ac.soton.bsharp.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBSharpLexer extends Lexer {
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

    public InternalBSharpLexer() {;} 
    public InternalBSharpLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalBSharpLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalBSharp.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:11:7: ( 'package' )
            // InternalBSharp.g:11:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:12:7: ( ':' )
            // InternalBSharp.g:12:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:13:7: ( '.' )
            // InternalBSharp.g:13:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:14:7: ( 'From' )
            // InternalBSharp.g:14:9: 'From'
            {
            match("From"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:15:7: ( 'Import' )
            // InternalBSharp.g:15:9: 'Import'
            {
            match("Import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:16:7: ( '*' )
            // InternalBSharp.g:16:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:17:7: ( 'Class' )
            // InternalBSharp.g:17:9: 'Class'
            {
            match("Class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:18:7: ( '[' )
            // InternalBSharp.g:18:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:19:7: ( ']' )
            // InternalBSharp.g:19:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:20:7: ( '(' )
            // InternalBSharp.g:20:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:21:7: ( ')' )
            // InternalBSharp.g:21:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:22:7: ( ';' )
            // InternalBSharp.g:22:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:23:7: ( '<' )
            // InternalBSharp.g:23:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:24:7: ( '>' )
            // InternalBSharp.g:24:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:25:7: ( ',' )
            // InternalBSharp.g:25:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:26:7: ( '\\u00D7' )
            // InternalBSharp.g:26:9: '\\u00D7'
            {
            match('\u00D7'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:27:7: ( '\\u2192' )
            // InternalBSharp.g:27:9: '\\u2192'
            {
            match('\u2192'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:28:7: ( '\\uE102' )
            // InternalBSharp.g:28:9: '\\uE102'
            {
            match('\uE102'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:29:7: ( '\\uE100' )
            // InternalBSharp.g:29:9: '\\uE100'
            {
            match('\uE100'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:30:7: ( '\\u2194' )
            // InternalBSharp.g:30:9: '\\u2194'
            {
            match('\u2194'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:31:7: ( '\\u2916' )
            // InternalBSharp.g:31:9: '\\u2916'
            {
            match('\u2916'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:32:7: ( '\\u21F8' )
            // InternalBSharp.g:32:9: '\\u21F8'
            {
            match('\u21F8'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:33:7: ( '\\u21A3' )
            // InternalBSharp.g:33:9: '\\u21A3'
            {
            match('\u21A3'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:34:7: ( '\\u2900' )
            // InternalBSharp.g:34:9: '\\u2900'
            {
            match('\u2900'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:35:7: ( '\\u21A0' )
            // InternalBSharp.g:35:9: '\\u21A0'
            {
            match('\u21A0'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:36:7: ( '\\u2119' )
            // InternalBSharp.g:36:9: '\\u2119'
            {
            match('\u2119'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:37:7: ( 'where' )
            // InternalBSharp.g:37:9: 'where'
            {
            match("where"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:38:7: ( 'Datatype' )
            // InternalBSharp.g:38:9: 'Datatype'
            {
            match("Datatype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:39:7: ( '|' )
            // InternalBSharp.g:39:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:40:7: ( 'Extend' )
            // InternalBSharp.g:40:9: 'Extend'
            {
            match("Extend"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:41:7: ( '{' )
            // InternalBSharp.g:41:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:42:7: ( '}' )
            // InternalBSharp.g:42:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:43:7: ( 'INFIX' )
            // InternalBSharp.g:43:9: 'INFIX'
            {
            match("INFIX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:44:7: ( 'match' )
            // InternalBSharp.g:44:9: 'match'
            {
            match("match"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:45:7: ( 'Theorems' )
            // InternalBSharp.g:45:9: 'Theorems'
            {
            match("Theorems"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:46:7: ( '\\u03BB' )
            // InternalBSharp.g:46:9: '\\u03BB'
            {
            match('\u03BB'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:47:7: ( '\\u2200' )
            // InternalBSharp.g:47:9: '\\u2200'
            {
            match('\u2200'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:48:7: ( '\\u2203' )
            // InternalBSharp.g:48:9: '\\u2203'
            {
            match('\u2203'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:49:7: ( '\\u00B7' )
            // InternalBSharp.g:49:9: '\\u00B7'
            {
            match('\u00B7'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:50:7: ( '\\u00AC' )
            // InternalBSharp.g:50:9: '\\u00AC'
            {
            match('\u00AC'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:51:7: ( '\\u21D4' )
            // InternalBSharp.g:51:9: '\\u21D4'
            {
            match('\u21D4'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:52:7: ( '\\u21D2' )
            // InternalBSharp.g:52:9: '\\u21D2'
            {
            match('\u21D2'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:53:7: ( '=' )
            // InternalBSharp.g:53:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:54:7: ( '\\u2260' )
            // InternalBSharp.g:54:9: '\\u2260'
            {
            match('\u2260'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:55:7: ( '\\u2227' )
            // InternalBSharp.g:55:9: '\\u2227'
            {
            match('\u2227'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:56:7: ( '\\u2228' )
            // InternalBSharp.g:56:9: '\\u2228'
            {
            match('\u2228'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:3272:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | 'i' .. '\\uFFDC' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | 'i' .. '\\uFFDC' | '0' .. '9' )* )
            // InternalBSharp.g:3272:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | 'i' .. '\\uFFDC' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | 'i' .. '\\uFFDC' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='\uFFDC') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalBSharp.g:3272:49: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | 'i' .. '\\uFFDC' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='\uFFDC')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBSharp.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='\uFFDC') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:3274:10: ( ( '0' .. '9' )+ )
            // InternalBSharp.g:3274:12: ( '0' .. '9' )+
            {
            // InternalBSharp.g:3274:12: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBSharp.g:3274:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:3276:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalBSharp.g:3276:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalBSharp.g:3276:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\"') ) {
                alt5=1;
            }
            else if ( (LA5_0=='\'') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBSharp.g:3276:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalBSharp.g:3276:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\\') ) {
                            alt3=1;
                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalBSharp.g:3276:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalBSharp.g:3276:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalBSharp.g:3276:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalBSharp.g:3276:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalBSharp.g:3276:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalBSharp.g:3276:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:3278:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalBSharp.g:3278:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalBSharp.g:3278:24: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBSharp.g:3278:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:3280:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalBSharp.g:3280:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalBSharp.g:3280:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBSharp.g:3280:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalBSharp.g:3280:40: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBSharp.g:3280:41: ( '\\r' )? '\\n'
                    {
                    // InternalBSharp.g:3280:41: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalBSharp.g:3280:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:3282:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalBSharp.g:3282:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalBSharp.g:3282:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBSharp.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:3284:16: ( . )
            // InternalBSharp.g:3284:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalBSharp.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt11=53;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // InternalBSharp.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalBSharp.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalBSharp.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalBSharp.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalBSharp.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalBSharp.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalBSharp.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalBSharp.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalBSharp.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalBSharp.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalBSharp.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalBSharp.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalBSharp.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalBSharp.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalBSharp.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalBSharp.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalBSharp.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalBSharp.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalBSharp.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalBSharp.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalBSharp.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalBSharp.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalBSharp.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalBSharp.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalBSharp.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalBSharp.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalBSharp.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalBSharp.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalBSharp.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalBSharp.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalBSharp.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalBSharp.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // InternalBSharp.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // InternalBSharp.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // InternalBSharp.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // InternalBSharp.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // InternalBSharp.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // InternalBSharp.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // InternalBSharp.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // InternalBSharp.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // InternalBSharp.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // InternalBSharp.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // InternalBSharp.g:1:262: T__53
                {
                mT__53(); 

                }
                break;
            case 44 :
                // InternalBSharp.g:1:268: T__54
                {
                mT__54(); 

                }
                break;
            case 45 :
                // InternalBSharp.g:1:274: T__55
                {
                mT__55(); 

                }
                break;
            case 46 :
                // InternalBSharp.g:1:280: T__56
                {
                mT__56(); 

                }
                break;
            case 47 :
                // InternalBSharp.g:1:286: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 48 :
                // InternalBSharp.g:1:294: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 49 :
                // InternalBSharp.g:1:303: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 50 :
                // InternalBSharp.g:1:315: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 51 :
                // InternalBSharp.g:1:331: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 52 :
                // InternalBSharp.g:1:347: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 53 :
                // InternalBSharp.g:1:355: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\1\66\2\uffff\2\66\1\uffff\1\66\10\uffff\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\115\1\116\1\117\1\120\2\66\1\123\1\66\1\125\1\126\2\66\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\uffff\1\141\1\142\1\143\2\uffff\3\64\2\uffff\1\66\3\uffff\3\66\1\uffff\1\66\23\uffff\2\66\1\uffff\1\66\2\uffff\2\66\20\uffff\13\66\1\176\11\66\1\uffff\1\66\1\u0089\1\u008a\1\u008b\2\66\1\u008e\2\66\1\u0091\3\uffff\1\66\1\u0093\1\uffff\1\66\1\u0095\1\uffff\1\66\1\uffff\1\66\1\uffff\1\u0098\1\u0099\2\uffff";
    static final String DFA11_eofS =
        "\u009a\uffff";
    static final String DFA11_minS =
        "\1\0\1\141\2\uffff\1\162\1\116\1\uffff\1\154\10\uffff\13\60\1\150\1\141\1\60\1\170\2\60\1\141\1\150\7\60\1\uffff\3\60\2\uffff\2\0\1\52\2\uffff\1\143\3\uffff\1\157\1\160\1\106\1\uffff\1\141\23\uffff\1\145\1\164\1\uffff\1\164\2\uffff\1\164\1\145\20\uffff\1\153\1\155\1\157\1\111\1\163\1\162\1\141\1\145\1\143\1\157\1\141\1\60\1\162\1\130\1\163\1\145\1\164\1\156\1\150\1\162\1\147\1\uffff\1\164\3\60\1\171\1\144\1\60\2\145\1\60\3\uffff\1\160\1\60\1\uffff\1\155\1\60\1\uffff\1\145\1\uffff\1\163\1\uffff\2\60\2\uffff";
    static final String DFA11_maxS =
        "\1\uffff\1\141\2\uffff\1\162\1\155\1\uffff\1\154\10\uffff\13\uffdc\1\150\1\141\1\uffdc\1\170\2\uffdc\1\141\1\150\7\uffdc\1\uffff\3\uffdc\2\uffff\2\uffff\1\57\2\uffff\1\143\3\uffff\1\157\1\160\1\106\1\uffff\1\141\23\uffff\1\145\1\164\1\uffff\1\164\2\uffff\1\164\1\145\20\uffff\1\153\1\155\1\157\1\111\1\163\1\162\1\141\1\145\1\143\1\157\1\141\1\uffdc\1\162\1\130\1\163\1\145\1\164\1\156\1\150\1\162\1\147\1\uffff\1\164\3\uffdc\1\171\1\144\1\uffdc\2\145\1\uffdc\3\uffff\1\160\1\uffdc\1\uffff\1\155\1\uffdc\1\uffff\1\145\1\uffff\1\163\1\uffff\2\uffdc\2\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\1\3\2\uffff\1\6\1\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\32\uffff\1\53\3\uffff\1\57\1\60\3\uffff\1\64\1\65\1\uffff\1\57\1\2\1\3\3\uffff\1\6\1\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\2\uffff\1\35\1\uffff\1\37\1\40\2\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\60\1\61\1\62\1\63\1\64\25\uffff\1\4\12\uffff\1\41\1\7\1\33\2\uffff\1\42\2\uffff\1\5\1\uffff\1\36\1\uffff\1\1\2\uffff\1\34\1\43";
    static final String DFA11_specialS =
        "\1\2\57\uffff\1\1\1\0\150\uffff}>";
    static final String[] DFA11_transitionS = {
            "\11\64\2\63\2\64\1\63\22\64\1\63\1\64\1\60\4\64\1\61\1\12\1\13\1\6\1\64\1\17\1\64\1\3\1\62\12\57\1\2\1\14\1\15\1\52\1\16\2\64\2\56\1\7\1\34\1\36\1\4\2\56\1\5\12\56\1\42\6\56\1\10\1\64\1\11\1\64\1\56\1\64\14\56\1\41\2\56\1\1\6\56\1\33\3\56\1\37\1\35\1\40\56\56\1\47\12\56\1\46\37\56\1\20\u02e3\56\1\43\u1d5d\56\1\32\170\56\1\21\1\56\1\24\13\56\1\31\2\56\1\27\56\56\1\51\1\56\1\50\43\56\1\26\7\56\1\44\2\56\1\45\43\56\1\54\1\55\67\56\1\53\u069f\56\1\30\25\56\1\25\ub7e9\56\1\23\1\56\1\22\u1eda\56\43\64",
            "\1\65",
            "",
            "",
            "\1\71",
            "\1\73\36\uffff\1\72",
            "",
            "\1\75",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\uff7c\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\uff7c\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\uff7c\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\uff7c\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\uff7c\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\uff7c\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\uff7c\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\uff7c\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\uff7c\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\uff7c\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\uff7c\66",
            "\1\121",
            "\1\122",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\uff7c\66",
            "\1\124",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\uff7c\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\uff7c\66",
            "\1\127",
            "\1\130",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\uff7c\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\uff7c\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\uff7c\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\uff7c\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\uff7c\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\uff7c\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\uff7c\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\uff7c\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\uff7c\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\uff7c\66",
            "",
            "",
            "\0\145",
            "\0\145",
            "\1\146\4\uffff\1\147",
            "",
            "",
            "\1\151",
            "",
            "",
            "",
            "\1\152",
            "\1\153",
            "\1\154",
            "",
            "\1\155",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\156",
            "\1\157",
            "",
            "\1\160",
            "",
            "",
            "\1\161",
            "\1\162",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\uff7c\66",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "",
            "\1\u0088",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\uff7c\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\uff7c\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\uff7c\66",
            "\1\u008c",
            "\1\u008d",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\uff7c\66",
            "\1\u008f",
            "\1\u0090",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\uff7c\66",
            "",
            "",
            "",
            "\1\u0092",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\uff7c\66",
            "",
            "\1\u0094",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\uff7c\66",
            "",
            "\1\u0096",
            "",
            "\1\u0097",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\uff7c\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\uff7c\66",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_49 = input.LA(1);

                        s = -1;
                        if ( ((LA11_49>='\u0000' && LA11_49<='\uFFFF')) ) {s = 101;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_48 = input.LA(1);

                        s = -1;
                        if ( ((LA11_48>='\u0000' && LA11_48<='\uFFFF')) ) {s = 101;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_0 = input.LA(1);

                        s = -1;
                        if ( (LA11_0=='p') ) {s = 1;}

                        else if ( (LA11_0==':') ) {s = 2;}

                        else if ( (LA11_0=='.') ) {s = 3;}

                        else if ( (LA11_0=='F') ) {s = 4;}

                        else if ( (LA11_0=='I') ) {s = 5;}

                        else if ( (LA11_0=='*') ) {s = 6;}

                        else if ( (LA11_0=='C') ) {s = 7;}

                        else if ( (LA11_0=='[') ) {s = 8;}

                        else if ( (LA11_0==']') ) {s = 9;}

                        else if ( (LA11_0=='(') ) {s = 10;}

                        else if ( (LA11_0==')') ) {s = 11;}

                        else if ( (LA11_0==';') ) {s = 12;}

                        else if ( (LA11_0=='<') ) {s = 13;}

                        else if ( (LA11_0=='>') ) {s = 14;}

                        else if ( (LA11_0==',') ) {s = 15;}

                        else if ( (LA11_0=='\u00D7') ) {s = 16;}

                        else if ( (LA11_0=='\u2192') ) {s = 17;}

                        else if ( (LA11_0=='\uE102') ) {s = 18;}

                        else if ( (LA11_0=='\uE100') ) {s = 19;}

                        else if ( (LA11_0=='\u2194') ) {s = 20;}

                        else if ( (LA11_0=='\u2916') ) {s = 21;}

                        else if ( (LA11_0=='\u21F8') ) {s = 22;}

                        else if ( (LA11_0=='\u21A3') ) {s = 23;}

                        else if ( (LA11_0=='\u2900') ) {s = 24;}

                        else if ( (LA11_0=='\u21A0') ) {s = 25;}

                        else if ( (LA11_0=='\u2119') ) {s = 26;}

                        else if ( (LA11_0=='w') ) {s = 27;}

                        else if ( (LA11_0=='D') ) {s = 28;}

                        else if ( (LA11_0=='|') ) {s = 29;}

                        else if ( (LA11_0=='E') ) {s = 30;}

                        else if ( (LA11_0=='{') ) {s = 31;}

                        else if ( (LA11_0=='}') ) {s = 32;}

                        else if ( (LA11_0=='m') ) {s = 33;}

                        else if ( (LA11_0=='T') ) {s = 34;}

                        else if ( (LA11_0=='\u03BB') ) {s = 35;}

                        else if ( (LA11_0=='\u2200') ) {s = 36;}

                        else if ( (LA11_0=='\u2203') ) {s = 37;}

                        else if ( (LA11_0=='\u00B7') ) {s = 38;}

                        else if ( (LA11_0=='\u00AC') ) {s = 39;}

                        else if ( (LA11_0=='\u21D4') ) {s = 40;}

                        else if ( (LA11_0=='\u21D2') ) {s = 41;}

                        else if ( (LA11_0=='=') ) {s = 42;}

                        else if ( (LA11_0=='\u2260') ) {s = 43;}

                        else if ( (LA11_0=='\u2227') ) {s = 44;}

                        else if ( (LA11_0=='\u2228') ) {s = 45;}

                        else if ( ((LA11_0>='A' && LA11_0<='B')||(LA11_0>='G' && LA11_0<='H')||(LA11_0>='J' && LA11_0<='S')||(LA11_0>='U' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='l')||(LA11_0>='n' && LA11_0<='o')||(LA11_0>='q' && LA11_0<='v')||(LA11_0>='x' && LA11_0<='z')||(LA11_0>='~' && LA11_0<='\u00AB')||(LA11_0>='\u00AD' && LA11_0<='\u00B6')||(LA11_0>='\u00B8' && LA11_0<='\u00D6')||(LA11_0>='\u00D8' && LA11_0<='\u03BA')||(LA11_0>='\u03BC' && LA11_0<='\u2118')||(LA11_0>='\u211A' && LA11_0<='\u2191')||LA11_0=='\u2193'||(LA11_0>='\u2195' && LA11_0<='\u219F')||(LA11_0>='\u21A1' && LA11_0<='\u21A2')||(LA11_0>='\u21A4' && LA11_0<='\u21D1')||LA11_0=='\u21D3'||(LA11_0>='\u21D5' && LA11_0<='\u21F7')||(LA11_0>='\u21F9' && LA11_0<='\u21FF')||(LA11_0>='\u2201' && LA11_0<='\u2202')||(LA11_0>='\u2204' && LA11_0<='\u2226')||(LA11_0>='\u2229' && LA11_0<='\u225F')||(LA11_0>='\u2261' && LA11_0<='\u28FF')||(LA11_0>='\u2901' && LA11_0<='\u2915')||(LA11_0>='\u2917' && LA11_0<='\uE0FF')||LA11_0=='\uE101'||(LA11_0>='\uE103' && LA11_0<='\uFFDC')) ) {s = 46;}

                        else if ( ((LA11_0>='0' && LA11_0<='9')) ) {s = 47;}

                        else if ( (LA11_0=='\"') ) {s = 48;}

                        else if ( (LA11_0=='\'') ) {s = 49;}

                        else if ( (LA11_0=='/') ) {s = 50;}

                        else if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {s = 51;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\b')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||LA11_0=='!'||(LA11_0>='#' && LA11_0<='&')||LA11_0=='+'||LA11_0=='-'||(LA11_0>='?' && LA11_0<='@')||LA11_0=='\\'||LA11_0=='^'||LA11_0=='`'||(LA11_0>='\uFFDD' && LA11_0<='\uFFFF')) ) {s = 52;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}