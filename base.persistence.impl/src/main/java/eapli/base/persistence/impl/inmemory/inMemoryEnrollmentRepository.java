package eapli.base.persistence.impl.inmemory;

import eapli.base.enrollments.repositories.EnrollmentRepository;
import eapli.base.enrollments.domain.Enrollment;
import eapli.base.enrollments.domain.EnrollmentId;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class inMemoryEnrollmentRepository extends InMemoryDomainRepository<Enrollment, EnrollmentId> implements EnrollmentRepository {
}
