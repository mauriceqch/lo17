#!/bin/bash
cat text.xml | ./stoplist_filter.pl | ./segmente_TT.pl | ./stoplist/clean.sh | sort -u | ./lemme/successeurs_P16.pl | ./lemme/filtronc_P16.pl > lemme_successeurs.txt
