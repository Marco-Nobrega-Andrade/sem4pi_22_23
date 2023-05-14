package eapli.base.usermanagement.repositories;

import eapli.base.usermanagement.domain.Acronym;
import eapli.base.usermanagement.domain.Teacher;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.List;

public interface TeacherRepository extends DomainRepository<Acronym, Teacher> {

    /**
     * returns the list of Teachers in the system who are teachers
     *
     * @return List<Person>
     */
    Iterable<Teacher> findAllTeachers();

    Teacher findTeacherByAcronym(String acronym);
}
