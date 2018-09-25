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
            // InternalBSharp.g:11:7: ( ':' )
            // InternalBSharp.g:11:9: ':'
            {
            match(':'); 

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
            // InternalBSharp.g:12:7: ( 'Pred' )
            // InternalBSharp.g:12:9: 'Pred'
            {
            match("Pred"); 


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
            // InternalBSharp.g:14:7: ( '.*' )
            // InternalBSharp.g:14:9: '.*'
            {
            match(".*"); 


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
            // InternalBSharp.g:16:7: ( 'Class' )
            // InternalBSharp.g:16:9: 'Class'
            {
            match("Class"); 


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
            // InternalBSharp.g:17:7: ( ';' )
            // InternalBSharp.g:17:9: ';'
            {
            match(';'); 

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
            // InternalBSharp.g:18:7: ( '{' )
            // InternalBSharp.g:18:9: '{'
            {
            match('{'); 

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
            // InternalBSharp.g:19:7: ( '}' )
            // InternalBSharp.g:19:9: '}'
            {
            match('}'); 

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
            // InternalBSharp.g:20:7: ( '<' )
            // InternalBSharp.g:20:9: '<'
            {
            match('<'); 

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
            // InternalBSharp.g:21:7: ( '>' )
            // InternalBSharp.g:21:9: '>'
            {
            match('>'); 

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
            // InternalBSharp.g:22:7: ( ',' )
            // InternalBSharp.g:22:9: ','
            {
            match(','); 

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
            // InternalBSharp.g:23:7: ( '\\u00D7' )
            // InternalBSharp.g:23:9: '\\u00D7'
            {
            match('\u00D7'); 

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
            // InternalBSharp.g:24:7: ( '\\u2192' )
            // InternalBSharp.g:24:9: '\\u2192'
            {
            match('\u2192'); 

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
            // InternalBSharp.g:25:7: ( '\\uE102' )
            // InternalBSharp.g:25:9: '\\uE102'
            {
            match('\uE102'); 

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
            // InternalBSharp.g:26:7: ( '\\uE100' )
            // InternalBSharp.g:26:9: '\\uE100'
            {
            match('\uE100'); 

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
            // InternalBSharp.g:27:7: ( '\\u2194' )
            // InternalBSharp.g:27:9: '\\u2194'
            {
            match('\u2194'); 

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
            // InternalBSharp.g:28:7: ( '\\u2916' )
            // InternalBSharp.g:28:9: '\\u2916'
            {
            match('\u2916'); 

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
            // InternalBSharp.g:29:7: ( '\\u21F8' )
            // InternalBSharp.g:29:9: '\\u21F8'
            {
            match('\u21F8'); 

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
            // InternalBSharp.g:30:7: ( '\\u21A3' )
            // InternalBSharp.g:30:9: '\\u21A3'
            {
            match('\u21A3'); 

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
            // InternalBSharp.g:31:7: ( '\\u2900' )
            // InternalBSharp.g:31:9: '\\u2900'
            {
            match('\u2900'); 

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
            // InternalBSharp.g:32:7: ( '\\u21A0' )
            // InternalBSharp.g:32:9: '\\u21A0'
            {
            match('\u21A0'); 

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
            // InternalBSharp.g:33:7: ( '(' )
            // InternalBSharp.g:33:9: '('
            {
            match('('); 

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
            // InternalBSharp.g:34:7: ( ')' )
            // InternalBSharp.g:34:9: ')'
            {
            match(')'); 

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
            // InternalBSharp.g:35:7: ( 'where' )
            // InternalBSharp.g:35:9: 'where'
            {
            match("where"); 


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
            // InternalBSharp.g:36:7: ( 'Datatype' )
            // InternalBSharp.g:36:9: 'Datatype'
            {
            match("Datatype"); 


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
            // InternalBSharp.g:37:7: ( '|' )
            // InternalBSharp.g:37:9: '|'
            {
            match('|'); 

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
            // InternalBSharp.g:38:7: ( 'Extend' )
            // InternalBSharp.g:38:9: 'Extend'
            {
            match("Extend"); 


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
            // InternalBSharp.g:39:7: ( 'INFIX' )
            // InternalBSharp.g:39:9: 'INFIX'
            {
            match("INFIX"); 


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
            // InternalBSharp.g:40:7: ( 'match' )
            // InternalBSharp.g:40:9: 'match'
            {
            match("match"); 


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
            // InternalBSharp.g:41:7: ( 'Theorems' )
            // InternalBSharp.g:41:9: 'Theorems'
            {
            match("Theorems"); 


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
            // InternalBSharp.g:42:7: ( '\\u03BB' )
            // InternalBSharp.g:42:9: '\\u03BB'
            {
            match('\u03BB'); 

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
            // InternalBSharp.g:43:7: ( '\\u2200' )
            // InternalBSharp.g:43:9: '\\u2200'
            {
            match('\u2200'); 

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
            // InternalBSharp.g:44:7: ( '\\u2203' )
            // InternalBSharp.g:44:9: '\\u2203'
            {
            match('\u2203'); 

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
            // InternalBSharp.g:45:7: ( '\\u00B7' )
            // InternalBSharp.g:45:9: '\\u00B7'
            {
            match('\u00B7'); 

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
            // InternalBSharp.g:46:7: ( '\\u00AC' )
            // InternalBSharp.g:46:9: '\\u00AC'
            {
            match('\u00AC'); 

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
            // InternalBSharp.g:47:7: ( '\\u21D4' )
            // InternalBSharp.g:47:9: '\\u21D4'
            {
            match('\u21D4'); 

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
            // InternalBSharp.g:48:7: ( '\\u21D2' )
            // InternalBSharp.g:48:9: '\\u21D2'
            {
            match('\u21D2'); 

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
            // InternalBSharp.g:49:7: ( '=' )
            // InternalBSharp.g:49:9: '='
            {
            match('='); 

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
            // InternalBSharp.g:50:7: ( '\\u2260' )
            // InternalBSharp.g:50:9: '\\u2260'
            {
            match('\u2260'); 

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
            // InternalBSharp.g:51:7: ( '\\u2227' )
            // InternalBSharp.g:51:9: '\\u2227'
            {
            match('\u2227'); 

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
            // InternalBSharp.g:52:7: ( '\\u2228' )
            // InternalBSharp.g:52:9: '\\u2228'
            {
            match('\u2228'); 

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
            // InternalBSharp.g:53:7: ( 'Instance' )
            // InternalBSharp.g:53:9: 'Instance'
            {
            match("Instance"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBSharp.g:3066:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalBSharp.g:3066:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalBSharp.g:3066:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalBSharp.g:3066:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalBSharp.g:3066:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBSharp.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
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
            // InternalBSharp.g:3068:10: ( ( '0' .. '9' )+ )
            // InternalBSharp.g:3068:12: ( '0' .. '9' )+
            {
            // InternalBSharp.g:3068:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBSharp.g:3068:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
            // InternalBSharp.g:3070:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalBSharp.g:3070:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalBSharp.g:3070:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBSharp.g:3070:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalBSharp.g:3070:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalBSharp.g:3070:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalBSharp.g:3070:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalBSharp.g:3070:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalBSharp.g:3070:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalBSharp.g:3070:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalBSharp.g:3070:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop5;
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
            // InternalBSharp.g:3072:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalBSharp.g:3072:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalBSharp.g:3072:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBSharp.g:3072:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // InternalBSharp.g:3074:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalBSharp.g:3074:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalBSharp.g:3074:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBSharp.g:3074:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // InternalBSharp.g:3074:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBSharp.g:3074:41: ( '\\r' )? '\\n'
                    {
                    // InternalBSharp.g:3074:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalBSharp.g:3074:41: '\\r'
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
            // InternalBSharp.g:3076:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalBSharp.g:3076:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalBSharp.g:3076:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // InternalBSharp.g:3078:16: ( . )
            // InternalBSharp.g:3078:18: .
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
        // InternalBSharp.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=50;
        alt12 = dfa12.predict(input);
        switch (alt12) {
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
                // InternalBSharp.g:1:268: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 45 :
                // InternalBSharp.g:1:276: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 46 :
                // InternalBSharp.g:1:285: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 47 :
                // InternalBSharp.g:1:297: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 48 :
                // InternalBSharp.g:1:313: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 49 :
                // InternalBSharp.g:1:329: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 50 :
                // InternalBSharp.g:1:337: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\2\uffff\1\63\1\65\2\63\22\uffff\2\63\1\uffff\3\63\13\uffff\1\60\2\uffff\3\60\3\uffff\1\63\3\uffff\4\63\22\uffff\2\63\1\uffff\3\63\20\uffff\12\63\1\166\11\63\1\uffff\1\63\1\u0081\1\63\1\u0083\1\u0084\2\63\1\u0087\1\63\1\u0089\1\uffff\1\63\2\uffff\1\63\1\u008c\1\uffff\1\63\1\uffff\2\63\1\uffff\1\63\1\u0091\1\u0092\1\u0093\3\uffff";
    static final String DFA12_eofS =
        "\u0094\uffff";
    static final String DFA12_minS =
        "\1\0\1\uffff\1\162\1\52\1\116\1\154\22\uffff\1\150\1\141\1\uffff\1\170\1\141\1\150\13\uffff\1\101\2\uffff\2\0\1\52\3\uffff\1\145\3\uffff\1\160\1\106\1\163\1\141\22\uffff\1\145\1\164\1\uffff\2\164\1\145\20\uffff\1\144\1\157\1\111\1\164\1\163\1\162\1\141\1\145\1\143\1\157\1\60\1\162\1\130\1\141\1\163\1\145\1\164\1\156\1\150\1\162\1\uffff\1\164\1\60\1\156\2\60\1\171\1\144\1\60\1\145\1\60\1\uffff\1\143\2\uffff\1\160\1\60\1\uffff\1\155\1\uffff\2\145\1\uffff\1\163\3\60\3\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\uffff\1\162\1\52\1\156\1\154\22\uffff\1\150\1\141\1\uffff\1\170\1\141\1\150\13\uffff\1\172\2\uffff\2\uffff\1\57\3\uffff\1\145\3\uffff\1\160\1\106\1\163\1\141\22\uffff\1\145\1\164\1\uffff\2\164\1\145\20\uffff\1\144\1\157\1\111\1\164\1\163\1\162\1\141\1\145\1\143\1\157\1\172\1\162\1\130\1\141\1\163\1\145\1\164\1\156\1\150\1\162\1\uffff\1\164\1\172\1\156\2\172\1\171\1\144\1\172\1\145\1\172\1\uffff\1\143\2\uffff\1\160\1\172\1\uffff\1\155\1\uffff\2\145\1\uffff\1\163\3\172\3\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\4\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\2\uffff\1\33\3\uffff\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\uffff\1\54\1\55\3\uffff\1\61\1\62\1\1\1\uffff\1\54\1\4\1\3\4\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\2\uffff\1\33\3\uffff\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\55\1\56\1\57\1\60\1\61\24\uffff\1\2\12\uffff\1\35\1\uffff\1\6\1\31\2\uffff\1\36\1\uffff\1\5\2\uffff\1\34\4\uffff\1\53\1\32\1\37";
    static final String DFA12_specialS =
        "\1\0\53\uffff\1\1\1\2\146\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\60\2\57\2\60\1\57\22\60\1\57\1\60\1\54\4\60\1\55\1\26\1\27\2\60\1\13\1\60\1\3\1\56\12\53\1\1\1\6\1\11\1\45\1\12\2\60\2\52\1\5\1\31\1\33\3\52\1\4\6\52\1\2\3\52\1\35\6\52\3\60\1\51\1\52\1\60\14\52\1\34\11\52\1\30\3\52\1\7\1\32\1\10\56\60\1\42\12\60\1\41\37\60\1\14\u02e3\60\1\36\u1dd6\60\1\15\1\60\1\20\13\60\1\25\2\60\1\23\56\60\1\44\1\60\1\43\43\60\1\22\7\60\1\37\2\60\1\40\43\60\1\47\1\50\67\60\1\46\u069f\60\1\24\25\60\1\21\ub7e9\60\1\17\1\60\1\16\u1efd\60",
            "",
            "\1\62",
            "\1\64",
            "\1\67\36\uffff\1\66\1\70",
            "\1\71",
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
            "\1\114",
            "\1\115",
            "",
            "\1\117",
            "\1\120",
            "\1\121",
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
            "\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\0\136",
            "\0\136",
            "\1\137\4\uffff\1\140",
            "",
            "",
            "",
            "\1\142",
            "",
            "",
            "",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
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
            "\1\147",
            "\1\150",
            "",
            "\1\151",
            "\1\152",
            "\1\153",
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
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "",
            "\1\u0080",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0082",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0085",
            "\1\u0086",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0088",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u008a",
            "",
            "",
            "\1\u008b",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u008d",
            "",
            "\1\u008e",
            "\1\u008f",
            "",
            "\1\u0090",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0==':') ) {s = 1;}

                        else if ( (LA12_0=='P') ) {s = 2;}

                        else if ( (LA12_0=='.') ) {s = 3;}

                        else if ( (LA12_0=='I') ) {s = 4;}

                        else if ( (LA12_0=='C') ) {s = 5;}

                        else if ( (LA12_0==';') ) {s = 6;}

                        else if ( (LA12_0=='{') ) {s = 7;}

                        else if ( (LA12_0=='}') ) {s = 8;}

                        else if ( (LA12_0=='<') ) {s = 9;}

                        else if ( (LA12_0=='>') ) {s = 10;}

                        else if ( (LA12_0==',') ) {s = 11;}

                        else if ( (LA12_0=='\u00D7') ) {s = 12;}

                        else if ( (LA12_0=='\u2192') ) {s = 13;}

                        else if ( (LA12_0=='\uE102') ) {s = 14;}

                        else if ( (LA12_0=='\uE100') ) {s = 15;}

                        else if ( (LA12_0=='\u2194') ) {s = 16;}

                        else if ( (LA12_0=='\u2916') ) {s = 17;}

                        else if ( (LA12_0=='\u21F8') ) {s = 18;}

                        else if ( (LA12_0=='\u21A3') ) {s = 19;}

                        else if ( (LA12_0=='\u2900') ) {s = 20;}

                        else if ( (LA12_0=='\u21A0') ) {s = 21;}

                        else if ( (LA12_0=='(') ) {s = 22;}

                        else if ( (LA12_0==')') ) {s = 23;}

                        else if ( (LA12_0=='w') ) {s = 24;}

                        else if ( (LA12_0=='D') ) {s = 25;}

                        else if ( (LA12_0=='|') ) {s = 26;}

                        else if ( (LA12_0=='E') ) {s = 27;}

                        else if ( (LA12_0=='m') ) {s = 28;}

                        else if ( (LA12_0=='T') ) {s = 29;}

                        else if ( (LA12_0=='\u03BB') ) {s = 30;}

                        else if ( (LA12_0=='\u2200') ) {s = 31;}

                        else if ( (LA12_0=='\u2203') ) {s = 32;}

                        else if ( (LA12_0=='\u00B7') ) {s = 33;}

                        else if ( (LA12_0=='\u00AC') ) {s = 34;}

                        else if ( (LA12_0=='\u21D4') ) {s = 35;}

                        else if ( (LA12_0=='\u21D2') ) {s = 36;}

                        else if ( (LA12_0=='=') ) {s = 37;}

                        else if ( (LA12_0=='\u2260') ) {s = 38;}

                        else if ( (LA12_0=='\u2227') ) {s = 39;}

                        else if ( (LA12_0=='\u2228') ) {s = 40;}

                        else if ( (LA12_0=='^') ) {s = 41;}

                        else if ( ((LA12_0>='A' && LA12_0<='B')||(LA12_0>='F' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='O')||(LA12_0>='Q' && LA12_0<='S')||(LA12_0>='U' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='l')||(LA12_0>='n' && LA12_0<='v')||(LA12_0>='x' && LA12_0<='z')) ) {s = 42;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 43;}

                        else if ( (LA12_0=='\"') ) {s = 44;}

                        else if ( (LA12_0=='\'') ) {s = 45;}

                        else if ( (LA12_0=='/') ) {s = 46;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 47;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||LA12_0=='-'||(LA12_0>='?' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='~' && LA12_0<='\u00AB')||(LA12_0>='\u00AD' && LA12_0<='\u00B6')||(LA12_0>='\u00B8' && LA12_0<='\u00D6')||(LA12_0>='\u00D8' && LA12_0<='\u03BA')||(LA12_0>='\u03BC' && LA12_0<='\u2191')||LA12_0=='\u2193'||(LA12_0>='\u2195' && LA12_0<='\u219F')||(LA12_0>='\u21A1' && LA12_0<='\u21A2')||(LA12_0>='\u21A4' && LA12_0<='\u21D1')||LA12_0=='\u21D3'||(LA12_0>='\u21D5' && LA12_0<='\u21F7')||(LA12_0>='\u21F9' && LA12_0<='\u21FF')||(LA12_0>='\u2201' && LA12_0<='\u2202')||(LA12_0>='\u2204' && LA12_0<='\u2226')||(LA12_0>='\u2229' && LA12_0<='\u225F')||(LA12_0>='\u2261' && LA12_0<='\u28FF')||(LA12_0>='\u2901' && LA12_0<='\u2915')||(LA12_0>='\u2917' && LA12_0<='\uE0FF')||LA12_0=='\uE101'||(LA12_0>='\uE103' && LA12_0<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_44 = input.LA(1);

                        s = -1;
                        if ( ((LA12_44>='\u0000' && LA12_44<='\uFFFF')) ) {s = 94;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_45 = input.LA(1);

                        s = -1;
                        if ( ((LA12_45>='\u0000' && LA12_45<='\uFFFF')) ) {s = 94;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}