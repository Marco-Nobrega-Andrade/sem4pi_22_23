package eapli.base.formativeexams.domain;

import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class FormativeExam implements AggregateRoot<FormativeExamID> {

    private FormativeStructure formativeStructure;
   @EmbeddedId
    private FormativeExamID formativeExamID;

    public FormativeExam(FormativeStructure formativeStructure, FormativeExamID formativeExamID) {

        if (formativeStructure == null || formativeExamID == null) {
            throw new IllegalArgumentException("Parameters cannot be null");
        }

        this.formativeStructure = formativeStructure;
        this.formativeExamID = formativeExamID;
    }

    protected FormativeExam() {
        //for ORM
    }

    @Override
    public boolean sameAs(Object other) {
        if (!(other instanceof FormativeExam)) {
            return false;
        }

        final FormativeExam that = (FormativeExam) other;

        return formativeExamID.equals(that.formativeExamID);
    }

    @Override
    public FormativeExamID identity() {
        return formativeExamID;
    }

    public boolean hasIdentity(FormativeExamID id) {
        return AggregateRoot.super.hasIdentity(id);
    }

    public int compareTo(FormativeExamID other) {
        return AggregateRoot.super.compareTo(other);
    }

    public String returnFormativeExamId(){
        return formativeExamID.toString();
    }
}
