package eapli.base.courseclasses.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.util.Objects;

@Embeddable
public class ScheduledDate implements ValueObject {

    private Duration duration;
    private Date date;

    public ScheduledDate(Duration duration, Date date) {
        this.duration = duration;
        this.date = date;
    }

    protected ScheduledDate() {
        //Only for ORM
    }

    public boolean compareIfScheduleClassIsOneWeekAfter(ScheduledDate scheduledDate){
        return scheduledDate.duration.equals(duration) && scheduledDate.date.compareDayOfTheWeekAndTime(date);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScheduledDate that = (ScheduledDate) o;
        return Objects.equals(duration, that.duration) && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duration, date);
    }
}
