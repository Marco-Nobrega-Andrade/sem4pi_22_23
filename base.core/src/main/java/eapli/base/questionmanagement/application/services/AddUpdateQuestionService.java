package eapli.base.questionmanagement.application.services;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.questionmanagement.domain.*;
import eapli.base.questionmanagement.dto.QuestionDTOWithId;
import eapli.base.questionmanagement.repositories.QuestionRepository;

public class AddUpdateQuestionService {
    private final QuestionRepository questionRepository = PersistenceContext.repositories().questionRepository();

    public void addQuestion(String structure){
        long numberOfQuestions = questionRepository.count();
        QuestionBuilder builder = new QuestionBuilder();
        Question question = builder.withStructure(structure).withIdentifier(numberOfQuestions + 1).build();
        questionRepository.save(question);
    }

    public void updateQuestion(QuestionDTOWithId questionDTO, String updatedQuestion){
        VerifyQuestionService verifyQuestionService = new VerifyQuestionService();
        Question question = questionRepository.ofIdentity(new QuestionId(questionDTO.questionIdentifier)).get();
        verifyQuestionService.verifyQuestion(updatedQuestion);
        question.changeQuestion(new Structure(updatedQuestion));
        questionRepository.save(question);
    }
}
