package main.tokenizer;

import java.util.Map;

import main.data.readers.TokensReader;
import main.spelling.CustomLevenshtein;
import main.spelling.data.WordWithProximity;
import main.tokenizer.data.Token;
import main.tokenizer.data.TokenType;

public class TokenFactory {
	private static final Map<String, TokenConstant> tokens = new TokensReader().getData();

	public static Token create(String inputString) {
		String token;
		TokenType type;
		
		WordWithProximity result = tokens
			.keySet()
			.stream()
			.map(t -> new WordWithProximity(t, CustomLevenshtein.levenshteinCompare(t, inputString)))
			.filter(t -> t.getProximity() <= 3.0)
			.sorted((w1, w2) -> Double.compare(w1.getProximity(), w2.getProximity()))
			.findFirst()
			.orElse(null);
		
		if (result != null) {
			String word = result.getWord();
			TokenConstant resultingToken = tokens.get(word);
			type = resultingToken.getType();
			token = resultingToken.name();
		} else {
			type = TokenType.WORD;
			token = inputString;
		}
		
		return new Token(token, type);
	}
}
