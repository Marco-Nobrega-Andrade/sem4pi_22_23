package eapli.base.postitmanager.domain;

import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class PostIt implements AggregateRoot<PostItIdentifier> {
    @EmbeddedId
    private PostItIdentifier postItIdentifier;
    private Content content;
    protected PostIt(PostItIdentifier postItIdentifier, Content content) {
        if (postItIdentifier == null || content == null) {
            throw new IllegalArgumentException();
        }
        this.postItIdentifier = postItIdentifier;
        this.content = content;
    }
    protected PostIt() {
        // for ORM only
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostIt postIt = (PostIt) o;
        return Objects.equals(postItIdentifier, postIt.postItIdentifier);
    }
    @Override
    public int hashCode() {
        return Objects.hash(postItIdentifier);
    }
    @Override
    public boolean sameAs(Object other) {
        if (!(other instanceof PostIt)) {
            return false;
        }

        final PostIt that = (PostIt) other;

        return this.postItIdentifier.equals(that.postItIdentifier);
    }
    @Override
    public PostItIdentifier identity() {
        return postItIdentifier;
    }
    public String returnContentString(){
        return content.toString();
    }
}
