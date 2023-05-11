package eapli.base.persistence.impl.inmemory;

import eapli.base.usermanagement.domain.ID_Person;
import eapli.base.usermanagement.domain.Person;
import eapli.base.usermanagement.repositories.PersonRepository;
import eapli.framework.general.domain.model.EmailAddress;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class InMemoryPersonRepository extends InMemoryDomainRepository<Person, ID_Person>
        implements PersonRepository {
    @Override
    public int findTotalNumberOfPerson() {
        return (int) count();
    }

    @Override
    public Optional<Person> findAllPersonsWhoMatch(EmailAddress email) {
        return null;
    }


}
