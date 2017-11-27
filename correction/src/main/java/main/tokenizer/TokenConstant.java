package main.tokenizer;

import main.tokenizer.data.TokenType;

public enum TokenConstant {
	// REQUEST ITEMS : colonnes
	MOT(TokenType.REQUEST_ITEMS),
	FICHIER(TokenType.REQUEST_ITEMS),
	NUMERO(TokenType.REQUEST_ITEMS),
	DATE(TokenType.REQUEST_ITEMS),
	// COUNT
	NOMBRE(TokenType.REQUEST_ITEMS),
	// REQUEST TYPE
	SELECT(TokenType.REQUEST_TYPE),
	// REQUEST TABLE
	TEXTE(TokenType.REQUEST_TABLE),
	// CONJUNCTION
	ET(TokenType.CONJUNCTION),
	OU(TokenType.CONJUNCTION);
	
	private final TokenType type;

	private TokenConstant(TokenType type) {
		this.type = type;
	}

	public TokenType getType() {
		return type;
	}
}
