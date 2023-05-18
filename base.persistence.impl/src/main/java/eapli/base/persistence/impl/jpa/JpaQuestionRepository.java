package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.questionmanagement.domain.Question;
import eapli.base.questionmanagement.domain.QuestionId;
import eapli.base.questionmanagement.repositories.QuestionRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.List;
import java.util.Optional;

public class JpaQuestionRepository extends JpaAutoTxRepository<Question, QuestionId, QuestionId> implements QuestionRepository {

    public JpaQuestionRepository(final TransactionalContext autoTx) {
        super(autoTx, "questionId");
    }

    public JpaQuestionRepository(final String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "questionId");
    }
    @Override
    public <S extends Question> S save(S entity) {
        return null;
    }

    @Override
    public Iterable<Question> findAll() {
        return null;
    }

    @Override
    public Optional<Question> ofIdentity(QuestionId id) {
        return Optional.empty();
    }

    @Override
    public void delete(Question entity) {

    }

    @Override
    public void deleteOfIdentity(QuestionId entityId) {

    }

    @Override
    public long count() {
        return 0;
    }


    @Override
    public List<Question> listQuestionsByCourseId(String course_id) {
        //query string search all classes in a course where the teacher is in list of teachers
        return  createQuery("SELECT q from Question q  WHERE q IN (SELECT q FROM Course c JOIN c.questionList t WHERE c.courseId.course_id =:course_id))"
                , Question.class).
                setParameter("course_id", course_id).getResultList();

    }
}
