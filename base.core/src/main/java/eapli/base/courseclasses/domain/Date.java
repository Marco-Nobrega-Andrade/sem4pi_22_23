package eapli.base.courseclasses.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Objects;

@Embeddable
public class Date implements ValueObject {

    @Temporal(TemporalType.DATE)
    private java.util.Date date_time;

    public Date(java.util.Date date_time) {
        if(date_time.before(new java.util.Date())){
            throw new IllegalArgumentException("Class date must be after today");
        }
        this.date_time = date_time;
    }

    protected Date() {
        //Only for ORM
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date date = (Date) o;
        return Objects.equals(date_time, date.date_time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date_time);
    }
}
