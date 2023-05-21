package eapli.base.exams.domain;

import eapli.framework.domain.model.ValueObject;

import java.util.Objects;

public class ExamId implements ValueObject, Comparable<ExamId> {

    private Long exam_id;

    public ExamId(long exam_id) {
        if (exam_id <= 0 ) {
            throw new IllegalArgumentException(
                    "Id number must be greater than 0");
        }
        this.exam_id = exam_id;
    }

    protected ExamId() {
        //only for ORM
    }

    @Override
    public String toString() {
        return "" + exam_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamId examId = (ExamId) o;
        return exam_id == examId.exam_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(exam_id);
    }

    @Override
    public int compareTo(ExamId o) {
        return Long.compare(exam_id,o.exam_id);
    }
}
