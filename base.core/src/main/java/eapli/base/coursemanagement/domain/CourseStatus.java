package eapli.base.coursemanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;
import java.util.Objects;
@Embeddable
public class CourseStatus implements ValueObject {

    private CourseStatusValue courseStatusValue;
    /*
    Course status lifecycle
    close --> open --> open enrollments --> closed enrollments --> closed
    */
    enum CourseStatusValue {
        OPEN,
        CLOSE,
        CLOSED,
        OPEN_ENROLLMENTS,
        CLOSED_ENROLLMENTS
    }

    public CourseStatus(CourseStatusValue courseStatusValue) {
        this.courseStatusValue = courseStatusValue;
    }

    public CourseStatus() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseStatus that = (CourseStatus) o;
        return courseStatusValue == that.courseStatusValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseStatusValue);
    }
}
