package eapli.base.persistence.impl.inmemory;

import eapli.base.usermanagement.domain.BaseRoles;
import eapli.base.usermanagement.domain.ID_Person;
import eapli.base.usermanagement.domain.Person;
import eapli.base.usermanagement.domain.Student;
import eapli.base.usermanagement.repositories.PersonRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;


public class InMemoryPersonRepository extends InMemoryDomainRepository<Person, ID_Person>
        implements PersonRepository {
    @Override
    public int findTotalNumberOfPerson() {
        return (int) count();
    }

    @Override
    public int findTotalMecanographicNumberByYear(String year) {

        Iterable<Person> person = findAll();
        int i = 0;
        for (Person p: person){
            if (p.user().hasAny(BaseRoles.STUDENT)){
                Student s = (Student) p;
                if (s.compareYearMecanographicNumber(year)){
                    i++;
                }
            }
        }

        return  i;
    }
}
