package eapli.base.courseclasses.repositories;

import eapli.base.courseclasses.domain.*;
import eapli.base.usermanagement.domain.Person;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;

public interface ExtraClassRepository extends DomainRepository<ExtraClassId, ExtraClass> {
    public Optional<ExtraClass> findAllClassesWhoMatch(Person person, Date date);
}
