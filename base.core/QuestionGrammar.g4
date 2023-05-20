grammar QuestionGrammar;
prog: matching_type_question
      | select_missing_words
      | true_false_question
      | multiple_choice_question;

phrase: ANY_CHAR* (SPACE* (WORD | INT) (SPACE* ANY_CHAR+)*)+
    ;

middle_phrase: phrase SPACE
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
multiple_choice_question : 'Multiple Choice' NEWLINE+ points NEWLINE+ phrase NEWLINE+ list_with_title NEWLINE+ multiple_choice_solution (NEWLINE+ feedback)?
;
multiple_choice_solution : 'Solution: ' phrase
;
/////////////////////////
matching_type_question : 'Matching Type' NEWLINE+ points NEWLINE+ phrase NEWLINE+ list_with_title NEWLINE+ list_with_title NEWLINE+ matching_type_solution NEWLINE+
;
matching_type_solution : 'Solution:' (NEWLINE phrase DASH phrase)+
;
//////////////////////////
true_false_question : 'True/False Question' NEWLINE+ points NEWLINE+ phrase NEWLINE+ true_false_solution (NEWLINE+ feedback)?
;

true_false_solution: 'Solution: ' ('T' |'F'|'t'| 'f')
;
////////////////////////////
select_missing_words : 'Select Missing Words' NEWLINE+ points NEWLINE+ phrase NEWLINE+ missing_word_question NEWLINE+ list_with_title+ NEWLINE+ missing_word_solution (NEWLINE+ feedback)?
;
missing_word_question : MISSING_WORD phrase
                        | middle_phrase? MISSING_WORD (SPACE MISSING_WORD)* (middle_phrase(MISSING_WORD (SPACE MISSING_WORD)*)?)* phrase?
;
missing_word_solution: 'Solution: ' list_phrases
;
list_phrases: phrase (',' phrase)*
;
points :'(' INT 'pts)'
;
feedback: 'Feedback: ' phrase
;

NEWLINE : [\r\n]+ ;
SPACE: ' ';
WORD: [A-Za-z]+;
COLON : ':' ;
DASH : '-';
INT : [0-9]+;
ANY_CHAR : ~[\t\r\n];
MISSING_WORD : '||WORD||';