// $ANTLR 3.5.1 /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g 2017-12-05 15:55:30

    package main.sql.output;
    import main.sql.data.Arbre;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class Tal_sqlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "CONJ", "COUNT", "DATE", 
		"FICHIER", "NOMBRE", "NUMERO", "POINT", "SELECT", "TEXTE", "VAR", "WS"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public Tal_sqlParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public Tal_sqlParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return Tal_sqlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g"; }



	// $ANTLR start "listerequetes"
	// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:49:1: listerequetes returns [Arbre lr_arbre = new Arbre(\"\")] : r= requete ( POINT )? ;
	public final Arbre listerequetes() throws RecognitionException {
		Arbre lr_arbre =  new Arbre("");


		Arbre r =null;

		try {
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:49:55: (r= requete ( POINT )? )
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:50:3: r= requete ( POINT )?
			{
			pushFollow(FOLLOW_requete_in_listerequetes190);
			r=requete();
			state._fsp--;

			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:50:15: ( POINT )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==POINT) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:50:15: POINT
					{
					match(input,POINT,FOLLOW_POINT_in_listerequetes192); 
					}
					break;

			}


							lr_arbre.ajouteFils(r);
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lr_arbre;
	}
	// $ANTLR end "listerequetes"



	// $ANTLR start "requete"
	// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:56:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : SELECT ( NOMBRE | FICHIER | NUMERO | DATE ) ( TEXTE | DATE ) ps= params ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre ps =null;

		Arbre ps_arbre;
		try {
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:57:26: ( SELECT ( NOMBRE | FICHIER | NUMERO | DATE ) ( TEXTE | DATE ) ps= params )
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:58:3: SELECT ( NOMBRE | FICHIER | NUMERO | DATE ) ( TEXTE | DATE ) ps= params
			{
			match(input,SELECT,FOLLOW_SELECT_in_requete220); 

							req_arbre.ajouteFils(new Arbre("","select "));
						
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:62:3: ( NOMBRE | FICHIER | NUMERO | DATE )
			int alt2=4;
			switch ( input.LA(1) ) {
			case NOMBRE:
				{
				alt2=1;
				}
				break;
			case FICHIER:
				{
				alt2=2;
				}
				break;
			case NUMERO:
				{
				alt2=3;
				}
				break;
			case DATE:
				{
				alt2=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:62:4: NOMBRE
					{
					match(input,NOMBRE,FOLLOW_NOMBRE_in_requete231); 

								String columns = "count(distinct fichier)";
								req_arbre.ajouteFils(new Arbre("",columns));
								req_arbre.setStringData("columns", columns);
								
					}
					break;
				case 2 :
					// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:68:5: FICHIER
					{
					match(input,FICHIER,FOLLOW_FICHIER_in_requete242); 

								String columns = "fichier";
								String displayColumns = "string_agg(mot, ',') as mots, " + columns;
								req_arbre.ajouteFils(new Arbre("",displayColumns));
								req_arbre.setStringData("columns", columns);
								
					}
					break;
				case 3 :
					// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:75:6: NUMERO
					{
					match(input,NUMERO,FOLLOW_NUMERO_in_requete254); 

								String columns = "numero";
								String displayColumns = "string_agg(mot, ',') as mots, " + columns;
								req_arbre.ajouteFils(new Arbre("",displayColumns));
								req_arbre.setStringData("columns", columns);
								
					}
					break;
				case 4 :
					// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:82:5: DATE
					{
					match(input,DATE,FOLLOW_DATE_in_requete265); 

								String columns = "jour, mois, annee, texte.fichier";
								String displayColumns = "string_agg(mot, ',') as mots, " + columns;
								req_arbre.ajouteFils(new Arbre("", displayColumns));
								req_arbre.setStringData("columns", columns);
							
					}
					break;

			}

			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:89:3: ( TEXTE | DATE )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==TEXTE) ) {
				alt3=1;
			}
			else if ( (LA3_0==DATE) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:89:4: TEXTE
					{
					match(input,TEXTE,FOLLOW_TEXTE_in_requete275); 

									req_arbre.ajouteFils(new Arbre("","from texte"));
									req_arbre.ajouteFils(new Arbre("","where"));
								
					}
					break;
				case 2 :
					// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:94:5: DATE
					{
					match(input,DATE,FOLLOW_DATE_in_requete286); 

									req_arbre.ajouteFils(new Arbre("","from date"));
									req_arbre.ajouteFils(new Arbre("","left join texte on texte.fichier = date.fichier"));
									req_arbre.ajouteFils(new Arbre("","where"));
								
					}
					break;

			}

			pushFollow(FOLLOW_params_in_requete303);
			ps=params();
			state._fsp--;


							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
							req_arbre.setIntegerData("param_count", ps_arbre.getIntegerData("param_count"));
							req_arbre.setBooleanData("intersection", ps_arbre.getBooleanData("intersection"));
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return req_arbre;
	}
	// $ANTLR end "requete"



	// $ANTLR start "params"
	// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:110:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param ( (conj= CONJ )? par2= param )* ;
	public final Arbre params() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Token conj=null;
		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:111:40: (par1= param ( (conj= CONJ )? par2= param )* )
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:112:3: par1= param ( (conj= CONJ )? par2= param )*
			{
			pushFollow(FOLLOW_param_in_params335);
			par1=param();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
							les_pars_arbre.incrementIntegerData("param_count");
						
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:118:3: ( (conj= CONJ )? par2= param )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==CONJ||LA5_0==VAR) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:118:4: (conj= CONJ )? par2= param
					{
					// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:118:9: (conj= CONJ )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==CONJ) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:118:9: conj= CONJ
							{
							conj=(Token)match(input,CONJ,FOLLOW_CONJ_in_params350); 
							}
							break;

					}

					pushFollow(FOLLOW_param_in_params357);
					par2=param();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
									les_pars_arbre.incrementIntegerData("param_count");			
									
									if (conj != null && "ET".equals(conj.getText())) {
										les_pars_arbre.setBooleanData("intersection", true);
									}
								
					}
					break;

				default :
					break loop5;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "params"



	// $ANTLR start "param"
	// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:132:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre param() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:132:51: (a= VAR )
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:133:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_param385); 
			 lepar_arbre.ajouteFils(new Arbre("mot =", "'"+a.getText()+"'"));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "param"

	// Delegated rules



	public static final BitSet FOLLOW_requete_in_listerequetes190 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_POINT_in_listerequetes192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete220 = new BitSet(new long[]{0x0000000000000780L});
	public static final BitSet FOLLOW_NOMBRE_in_requete231 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_FICHIER_in_requete242 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_NUMERO_in_requete254 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_DATE_in_requete265 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_TEXTE_in_requete275 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_DATE_in_requete286 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_params_in_requete303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_params335 = new BitSet(new long[]{0x0000000000004022L});
	public static final BitSet FOLLOW_CONJ_in_params350 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_param_in_params357 = new BitSet(new long[]{0x0000000000004022L});
	public static final BitSet FOLLOW_VAR_in_param385 = new BitSet(new long[]{0x0000000000000002L});
}
