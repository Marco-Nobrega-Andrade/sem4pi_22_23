package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.usermanagement.repositories.PersonRepository;
import eapli.base.usermanagement.domain.ID_Person;
import eapli.base.usermanagement.domain.Person;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.general.domain.model.EmailAddress;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import javax.persistence.TypedQuery;
import java.util.HashMap;
import java.util.List;
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
    public List<Person> findAllPersonsWhoMatch(List<EmailAddress> email) {
        return createQuery("SELECT p FROM Person p WHERE p.systemUser.email IN ( :email )", Person.class)
                .setParameter("email", email).getResultList();
    }

    @Override
    public Person findPersonBySystemUser(SystemUser systemUser) {
        TypedQuery<Person> query = createQuery("SELECT p FROM Person p WHERE p.systemUser = :systemUser",
                Person.class);
        query.setParameter("systemUser", systemUser);
        return query.getSingleResult();
    }

}
