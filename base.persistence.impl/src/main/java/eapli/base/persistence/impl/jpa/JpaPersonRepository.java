package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.usermanagement.repositories.PersonRepository;
import eapli.base.usermanagement.domain.ID_Person;
import eapli.base.usermanagement.domain.Person;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import javax.persistence.TypedQuery;

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
    public int findTotalMecanographicNumberByYear(String year) {
        TypedQuery<Integer> query = createQuery("SELECT COUNT(p.mecanographicNumber) FROM p WHERE SUBSTRING(p.mecanographicNumber.number, 1, 4) = :year",
                int.class);
        query.setParameter("year", year);
        return  query.getSingleResult();
    }
}
