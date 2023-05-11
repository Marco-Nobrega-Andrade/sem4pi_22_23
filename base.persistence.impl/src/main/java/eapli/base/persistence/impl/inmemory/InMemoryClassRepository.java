package eapli.base.persistence.impl.inmemory;

import eapli.base.courseclasses.domain.Class;
import eapli.base.courseclasses.domain.ClassId;
import eapli.base.courseclasses.domain.Date;
import eapli.base.courseclasses.repositories.ClassRepository;
import eapli.base.usermanagement.domain.ID_Person;
import eapli.base.usermanagement.domain.Person;
import eapli.base.usermanagement.repositories.PersonRepository;
import eapli.framework.general.domain.model.EmailAddress;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.Optional;

public class InMemoryClassRepository extends InMemoryDomainRepository<Class, ClassId>
        implements ClassRepository {
    @Override
    public Optional<Class> findAllClassesWhoMatch(Person person, Date date) {
        return Optional.empty();
    }
}
