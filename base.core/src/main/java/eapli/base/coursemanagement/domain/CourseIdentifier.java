package eapli.base.coursemanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class CourseIdentifier implements Comparable<CourseIdentifier>, ValueObject {
    private String course_Id;

    public CourseIdentifier(String courseId) {
        if(StringPredicates.isNullOrEmpty(courseId)){
            throw new IllegalArgumentException("Course identifier cannot be null");
        }
        if(courseId.isBlank()){
            throw new IllegalArgumentException("Course identifier cannot be blank");
        }
        this.course_Id = courseId;
    }

    protected CourseIdentifier() {
        //only for ORM
    }

    @Override
    public int compareTo(CourseIdentifier o) {
        return course_Id.compareTo(o.course_Id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseIdentifier that = (CourseIdentifier) o;
        return Objects.equals(course_Id, that.course_Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(course_Id);
    }

    public String returnCourseIdentifierString(){
        return course_Id;
    }
}
