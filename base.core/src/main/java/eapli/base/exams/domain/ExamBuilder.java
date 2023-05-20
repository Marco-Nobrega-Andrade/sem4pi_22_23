package eapli.base.exams.domain;

import eapli.base.questionmanagement.domain.*;
import eapli.base.usermanagement.domain.Teacher;

import java.util.Date;

public class ExamBuilder {

    private DateInterval dateInterval;

    private ExamId examId;

    private ExamSpecification specification;

    private Teacher teacher;


    public ExamBuilder withId(long examId){
        this.examId = new ExamId(examId);
        return this;
    }

    public ExamBuilder withExamSpecification(String structure){
        this.specification = new ExamSpecification(structure);
        new VerifyExamSpecificationService().verifyExamSpecification(structure);
        return this;
    }

    public ExamBuilder withDateInterval(Date initialDate, Date finalDate){
        this.dateInterval = new DateInterval(initialDate,finalDate);
        return this;
    }

    public ExamBuilder withTeacher(Teacher teacher){
        this.teacher = teacher;
        return this;
    }

    public Exam build(){
        return new Exam(examId, dateInterval,specification,teacher);
    }


}
