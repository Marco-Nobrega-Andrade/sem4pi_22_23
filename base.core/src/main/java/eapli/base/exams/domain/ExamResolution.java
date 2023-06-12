package eapli.base.exams.domain;

import eapli.base.exceptions.InvalidIdException;
import eapli.base.exceptions.NegativeParameterException;
import eapli.base.exceptions.ParameterNullBlankException;
import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class ExamResolution implements AggregateRoot<ExamResolutionId> {

    @EmbeddedId
    private ExamResolutionId examResolution_Id;

    private Grade grade;

    public ExamResolution(ExamResolutionId id, Grade grade) throws ParameterNullBlankException {
        if (validateIdAndGrade(id,grade)) {
            this.examResolution_Id = id;
            this.grade = grade;
        }
    }

    private boolean validateIdAndGrade(ExamResolutionId id, Grade grade) throws ParameterNullBlankException {
        return ensureIdIsNotNull(id) && ensureGradeIsNotNull(grade);
    }

    private boolean ensureIdIsNotNull(ExamResolutionId id) throws ParameterNullBlankException {
        if(id == null){
            throw new ParameterNullBlankException("Exam resolution id cannot be null.");
        }
        return true;
    }

    private boolean ensureGradeIsNotNull(Grade grade) throws ParameterNullBlankException {
        if(grade == null){
            throw new ParameterNullBlankException("Exam resolution grade cannot be null.");
        }
        return true;
    }

    public ExamResolution(long id, double grade) throws InvalidIdException, NegativeParameterException {
        this.examResolution_Id = new ExamResolutionId(id);
        this.grade = new Grade(grade);
    }

    protected ExamResolution() {
        //Only for ORM
    }

    @Override
    public boolean sameAs(Object other) {
        if (!(other instanceof ExamResolution)) {
            return false;
        }

        final ExamResolution that = (ExamResolution) other;

        return examResolution_Id.equals(that.examResolution_Id) && grade.equals(that.grade);
    }

    @Override
    public ExamResolutionId identity() {
        return this.examResolution_Id;
    }
}
