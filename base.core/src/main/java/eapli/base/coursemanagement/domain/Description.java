package eapli.base.coursemanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class Description implements ValueObject {
    private String description;

    public Description(String description) {
        if(StringPredicates.isNullOrEmpty(description)){
            throw new IllegalArgumentException("Course description cannot be null");
        }
        if(description.isBlank()){
            throw new IllegalArgumentException("Course description cannot be blank");
        }
        this.description = description;
    }

    protected Description() {
        //only for ORM
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Description that = (Description) o;
        return Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }
}
