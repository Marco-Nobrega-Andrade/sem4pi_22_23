grammar FormativeExamGrammar;

prog: header (NEWLINE+ question) NEWLINE*;

header: 'Header: ' phrase;

points : '(' INT 'pts)' ;

phrase : ANY_CHAR* (SPACE* (WORD | INT) (SPACE* ANY_CHAR+)*)+ ;

middle_phrase: phrase SPACE;

list_with_title: title_list list? ;
title_list: SPACE* phrase SPACE* COLON SPACE* ;
list: (topic_list)+ ;
topic_list : (NEWLINE)+ DASH phrase ;

feedback : 'Feedback: ' phrase ;




question : matching_type_question + NEWLINE matching_type_solution +
                 | select_missing_words + NEWLINE missing_word_solution +
                 | true_false_question + NEWLINE true_false_solution +
                 | multiple_choice_question + NEWLINE multiple_choice_solution +
                 | short_answer_question + NEWLINE short_answer_solution +
                 | numerical_question + NEWLINE numerical_answer +
                 ;

/////////////////////////
multiple_choice_question : 'Multiple Choice' NEWLINE+ points NEWLINE+ phrase NEWLINE+ list_with_title NEWLINE+ multiple_choice_solution (NEWLINE+ feedback)?;
multiple_choice_solution : 'Solution: ' list_phrases;
/////////////////////////
matching_type_question : 'Matching Type' NEWLINE+ points NEWLINE+ phrase NEWLINE+ list_with_title NEWLINE+ list_with_title NEWLINE+ matching_type_solution NEWLINE+ (NEWLINE+ feedback)?;
matching_type_solution : 'Solution:' (NEWLINE phrase DASH phrase)+;
//////////////////////////
true_false_question : 'True/False Question' NEWLINE+ points NEWLINE+ phrase NEWLINE+ true_false_solution (NEWLINE+ feedback)?;
true_false_solution: 'Solution: ' ('T' |'F'|'t'| 'f');
////////////////////////////
select_missing_words : 'Select Missing Words' NEWLINE+ points NEWLINE+ phrase NEWLINE+ missing_word_question NEWLINE+ list_with_title+ NEWLINE+ missing_word_solution (NEWLINE+ feedback)?;
missing_word_question : MISSING_WORD phrase
                        | middle_phrase? MISSING_WORD (SPACE MISSING_WORD)* (middle_phrase(MISSING_WORD (SPACE MISSING_WORD)*)?)* phrase?;
missing_word_solution: 'Solution: ' list_phrases;
list_phrases: phrase (',' phrase)*;

//////////////////////
short_answer_question: 'Short Answer' NEWLINE+ points NEWLINE+ phrase NEWLINE+ short_answer_solution (NEWLINE+ feedback)?;
short_answer_solution: 'Solution: ' phrase;
////////////////////
numerical_question: 'Numerical' NEWLINE+ points NEWLINE+ phrase NEWLINE+ numerical_answer (NEWLINE+ feedback)?;
numerical_answer: 'Solution: ' INT(','INT)? SPACE WORD;


NEWLINE : [\r\n]+;
SPACE: ' ';
WORD: [A-Za-z]+;
COLON : ':' ;
DASH : '-';
INT : [0-9]+;
ANY_CHAR : ~[\t\r\n];
MISSING_WORD : '||WORD||';