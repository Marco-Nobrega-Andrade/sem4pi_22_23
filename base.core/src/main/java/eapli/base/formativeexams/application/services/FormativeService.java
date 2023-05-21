package eapli.base.formativeexams.application.services;

import eapli.base.formativeexams.domain.FormativeExam;
import eapli.base.formativeexams.domain.FormativeExamFactory;
import eapli.base.formativeexams.repositories.FormativeExamRepository;
import eapli.base.grammarutils.FormativeExamGrammarLexer;
import eapli.base.grammarutils.FormativeExamGrammarParser;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.questionmanagement.domain.Question;
import eapli.base.questionmanagement.repositories.QuestionRepository;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FormativeService {

    private final String matching = "Matching Type";
    private final String multipleChoice = "Multiple Choice";
    private final String shortAnswer = "Short Answer";
    private final String numerical = "Numerical";
    private final String selectMissingWords = "Select Missing Words";
    private final String trueOrFalse = "True/False Question";

    private final VerifyGrammarService verifyGrammarService = new VerifyGrammarService();

    private final QuestionRepository questionRepository = PersistenceContext.repositories().questionRepository();

    private final FormativeExamRepository formativeExamRepository = PersistenceContext.repositories().formativeExamRepository();

    public boolean createFormativeExam(String type, int number) {
        // TODO
        if (type.equals(matching)||type.equals(multipleChoice)||type.equals(shortAnswer)||
                type.equals(numerical)||type.equals(selectMissingWords)||type.equals(trueOrFalse)) {

            Iterable<Question> questions = questionRepository.findAll();
            List<String> structureList = new ArrayList<>();

            if (questions == null || !questions.iterator().hasNext()) {
                throw new IllegalArgumentException("There are no questions in the system");
            }

            for (Question question : questions) {
                structureList.add(question.returnStructureToString());
            }
            List<String> matchingQuestionStructures = new ArrayList<>();
            for (String string : structureList) {
                if (string.startsWith(type)) {
                    matchingQuestionStructures.add(string);
                }
            }

            // get random questions from matchingQuestionStructures with number as size

            Random random = new Random();

            // Generate a random integer between a specific range
            String structure = "";
            for (int i= 0 ; i < number ; i++) {
                int randomInRange = random.nextInt(matchingQuestionStructures.size());
                structure = structure + matchingQuestionStructures.get(randomInRange) + "\n";
            }

            if(verifyGrammarService.verifyGrammar(structure)){
                FormativeExamFactory formativeExamFactory = new FormativeExamFactory();
                FormativeExam formativeExam= formativeExamFactory.build(formativeExamRepository.count()+1,structure);
                formativeExamRepository.save(formativeExam);
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("The provided type is not matching with the possibles types of questions in the system");
    }

}
