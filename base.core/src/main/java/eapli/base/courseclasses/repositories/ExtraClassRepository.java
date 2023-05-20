package eapli.base.courseclasses.repositories;

import eapli.base.courseclasses.domain.*;
import eapli.base.courseclasses.domain.Class;
import eapli.base.coursemanagement.domain.Course;
import eapli.base.usermanagement.domain.Person;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.List;
import java.util.Optional;

public interface ExtraClassRepository extends DomainRepository<ExtraClassId, ExtraClass> {
    public List<ExtraClass> findAllClassesWhoMatch(List<Person> person);

    List<ExtraClass> findExtraClassesInACourse(Course course);

    List<ExtraClass> findAllClassesByTeacher(List<Person> teachers);
}
