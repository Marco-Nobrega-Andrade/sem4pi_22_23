package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.coursemanagement.repositories.CourseRepository;
import eapli.base.enrollments.EnrollmentRepository;
import eapli.base.enrollments.domain.Enrollment;
import eapli.base.enrollments.domain.EnrollmentId;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

public class JpaEnrollmentRepository extends JpaAutoTxRepository<Enrollment, EnrollmentId, EnrollmentId> implements EnrollmentRepository {
    public JpaEnrollmentRepository(final TransactionalContext autoTx) {
        super(autoTx, "enrollmentId");
    }

    public JpaEnrollmentRepository(final String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "enrollmentId");
    }
}
