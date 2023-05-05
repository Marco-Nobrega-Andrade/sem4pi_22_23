package eapli.base.persistence.impl.inmemory;

import eapli.base.usermanagement.domain.*;
import eapli.base.usermanagement.repositories.StudentRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryStudentRepository extends InMemoryDomainRepository<Student, MecanographicNumber>
        implements StudentRepository {
    @Override
    public int findTotalMecanographicNumberByYear(String year) {
        Iterable<Student> student = findAll();
        int i = 0;
        for (Student s: student){
            if (s.compareYearMecanographicNumber(year)){
                i++;
            }
        }
        return  i;
    }
}
