package eapli.base.usermanagement.repositories;

import eapli.base.usermanagement.domain.ID_Person;
import eapli.base.usermanagement.domain.Person;
import eapli.framework.domain.repositories.DomainRepository;

public interface PersonRepository extends DomainRepository<ID_Person, Person> {

    /**
     * returns the total number of Person in the system
     * @return
     */
    int findTotalNumberOfPerson();


}
