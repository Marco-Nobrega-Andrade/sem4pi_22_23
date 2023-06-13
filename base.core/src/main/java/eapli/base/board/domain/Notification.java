package eapli.base.board.domain;

import eapli.base.courseclasses.domain.Date;
import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;

@Embeddable
public class Notification implements ValueObject {
    private String message;

    private eapli.base.courseclasses.domain.Date date;
    public Notification(String message){
        this.message = message;
        this.date = new Date(new java.util.Date());
    }

    public Notification() {
        //for ORM
    }

    @Override
    public String toString() {
        return date.toString()+" "+message;
    }
}
