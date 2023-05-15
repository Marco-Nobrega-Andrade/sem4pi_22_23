package eapli.base.courseclasses.domain;

import eapli.framework.domain.model.AggregateRoot;
import javax.persistence.*;
import java.util.Date;
import java.util.Objects;


@Entity
public class Class implements AggregateRoot<ClassId> {
    @Id
    private ClassId classId;

    private ClassTitle classTitle;

    private WeeklyDate weeklyDate;


    public Class( ClassTitle classTitle, WeeklyDate weeklyDate, ClassId classId) {
        if (classId == null || classTitle == null || weeklyDate == null) {
            throw new IllegalArgumentException("Class cannot be created with null Objects");
        }
        this.classId = classId;
        this.classTitle = classTitle;
        this.weeklyDate = weeklyDate;
    }

    protected Class() {
        //only for ORM
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Class aClass = (Class) o;
        return Objects.equals(classId, aClass.classId) && Objects.equals(classTitle, aClass.classTitle) && Objects.equals(weeklyDate, aClass.weeklyDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classId, classTitle, weeklyDate);
    }

    public boolean verifyIfAClassAtTheTime(Date startingDateWithTime, int duration){
        return weeklyDate.verifyIfAClassAtTheTime(startingDateWithTime,duration);
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
