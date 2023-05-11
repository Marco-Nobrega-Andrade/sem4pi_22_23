package eapli.base.enrollments.repositories;

import eapli.base.enrollments.domain.Enrollment;
import eapli.base.enrollments.domain.EnrollmentId;
import eapli.framework.domain.repositories.DomainRepository;

public interface EnrollmentRepository extends DomainRepository<EnrollmentId, Enrollment> {
}
