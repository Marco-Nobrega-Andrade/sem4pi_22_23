package eapli.base.coursemanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import java.util.Objects;

public class CourseName implements ValueObject {
    private String course_Name;

    public CourseName(String courseName) {
        if(StringPredicates.isNullOrEmpty(courseName)){
            throw new IllegalArgumentException("Course name cannot be null");
        }
        if(courseName.isBlank()){
            throw new IllegalArgumentException("Course name cannot be blank");
        }
        this.course_Name = courseName;
    }

    protected CourseName() {
        //only for ORM
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseName that = (CourseName) o;
        return Objects.equals(course_Name, that.course_Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(course_Name);
    }
}
