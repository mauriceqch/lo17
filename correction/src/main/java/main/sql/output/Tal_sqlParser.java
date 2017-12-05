// $ANTLR 3.5.1 /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g 2017-11-28 16:29:58

    package main.sql.output;


import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

import main.sql.data.Arbre;

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
	// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:47:1: listerequetes returns [Arbre lr_arbre = new Arbre(\"\")] : r= requete POINT ;
	public final Arbre listerequetes() throws RecognitionException {
		Arbre lr_arbre =  new Arbre("");


		Arbre r =null;

		try {
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:47:55: (r= requete POINT )
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:48:3: r= requete POINT
			{
			pushFollow(FOLLOW_requete_in_listerequetes190);
			r=requete();
			state._fsp--;

			match(input,POINT,FOLLOW_POINT_in_listerequetes192); 

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
	// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:54:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : SELECT ( NOMBRE | FICHIER | NUMERO | DATE ) ( TEXTE | DATE ) ps= params ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre ps =null;

		Arbre ps_arbre;
		try {
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:55:26: ( SELECT ( NOMBRE | FICHIER | NUMERO | DATE ) ( TEXTE | DATE ) ps= params )
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:56:3: SELECT ( NOMBRE | FICHIER | NUMERO | DATE ) ( TEXTE | DATE ) ps= params
			{
			match(input,SELECT,FOLLOW_SELECT_in_requete219); 

							req_arbre.ajouteFils(new Arbre("","select "));
						
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:60:3: ( NOMBRE | FICHIER | NUMERO | DATE )
			int alt1=4;
			switch ( input.LA(1) ) {
			case NOMBRE:
				{
				alt1=1;
				}
				break;
			case FICHIER:
				{
				alt1=2;
				}
				break;
			case NUMERO:
				{
				alt1=3;
				}
				break;
			case DATE:
				{
				alt1=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:60:4: NOMBRE
					{
					match(input,NOMBRE,FOLLOW_NOMBRE_in_requete230); 

								String columns = "count(distinct fichier)";
								req_arbre.ajouteFils(new Arbre("",columns));
								req_arbre.setStringData("columns", columns);
								
					}
					break;
				case 2 :
					// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:66:5: FICHIER
					{
					match(input,FICHIER,FOLLOW_FICHIER_in_requete241); 

								String columns = "fichier";
								String displayColumns = "string_agg(mot, ',') as mots, " + columns;
								req_arbre.ajouteFils(new Arbre("",displayColumns));
								req_arbre.setStringData("columns", columns);
								
					}
					break;
				case 3 :
					// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:73:6: NUMERO
					{
					match(input,NUMERO,FOLLOW_NUMERO_in_requete253); 

								String columns = "numero";
								String displayColumns = "string_agg(mot, ',') as mots, " + columns;
								req_arbre.ajouteFils(new Arbre("",displayColumns));
								req_arbre.setStringData("columns", columns);
								
					}
					break;
				case 4 :
					// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:80:5: DATE
					{
					match(input,DATE,FOLLOW_DATE_in_requete264); 

								String columns = "mois, annee, texte.fichier";
								String displayColumns = "count(*) as count, jour, " + columns;
								req_arbre.ajouteFils(new Arbre("", displayColumns));
								req_arbre.setStringData("columns", columns);
							
					}
					break;

			}

			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:87:3: ( TEXTE | DATE )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==TEXTE) ) {
				alt2=1;
			}
			else if ( (LA2_0==DATE) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:87:4: TEXTE
					{
					match(input,TEXTE,FOLLOW_TEXTE_in_requete274); 

									req_arbre.ajouteFils(new Arbre("","from texte"));
									req_arbre.ajouteFils(new Arbre("","where"));
								
					}
					break;
				case 2 :
					// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:92:5: DATE
					{
					match(input,DATE,FOLLOW_DATE_in_requete285); 

									req_arbre.ajouteFils(new Arbre("","from date"));
									req_arbre.ajouteFils(new Arbre("","left join texte on texte.fichier = date.fichier"));
									req_arbre.ajouteFils(new Arbre("","where"));
								
					}
					break;

			}

			pushFollow(FOLLOW_params_in_requete302);
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
	// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:108:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param ( (conj= CONJ )? par2= param )* ;
	public final Arbre params() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Token conj=null;
		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:109:40: (par1= param ( (conj= CONJ )? par2= param )* )
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:110:3: par1= param ( (conj= CONJ )? par2= param )*
			{
			pushFollow(FOLLOW_param_in_params334);
			par1=param();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
							les_pars_arbre.incrementIntegerData("param_count");
						
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:116:3: ( (conj= CONJ )? par2= param )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==CONJ||LA4_0==VAR) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:116:4: (conj= CONJ )? par2= param
					{
					// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:116:9: (conj= CONJ )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==CONJ) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:116:9: conj= CONJ
							{
							conj=(Token)match(input,CONJ,FOLLOW_CONJ_in_params349); 
							}
							break;

					}

					pushFollow(FOLLOW_param_in_params356);
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
					break loop4;
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
	// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:130:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre param() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:130:51: (a= VAR )
			// /home/quachmau/sandbox/lo17/correction/src/main/java/main/sql/Tal_sql.g:131:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_param384); 
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



	public static final BitSet FOLLOW_requete_in_listerequetes190 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_POINT_in_listerequetes192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete219 = new BitSet(new long[]{0x0000000000000780L});
	public static final BitSet FOLLOW_NOMBRE_in_requete230 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_FICHIER_in_requete241 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_NUMERO_in_requete253 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_DATE_in_requete264 = new BitSet(new long[]{0x0000000000002080L});
	public static final BitSet FOLLOW_TEXTE_in_requete274 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_DATE_in_requete285 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_params_in_requete302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_params334 = new BitSet(new long[]{0x0000000000004022L});
	public static final BitSet FOLLOW_CONJ_in_params349 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_param_in_params356 = new BitSet(new long[]{0x0000000000004022L});
	public static final BitSet FOLLOW_VAR_in_param384 = new BitSet(new long[]{0x0000000000000002L});
}
