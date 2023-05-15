package eapli.base.courseclasses.domain;

import eapli.base.courseclasses.domain.builder.ClassBuilder;
import eapli.base.usermanagement.domain.ID_Person;
import eapli.base.usermanagement.domain.Person;
import eapli.base.usermanagement.domain.builder.PersonBuilder;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ClassTest {

    @Test(expected = IllegalArgumentException.class)
    public void ensureClassCannotBeCreatedWithNullValues() {
        Class courseClass = new ClassBuilder().build();
    }

    @Test
    public void ensureClassEqualsPassesForTheSameID() {
        Class courseClass = new ClassBuilder().withTitleDateWithTimeNumberOfClassDurationID("title",new java.util.Date(1000,10,2,10,0,0),30,3,1L).build();
        Class anotherCourseClass = new ClassBuilder().withTitleDateWithTimeNumberOfClassDurationID("title",new java.util.Date(1000,10,2,10,0,0),30,3,1L).build();

        assertTrue(courseClass.equals(anotherCourseClass));
    }

    @Test
    public void ensureClassEqualsFailsForDifferenteID()  {
        Class courseClass = new ClassBuilder().withTitleDateWithTimeNumberOfClassDurationID("title",new java.util.Date(1000,10,2,10,0,0),30,3,1L).build();
        Class anotherCourseClass = new ClassBuilder().withTitleDateWithTimeNumberOfClassDurationID("title",new java.util.Date(1000,10,2,10,0,0),30,3,2L).build();

        assertFalse(courseClass.equals(anotherCourseClass));
    }

    @Test
    public void ensureClassEqualsAreTheSameForTheSameInstance() {
        Class courseClass = new Class();

        assertTrue(courseClass.equals(courseClass));
    }

    @Test
    public void ensureClassEqualsFailsForDifferenteObjectTypes(){
        Class courseClass = new Class();
        ExtraClass extraClass = new ExtraClass();
        assertFalse(courseClass.equals(extraClass));
    }

    @Test
    public void ensureClassIsTheSameAsItsInstance() {
        Class courseClass = new ClassBuilder().withTitleDateWithTimeNumberOfClassDurationID("title",new java.util.Date(1000,10,2,10,0,0),30,3,1L).build();

        assertTrue(courseClass.sameAs(courseClass));
    }

    @Test
    public void ensureTwoClassWithDifferentIDAreNotTheSame()  {
        Class courseClass = new ClassBuilder().withTitleDateWithTimeNumberOfClassDurationID("title",new java.util.Date(1000,10,2,10,0,0),30,3,1L).build();
        Class anotherCourseClass = new ClassBuilder().withTitleDateWithTimeNumberOfClassDurationID("title",new java.util.Date(1000,10,2,10,0,0),30,3,2L).build();

        assertFalse(courseClass.sameAs(anotherCourseClass));
    }

    @Test
    public void verifyIfAClassAtTheTime()  {
        Class courseClass = new ClassBuilder().withTitleDateWithTimeNumberOfClassDurationID("title",new java.util.Date(1000,10,2,10,0,0),3,30,1L).build();

        java.util.Date testData1 = new java.util.Date(1000,10,9,10,10,0);
        assertTrue(courseClass.verifyIfAClassAtTheTime(testData1,30));

        java.util.Date testData2 = new java.util.Date(1000,10,9,11,30,0);
        assertFalse(courseClass.verifyIfAClassAtTheTime(testData2,30));

    }
}