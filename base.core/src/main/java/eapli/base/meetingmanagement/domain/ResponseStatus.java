package eapli.base.meetingmanagement.domain;

import eapli.framework.domain.model.ValueObject;

import java.util.Objects;

public class ResponseStatus implements ValueObject {

    private boolean status;

    public ResponseStatus(boolean status) {
        this.status = status;
    }

    protected ResponseStatus() {
        //for ORM
    }

    protected boolean returnResponseStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResponseStatus that = (ResponseStatus) o;
        return Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status);
    }
}
