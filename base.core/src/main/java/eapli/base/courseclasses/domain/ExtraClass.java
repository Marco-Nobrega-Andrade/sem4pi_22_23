package eapli.base.courseclasses.domain;

import eapli.base.coursemanagement.domain.Course;
import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.*;

@Entity
public class ExtraClass implements AggregateRoot<ExtraClassId> {
    @EmbeddedId
    private ExtraClassId extraClassId;
    @Embedded
    private ScheduledDate scheduledDate;

    public ExtraClass(ExtraClassId extraClassId, ScheduledDate scheduledDate) {
        this.extraClassId = extraClassId;
        this.scheduledDate = scheduledDate;
    }

    protected ExtraClass() {
        //only for ORM
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
