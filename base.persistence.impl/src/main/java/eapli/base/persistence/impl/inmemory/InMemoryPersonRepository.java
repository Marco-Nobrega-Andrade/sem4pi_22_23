package eapli.base.persistence.impl.inmemory;

import eapli.base.usermanagement.domain.ID_Person;
import eapli.base.usermanagement.domain.Person;
import eapli.base.usermanagement.repositories.PersonRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;


public class InMemoryPersonRepository extends InMemoryDomainRepository<Person, ID_Person>
        implements PersonRepository {
    @Override
    public int findTotalNumberOfPerson() {
        return (int) count();
    }


}
