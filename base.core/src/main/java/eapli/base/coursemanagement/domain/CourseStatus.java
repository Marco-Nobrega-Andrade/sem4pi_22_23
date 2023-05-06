package eapli.base.coursemanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Objects;
@Embeddable
public class CourseStatus implements ValueObject {

    @Enumerated(EnumType.STRING)
    private CourseStatusValue courseStatusValue;


    public CourseStatus(CourseStatusValue courseStatusValue) {
        this.courseStatusValue = courseStatusValue;
    }

    public CourseStatus(String status) {
        this.courseStatusValue = CourseStatusValue.valueOf(status);
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
        return courseStatusValue.getStateNumber();
    }
}
