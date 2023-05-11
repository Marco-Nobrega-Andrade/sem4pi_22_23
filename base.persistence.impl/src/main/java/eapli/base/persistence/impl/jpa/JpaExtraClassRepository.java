package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.courseclasses.domain.*;
import eapli.base.courseclasses.repositories.ExtraClassRepository;
import eapli.base.usermanagement.domain.Person;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class JpaExtraClassRepository extends JpaAutoTxRepository<ExtraClass, ExtraClassId,ExtraClassId> implements ExtraClassRepository {

    public JpaExtraClassRepository(final TransactionalContext autoTx) {
        super(autoTx, "extraClassId");
    }
    public JpaExtraClassRepository(final String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "extraClassId");
    }
    @Override
    public Optional<ExtraClass> findAllClassesWhoMatch(Person person, Date date) {
        final Map<String, Object> params = new HashMap<>();
        params.put("person", person);
        params.put("date", date);
        return matchOne("e.person=:person AND e.date=:date", params);
    }
}
