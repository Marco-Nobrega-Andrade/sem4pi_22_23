package eapli.base.coursemanagement.domain;

import eapli.base.enrollments.domain.Enrollment;
import eapli.base.usermanagement.domain.Teacher;
import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Course implements AggregateRoot<CourseIdentifier> {
    @EmbeddedId
    private CourseIdentifier courseId;
    @Embedded
    private CourseTitle courseTitle;
    @Embedded
    private CourseName courseName;
    @Embedded
    private Description courseDescription;
    @Embedded
    private EnrollmentLimits enrollmentLimits;
    @Embedded
    private CourseStatus courseStatus;

    @OneToOne(cascade = CascadeType.ALL)
    private Teacher teacherInCharge;

    @OneToMany(mappedBy="studentEnrolled", cascade = CascadeType.ALL)
    private List<Enrollment> enrollmentsList = new ArrayList<>();

    /*
    @OneToMany(mappedBy="course", cascade = CascadeType.ALL)
    private List<Class> classesList;

    @OneToMany(mappedBy="course", cascade = CascadeType.ALL)
    private List<ExtraClass> extraClassesList;
    */
    public Course(CourseIdentifier courseId, CourseTitle courseTitle, CourseName courseName, Description description, EnrollmentLimits enrollmentLimits, CourseStatus courseStatus, Teacher teacherInCharge, ArrayList<Enrollment> enrollmentsList /* ,ArrayList<Class> classesList, ArrayList<ExtraClass> extraClassesList*/) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.courseName = courseName;
        this.courseDescription = description;
        this.enrollmentLimits = enrollmentLimits;
        this.courseStatus = courseStatus;
        this.teacherInCharge = teacherInCharge;
        this.enrollmentsList = enrollmentsList;
        /*
        this.classesList = classesList;
        this.extraClassesList = extraClassesList;
         */
    }

    protected Course() {
        //Only for ORM
    }

    @Override
    public boolean sameAs(Object other) {
        if (!(other instanceof Course)) {
            return false;
        }

        final Course that = (Course) other;

        return courseId.equals(that.courseId) && courseTitle.equals(that.courseTitle) && courseName.equals(that.courseName) && courseDescription.equals(that.courseDescription)
                && enrollmentLimits.equals(that.enrollmentLimits) && courseStatus.equals(that.courseStatus) && teacherInCharge.equals(that.teacherInCharge)
                && enrollmentsList.equals(that.enrollmentsList)
                /* && classesList.equals(that.classesList) && extraClassesList.equals(that.extraClassesList)*/;
    }

    @Override
    public int compareTo(CourseIdentifier other) {
        return AggregateRoot.super.compareTo(other);
    }

    @Override
    public CourseIdentifier identity() {
        return courseId;
    }

    @Override
    public boolean hasIdentity(CourseIdentifier id) {
        return AggregateRoot.super.hasIdentity(id);
    }

}
