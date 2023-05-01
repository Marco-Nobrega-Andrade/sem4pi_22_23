package eapli.base.enrollments.domain;

import eapli.base.coursemanagement.domain.Course;
import eapli.base.usermanagement.domain.Student;
import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.*;

@Entity
public class Enrollment implements AggregateRoot<EnrollmentId> {
    @EmbeddedId
    private EnrollmentId enrollmentId;
    @Embedded
    private EnrollmentStatus enrollmentStatus;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="enrollmentId")
    private Student studentEnrolled;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="courseId")
    private Course courseEnrolled;

    protected Enrollment() {
    }

    @Override
    public boolean sameAs(Object other) {
        if (!(other instanceof Enrollment)) {
            return false;
        }

        final Enrollment that = (Enrollment) other;

        return enrollmentId.equals(that.enrollmentId) && enrollmentStatus.equals(that.enrollmentStatus) && studentEnrolled.equals(that.studentEnrolled)
                && courseEnrolled.equals(that.courseEnrolled);
    }

    @Override
    public EnrollmentId identity() {
        return this.enrollmentId;
    }
}
