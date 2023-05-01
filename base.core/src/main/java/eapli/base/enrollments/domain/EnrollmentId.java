package eapli.base.enrollments.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class EnrollmentId implements ValueObject, Comparable<EnrollmentId> {
    private Long enrollment_Id;

    @Override
    public int compareTo(EnrollmentId o) {
        return Long.compare(this.enrollment_Id, o.enrollment_Id);
    }

    public EnrollmentId(Long enrollmentId) {
        this.enrollment_Id = enrollmentId;
    }

    public EnrollmentId() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnrollmentId that = (EnrollmentId) o;
        return Objects.equals(enrollment_Id, that.enrollment_Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enrollment_Id);
    }
}
