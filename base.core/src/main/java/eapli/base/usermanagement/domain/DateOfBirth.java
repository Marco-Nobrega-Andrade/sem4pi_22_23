package eapli.base.usermanagement.domain;

import eapli.framework.domain.model.ValueObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class DateOfBirth implements ValueObject, Comparable<DateOfBirth>{

    private Date date;

    public DateOfBirth(String date) {
        Date date_form;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            date_form = formatter.parse(date);
        }catch (Exception e){
            throw new IllegalArgumentException(
                    "Date isn´t in the correct format");
        }
        if(date_form.after(new Date())){
            throw new IllegalArgumentException(
                    "The Date is in a future time");
        }
    }

    public static DateOfBirth valueOf(final String date) {
        return new DateOfBirth(date);
    }


    protected DateOfBirth() {
        // for ORM
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DateOfBirth that = (DateOfBirth) o;
        return Objects.equals(date, that.date);
    }

    @Override
    public String toString() {
        return "DateOfBirth{" +
                "date=" + date +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(date);
    }

    @Override
    public int compareTo(DateOfBirth o) {
        return this.date.compareTo(o.date);
    }
}
