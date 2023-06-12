package eapli.base.postitmanager.domain;

import eapli.base.exceptions.NegativeParameterException;
import eapli.base.exceptions.ZeroParameterException;
import eapli.framework.domain.model.ValueObject;

import java.util.Objects;

public class PostItKey implements Comparable<PostItKey>, ValueObject {
    private PostItIdentifier postItIdentifier;
    private PostItVersion postItVersion;

    protected PostItKey(PostItIdentifier postItIdentifier, PostItVersion postItVersion){
        this.postItIdentifier = postItIdentifier;
        this.postItVersion = postItVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostItKey that = (PostItKey) o;
        return Objects.equals(postItIdentifier, that.postItIdentifier) && Objects.equals(postItVersion, that.postItVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postItIdentifier);
    }

    @Override
    public int compareTo(PostItKey o) {
        return 0;
    }

    public void updateVersion() {
        this.postItVersion.updateVersion();
    }
}
