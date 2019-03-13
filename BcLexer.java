// Generated from Bc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, FLOAT=37, ID=38, OP=39, 
		END_EXPR=40, WS=41, COMMENT=42, COMMENT2=43, OR=44, AND=45, NOT=46, EQ=47, 
		LT=48, GT=49, NE=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "FLOAT", "ID", "OP", "END_EXPR", "WS", "COMMENT", 
			"COMMENT2", "OR", "AND", "NOT", "EQ", "LT", "GT", "NE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if['", "'] then '", "'elif['", "'else'", "'while['", "'] do'", 
			"'done'", "'for['", "';'", "']'", "'('", "')'", "'++'", "'--'", "'-'", 
			"'^'", "'*'", "'/'", "'%'", "'+'", "'^='", "'*='", "'/='", "'%='", "'+='", 
			"'-='", "'read()'", "'sqrt('", "'s('", "'c('", "'l('", "'e('", "','", 
			"'='", "'define'", "'return'", null, null, null, null, null, null, null, 
			"'||'", "'&&'", "'!'", "'=='", "'<'", "'>'", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "FLOAT", "ID", "OP", "END_EXPR", "WS", "COMMENT", "COMMENT2", "OR", 
			"AND", "NOT", "EQ", "LT", "GT", "NE"
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


	public BcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Bc.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u0137\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3"+
		" \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%"+
		"\3&\6&\u00ed\n&\r&\16&\u00ee\3&\3&\6&\u00f3\n&\r&\16&\u00f4\5&\u00f7\n"+
		"&\3\'\3\'\7\'\u00fb\n\'\f\'\16\'\u00fe\13\'\3(\3(\3)\3)\5)\u0104\n)\3"+
		"*\6*\u0107\n*\r*\16*\u0108\3*\3*\3+\3+\3+\3+\7+\u0111\n+\f+\16+\u0114"+
		"\13+\3+\3+\3+\3+\3+\3,\3,\7,\u011d\n,\f,\16,\u0120\13,\3,\3,\3,\3,\3-"+
		"\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63"+
		"\4\u0112\u011e\2\64\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64\3\2\b\3\2\62;\3\2c|\5\2\62;aac|\6\2\'\',-//\61\61\4\2\f\f==\5\2\13"+
		"\13\17\17\"\"\2\u013e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2\5k\3\2\2"+
		"\2\7s\3\2\2\2\ty\3\2\2\2\13~\3\2\2\2\r\u0085\3\2\2\2\17\u008a\3\2\2\2"+
		"\21\u008f\3\2\2\2\23\u0094\3\2\2\2\25\u0096\3\2\2\2\27\u0098\3\2\2\2\31"+
		"\u009a\3\2\2\2\33\u009c\3\2\2\2\35\u009f\3\2\2\2\37\u00a2\3\2\2\2!\u00a4"+
		"\3\2\2\2#\u00a6\3\2\2\2%\u00a8\3\2\2\2\'\u00aa\3\2\2\2)\u00ac\3\2\2\2"+
		"+\u00ae\3\2\2\2-\u00b1\3\2\2\2/\u00b4\3\2\2\2\61\u00b7\3\2\2\2\63\u00ba"+
		"\3\2\2\2\65\u00bd\3\2\2\2\67\u00c0\3\2\2\29\u00c7\3\2\2\2;\u00cd\3\2\2"+
		"\2=\u00d0\3\2\2\2?\u00d3\3\2\2\2A\u00d6\3\2\2\2C\u00d9\3\2\2\2E\u00db"+
		"\3\2\2\2G\u00dd\3\2\2\2I\u00e4\3\2\2\2K\u00ec\3\2\2\2M\u00f8\3\2\2\2O"+
		"\u00ff\3\2\2\2Q\u0103\3\2\2\2S\u0106\3\2\2\2U\u010c\3\2\2\2W\u011a\3\2"+
		"\2\2Y\u0125\3\2\2\2[\u0128\3\2\2\2]\u012b\3\2\2\2_\u012d\3\2\2\2a\u0130"+
		"\3\2\2\2c\u0132\3\2\2\2e\u0134\3\2\2\2gh\7k\2\2hi\7h\2\2ij\7]\2\2j\4\3"+
		"\2\2\2kl\7_\2\2lm\7\"\2\2mn\7v\2\2no\7j\2\2op\7g\2\2pq\7p\2\2qr\7\"\2"+
		"\2r\6\3\2\2\2st\7g\2\2tu\7n\2\2uv\7k\2\2vw\7h\2\2wx\7]\2\2x\b\3\2\2\2"+
		"yz\7g\2\2z{\7n\2\2{|\7u\2\2|}\7g\2\2}\n\3\2\2\2~\177\7y\2\2\177\u0080"+
		"\7j\2\2\u0080\u0081\7k\2\2\u0081\u0082\7n\2\2\u0082\u0083\7g\2\2\u0083"+
		"\u0084\7]\2\2\u0084\f\3\2\2\2\u0085\u0086\7_\2\2\u0086\u0087\7\"\2\2\u0087"+
		"\u0088\7f\2\2\u0088\u0089\7q\2\2\u0089\16\3\2\2\2\u008a\u008b\7f\2\2\u008b"+
		"\u008c\7q\2\2\u008c\u008d\7p\2\2\u008d\u008e\7g\2\2\u008e\20\3\2\2\2\u008f"+
		"\u0090\7h\2\2\u0090\u0091\7q\2\2\u0091\u0092\7t\2\2\u0092\u0093\7]\2\2"+
		"\u0093\22\3\2\2\2\u0094\u0095\7=\2\2\u0095\24\3\2\2\2\u0096\u0097\7_\2"+
		"\2\u0097\26\3\2\2\2\u0098\u0099\7*\2\2\u0099\30\3\2\2\2\u009a\u009b\7"+
		"+\2\2\u009b\32\3\2\2\2\u009c\u009d\7-\2\2\u009d\u009e\7-\2\2\u009e\34"+
		"\3\2\2\2\u009f\u00a0\7/\2\2\u00a0\u00a1\7/\2\2\u00a1\36\3\2\2\2\u00a2"+
		"\u00a3\7/\2\2\u00a3 \3\2\2\2\u00a4\u00a5\7`\2\2\u00a5\"\3\2\2\2\u00a6"+
		"\u00a7\7,\2\2\u00a7$\3\2\2\2\u00a8\u00a9\7\61\2\2\u00a9&\3\2\2\2\u00aa"+
		"\u00ab\7\'\2\2\u00ab(\3\2\2\2\u00ac\u00ad\7-\2\2\u00ad*\3\2\2\2\u00ae"+
		"\u00af\7`\2\2\u00af\u00b0\7?\2\2\u00b0,\3\2\2\2\u00b1\u00b2\7,\2\2\u00b2"+
		"\u00b3\7?\2\2\u00b3.\3\2\2\2\u00b4\u00b5\7\61\2\2\u00b5\u00b6\7?\2\2\u00b6"+
		"\60\3\2\2\2\u00b7\u00b8\7\'\2\2\u00b8\u00b9\7?\2\2\u00b9\62\3\2\2\2\u00ba"+
		"\u00bb\7-\2\2\u00bb\u00bc\7?\2\2\u00bc\64\3\2\2\2\u00bd\u00be\7/\2\2\u00be"+
		"\u00bf\7?\2\2\u00bf\66\3\2\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7g\2\2\u00c2"+
		"\u00c3\7c\2\2\u00c3\u00c4\7f\2\2\u00c4\u00c5\7*\2\2\u00c5\u00c6\7+\2\2"+
		"\u00c68\3\2\2\2\u00c7\u00c8\7u\2\2\u00c8\u00c9\7s\2\2\u00c9\u00ca\7t\2"+
		"\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7*\2\2\u00cc:\3\2\2\2\u00cd\u00ce\7"+
		"u\2\2\u00ce\u00cf\7*\2\2\u00cf<\3\2\2\2\u00d0\u00d1\7e\2\2\u00d1\u00d2"+
		"\7*\2\2\u00d2>\3\2\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5\7*\2\2\u00d5@\3"+
		"\2\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7*\2\2\u00d8B\3\2\2\2\u00d9\u00da"+
		"\7.\2\2\u00daD\3\2\2\2\u00db\u00dc\7?\2\2\u00dcF\3\2\2\2\u00dd\u00de\7"+
		"f\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7h\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2"+
		"\7p\2\2\u00e2\u00e3\7g\2\2\u00e3H\3\2\2\2\u00e4\u00e5\7t\2\2\u00e5\u00e6"+
		"\7g\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7w\2\2\u00e8\u00e9\7t\2\2\u00e9"+
		"\u00ea\7p\2\2\u00eaJ\3\2\2\2\u00eb\u00ed\t\2\2\2\u00ec\u00eb\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f6\3\2"+
		"\2\2\u00f0\u00f2\7\60\2\2\u00f1\u00f3\t\2\2\2\u00f2\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2"+
		"\2\2\u00f6\u00f0\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7L\3\2\2\2\u00f8\u00fc"+
		"\t\3\2\2\u00f9\u00fb\t\4\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fdN\3\2\2\2\u00fe\u00fc\3\2\2\2"+
		"\u00ff\u0100\t\5\2\2\u0100P\3\2\2\2\u0101\u0104\t\6\2\2\u0102\u0104\5"+
		"W,\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104R\3\2\2\2\u0105\u0107"+
		"\t\7\2\2\u0106\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0106\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\b*\2\2\u010bT\3\2\2\2\u010c"+
		"\u010d\7\61\2\2\u010d\u010e\7,\2\2\u010e\u0112\3\2\2\2\u010f\u0111\13"+
		"\2\2\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0113\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\7,"+
		"\2\2\u0116\u0117\7\61\2\2\u0117\u0118\3\2\2\2\u0118\u0119\b+\2\2\u0119"+
		"V\3\2\2\2\u011a\u011e\7%\2\2\u011b\u011d\13\2\2\2\u011c\u011b\3\2\2\2"+
		"\u011d\u0120\3\2\2\2\u011e\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0121"+
		"\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\7\f\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0124\b,\2\2\u0124X\3\2\2\2\u0125\u0126\7~\2\2\u0126\u0127\7~\2\2\u0127"+
		"Z\3\2\2\2\u0128\u0129\7(\2\2\u0129\u012a\7(\2\2\u012a\\\3\2\2\2\u012b"+
		"\u012c\7#\2\2\u012c^\3\2\2\2\u012d\u012e\7?\2\2\u012e\u012f\7?\2\2\u012f"+
		"`\3\2\2\2\u0130\u0131\7>\2\2\u0131b\3\2\2\2\u0132\u0133\7@\2\2\u0133d"+
		"\3\2\2\2\u0134\u0135\7#\2\2\u0135\u0136\7?\2\2\u0136f\3\2\2\2\13\2\u00ee"+
		"\u00f4\u00f6\u00fc\u0103\u0108\u0112\u011e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}