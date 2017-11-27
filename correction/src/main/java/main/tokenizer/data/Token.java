package main.tokenizer.data;

import java.util.Map;

import main.data.readers.TokensReader;
import main.spelling.CustomLevenshtein;
import main.spelling.data.WordWithProximity;
import main.tokenizer.TokenConstant;

public class Token {
	private static final Map<String, TokenConstant> tokens = new TokensReader().getData();
	private final TokenType type;
	private final String token;

	public Token(String token) {
		WordWithProximity result = tokens
			.keySet()
			.stream()
			.map(t -> new WordWithProximity(t, CustomLevenshtein.levenshteinCompare(t, token)))
			.filter(t -> t.getProximity() <= 3.0)
			.sorted((w1, w2) -> Double.compare(w1.getProximity(), w2.getProximity()))
			.findFirst()
			.orElse(null);
		
		if (result != null) {
			String word = result.getWord();
			TokenConstant resultingToken = tokens.get(word);
			this.type = resultingToken.getType();
			this.token = resultingToken.name();
		} else {
			this.type = TokenType.WORD;
			this.token = token;
		}
	}

	public Token(String token, TokenType tokenType) {
		this.type = tokenType;
		this.token = token;
	}
	
	public TokenType getType() {
		return type;
	}

	public String getToken() {
		return token;
	}

	@Override
	public String toString() {
		return "Token [type=" + type + ", token=" + token + "]";
	}
}
