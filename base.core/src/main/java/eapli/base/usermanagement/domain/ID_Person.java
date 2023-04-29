package eapli.base.usermanagement.domain;

import eapli.framework.domain.model.ValueObject;

import java.util.Objects;

public class ID_Person implements ValueObject, Comparable<ID_Person>{

    private int number;

    public ID_Person(int number) {
        if (number > 0 ) {
            throw new IllegalArgumentException(
                    "ID number must be greater than 0");
        }
        this.number = number;
    }

    protected ID_Person() {
        // for ORM
    }

    public static TaxPayerNumber valueOf(final int taxPayerNumber) {
        return new TaxPayerNumber(taxPayerNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ID_Person that = (ID_Person) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "ID_Person{" +
                "number=" + number +
                '}';
    }


    @Override
    public int compareTo(ID_Person o) {
        if (number > o.number){
            return 1;
        } else if (number < o.number) {
            return -1;
        }else{
            return 0;
        }
    }
}
