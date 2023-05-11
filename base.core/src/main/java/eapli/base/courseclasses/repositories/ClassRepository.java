package eapli.base.courseclasses.repositories;

import eapli.base.courseclasses.domain.Class;
import eapli.base.courseclasses.domain.ClassId;
import eapli.base.courseclasses.domain.Date;
import eapli.base.usermanagement.domain.Person;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;

public interface ClassRepository extends DomainRepository<ClassId, Class> {
    Optional<Class> findAllClassesWhoMatch(Person person, Date date);
}
