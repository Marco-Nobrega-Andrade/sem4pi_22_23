package eapli.base.postitmanager.domain;

import eapli.base.exceptions.NegativeParameterException;
import eapli.base.exceptions.ZeroParameterException;
import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class PostIt implements AggregateRoot<PostItKey> {
    @EmbeddedId
    private PostItKey postItKey;
    private Content content;
    protected PostIt(PostItKey postItKey, Content content) throws ZeroParameterException, NegativeParameterException {
        if (postItKey == null || content == null) {
            throw new IllegalArgumentException();
        }
        this.postItKey = postItKey;
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
        return Objects.equals(postItKey, postIt.postItKey);
    }
    @Override
    public int hashCode() {
        return Objects.hash(postItKey);
    }
    @Override
    public boolean sameAs(Object other) {
        if (!(other instanceof PostIt)) {
            return false;
        }

        final PostIt that = (PostIt) other;

        return this.postItKey.equals(that.postItKey);
    }
    @Override
    public PostItKey identity() {
        return postItKey;
    }
    public String returnContentString(){
        return content.toString();
    }

    public void updateVersion(){
        this.postItKey.updateVersion();
    }

}
