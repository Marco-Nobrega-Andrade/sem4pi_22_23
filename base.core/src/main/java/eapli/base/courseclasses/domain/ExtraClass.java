package eapli.base.courseclasses.domain;

import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.*;
import java.util.Date;

@Entity
public class ExtraClass implements AggregateRoot<ExtraClassId> {
    @Id
    private ExtraClassId extraClassId;

    private ScheduledDate scheduledDate;

    public ExtraClass(ExtraClassId extraClassId, ScheduledDate scheduledDate) {
        this.extraClassId = extraClassId;
        this.scheduledDate = scheduledDate;
    }

    protected ExtraClass() {
        //only for ORM
    }

    public boolean verifyIfExistAnExtraClassAtTheTime(Date startingDateWithTime, int duration){
        return scheduledDate.verifyIfExistAtTheCurrentTime(startingDateWithTime,duration);
    }
    @Override
    public boolean sameAs(Object other) {
        if (!(other instanceof ExtraClass)) {
            return false;
        }

        final ExtraClass that = (ExtraClass) other;

        return extraClassId.equals(that.extraClassId) && scheduledDate.equals(that.scheduledDate);
    }

    @Override
    public ExtraClassId identity() {
        return extraClassId;
    }


}
