// Generated from D:/Uni_2ano_2sem/SEM_4_PI/sem4pi-22-23-24/base.core/src/main/antlr4\ExamGrammar.g4 by ANTLR 4.12.0
package eapli.base.grammarutils;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExamGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, NEWLINE=13, SPACE=14, WORD=15, COLON=16, 
		DASH=17, INT=18, ANY_CHAR=19, MISSING_WORD=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "NEWLINE", "SPACE", "WORD", "COLON", "DASH", 
			"INT", "ANY_CHAR", "MISSING_WORD"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Header: '", "'Section: '", "'Section description: '", "'Solution: '", 
			"'T'", "'F'", "'t'", "'f'", "','", "'('", "'pts)'", "'Feedback: '", null, 
			"' '", null, "':'", "'-'", null, null, "'||WORD||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "NEWLINE", "SPACE", "WORD", "COLON", "DASH", "INT", "ANY_CHAR", 
			"MISSING_WORD"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ExamGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ExamGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0014\u0096\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0004\u000e\u007f\b\u000e\u000b\u000e\f\u000e\u0080\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0004\u0011\u0088\b\u0011"+
		"\u000b\u0011\f\u0011\u0089\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0000\u0000\u0014\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014\u0001\u0000\u0004\u0002\u0000\n\n\r\r\u0002\u0000AZaz\u0001\u0000"+
		"09\u0002\u0000\t\n\r\r\u0097\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0001)\u0001\u0000\u0000\u0000\u00032\u0001\u0000\u0000\u0000\u0005<"+
		"\u0001\u0000\u0000\u0000\u0007R\u0001\u0000\u0000\u0000\t]\u0001\u0000"+
		"\u0000\u0000\u000b_\u0001\u0000\u0000\u0000\ra\u0001\u0000\u0000\u0000"+
		"\u000fc\u0001\u0000\u0000\u0000\u0011e\u0001\u0000\u0000\u0000\u0013g"+
		"\u0001\u0000\u0000\u0000\u0015i\u0001\u0000\u0000\u0000\u0017n\u0001\u0000"+
		"\u0000\u0000\u0019y\u0001\u0000\u0000\u0000\u001b{\u0001\u0000\u0000\u0000"+
		"\u001d~\u0001\u0000\u0000\u0000\u001f\u0082\u0001\u0000\u0000\u0000!\u0084"+
		"\u0001\u0000\u0000\u0000#\u0087\u0001\u0000\u0000\u0000%\u008b\u0001\u0000"+
		"\u0000\u0000\'\u008d\u0001\u0000\u0000\u0000)*\u0005H\u0000\u0000*+\u0005"+
		"e\u0000\u0000+,\u0005a\u0000\u0000,-\u0005d\u0000\u0000-.\u0005e\u0000"+
		"\u0000./\u0005r\u0000\u0000/0\u0005:\u0000\u000001\u0005 \u0000\u0000"+
		"1\u0002\u0001\u0000\u0000\u000023\u0005S\u0000\u000034\u0005e\u0000\u0000"+
		"45\u0005c\u0000\u000056\u0005t\u0000\u000067\u0005i\u0000\u000078\u0005"+
		"o\u0000\u000089\u0005n\u0000\u00009:\u0005:\u0000\u0000:;\u0005 \u0000"+
		"\u0000;\u0004\u0001\u0000\u0000\u0000<=\u0005S\u0000\u0000=>\u0005e\u0000"+
		"\u0000>?\u0005c\u0000\u0000?@\u0005t\u0000\u0000@A\u0005i\u0000\u0000"+
		"AB\u0005o\u0000\u0000BC\u0005n\u0000\u0000CD\u0005 \u0000\u0000DE\u0005"+
		"d\u0000\u0000EF\u0005e\u0000\u0000FG\u0005s\u0000\u0000GH\u0005c\u0000"+
		"\u0000HI\u0005r\u0000\u0000IJ\u0005i\u0000\u0000JK\u0005p\u0000\u0000"+
		"KL\u0005t\u0000\u0000LM\u0005i\u0000\u0000MN\u0005o\u0000\u0000NO\u0005"+
		"n\u0000\u0000OP\u0005:\u0000\u0000PQ\u0005 \u0000\u0000Q\u0006\u0001\u0000"+
		"\u0000\u0000RS\u0005S\u0000\u0000ST\u0005o\u0000\u0000TU\u0005l\u0000"+
		"\u0000UV\u0005u\u0000\u0000VW\u0005t\u0000\u0000WX\u0005i\u0000\u0000"+
		"XY\u0005o\u0000\u0000YZ\u0005n\u0000\u0000Z[\u0005:\u0000\u0000[\\\u0005"+
		" \u0000\u0000\\\b\u0001\u0000\u0000\u0000]^\u0005T\u0000\u0000^\n\u0001"+
		"\u0000\u0000\u0000_`\u0005F\u0000\u0000`\f\u0001\u0000\u0000\u0000ab\u0005"+
		"t\u0000\u0000b\u000e\u0001\u0000\u0000\u0000cd\u0005f\u0000\u0000d\u0010"+
		"\u0001\u0000\u0000\u0000ef\u0005,\u0000\u0000f\u0012\u0001\u0000\u0000"+
		"\u0000gh\u0005(\u0000\u0000h\u0014\u0001\u0000\u0000\u0000ij\u0005p\u0000"+
		"\u0000jk\u0005t\u0000\u0000kl\u0005s\u0000\u0000lm\u0005)\u0000\u0000"+
		"m\u0016\u0001\u0000\u0000\u0000no\u0005F\u0000\u0000op\u0005e\u0000\u0000"+
		"pq\u0005e\u0000\u0000qr\u0005d\u0000\u0000rs\u0005b\u0000\u0000st\u0005"+
		"a\u0000\u0000tu\u0005c\u0000\u0000uv\u0005k\u0000\u0000vw\u0005:\u0000"+
		"\u0000wx\u0005 \u0000\u0000x\u0018\u0001\u0000\u0000\u0000yz\u0007\u0000"+
		"\u0000\u0000z\u001a\u0001\u0000\u0000\u0000{|\u0005 \u0000\u0000|\u001c"+
		"\u0001\u0000\u0000\u0000}\u007f\u0007\u0001\u0000\u0000~}\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u001e\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0005:\u0000\u0000\u0083 \u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0005-\u0000\u0000\u0085\"\u0001\u0000\u0000\u0000\u0086\u0088"+
		"\u0007\u0002\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0001\u0000\u0000\u0000\u008a$\u0001\u0000\u0000\u0000\u008b\u008c\b"+
		"\u0003\u0000\u0000\u008c&\u0001\u0000\u0000\u0000\u008d\u008e\u0005|\u0000"+
		"\u0000\u008e\u008f\u0005|\u0000\u0000\u008f\u0090\u0005W\u0000\u0000\u0090"+
		"\u0091\u0005O\u0000\u0000\u0091\u0092\u0005R\u0000\u0000\u0092\u0093\u0005"+
		"D\u0000\u0000\u0093\u0094\u0005|\u0000\u0000\u0094\u0095\u0005|\u0000"+
		"\u0000\u0095(\u0001\u0000\u0000\u0000\u0003\u0000\u0080\u0089\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}