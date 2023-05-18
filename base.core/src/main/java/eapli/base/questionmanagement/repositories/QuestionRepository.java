package eapli.base.questionmanagement.repositories;

import eapli.base.questionmanagement.domain.Question;
import eapli.base.questionmanagement.domain.QuestionId;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.List;

public interface QuestionRepository extends DomainRepository<QuestionId, Question> {
    List<Question> listQuestionsByCourseId(String courseId);
}
