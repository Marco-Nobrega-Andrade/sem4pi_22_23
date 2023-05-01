package eapli.base.usermanagement.domain;

import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Student extends Person{
    @Embedded
    @Column(unique = true)
    private MecanographicNumber mecanographicNumber;
    @Embedded
    private DateOfBirth date;
    @Embedded
    private TaxPayerNumber taxPayerNumber;

    public Student(SystemUser user, FullName fullName, ID_Person id, MecanographicNumber mecanographicNumber, DateOfBirth date, TaxPayerNumber taxPayerNumber) {
        super(user, fullName, id);
        this.mecanographicNumber = mecanographicNumber;
        this.date = date;
        this.taxPayerNumber = taxPayerNumber;
    }

    public Student(MecanographicNumber mecanographicNumber, DateOfBirth date, TaxPayerNumber taxPayerNumber) {
        this.mecanographicNumber = mecanographicNumber;
        this.date = date;
        this.taxPayerNumber = taxPayerNumber;
    }

    public Student() {
        // for ORM only
    }


    public boolean compareYearMecanographicNumber(String year){
        return mecanographicNumber.compareYear(year);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(mecanographicNumber, student.mecanographicNumber) && Objects.equals(date, student.date) && Objects.equals(taxPayerNumber, student.taxPayerNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mecanographicNumber, date, taxPayerNumber);
    }

    @Override
    public String toString() {
        return "Student{" +
                "mecanographicNumber=" + mecanographicNumber +
                ", date=" + date +
                ", taxPayerNumber=" + taxPayerNumber +
                '}';
    }
}
