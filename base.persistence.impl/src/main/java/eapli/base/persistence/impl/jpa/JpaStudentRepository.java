package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.usermanagement.domain.MecanographicNumber;
import eapli.base.usermanagement.domain.Student;
import eapli.base.usermanagement.repositories.StudentRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import javax.persistence.TypedQuery;

public class JpaStudentRepository extends JpaAutoTxRepository<Student, MecanographicNumber,MecanographicNumber> implements StudentRepository {

    public JpaStudentRepository(final TransactionalContext autoTx) {
        super(autoTx, "mecanographicNumber");
    }

    public JpaStudentRepository(final String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "mecanographicNumber");
    }

    @Override
    public int findTotalMecanographicNumberByYear(String year) {

        TypedQuery<Long> query = createQuery("SELECT COUNT(s.mecanographicNumber) FROM Student s WHERE SUBSTRING(s.mecanographicNumber.mecanographicNumber, 1, 4) = :year",
                Long.class);
        query.setParameter("year", year);
        return Math.toIntExact(query.getSingleResult());

    }
}
