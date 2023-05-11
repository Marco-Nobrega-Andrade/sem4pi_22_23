package eapli.base.enrollments.domain;

import eapli.base.coursemanagement.domain.Course;
import eapli.base.usermanagement.domain.Student;
import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.*;

@Entity
public class Enrollment implements AggregateRoot<EnrollmentId> {
    @Id
    private EnrollmentId enrollmentId;

    private EnrollmentStatus enrollmentStatus;
    @ManyToOne
    @JoinColumn
    private Course course;
    @ManyToOne
    @JoinColumn
    private Student student;
    protected Enrollment() {
    }

    @Override
    public boolean sameAs(Object other) {
        if (!(other instanceof Enrollment)) {
            return false;
        }

        final Enrollment that = (Enrollment) other;

        return enrollmentId.equals(that.enrollmentId) && enrollmentStatus.equals(that.enrollmentStatus);
    }

    @Override
    public EnrollmentId identity() {
        return this.enrollmentId;
    }

    public void changeStatus(String newStatus){
        this.enrollmentStatus = new EnrollmentStatus(EnrollmentStatusValue.valueOf(newStatus));
    }
}
