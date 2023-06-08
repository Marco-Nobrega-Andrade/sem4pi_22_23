package eapli.base.postitmanager.domain;

import eapli.framework.domain.model.ValueObject;

import java.util.Objects;

public class PostItIdentifier implements Comparable<PostItIdentifier>, ValueObject {
    private long postItId;

    protected PostItIdentifier(long id){
        if (id <= 0){
            throw new IllegalArgumentException("The post it id cannot be 0 or less.");
        }
        this.postItId = id;
    }

    protected PostItIdentifier(){
        //ORM
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostItIdentifier that = (PostItIdentifier) o;
        return Objects.equals(postItId, that.postItId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postItId);
    }

    @Override
    public int compareTo(PostItIdentifier o) {
        return 0;
    }
}
