package eapli.base.questionmanagement.domain;

import eapli.framework.domain.model.ValueObject;

import java.util.Objects;

public class QuestionId implements ValueObject, Comparable<QuestionId> {
    private Long question_Id;

    public QuestionId(Long question_Id) {
        if(question_Id < 1){
            throw new IllegalArgumentException("Question Id cannot be lower than 1");
        }
        this.question_Id = question_Id;
    }

    public QuestionId(){}

    @Override
    public int compareTo(QuestionId o) {
        return Long.compare(this.question_Id, o.question_Id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QuestionId)) return false;
        QuestionId that = (QuestionId) o;
        return Objects.equals(question_Id, that.question_Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question_Id);
    }

    @Override
    public String toString() {
        return question_Id.toString();
    }
}
