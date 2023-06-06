package eapli.base.boardparticipantmanagement.domain;

import eapli.framework.domain.model.ValueObject;

import java.util.Objects;

public class BoardParticipantId  implements Comparable<BoardParticipantId>, ValueObject {
    private Long id;

    protected BoardParticipantId(Long id) {
        this.id = id;
    }

    protected BoardParticipantId(){
        //Only for ORM
    }

    @Override
    public int compareTo(BoardParticipantId other) {
        return this.id.compareTo(other.id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BoardParticipantId)) return false;
        BoardParticipantId that = (BoardParticipantId) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
