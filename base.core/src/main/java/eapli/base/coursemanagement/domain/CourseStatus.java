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
        CLOSE (1){ @Override public String toString() { return "Close"; } },
        OPEN (2){ @Override public String toString() { return "Open"; } },
        OPEN_ENROLLMENTS (3){ @Override public String toString() { return "Enrollments open"; } },
        CLOSED_ENROLLMENTS (4){ @Override public String toString() { return "Enrollments closed"; } },
        CLOSED (5){ @Override public String toString() { return "Closed"; } };
        final private int stateNumber;
        CourseStatusValue (int stateNumber){
            this.stateNumber = stateNumber;
        }
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

    public String returnCourseStatusString(){
        return courseStatusValue.toString();
    }
    public int returnCourseStatusInt(){
        return courseStatusValue.stateNumber;
    }
}
