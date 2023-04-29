package eapli.base.usermanagement.domain;

import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Objects;


@Entity
public class Teacher extends Person{

    @Column(unique=true)
    private Acronym acronym;

    private DateOfBirth date;

    private TaxPayerNumber taxPayerNumber;

    public Teacher(SystemUser user, FullName fullName, ID_Person id, Acronym acronym, DateOfBirth date, TaxPayerNumber taxPayerNumber) {
        super(user, fullName, id);
        this.acronym = acronym;
        this.date = date;
        this.taxPayerNumber = taxPayerNumber;
    }

    public Teacher(Acronym acronym, DateOfBirth date, TaxPayerNumber taxPayerNumber) {
        this.acronym = acronym;
        this.date = date;
        this.taxPayerNumber = taxPayerNumber;
    }

    public Teacher() {
        // for ORM only
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(acronym, teacher.acronym) && Objects.equals(date, teacher.date) && Objects.equals(taxPayerNumber, teacher.taxPayerNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(acronym, date, taxPayerNumber);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "acronym=" + acronym +
                ", date=" + date +
                ", taxPayerNumber=" + taxPayerNumber +
                '}';
    }
}
