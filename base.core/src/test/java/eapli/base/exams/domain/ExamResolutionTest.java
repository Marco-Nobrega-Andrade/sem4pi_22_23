package eapli.base.exams.domain;

import eapli.base.exceptions.InvalidIdException;
import eapli.base.exceptions.NegativeParameterException;
import eapli.base.exceptions.ParameterNullBlankException;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExamResolutionTest {

    @Test(expected = ParameterNullBlankException.class)
    public void ensureIdCannotBeNull() throws NegativeParameterException, ParameterNullBlankException {
        ExamResolution instance = new ExamResolution(null,new Grade((double)20));
    }

    @Test(expected = ParameterNullBlankException.class)
    public void ensureGradeCannotBeNull() throws ParameterNullBlankException, InvalidIdException {
        ExamResolution instance = new ExamResolution(new ExamResolutionId((long) 2),null);
    }

    @Test
    public void ensureEqualExamResolutionsAreTheSame() throws NegativeParameterException, InvalidIdException {
        ExamResolution instance1 = new ExamResolution(1, 20);
        ExamResolution instance2 = new ExamResolution(1, 20);
        assertTrue(instance1.sameAs(instance2));
    }

    @Test
    public void ensureDiffExamResolutionsAreNotTheSame() throws NegativeParameterException, InvalidIdException {
        ExamResolution instance1 = new ExamResolution(1, 20);
        ExamResolution instance2 = new ExamResolution(2, 21);
        assertFalse(instance1.sameAs(instance2));
    }
}