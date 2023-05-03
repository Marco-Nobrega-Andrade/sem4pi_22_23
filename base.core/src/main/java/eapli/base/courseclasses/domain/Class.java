package eapli.base.courseclasses.domain;

import eapli.base.coursemanagement.domain.Course;
import eapli.framework.domain.model.AggregateRoot;
import javax.persistence.*;


@Entity
public class Class implements AggregateRoot<ClassId> {
    @EmbeddedId
    private ClassId classId;

    @Embedded
    private ClassTitle classTitle;

    @Embedded
    private WeeklyDate weeklyDate;

    @ManyToOne
    private Course classCourse;

    public Class(ClassId classId, ClassTitle classTitle, WeeklyDate weeklyDate) {
        this.classId = classId;
        this.classTitle = classTitle;
        this.weeklyDate = weeklyDate;
    }

    protected Class() {
        //only for ORM
    }

    @Override
    public boolean sameAs(Object other) {
        if (!(other instanceof Class)) {
            return false;
        }

        final Class that = (Class) other;

        return classId.equals(that.classId) && classTitle.equals(that.classTitle) && weeklyDate.equals(that.weeklyDate);
    }

    @Override
    public ClassId identity() {
        return classId;
    }
}
