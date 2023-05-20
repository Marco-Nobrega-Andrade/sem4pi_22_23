package eapli.base.exams.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExamIdTest {

    @Test(expected = IllegalArgumentException.class)
    public void ensureThatExamIDCannotBeCreateWithNumbersInferiorTo1() {
        ExamId test= new ExamId(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureThatDateIntervalCannotBeCreateWithNullValues() {
        DateInterval test= new DateInterval(null,null);
    }

    @Test
    public void ensureClassIDEquals() {
        ExamId test1 = new ExamId(1);
        ExamId test2 = new ExamId(2);
        assertTrue(test1.equals(test1));
        assertFalse(test1.equals(test2));
    }


}