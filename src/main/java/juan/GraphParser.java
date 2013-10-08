// Generated from juan/Graph.g4 by ANTLR 4.0
package juan;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GraphParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, ID=6, NUM=7, WS=8;
	public static final String[] tokenNames = {
		"<INVALID>", "'->'", "')'", "'('", "'Graph {'", "'}'", "ID", "NUM", "WS"
	};
	public static final int
		RULE_graph = 0, RULE_vertex = 1, RULE_edge = 2;
	public static final String[] ruleNames = {
		"graph", "vertex", "edge"
	};

	@Override
	public String getGrammarFileName() { return "Graph.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public GraphParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GraphContext extends ParserRuleContext {
		public List<EdgeContext> edge() {
			return getRuleContexts(EdgeContext.class);
		}
		public EdgeContext edge(int i) {
			return getRuleContext(EdgeContext.class,i);
		}
		public GraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphListener ) ((GraphListener)listener).enterGraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphListener ) ((GraphListener)listener).exitGraph(this);
		}
	}

	public final GraphContext graph() throws RecognitionException {
		GraphContext _localctx = new GraphContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_graph);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6); match(4);
			setState(8); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(7); edge();
				}
				}
				setState(10); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(12); match(5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VertexContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GraphParser.ID, 0); }
		public VertexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vertex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphListener ) ((GraphListener)listener).enterVertex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphListener ) ((GraphListener)listener).exitVertex(this);
		}
	}

	public final VertexContext vertex() throws RecognitionException {
		VertexContext _localctx = new VertexContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_vertex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EdgeContext extends ParserRuleContext {
		public List<VertexContext> vertex() {
			return getRuleContexts(VertexContext.class);
		}
		public TerminalNode NUM() { return getToken(GraphParser.NUM, 0); }
		public VertexContext vertex(int i) {
			return getRuleContext(VertexContext.class,i);
		}
		public EdgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphListener ) ((GraphListener)listener).enterEdge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphListener ) ((GraphListener)listener).exitEdge(this);
		}
	}

	public final EdgeContext edge() throws RecognitionException {
		EdgeContext _localctx = new EdgeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_edge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); vertex();
			setState(17); match(1);
			setState(18); vertex();
			setState(19); match(3);
			setState(20); match(NUM);
			setState(21); match(2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\2\3\n\32\4\2\t\2\4\3\t\3\4\4\t\4\3\2\3\2\6\2\13\n\2\r\2\16\2\f\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\2\5\2\4\6\2\2\27\2\b\3\2\2"+
		"\2\4\20\3\2\2\2\6\22\3\2\2\2\b\n\7\6\2\2\t\13\5\6\4\2\n\t\3\2\2\2\13\f"+
		"\3\2\2\2\f\n\3\2\2\2\f\r\3\2\2\2\r\16\3\2\2\2\16\17\7\7\2\2\17\3\3\2\2"+
		"\2\20\21\7\b\2\2\21\5\3\2\2\2\22\23\5\4\3\2\23\24\7\3\2\2\24\25\5\4\3"+
		"\2\25\26\7\5\2\2\26\27\7\t\2\2\27\30\7\4\2\2\30\7\3\2\2\2\3\f";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}