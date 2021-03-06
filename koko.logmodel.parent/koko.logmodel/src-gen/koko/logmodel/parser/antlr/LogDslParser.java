/*
 * generated by Xtext 2.25.0
 */
package koko.logmodel.parser.antlr;

import com.google.inject.Inject;
import koko.logmodel.parser.antlr.internal.InternalLogDslParser;
import koko.logmodel.services.LogDslGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class LogDslParser extends AbstractAntlrParser {

	@Inject
	private LogDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalLogDslParser createParser(XtextTokenStream stream) {
		return new InternalLogDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "LogDocument";
	}

	public LogDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LogDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
