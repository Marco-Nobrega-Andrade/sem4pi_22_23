package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.courseclasses.domain.Class;
import eapli.base.courseclasses.domain.ClassId;
import eapli.base.courseclasses.domain.Date;
import eapli.base.courseclasses.repositories.ClassRepository;
import eapli.base.usermanagement.domain.Person;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class JpaClassRepository extends JpaAutoTxRepository<Class, ClassId,ClassId> implements ClassRepository {

    public JpaClassRepository(final TransactionalContext autoTx) {
        super(autoTx, "classId");
    }
    public JpaClassRepository(final String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "classId");
    }
    @Override
    public Optional<Class> findAllClassesWhoMatch(Person person, Date date) {
        final Map<String, Object> params = new HashMap<>();
        params.put("person", person);
        params.put("date", date);
        return matchOne("e.person=:person AND e.date=:date", params);
    }

}
