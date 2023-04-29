package eapli.base.usermanagement.domain;

import eapli.framework.domain.model.ValueObject;

import java.util.Objects;

public class TaxPayerNumber implements ValueObject, Comparable<TaxPayerNumber>{

    private int number;

    public TaxPayerNumber(int number) {
        if (number > 999999999 || number < 100000000 ) {
            throw new IllegalArgumentException(
                    "Tax Payer number should have 9 digits");
        }
        this.number = number;
    }

    protected TaxPayerNumber() {
        // for ORM
    }

    public static TaxPayerNumber valueOf(final int taxPayerNumber) {
        return new TaxPayerNumber(taxPayerNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaxPayerNumber that = (TaxPayerNumber) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "TaxPayerNumber{" +
                "number=" + number +
                '}';
    }


    @Override
    public int compareTo(TaxPayerNumber o) {
        if (number > o.number){
            return 1;
        } else if (number < o.number) {
            return -1;
        }else{
            return 0;
        }
    }
}
