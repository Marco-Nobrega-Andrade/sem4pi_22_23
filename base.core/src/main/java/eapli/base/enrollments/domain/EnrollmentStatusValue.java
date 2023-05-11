package eapli.base.enrollments.domain;
/*
    Enrollment status lifecycle
    Pending --> accepted or Pending --> rejected
    */
public enum EnrollmentStatusValue{
    PENDING,
    ACCEPTED,
    REJECTED
}
