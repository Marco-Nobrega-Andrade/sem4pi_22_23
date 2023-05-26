package eapli.base.usermanagement.repositories;

import eapli.base.usermanagement.domain.ID_Person;
import eapli.base.usermanagement.domain.Person;
import eapli.framework.domain.repositories.DomainRepository;
import eapli.framework.general.domain.model.EmailAddress;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import java.util.List;
import java.util.Optional;

public interface PersonRepository extends DomainRepository<ID_Person, Person> {

    /**
     * returns the total number of Person in the system
     * @return
     */
    int findTotalNumberOfPerson();

/**
 * returns the list of Person in the system that match with the given email
 *
 * @return
 */

    List<Person> findAllPersonsWhoMatch(List<EmailAddress> email);

    Person findPersonBySystemUser(SystemUser systemUser);
}
