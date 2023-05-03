package eapli.base.coursemanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class CourseTitle implements ValueObject {
    private String course_Title;

    public CourseTitle(String courseTitle) {
        if(StringPredicates.isNullOrEmpty(courseTitle)){
            throw new IllegalArgumentException("Course title cannot be null");
        }
        if(courseTitle.isBlank()){
            throw new IllegalArgumentException("Course title cannot be blank");
        }
        this.course_Title = courseTitle;
    }

    protected CourseTitle() {
        //only for ORM
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseTitle that = (CourseTitle) o;
        return Objects.equals(course_Title, that.course_Title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(course_Title);
    }

    public String returnCourseTitleString(){
        return course_Title;
    }
}
