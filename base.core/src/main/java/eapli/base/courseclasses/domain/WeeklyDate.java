package eapli.base.courseclasses.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import java.util.*;


public class WeeklyDate implements ValueObject {

    @ElementCollection
    private List<ScheduledDate> scheduledDates;

    public WeeklyDate(List<ScheduledDate>  scheduledDates) {
        if(scheduledDates != null) {
            this.scheduledDates = scheduledDates;
        }else{
            this.scheduledDates = new ArrayList<>();
        }
    }

    protected WeeklyDate() {
        //only for ORM
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeeklyDate that = (WeeklyDate) o;
        return Objects.equals(scheduledDates, that.scheduledDates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scheduledDates);
    }
}
