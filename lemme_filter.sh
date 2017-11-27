cat lemme_successeurs.txt | ./stoplist/newcreeFiltre.pl > lemme_filter.pl
chmod u+x lemme_filter.pl
cat text.xml | ./lemme_filter.pl > text_lemmatise.xml
