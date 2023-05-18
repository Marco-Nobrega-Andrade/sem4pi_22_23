package eapli.base.exams.domain;

import eapli.base.usermanagement.domain.Teacher;
import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Exam implements AggregateRoot<ExamId>  {

    @EmbeddedId
    private ExamId examId;
    private DateInterval dateInterval;

    private ExamSpecification examSpecification;

    @ManyToOne(cascade = CascadeType.REFRESH)
    private Teacher examTeacher;

    protected Exam(ExamId examId, DateInterval dateInterval, ExamSpecification examSpecification, Teacher examTeacher) {
        if (examId == null || dateInterval == null || examSpecification == null || examTeacher == null ) throw new IllegalArgumentException("Exam cannot be created with null parameters");

        this.examId = examId;
        this.dateInterval = dateInterval;
        this.examSpecification = examSpecification;
        this.examTeacher = examTeacher;
    }

    protected Exam() {
        //Only for ORM
    }


    @Override
    public boolean sameAs(Object other) {
        if (!(other instanceof Exam)) {
            return false;
        }

        final Exam that = (Exam) other;

        return examId.equals(that.examId) && dateInterval.equals(that.dateInterval) && examSpecification.equals(examSpecification)
                && examTeacher.equals(that.examTeacher);
    }

    @Override
    public int compareTo(ExamId other) {
        return AggregateRoot.super.compareTo(other);
    }

    @Override
    public ExamId identity() {
        return examId;
    }

    @Override
    public boolean hasIdentity(ExamId id) {
        return AggregateRoot.super.hasIdentity(id);
    }
}
