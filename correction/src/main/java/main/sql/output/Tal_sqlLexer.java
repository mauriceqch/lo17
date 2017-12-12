// $ANTLR 3.5.1 /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g 2017-12-12 15:56:16

    package main.sql.output;
    import main.sql.data.Arbre;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class Tal_sqlLexer extends Lexer {
	public static final int EOF=-1;
	public static final int CHAR=4;
	public static final int CONJ=5;
	public static final int COUNT=6;
	public static final int DATE=7;
	public static final int FICHIER=8;
	public static final int NOMBRE=9;
	public static final int NUMERO=10;
	public static final int POINT=11;
	public static final int SELECT=12;
	public static final int TEXTE=13;
	public static final int VAR=14;
	public static final int WS=15;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public Tal_sqlLexer() {} 
	public Tal_sqlLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public Tal_sqlLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g"; }

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:13:8: ( 'SELECT' )
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:13:10: 'SELECT'
			{
			match("SELECT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT"

	// $ANTLR start "COUNT"
	public final void mCOUNT() throws RecognitionException {
		try {
			int _type = COUNT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:16:8: ( 'COUNT' )
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:16:10: 'COUNT'
			{
			match("COUNT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COUNT"

	// $ANTLR start "FICHIER"
	public final void mFICHIER() throws RecognitionException {
		try {
			int _type = FICHIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:19:9: ( 'FICHIER' )
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:19:11: 'FICHIER'
			{
			match("FICHIER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FICHIER"

	// $ANTLR start "NUMERO"
	public final void mNUMERO() throws RecognitionException {
		try {
			int _type = NUMERO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:22:8: ( 'NUMERO' )
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:22:10: 'NUMERO'
			{
			match("NUMERO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMERO"

	// $ANTLR start "NOMBRE"
	public final void mNOMBRE() throws RecognitionException {
		try {
			int _type = NOMBRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:25:8: ( 'NOMBRE' )
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:25:10: 'NOMBRE'
			{
			match("NOMBRE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOMBRE"

	// $ANTLR start "CONJ"
	public final void mCONJ() throws RecognitionException {
		try {
			int _type = CONJ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:28:6: ( 'ET' | 'OU' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='E') ) {
				alt1=1;
			}
			else if ( (LA1_0=='O') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:28:8: 'ET'
					{
					match("ET"); 

					}
					break;
				case 2 :
					// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:28:15: 'OU'
					{
					match("OU"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONJ"

	// $ANTLR start "POINT"
	public final void mPOINT() throws RecognitionException {
		try {
			int _type = POINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:31:7: ( '.' )
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:31:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POINT"

	// $ANTLR start "TEXTE"
	public final void mTEXTE() throws RecognitionException {
		try {
			int _type = TEXTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:34:7: ( 'TEXTE' )
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:34:9: 'TEXTE'
			{
			match("TEXTE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TEXTE"

	// $ANTLR start "DATE"
	public final void mDATE() throws RecognitionException {
		try {
			int _type = DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:37:6: ( 'DATE' )
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:37:8: 'DATE'
			{
			match("DATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:40:7: ( 'Â' .. 'ü' | 'a' .. 'z' | 'A' .. 'Z' )
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00C2' && input.LA(1) <= '\u00FC') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:43:6: ( ( CHAR | '0' .. '9' )+ )
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:43:8: ( CHAR | '0' .. '9' )+
			{
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:43:8: ( CHAR | '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')||(LA2_0 >= '\u00C2' && LA2_0 <= '\u00FC')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00C2' && input.LA(1) <= '\u00FC') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:46:5: ( ( ' ' | '\\t' | '\\r' ) | '\\n' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='\t'||LA3_0=='\r'||LA3_0==' ') ) {
				alt3=1;
			}
			else if ( (LA3_0=='\n') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:46:7: ( ' ' | '\\t' | '\\r' )
					{
					if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					skip();
					}
					break;
				case 2 :
					// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:46:38: '\\n'
					{
					match('\n'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:1:8: ( SELECT | COUNT | FICHIER | NUMERO | NOMBRE | CONJ | POINT | TEXTE | DATE | CHAR | VAR | WS )
		int alt4=12;
		switch ( input.LA(1) ) {
		case 'S':
			{
			switch ( input.LA(2) ) {
			case 'E':
				{
				int LA4_13 = input.LA(3);
				if ( (LA4_13=='L') ) {
					int LA4_23 = input.LA(4);
					if ( (LA4_23=='E') ) {
						int LA4_31 = input.LA(5);
						if ( (LA4_31=='C') ) {
							int LA4_38 = input.LA(6);
							if ( (LA4_38=='T') ) {
								int LA4_45 = input.LA(7);
								if ( ((LA4_45 >= '0' && LA4_45 <= '9')||(LA4_45 >= 'A' && LA4_45 <= 'Z')||(LA4_45 >= 'a' && LA4_45 <= 'z')||(LA4_45 >= '\u00C2' && LA4_45 <= '\u00FC')) ) {
									alt4=11;
								}

								else {
									alt4=1;
								}

							}

							else {
								alt4=11;
							}

						}

						else {
							alt4=11;
						}

					}

					else {
						alt4=11;
					}

				}

				else {
					alt4=11;
				}

				}
				break;
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
			case 'A':
			case 'B':
			case 'C':
			case 'D':
			case 'F':
			case 'G':
			case 'H':
			case 'I':
			case 'J':
			case 'K':
			case 'L':
			case 'M':
			case 'N':
			case 'O':
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
			case 'T':
			case 'U':
			case 'V':
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
			case 'a':
			case 'b':
			case 'c':
			case 'd':
			case 'e':
			case 'f':
			case 'g':
			case 'h':
			case 'i':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'o':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'u':
			case 'v':
			case 'w':
			case 'x':
			case 'y':
			case 'z':
			case '\u00C2':
			case '\u00C3':
			case '\u00C4':
			case '\u00C5':
			case '\u00C6':
			case '\u00C7':
			case '\u00C8':
			case '\u00C9':
			case '\u00CA':
			case '\u00CB':
			case '\u00CC':
			case '\u00CD':
			case '\u00CE':
			case '\u00CF':
			case '\u00D0':
			case '\u00D1':
			case '\u00D2':
			case '\u00D3':
			case '\u00D4':
			case '\u00D5':
			case '\u00D6':
			case '\u00D7':
			case '\u00D8':
			case '\u00D9':
			case '\u00DA':
			case '\u00DB':
			case '\u00DC':
			case '\u00DD':
			case '\u00DE':
			case '\u00DF':
			case '\u00E0':
			case '\u00E1':
			case '\u00E2':
			case '\u00E3':
			case '\u00E4':
			case '\u00E5':
			case '\u00E6':
			case '\u00E7':
			case '\u00E8':
			case '\u00E9':
			case '\u00EA':
			case '\u00EB':
			case '\u00EC':
			case '\u00ED':
			case '\u00EE':
			case '\u00EF':
			case '\u00F0':
			case '\u00F1':
			case '\u00F2':
			case '\u00F3':
			case '\u00F4':
			case '\u00F5':
			case '\u00F6':
			case '\u00F7':
			case '\u00F8':
			case '\u00F9':
			case '\u00FA':
			case '\u00FB':
			case '\u00FC':
				{
				alt4=11;
				}
				break;
			default:
				alt4=10;
			}
			}
			break;
		case 'C':
			{
			switch ( input.LA(2) ) {
			case 'O':
				{
				int LA4_15 = input.LA(3);
				if ( (LA4_15=='U') ) {
					int LA4_24 = input.LA(4);
					if ( (LA4_24=='N') ) {
						int LA4_32 = input.LA(5);
						if ( (LA4_32=='T') ) {
							int LA4_39 = input.LA(6);
							if ( ((LA4_39 >= '0' && LA4_39 <= '9')||(LA4_39 >= 'A' && LA4_39 <= 'Z')||(LA4_39 >= 'a' && LA4_39 <= 'z')||(LA4_39 >= '\u00C2' && LA4_39 <= '\u00FC')) ) {
								alt4=11;
							}

							else {
								alt4=2;
							}

						}

						else {
							alt4=11;
						}

					}

					else {
						alt4=11;
					}

				}

				else {
					alt4=11;
				}

				}
				break;
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
			case 'A':
			case 'B':
			case 'C':
			case 'D':
			case 'E':
			case 'F':
			case 'G':
			case 'H':
			case 'I':
			case 'J':
			case 'K':
			case 'L':
			case 'M':
			case 'N':
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
			case 'T':
			case 'U':
			case 'V':
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
			case 'a':
			case 'b':
			case 'c':
			case 'd':
			case 'e':
			case 'f':
			case 'g':
			case 'h':
			case 'i':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'o':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'u':
			case 'v':
			case 'w':
			case 'x':
			case 'y':
			case 'z':
			case '\u00C2':
			case '\u00C3':
			case '\u00C4':
			case '\u00C5':
			case '\u00C6':
			case '\u00C7':
			case '\u00C8':
			case '\u00C9':
			case '\u00CA':
			case '\u00CB':
			case '\u00CC':
			case '\u00CD':
			case '\u00CE':
			case '\u00CF':
			case '\u00D0':
			case '\u00D1':
			case '\u00D2':
			case '\u00D3':
			case '\u00D4':
			case '\u00D5':
			case '\u00D6':
			case '\u00D7':
			case '\u00D8':
			case '\u00D9':
			case '\u00DA':
			case '\u00DB':
			case '\u00DC':
			case '\u00DD':
			case '\u00DE':
			case '\u00DF':
			case '\u00E0':
			case '\u00E1':
			case '\u00E2':
			case '\u00E3':
			case '\u00E4':
			case '\u00E5':
			case '\u00E6':
			case '\u00E7':
			case '\u00E8':
			case '\u00E9':
			case '\u00EA':
			case '\u00EB':
			case '\u00EC':
			case '\u00ED':
			case '\u00EE':
			case '\u00EF':
			case '\u00F0':
			case '\u00F1':
			case '\u00F2':
			case '\u00F3':
			case '\u00F4':
			case '\u00F5':
			case '\u00F6':
			case '\u00F7':
			case '\u00F8':
			case '\u00F9':
			case '\u00FA':
			case '\u00FB':
			case '\u00FC':
				{
				alt4=11;
				}
				break;
			default:
				alt4=10;
			}
			}
			break;
		case 'F':
			{
			switch ( input.LA(2) ) {
			case 'I':
				{
				int LA4_16 = input.LA(3);
				if ( (LA4_16=='C') ) {
					int LA4_25 = input.LA(4);
					if ( (LA4_25=='H') ) {
						int LA4_33 = input.LA(5);
						if ( (LA4_33=='I') ) {
							int LA4_40 = input.LA(6);
							if ( (LA4_40=='E') ) {
								int LA4_47 = input.LA(7);
								if ( (LA4_47=='R') ) {
									int LA4_52 = input.LA(8);
									if ( ((LA4_52 >= '0' && LA4_52 <= '9')||(LA4_52 >= 'A' && LA4_52 <= 'Z')||(LA4_52 >= 'a' && LA4_52 <= 'z')||(LA4_52 >= '\u00C2' && LA4_52 <= '\u00FC')) ) {
										alt4=11;
									}

									else {
										alt4=3;
									}

								}

								else {
									alt4=11;
								}

							}

							else {
								alt4=11;
							}

						}

						else {
							alt4=11;
						}

					}

					else {
						alt4=11;
					}

				}

				else {
					alt4=11;
				}

				}
				break;
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
			case 'A':
			case 'B':
			case 'C':
			case 'D':
			case 'E':
			case 'F':
			case 'G':
			case 'H':
			case 'J':
			case 'K':
			case 'L':
			case 'M':
			case 'N':
			case 'O':
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
			case 'T':
			case 'U':
			case 'V':
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
			case 'a':
			case 'b':
			case 'c':
			case 'd':
			case 'e':
			case 'f':
			case 'g':
			case 'h':
			case 'i':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'o':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'u':
			case 'v':
			case 'w':
			case 'x':
			case 'y':
			case 'z':
			case '\u00C2':
			case '\u00C3':
			case '\u00C4':
			case '\u00C5':
			case '\u00C6':
			case '\u00C7':
			case '\u00C8':
			case '\u00C9':
			case '\u00CA':
			case '\u00CB':
			case '\u00CC':
			case '\u00CD':
			case '\u00CE':
			case '\u00CF':
			case '\u00D0':
			case '\u00D1':
			case '\u00D2':
			case '\u00D3':
			case '\u00D4':
			case '\u00D5':
			case '\u00D6':
			case '\u00D7':
			case '\u00D8':
			case '\u00D9':
			case '\u00DA':
			case '\u00DB':
			case '\u00DC':
			case '\u00DD':
			case '\u00DE':
			case '\u00DF':
			case '\u00E0':
			case '\u00E1':
			case '\u00E2':
			case '\u00E3':
			case '\u00E4':
			case '\u00E5':
			case '\u00E6':
			case '\u00E7':
			case '\u00E8':
			case '\u00E9':
			case '\u00EA':
			case '\u00EB':
			case '\u00EC':
			case '\u00ED':
			case '\u00EE':
			case '\u00EF':
			case '\u00F0':
			case '\u00F1':
			case '\u00F2':
			case '\u00F3':
			case '\u00F4':
			case '\u00F5':
			case '\u00F6':
			case '\u00F7':
			case '\u00F8':
			case '\u00F9':
			case '\u00FA':
			case '\u00FB':
			case '\u00FC':
				{
				alt4=11;
				}
				break;
			default:
				alt4=10;
			}
			}
			break;
		case 'N':
			{
			switch ( input.LA(2) ) {
			case 'U':
				{
				int LA4_17 = input.LA(3);
				if ( (LA4_17=='M') ) {
					int LA4_26 = input.LA(4);
					if ( (LA4_26=='E') ) {
						int LA4_34 = input.LA(5);
						if ( (LA4_34=='R') ) {
							int LA4_41 = input.LA(6);
							if ( (LA4_41=='O') ) {
								int LA4_48 = input.LA(7);
								if ( ((LA4_48 >= '0' && LA4_48 <= '9')||(LA4_48 >= 'A' && LA4_48 <= 'Z')||(LA4_48 >= 'a' && LA4_48 <= 'z')||(LA4_48 >= '\u00C2' && LA4_48 <= '\u00FC')) ) {
									alt4=11;
								}

								else {
									alt4=4;
								}

							}

							else {
								alt4=11;
							}

						}

						else {
							alt4=11;
						}

					}

					else {
						alt4=11;
					}

				}

				else {
					alt4=11;
				}

				}
				break;
			case 'O':
				{
				int LA4_18 = input.LA(3);
				if ( (LA4_18=='M') ) {
					int LA4_27 = input.LA(4);
					if ( (LA4_27=='B') ) {
						int LA4_35 = input.LA(5);
						if ( (LA4_35=='R') ) {
							int LA4_42 = input.LA(6);
							if ( (LA4_42=='E') ) {
								int LA4_49 = input.LA(7);
								if ( ((LA4_49 >= '0' && LA4_49 <= '9')||(LA4_49 >= 'A' && LA4_49 <= 'Z')||(LA4_49 >= 'a' && LA4_49 <= 'z')||(LA4_49 >= '\u00C2' && LA4_49 <= '\u00FC')) ) {
									alt4=11;
								}

								else {
									alt4=5;
								}

							}

							else {
								alt4=11;
							}

						}

						else {
							alt4=11;
						}

					}

					else {
						alt4=11;
					}

				}

				else {
					alt4=11;
				}

				}
				break;
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
			case 'A':
			case 'B':
			case 'C':
			case 'D':
			case 'E':
			case 'F':
			case 'G':
			case 'H':
			case 'I':
			case 'J':
			case 'K':
			case 'L':
			case 'M':
			case 'N':
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
			case 'T':
			case 'V':
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
			case 'a':
			case 'b':
			case 'c':
			case 'd':
			case 'e':
			case 'f':
			case 'g':
			case 'h':
			case 'i':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'o':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'u':
			case 'v':
			case 'w':
			case 'x':
			case 'y':
			case 'z':
			case '\u00C2':
			case '\u00C3':
			case '\u00C4':
			case '\u00C5':
			case '\u00C6':
			case '\u00C7':
			case '\u00C8':
			case '\u00C9':
			case '\u00CA':
			case '\u00CB':
			case '\u00CC':
			case '\u00CD':
			case '\u00CE':
			case '\u00CF':
			case '\u00D0':
			case '\u00D1':
			case '\u00D2':
			case '\u00D3':
			case '\u00D4':
			case '\u00D5':
			case '\u00D6':
			case '\u00D7':
			case '\u00D8':
			case '\u00D9':
			case '\u00DA':
			case '\u00DB':
			case '\u00DC':
			case '\u00DD':
			case '\u00DE':
			case '\u00DF':
			case '\u00E0':
			case '\u00E1':
			case '\u00E2':
			case '\u00E3':
			case '\u00E4':
			case '\u00E5':
			case '\u00E6':
			case '\u00E7':
			case '\u00E8':
			case '\u00E9':
			case '\u00EA':
			case '\u00EB':
			case '\u00EC':
			case '\u00ED':
			case '\u00EE':
			case '\u00EF':
			case '\u00F0':
			case '\u00F1':
			case '\u00F2':
			case '\u00F3':
			case '\u00F4':
			case '\u00F5':
			case '\u00F6':
			case '\u00F7':
			case '\u00F8':
			case '\u00F9':
			case '\u00FA':
			case '\u00FB':
			case '\u00FC':
				{
				alt4=11;
				}
				break;
			default:
				alt4=10;
			}
			}
			break;
		case 'E':
			{
			switch ( input.LA(2) ) {
			case 'T':
				{
				int LA4_19 = input.LA(3);
				if ( ((LA4_19 >= '0' && LA4_19 <= '9')||(LA4_19 >= 'A' && LA4_19 <= 'Z')||(LA4_19 >= 'a' && LA4_19 <= 'z')||(LA4_19 >= '\u00C2' && LA4_19 <= '\u00FC')) ) {
					alt4=11;
				}

				else {
					alt4=6;
				}

				}
				break;
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
			case 'A':
			case 'B':
			case 'C':
			case 'D':
			case 'E':
			case 'F':
			case 'G':
			case 'H':
			case 'I':
			case 'J':
			case 'K':
			case 'L':
			case 'M':
			case 'N':
			case 'O':
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
			case 'U':
			case 'V':
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
			case 'a':
			case 'b':
			case 'c':
			case 'd':
			case 'e':
			case 'f':
			case 'g':
			case 'h':
			case 'i':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'o':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'u':
			case 'v':
			case 'w':
			case 'x':
			case 'y':
			case 'z':
			case '\u00C2':
			case '\u00C3':
			case '\u00C4':
			case '\u00C5':
			case '\u00C6':
			case '\u00C7':
			case '\u00C8':
			case '\u00C9':
			case '\u00CA':
			case '\u00CB':
			case '\u00CC':
			case '\u00CD':
			case '\u00CE':
			case '\u00CF':
			case '\u00D0':
			case '\u00D1':
			case '\u00D2':
			case '\u00D3':
			case '\u00D4':
			case '\u00D5':
			case '\u00D6':
			case '\u00D7':
			case '\u00D8':
			case '\u00D9':
			case '\u00DA':
			case '\u00DB':
			case '\u00DC':
			case '\u00DD':
			case '\u00DE':
			case '\u00DF':
			case '\u00E0':
			case '\u00E1':
			case '\u00E2':
			case '\u00E3':
			case '\u00E4':
			case '\u00E5':
			case '\u00E6':
			case '\u00E7':
			case '\u00E8':
			case '\u00E9':
			case '\u00EA':
			case '\u00EB':
			case '\u00EC':
			case '\u00ED':
			case '\u00EE':
			case '\u00EF':
			case '\u00F0':
			case '\u00F1':
			case '\u00F2':
			case '\u00F3':
			case '\u00F4':
			case '\u00F5':
			case '\u00F6':
			case '\u00F7':
			case '\u00F8':
			case '\u00F9':
			case '\u00FA':
			case '\u00FB':
			case '\u00FC':
				{
				alt4=11;
				}
				break;
			default:
				alt4=10;
			}
			}
			break;
		case 'O':
			{
			switch ( input.LA(2) ) {
			case 'U':
				{
				int LA4_20 = input.LA(3);
				if ( ((LA4_20 >= '0' && LA4_20 <= '9')||(LA4_20 >= 'A' && LA4_20 <= 'Z')||(LA4_20 >= 'a' && LA4_20 <= 'z')||(LA4_20 >= '\u00C2' && LA4_20 <= '\u00FC')) ) {
					alt4=11;
				}

				else {
					alt4=6;
				}

				}
				break;
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
			case 'A':
			case 'B':
			case 'C':
			case 'D':
			case 'E':
			case 'F':
			case 'G':
			case 'H':
			case 'I':
			case 'J':
			case 'K':
			case 'L':
			case 'M':
			case 'N':
			case 'O':
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
			case 'T':
			case 'V':
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
			case 'a':
			case 'b':
			case 'c':
			case 'd':
			case 'e':
			case 'f':
			case 'g':
			case 'h':
			case 'i':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'o':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'u':
			case 'v':
			case 'w':
			case 'x':
			case 'y':
			case 'z':
			case '\u00C2':
			case '\u00C3':
			case '\u00C4':
			case '\u00C5':
			case '\u00C6':
			case '\u00C7':
			case '\u00C8':
			case '\u00C9':
			case '\u00CA':
			case '\u00CB':
			case '\u00CC':
			case '\u00CD':
			case '\u00CE':
			case '\u00CF':
			case '\u00D0':
			case '\u00D1':
			case '\u00D2':
			case '\u00D3':
			case '\u00D4':
			case '\u00D5':
			case '\u00D6':
			case '\u00D7':
			case '\u00D8':
			case '\u00D9':
			case '\u00DA':
			case '\u00DB':
			case '\u00DC':
			case '\u00DD':
			case '\u00DE':
			case '\u00DF':
			case '\u00E0':
			case '\u00E1':
			case '\u00E2':
			case '\u00E3':
			case '\u00E4':
			case '\u00E5':
			case '\u00E6':
			case '\u00E7':
			case '\u00E8':
			case '\u00E9':
			case '\u00EA':
			case '\u00EB':
			case '\u00EC':
			case '\u00ED':
			case '\u00EE':
			case '\u00EF':
			case '\u00F0':
			case '\u00F1':
			case '\u00F2':
			case '\u00F3':
			case '\u00F4':
			case '\u00F5':
			case '\u00F6':
			case '\u00F7':
			case '\u00F8':
			case '\u00F9':
			case '\u00FA':
			case '\u00FB':
			case '\u00FC':
				{
				alt4=11;
				}
				break;
			default:
				alt4=10;
			}
			}
			break;
		case '.':
			{
			alt4=7;
			}
			break;
		case 'T':
			{
			switch ( input.LA(2) ) {
			case 'E':
				{
				int LA4_21 = input.LA(3);
				if ( (LA4_21=='X') ) {
					int LA4_29 = input.LA(4);
					if ( (LA4_29=='T') ) {
						int LA4_36 = input.LA(5);
						if ( (LA4_36=='E') ) {
							int LA4_43 = input.LA(6);
							if ( ((LA4_43 >= '0' && LA4_43 <= '9')||(LA4_43 >= 'A' && LA4_43 <= 'Z')||(LA4_43 >= 'a' && LA4_43 <= 'z')||(LA4_43 >= '\u00C2' && LA4_43 <= '\u00FC')) ) {
								alt4=11;
							}

							else {
								alt4=8;
							}

						}

						else {
							alt4=11;
						}

					}

					else {
						alt4=11;
					}

				}

				else {
					alt4=11;
				}

				}
				break;
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
			case 'A':
			case 'B':
			case 'C':
			case 'D':
			case 'F':
			case 'G':
			case 'H':
			case 'I':
			case 'J':
			case 'K':
			case 'L':
			case 'M':
			case 'N':
			case 'O':
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
			case 'T':
			case 'U':
			case 'V':
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
			case 'a':
			case 'b':
			case 'c':
			case 'd':
			case 'e':
			case 'f':
			case 'g':
			case 'h':
			case 'i':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'o':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'u':
			case 'v':
			case 'w':
			case 'x':
			case 'y':
			case 'z':
			case '\u00C2':
			case '\u00C3':
			case '\u00C4':
			case '\u00C5':
			case '\u00C6':
			case '\u00C7':
			case '\u00C8':
			case '\u00C9':
			case '\u00CA':
			case '\u00CB':
			case '\u00CC':
			case '\u00CD':
			case '\u00CE':
			case '\u00CF':
			case '\u00D0':
			case '\u00D1':
			case '\u00D2':
			case '\u00D3':
			case '\u00D4':
			case '\u00D5':
			case '\u00D6':
			case '\u00D7':
			case '\u00D8':
			case '\u00D9':
			case '\u00DA':
			case '\u00DB':
			case '\u00DC':
			case '\u00DD':
			case '\u00DE':
			case '\u00DF':
			case '\u00E0':
			case '\u00E1':
			case '\u00E2':
			case '\u00E3':
			case '\u00E4':
			case '\u00E5':
			case '\u00E6':
			case '\u00E7':
			case '\u00E8':
			case '\u00E9':
			case '\u00EA':
			case '\u00EB':
			case '\u00EC':
			case '\u00ED':
			case '\u00EE':
			case '\u00EF':
			case '\u00F0':
			case '\u00F1':
			case '\u00F2':
			case '\u00F3':
			case '\u00F4':
			case '\u00F5':
			case '\u00F6':
			case '\u00F7':
			case '\u00F8':
			case '\u00F9':
			case '\u00FA':
			case '\u00FB':
			case '\u00FC':
				{
				alt4=11;
				}
				break;
			default:
				alt4=10;
			}
			}
			break;
		case 'D':
			{
			switch ( input.LA(2) ) {
			case 'A':
				{
				int LA4_22 = input.LA(3);
				if ( (LA4_22=='T') ) {
					int LA4_30 = input.LA(4);
					if ( (LA4_30=='E') ) {
						int LA4_37 = input.LA(5);
						if ( ((LA4_37 >= '0' && LA4_37 <= '9')||(LA4_37 >= 'A' && LA4_37 <= 'Z')||(LA4_37 >= 'a' && LA4_37 <= 'z')||(LA4_37 >= '\u00C2' && LA4_37 <= '\u00FC')) ) {
							alt4=11;
						}

						else {
							alt4=9;
						}

					}

					else {
						alt4=11;
					}

				}

				else {
					alt4=11;
				}

				}
				break;
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
			case 'B':
			case 'C':
			case 'D':
			case 'E':
			case 'F':
			case 'G':
			case 'H':
			case 'I':
			case 'J':
			case 'K':
			case 'L':
			case 'M':
			case 'N':
			case 'O':
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
			case 'T':
			case 'U':
			case 'V':
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
			case 'a':
			case 'b':
			case 'c':
			case 'd':
			case 'e':
			case 'f':
			case 'g':
			case 'h':
			case 'i':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'o':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'u':
			case 'v':
			case 'w':
			case 'x':
			case 'y':
			case 'z':
			case '\u00C2':
			case '\u00C3':
			case '\u00C4':
			case '\u00C5':
			case '\u00C6':
			case '\u00C7':
			case '\u00C8':
			case '\u00C9':
			case '\u00CA':
			case '\u00CB':
			case '\u00CC':
			case '\u00CD':
			case '\u00CE':
			case '\u00CF':
			case '\u00D0':
			case '\u00D1':
			case '\u00D2':
			case '\u00D3':
			case '\u00D4':
			case '\u00D5':
			case '\u00D6':
			case '\u00D7':
			case '\u00D8':
			case '\u00D9':
			case '\u00DA':
			case '\u00DB':
			case '\u00DC':
			case '\u00DD':
			case '\u00DE':
			case '\u00DF':
			case '\u00E0':
			case '\u00E1':
			case '\u00E2':
			case '\u00E3':
			case '\u00E4':
			case '\u00E5':
			case '\u00E6':
			case '\u00E7':
			case '\u00E8':
			case '\u00E9':
			case '\u00EA':
			case '\u00EB':
			case '\u00EC':
			case '\u00ED':
			case '\u00EE':
			case '\u00EF':
			case '\u00F0':
			case '\u00F1':
			case '\u00F2':
			case '\u00F3':
			case '\u00F4':
			case '\u00F5':
			case '\u00F6':
			case '\u00F7':
			case '\u00F8':
			case '\u00F9':
			case '\u00FA':
			case '\u00FB':
			case '\u00FC':
				{
				alt4=11;
				}
				break;
			default:
				alt4=10;
			}
			}
			break;
		case 'A':
		case 'B':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'P':
		case 'Q':
		case 'R':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
		case '\u00C2':
		case '\u00C3':
		case '\u00C4':
		case '\u00C5':
		case '\u00C6':
		case '\u00C7':
		case '\u00C8':
		case '\u00C9':
		case '\u00CA':
		case '\u00CB':
		case '\u00CC':
		case '\u00CD':
		case '\u00CE':
		case '\u00CF':
		case '\u00D0':
		case '\u00D1':
		case '\u00D2':
		case '\u00D3':
		case '\u00D4':
		case '\u00D5':
		case '\u00D6':
		case '\u00D7':
		case '\u00D8':
		case '\u00D9':
		case '\u00DA':
		case '\u00DB':
		case '\u00DC':
		case '\u00DD':
		case '\u00DE':
		case '\u00DF':
		case '\u00E0':
		case '\u00E1':
		case '\u00E2':
		case '\u00E3':
		case '\u00E4':
		case '\u00E5':
		case '\u00E6':
		case '\u00E7':
		case '\u00E8':
		case '\u00E9':
		case '\u00EA':
		case '\u00EB':
		case '\u00EC':
		case '\u00ED':
		case '\u00EE':
		case '\u00EF':
		case '\u00F0':
		case '\u00F1':
		case '\u00F2':
		case '\u00F3':
		case '\u00F4':
		case '\u00F5':
		case '\u00F6':
		case '\u00F7':
		case '\u00F8':
		case '\u00F9':
		case '\u00FA':
		case '\u00FB':
		case '\u00FC':
			{
			int LA4_10 = input.LA(2);
			if ( ((LA4_10 >= '0' && LA4_10 <= '9')||(LA4_10 >= 'A' && LA4_10 <= 'Z')||(LA4_10 >= 'a' && LA4_10 <= 'z')||(LA4_10 >= '\u00C2' && LA4_10 <= '\u00FC')) ) {
				alt4=11;
			}

			else {
				alt4=10;
			}

			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt4=11;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt4=12;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 4, 0, input);
			throw nvae;
		}
		switch (alt4) {
			case 1 :
				// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:1:10: SELECT
				{
				mSELECT(); 

				}
				break;
			case 2 :
				// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:1:17: COUNT
				{
				mCOUNT(); 

				}
				break;
			case 3 :
				// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:1:23: FICHIER
				{
				mFICHIER(); 

				}
				break;
			case 4 :
				// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:1:31: NUMERO
				{
				mNUMERO(); 

				}
				break;
			case 5 :
				// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:1:38: NOMBRE
				{
				mNOMBRE(); 

				}
				break;
			case 6 :
				// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:1:45: CONJ
				{
				mCONJ(); 

				}
				break;
			case 7 :
				// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:1:50: POINT
				{
				mPOINT(); 

				}
				break;
			case 8 :
				// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:1:56: TEXTE
				{
				mTEXTE(); 

				}
				break;
			case 9 :
				// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:1:62: DATE
				{
				mDATE(); 

				}
				break;
			case 10 :
				// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:1:67: CHAR
				{
				mCHAR(); 

				}
				break;
			case 11 :
				// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:1:72: VAR
				{
				mVAR(); 

				}
				break;
			case 12 :
				// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:1:76: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
