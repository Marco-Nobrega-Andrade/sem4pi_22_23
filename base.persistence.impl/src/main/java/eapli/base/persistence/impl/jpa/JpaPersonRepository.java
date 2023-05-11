package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.usermanagement.repositories.PersonRepository;
import eapli.base.usermanagement.domain.ID_Person;
import eapli.base.usermanagement.domain.Person;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.general.domain.model.EmailAddress;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class JpaPersonRepository extends JpaAutoTxRepository<Person, ID_Person,ID_Person> implements PersonRepository {


    public JpaPersonRepository(final TransactionalContext autoTx) {
        super(autoTx, "id");
    }

    public JpaPersonRepository(final String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "id");
    }
    @Override
    public int findTotalNumberOfPerson() {
        return (int) count();
    }

    @Override
    public Optional<Person> findAllPersonsWhoMatch(EmailAddress email) {
        final Map<String, Object> params = new HashMap<>();
        params.put("email", email);
        return matchOne("e.email=:email",params);
    }


}
