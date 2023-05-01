package eapli.base.usermanagement.domain;

import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Type")
public class Person implements AggregateRoot<ID_Person> {

    @Embedded
    private FullName fullName;

    @EmbeddedId
    private ID_Person id;

    /**
     * cascade = CascadeType.NONE as the systemUser is part of another aggregate
     */


    @OneToOne()
    private SystemUser systemUser;

    public Person(final SystemUser user, final FullName fullName, ID_Person id) {
        if (fullName == null || user == null || id == null) {
            throw new IllegalArgumentException();
        }
        this.systemUser = user;
        this.fullName = fullName;
        this.id =  id;
    }

    protected Person() {
        // for ORM only
    }

    public SystemUser user() {
        return this.systemUser;
    }

    public FullName fullName() {
        return this.fullName;
    }

    @Override
    public boolean sameAs(Object other) {
        if (!(other instanceof Person)) {
            return false;
        }

        final Person that = (Person) other;

        return fullName.equals(that.fullName) && systemUser.equals(that.systemUser) && id.equals(that.id);
    }

    @Override
    public int compareTo(ID_Person other) {
        return AggregateRoot.super.compareTo(other);
    }

    @Override
    public ID_Person identity() {
        return this.id;
    }

    @Override
    public boolean hasIdentity(ID_Person id) {
        return AggregateRoot.super.hasIdentity(id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName=" + fullName +
                ", id=" + id +
                ", systemUser=" + systemUser +
                '}';
    }
}
