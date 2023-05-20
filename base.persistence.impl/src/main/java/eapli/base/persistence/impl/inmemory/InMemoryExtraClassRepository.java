package eapli.base.persistence.impl.inmemory;

import eapli.base.courseclasses.domain.Date;
import eapli.base.courseclasses.domain.ExtraClass;
import eapli.base.courseclasses.domain.ExtraClassId;
import eapli.base.courseclasses.repositories.ExtraClassRepository;
import eapli.base.coursemanagement.domain.Course;
import eapli.base.usermanagement.domain.ID_Person;
import eapli.base.usermanagement.domain.Person;
import eapli.base.usermanagement.repositories.PersonRepository;
import eapli.framework.general.domain.model.EmailAddress;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.List;
import java.util.Optional;

public class InMemoryExtraClassRepository extends InMemoryDomainRepository<ExtraClass, ExtraClassId>
        implements ExtraClassRepository {
    @Override
    public List<ExtraClass> findAllClassesWhoMatch(List<Person> person) {
        return null;
    }

    @Override
    public List<ExtraClass> findExtraClassesInACourse(Course course) {
        return null;
    }

    @Override
    public List<ExtraClass> findAllClassesByTeacher(List<Person> teachers) {
        return null;
    }
}
