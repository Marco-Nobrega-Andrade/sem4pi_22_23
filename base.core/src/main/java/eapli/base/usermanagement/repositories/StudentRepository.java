package eapli.base.usermanagement.repositories;

import eapli.base.usermanagement.domain.MecanographicNumber;
import eapli.base.usermanagement.domain.Student;
import eapli.framework.domain.repositories.DomainRepository;

public interface StudentRepository extends DomainRepository<MecanographicNumber, Student> {


    /**
     * returns the total number of Students registered in a specific year
     * @param year
     *              the year to search for
     * @return
     */
    int findTotalMecanographicNumberByYear(String year);
}
