grammar Tal_sql;

@lexer::header {
    package main.sql.output;
}

@parser::header {
    package main.sql.output;
}

SELECT : 'SELECT'
;

COUNT 	: 'COUNT'
;

FICHIER : 'FICHIER'
;

NUMERO : 'NUMERO'
;

NOMBRE : 'NOMBRE'
;

CONJ : 'ET' | 'OU'
;

POINT : '.'
;

TEXTE : 'TEXTE'
;

DATE : 'DATE'
;

CHAR 	: 'Â' .. 'ü'|'a'..'z'|'A'..'Z'
;

VAR 	: (CHAR | '0'..'9')+
;

WS  : (' ' |'\t' | '\r') {skip();} | '\n' 
;

listerequetes returns [String sql = ""]
	@init	{Arbre lr_arbre;}: 
		r = requete POINT
			{
				lr_arbre = $r.req_arbre;
				sql = lr_arbre.sortArbre();
			}
;

requete returns [Arbre req_arbre = new Arbre("")]
	@init {Arbre ps_arbre;} : 
		SELECT
			{
				req_arbre.ajouteFils(new Arbre("","select "));
			} 
		(NOMBRE
			{
			req_arbre.ajouteFils(new Arbre("","count(distinct fichier)"));
			}
		| FICHIER
			{
			req_arbre.ajouteFils(new Arbre("","distinct fichier"));
			}
		 | NUMERO
			{
			req_arbre.ajouteFils(new Arbre("","distinct numero"));
			}
		| DATE
		{
			req_arbre.ajouteFils(new Arbre("","distinct jour, mois, annee, fichier"));
		})
		(TEXTE
			{
				req_arbre.ajouteFils(new Arbre("","from texte"));
				req_arbre.ajouteFils(new Arbre("","where"));
			}
		| DATE
			{
				req_arbre.ajouteFils(new Arbre("","from date"));
				req_arbre.ajouteFils(new Arbre("","left join texte on texte.fichier = date.fichier"));
				req_arbre.ajouteFils(new Arbre("","where"));
			}
		)
		ps = params 
			{
				ps_arbre = $ps.les_pars_arbre;
				req_arbre.ajouteFils(ps_arbre);
			}
;

params returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre;} : 
		par1 = param 
			{
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
			}
		(conj = CONJ? par2 = param
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", conj == null ? "OR" : (conj.getText().equals("OU") ? "OR" : "AND")));
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		)*
;

param returns [Arbre lepar_arbre = new Arbre("")] :
	a = VAR
		{ lepar_arbre.ajouteFils(new Arbre("mot =", "'"+a.getText()+"'"));}
;

