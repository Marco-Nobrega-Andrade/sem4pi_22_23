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
		SOLUTION_ENTRY=1, TRUE_FALSE_RESPONSES=2, HEADER_ENTRY=3, SECTION_ENTRY=4, 
		SECTION_DESCRIPTION_ENTRY=5, FEEDBACK_ENTRY=6, QUESTION_ENTRY=7, POINTS_ENTRY=8, 
		COMMA=9, WS=10, HASH=11, NEWLINE=12, WORD=13, COLON=14, DASH=15, INT=16, 
		ANY_CHAR=17, MISSING_WORD=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SOLUTION_ENTRY", "TRUE_FALSE_RESPONSES", "HEADER_ENTRY", "SECTION_ENTRY", 
			"SECTION_DESCRIPTION_ENTRY", "FEEDBACK_ENTRY", "QUESTION_ENTRY", "POINTS_ENTRY", 
			"COMMA", "WS", "HASH", "NEWLINE", "WORD", "COLON", "DASH", "INT", "ANY_CHAR", 
			"MISSING_WORD"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "','", null, "'#'", 
			null, null, "':'", "'-'", null, null, "'||WORD||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SOLUTION_ENTRY", "TRUE_FALSE_RESPONSES", "HEADER_ENTRY", "SECTION_ENTRY", 
			"SECTION_DESCRIPTION_ENTRY", "FEEDBACK_ENTRY", "QUESTION_ENTRY", "POINTS_ENTRY", 
			"COMMA", "WS", "HASH", "NEWLINE", "WORD", "COLON", "DASH", "INT", "ANY_CHAR", 
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
		"\u0004\u0000\u0012\u00a8\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0004\u0000\'\b\u0000\u000b\u0000\f\u0000(\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0004\t\u0083\b\t\u000b\t\f\t\u0084\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\u000b\u0004\u000b\u008c\b\u000b\u000b\u000b\f\u000b"+
		"\u008d\u0001\f\u0004\f\u0091\b\f\u000b\f\f\f\u0092\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0004\u000f\u009a\b\u000f\u000b\u000f\f"+
		"\u000f\u009b\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0000\u0000\u0012\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012\u0001\u0000\u0006"+
		"\u0004\u0000FFTTfftt\u0002\u0000\t\t  \u0002\u0000\n\n\r\r\u0002\u0000"+
		"AZaz\u0001\u000009\u0002\u0000\t\n\r\r\u00ac\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0001&\u0001\u0000\u0000\u0000\u00035\u0001\u0000\u0000"+
		"\u0000\u00057\u0001\u0000\u0000\u0000\u0007@\u0001\u0000\u0000\u0000\t"+
		"J\u0001\u0000\u0000\u0000\u000b`\u0001\u0000\u0000\u0000\rk\u0001\u0000"+
		"\u0000\u0000\u000fv\u0001\u0000\u0000\u0000\u0011\u007f\u0001\u0000\u0000"+
		"\u0000\u0013\u0082\u0001\u0000\u0000\u0000\u0015\u0088\u0001\u0000\u0000"+
		"\u0000\u0017\u008b\u0001\u0000\u0000\u0000\u0019\u0090\u0001\u0000\u0000"+
		"\u0000\u001b\u0094\u0001\u0000\u0000\u0000\u001d\u0096\u0001\u0000\u0000"+
		"\u0000\u001f\u0099\u0001\u0000\u0000\u0000!\u009d\u0001\u0000\u0000\u0000"+
		"#\u009f\u0001\u0000\u0000\u0000%\'\u0003\u0017\u000b\u0000&%\u0001\u0000"+
		"\u0000\u0000\'(\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001"+
		"\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*+\u0003\u0015\n\u0000+,\u0005"+
		"S\u0000\u0000,-\u0005o\u0000\u0000-.\u0005l\u0000\u0000./\u0005u\u0000"+
		"\u0000/0\u0005t\u0000\u000001\u0005i\u0000\u000012\u0005o\u0000\u0000"+
		"23\u0005n\u0000\u000034\u0005:\u0000\u00004\u0002\u0001\u0000\u0000\u0000"+
		"56\u0007\u0000\u0000\u00006\u0004\u0001\u0000\u0000\u000078\u0003\u0015"+
		"\n\u000089\u0005H\u0000\u00009:\u0005e\u0000\u0000:;\u0005a\u0000\u0000"+
		";<\u0005d\u0000\u0000<=\u0005e\u0000\u0000=>\u0005r\u0000\u0000>?\u0005"+
		":\u0000\u0000?\u0006\u0001\u0000\u0000\u0000@A\u0003\u0015\n\u0000AB\u0005"+
		"S\u0000\u0000BC\u0005e\u0000\u0000CD\u0005c\u0000\u0000DE\u0005t\u0000"+
		"\u0000EF\u0005i\u0000\u0000FG\u0005o\u0000\u0000GH\u0005n\u0000\u0000"+
		"HI\u0005:\u0000\u0000I\b\u0001\u0000\u0000\u0000JK\u0003\u0015\n\u0000"+
		"KL\u0005S\u0000\u0000LM\u0005e\u0000\u0000MN\u0005c\u0000\u0000NO\u0005"+
		"t\u0000\u0000OP\u0005i\u0000\u0000PQ\u0005o\u0000\u0000QR\u0005n\u0000"+
		"\u0000RS\u0005 \u0000\u0000ST\u0005d\u0000\u0000TU\u0005e\u0000\u0000"+
		"UV\u0005s\u0000\u0000VW\u0005c\u0000\u0000WX\u0005r\u0000\u0000XY\u0005"+
		"i\u0000\u0000YZ\u0005p\u0000\u0000Z[\u0005t\u0000\u0000[\\\u0005i\u0000"+
		"\u0000\\]\u0005o\u0000\u0000]^\u0005n\u0000\u0000^_\u0005:\u0000\u0000"+
		"_\n\u0001\u0000\u0000\u0000`a\u0003\u0015\n\u0000ab\u0005F\u0000\u0000"+
		"bc\u0005e\u0000\u0000cd\u0005e\u0000\u0000de\u0005d\u0000\u0000ef\u0005"+
		"b\u0000\u0000fg\u0005a\u0000\u0000gh\u0005c\u0000\u0000hi\u0005k\u0000"+
		"\u0000ij\u0005:\u0000\u0000j\f\u0001\u0000\u0000\u0000kl\u0003\u0015\n"+
		"\u0000lm\u0005Q\u0000\u0000mn\u0005u\u0000\u0000no\u0005e\u0000\u0000"+
		"op\u0005s\u0000\u0000pq\u0005t\u0000\u0000qr\u0005i\u0000\u0000rs\u0005"+
		"o\u0000\u0000st\u0005n\u0000\u0000tu\u0005:\u0000\u0000u\u000e\u0001\u0000"+
		"\u0000\u0000vw\u0003\u0015\n\u0000wx\u0005P\u0000\u0000xy\u0005o\u0000"+
		"\u0000yz\u0005i\u0000\u0000z{\u0005n\u0000\u0000{|\u0005t\u0000\u0000"+
		"|}\u0005s\u0000\u0000}~\u0005:\u0000\u0000~\u0010\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0005,\u0000\u0000\u0080\u0012\u0001\u0000\u0000\u0000\u0081"+
		"\u0083\u0007\u0001\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0006\t\u0000\u0000\u0087\u0014\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0005#\u0000\u0000\u0089\u0016\u0001\u0000\u0000\u0000\u008a\u008c\u0007"+
		"\u0002\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001"+
		"\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001"+
		"\u0000\u0000\u0000\u008e\u0018\u0001\u0000\u0000\u0000\u008f\u0091\u0007"+
		"\u0003\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001"+
		"\u0000\u0000\u0000\u0093\u001a\u0001\u0000\u0000\u0000\u0094\u0095\u0005"+
		":\u0000\u0000\u0095\u001c\u0001\u0000\u0000\u0000\u0096\u0097\u0005-\u0000"+
		"\u0000\u0097\u001e\u0001\u0000\u0000\u0000\u0098\u009a\u0007\u0004\u0000"+
		"\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000"+
		"\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000"+
		"\u0000\u009c \u0001\u0000\u0000\u0000\u009d\u009e\b\u0005\u0000\u0000"+
		"\u009e\"\u0001\u0000\u0000\u0000\u009f\u00a0\u0005|\u0000\u0000\u00a0"+
		"\u00a1\u0005|\u0000\u0000\u00a1\u00a2\u0005W\u0000\u0000\u00a2\u00a3\u0005"+
		"O\u0000\u0000\u00a3\u00a4\u0005R\u0000\u0000\u00a4\u00a5\u0005D\u0000"+
		"\u0000\u00a5\u00a6\u0005|\u0000\u0000\u00a6\u00a7\u0005|\u0000\u0000\u00a7"+
		"$\u0001\u0000\u0000\u0000\u0006\u0000(\u0084\u008d\u0092\u009b\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}