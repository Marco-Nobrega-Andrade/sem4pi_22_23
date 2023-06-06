grammar ExamGrammar;

prog: title type_of_grade type_of_feedback
                   (( WITH_PARAM header_description? (NEWLINE+ section (question_type_with_feedback)+)+)
                 | ( WITHOUT_PARAM header_description? (NEWLINE+ section (question_type_without_feedback)+)+));


question_type_with_feedback : (matching_type_question (feedback)?)
                 | (select_missing_words (feedback)?)
                 | (true_false_question (feedback)?)
                 | (multiple_choice_question (feedback)?)
                 | (short_answer_question (feedback)?)
                 | (numerical_question (feedback)?)
                 ;

question_type_without_feedback : matching_type_question
                 | select_missing_words
                 | true_false_question
                 | multiple_choice_question
                 | short_answer_question
                 | numerical_question
                 ;

type_of_grade :  NEWLINE+ TYPE_OF_GRADE_ENTRY (WITH_PARAM | WITHOUT_PARAM)
              ;

type_of_feedback :  NEWLINE+ TYPE_OF_FEEDBACK_ENTRY
              ;

header_description :  NEWLINE+ HEADER_DESCRIPTION_ENTRY phrase
              ;

/////////////////////////
multiple_choice_question : points question list_with_title multiple_choice_solution
                         ;
multiple_choice_solution : SOLUTION_ENTRY list_phrases
                         ;
/////////////////////////
matching_type_question : points question list_with_title list_with_title matching_type_solution
                       ;
matching_type_solution : SOLUTION_ENTRY (NEWLINE phrase DASH phrase)+
                       ;
//////////////////////////
true_false_question : points question true_false_solution
                    ;

true_false_solution: SOLUTION_ENTRY TRUE_FALSE_RESPONSES
                   ;
////////////////////////////
select_missing_words : points question missing_word_phrase list_with_title+ missing_word_solution
                     ;
missing_word_phrase : NEWLINE+ phrase? (MISSING_WORD phrase)+ MISSING_WORD?
                    | NEWLINE+ MISSING_WORD? (phrase MISSING_WORD)+ phrase?
                    ;
missing_word_solution: SOLUTION_ENTRY list_phrases
                    ;
list_phrases: phrase (COMMA phrase)*
            ;
//////////////////////
short_answer_question: points question short_answer_solution
                     ;
short_answer_solution: SOLUTION_ENTRY phrase
                     ;
////////////////////
numerical_question: points question numerical_answer
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


title: TITLE_ENTRY phrase;

section: SECTION_ENTRY phrase (NEWLINE+ SECTION_DESCRIPTION_ENTRY phrase)?;


/////////////////////////
SOLUTION_ENTRY : NEWLINE+ HASH 'Solution:';
TRUE_FALSE_RESPONSES : ('T' |'F'|'t'| 'f');
TITLE_ENTRY : HASH 'Title:';
SECTION_ENTRY : HASH 'Section:';
SECTION_DESCRIPTION_ENTRY: HASH 'Section description:';
FEEDBACK_ENTRY : HASH 'Feedback:';
QUESTION_ENTRY : HASH 'Question:';
POINTS_ENTRY : HASH 'Points:';
TYPE_OF_GRADE_ENTRY : HASH 'Type of grade:';
TYPE_OF_FEEDBACK_ENTRY : HASH 'Type of feedback:';
HEADER_DESCRIPTION_ENTRY : HASH 'Header description:';

WITH_PARAM : ('on-submission' | 'after-closing' | 'ON-SUBMISSION'| 'AFTER-CLOSING');
WITHOUT_PARAM : ( 'none' | 'NONE' );

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