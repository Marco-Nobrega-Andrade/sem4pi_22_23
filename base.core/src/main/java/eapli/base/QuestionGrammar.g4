grammar QuestionGrammar;
prog: matching_type_question;

phrase: ANY_CHAR* (SPACE* (WORD | INT) (SPACE* ANY_CHAR+)*)+
    ;
list_with_title: title_list list?
                ;
title_list: SPACE* phrase SPACE* COLON SPACE*
           ;
list: (topic_list)+
    ;
topic_list : (NEWLINE)+ DASH phrase
            ;
/////////////////////////
multiple_choice_question : 'Multiple Choice' NEWLINE+ phrase NEWLINE+ list_with_title NEWLINE+ phrase NEWLINE+ INT
;
matching_type_question : 'Matching Type' NEWLINE+ phrase NEWLINE+ list_with_title NEWLINE+ list_with_title NEWLINE+ phrase DASH phrase NEWLINE+ INT
;
NEWLINE : [\r\n]+ ;
SPACE: ' ';
WORD: [A-Za-z]+;
COLON : ':' ;
DASH : '-';
INT : [0-9]+;
ANY_CHAR : ~[\t\r\n];