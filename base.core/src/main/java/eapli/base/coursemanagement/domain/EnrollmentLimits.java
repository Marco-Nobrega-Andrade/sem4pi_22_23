package eapli.base.coursemanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class EnrollmentLimits implements ValueObject {
    private int minEnrollments;
    private int maxEnrollments;

    public EnrollmentLimits(int minEnrollments, int maxEnrollments) {
        verifyLimits(minEnrollments,maxEnrollments);
        this.minEnrollments = minEnrollments;
        this.maxEnrollments = maxEnrollments;
    }

    private void verifyLimits(int minEnrollments, int maxEnrollments) {
        if(minEnrollments < 1){
            throw new IllegalArgumentException("Minimum number of course enrollments must be greater than 0");
        }
        if(minEnrollments > maxEnrollments){
            throw new IllegalArgumentException("Maximum number of course enrollments must be greater or equal to the minimum number of course enrollments");
        }
    }

    protected EnrollmentLimits() {
        //only for ORM
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnrollmentLimits that = (EnrollmentLimits) o;
        return minEnrollments == that.minEnrollments && maxEnrollments == that.maxEnrollments;
    }

    @Override
    public int hashCode() {
        return Objects.hash(minEnrollments, maxEnrollments);
    }
}
