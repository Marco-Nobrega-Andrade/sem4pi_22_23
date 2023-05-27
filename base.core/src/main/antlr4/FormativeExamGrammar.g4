grammar FormativeExamGrammar;

prog:  (matching_type_question NEWLINE)+
             | (select_missing_words NEWLINE)+
             | (true_false_question NEWLINE)+
             | (multiple_choice_question NEWLINE)+
             | (short_answer_question NEWLINE)+
             | (numerical_question NEWLINE)+
             ;

/////////////////////////
multiple_choice_question : HASH MC_Q points question list_with_title multiple_choice_solution (feedback)?
                         ;
multiple_choice_solution : SOLUTION_ENTRY list_phrases
                         ;
/////////////////////////
matching_type_question : HASH MT_Q points question list_with_title list_with_title matching_type_solution (feedback)?
                       ;
matching_type_solution : SOLUTION_ENTRY (NEWLINE phrase DASH phrase)+
                       ;
//////////////////////////
true_false_question : HASH TF_Q points question true_false_solution (feedback)?
                    ;

true_false_solution: SOLUTION_ENTRY TRUE_FALSE_RESPONSES
                   ;
////////////////////////////
select_missing_words : HASH SMW_Q points question missing_word_phrase list_with_title+ missing_word_solution (feedback)?
                     ;
missing_word_phrase : NEWLINE+ phrase? (MISSING_WORD phrase)+ MISSING_WORD?
                    | NEWLINE+ MISSING_WORD? (phrase MISSING_WORD)+ phrase?
                    ;
missing_word_solution: SOLUTION_ENTRY list_phrases
                    ;
list_phrases: phrase (COMMA phrase)*
            ;
//////////////////////
short_answer_question: HASH SA_Q points question short_answer_solution (feedback)?
                     ;
short_answer_solution: SOLUTION_ENTRY phrase
                     ;
////////////////////
numerical_question: HASH N_Q points question numerical_answer (feedback)?
                  ;
numerical_answer: SOLUTION_ENTRY INT(COMMA INT)? WORD
                ;
/////////////////////
question: NEWLINE+ QUESTION_ENTRY phrase
        ;
points: NEWLINE+ POINTS_ENTRY INT
      ;
feedback: NEWLINE+ FEEDBACK_ENTRY phrase
        ;
phrase: ANY_CHAR* ( (WORD | INT) ( ANY_CHAR+)*)+
 ;

list_with_title: NEWLINE+ title_list list?
               ;
title_list: phrase COLON
        ;
list: (topic_list)+
 ;
topic_list : (NEWLINE)+ DASH phrase
             ;

/////////////////////////
SOLUTION_ENTRY : NEWLINE+ HASH 'Solution:';
TRUE_FALSE_RESPONSES : ('T' |'F'|'t'| 'f');

FEEDBACK_ENTRY : HASH 'Feedback:';
QUESTION_ENTRY : HASH 'Question:';
POINTS_ENTRY : HASH 'Points:';
MC_Q : 'Multiple Choice';
N_Q : 'Numerical';
SA_Q : 'Short Answer';
SMW_Q : 'Select Missing Words';
TF_Q : 'True/False Question';
MT_Q : 'Matching Type';
POINTS : 'Points';

COMMA : ',';
WS : [ \t]+ -> skip;
HASH : '#';
NEWLINE : [\r\n]+;
WORD: [A-Za-z]+;
COLON : ':' ;
DASH : '-';
INT : [0-9]+;
ANY_CHAR : ~[\t\r\n];
MISSING_WORD : '||WORD||';