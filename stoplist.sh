#!/bin/bash
./stoplist/tf_idf.pl | ./stoplist/tf_idf_to_stoplist.pl  | cut -d ' ' -f2 | awk 'NF{print $0 "\t"}' | ./stoplist/newcreeFiltre.pl > stoplist_filter.pl
chmod u+x stoplist_filter.pl
