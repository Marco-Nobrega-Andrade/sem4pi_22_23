package eapli.base.questionmanagement.domain;

import eapli.base.questionmanagement.domain.Question;
import eapli.base.questionmanagement.domain.QuestionId;
import eapli.base.questionmanagement.domain.Structure;

public class QuestionBuilder {
    private QuestionId question_id;
    private Structure structure;
    public QuestionBuilder withIdentifier(QuestionId question_id){
        this.question_id = question_id;
        return this;
    }

    public QuestionBuilder withStructure(Structure structure){
        this.structure = structure;
        return this;
    }

    public Question build(){
        return new Question(question_id, structure);
    }
}
