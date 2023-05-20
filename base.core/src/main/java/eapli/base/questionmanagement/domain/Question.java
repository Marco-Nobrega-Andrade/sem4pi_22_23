package eapli.base.questionmanagement.domain;

import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Question implements AggregateRoot<QuestionId> {
    @Id
    private QuestionId question_Id;
    private Structure structure;

    protected Question(QuestionId question_Id, Structure structure){
        this.question_Id = question_Id;
        this.structure = structure;
    }

    protected Question(){}
    @Override
    public boolean sameAs(Object other) {
        return false;
    }

    @Override
    public QuestionId identity() {
        return null;
    }

    public long returnQuestionIdentifier(){
        return question_Id.returnQuestionId();
    }
    public void changeQuestion(Structure structure){
        this.structure = structure;
    }
}
