package eapli.base.persistence.impl.inmemory;

import eapli.base.usermanagement.domain.ID_Person;
import eapli.base.usermanagement.domain.Person;
import eapli.base.usermanagement.repositories.PersonRepository;
import eapli.framework.general.domain.model.EmailAddress;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.Optional;

public class InMemoryExtraClassRepository extends InMemoryDomainRepository<Person, ID_Person>
        implements PersonRepository {
    @Override
    public int findTotalNumberOfPerson() {
        return 0;
    }

    @Override
    public Optional<Person> findAllPersonsWhoMatch(EmailAddress email) {
        return Optional.empty();
    }
}
