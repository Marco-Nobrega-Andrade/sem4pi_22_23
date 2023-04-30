package eapli.base.usermanagement.repositories;

import eapli.base.clientusermanagement.domain.ClientUser;
import eapli.base.usermanagement.domain.ID_Person;
import eapli.base.usermanagement.domain.MecanographicNumber;
import eapli.base.usermanagement.domain.Person;
import eapli.framework.domain.repositories.DomainRepository;

public interface PersonRepository extends DomainRepository<ID_Person, Person> {

    /**
     * returns the total number of Person in the system
     * @return
     */
    int findTotalNumberOfPerson();

    /**
     * returns the total number of Students registered in a specific year
     * @param year
     *              the year to search for
     * @return
     */
    int findTotalMecanographicNumberByYear(String year);
}
