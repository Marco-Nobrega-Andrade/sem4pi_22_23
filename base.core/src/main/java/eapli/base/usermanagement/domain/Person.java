package eapli.base.usermanagement.domain;

import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Person implements AggregateRoot<ID_Person> {

    @Embedded
    private FullName fullName;

    @EmbeddedId
    private ID_Person id;


    @OneToOne(cascade = CascadeType.ALL)
    private SystemUser systemUser;

    @OneToOne(cascade = CascadeType.ALL)
    private Teacher teacher;

    @OneToOne(cascade = CascadeType.ALL)
    private Student student;

    @OneToOne(cascade = CascadeType.ALL)
    private BoardOwner boardOwner;

    public Person(final SystemUser user, final FullName fullName, ID_Person id) {
        if (fullName == null || user == null || id == null) {
            throw new IllegalArgumentException();
        }
        this.systemUser = user;
        this.fullName = fullName;
        this.id =  id;
    }

    public Person(final SystemUser user, final FullName fullName, ID_Person id,Teacher teacher) {
        if (fullName == null || user == null || id == null || teacher == null) {
            throw new IllegalArgumentException();
        }
        this.systemUser = user;
        this.fullName = fullName;
        this.id =  id;
        this.teacher = teacher;
    }

    public Person(final SystemUser user, final FullName fullName, ID_Person id,Student student) {
        if (fullName == null || user == null || id == null || student == null) {
            throw new IllegalArgumentException();
        }
        this.systemUser = user;
        this.fullName = fullName;
        this.id =  id;
        this.student = student;
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

        return Objects.equals(fullName, that.fullName) && Objects.equals(id, that.id) && Objects.equals(systemUser, that.systemUser) && Objects.equals(teacher, that.teacher) && Objects.equals(student, that.student);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(fullName, person.fullName) && Objects.equals(id, person.id) && Objects.equals(systemUser, person.systemUser) && Objects.equals(teacher, person.teacher) && Objects.equals(student, person.student);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, id, systemUser, teacher, student);
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
    public boolean isATeacher() {
        return this.teacher != null;
    }

    public boolean addBoardOwner(BoardOwner boardOwner){
        if(isBoardOwner()) return false;
        this.boardOwner=boardOwner;
        return true;
    }

    public boolean isBoardOwner(){
        if(boardOwner!=null) return true;
        return false;
    }
}
