package eapli.base.postitmanager.domain;

import eapli.base.exceptions.NegativeParameterException;
import eapli.base.exceptions.ZeroParameterException;
import eapli.framework.domain.model.ValueObject;

public class PostItVersion implements ValueObject {
    private int version;

    protected PostItVersion(int version) throws NegativeParameterException, ZeroParameterException {
        if (version < 0) {
            throw new NegativeParameterException();
        }
        if (version == 0) {
            throw new ZeroParameterException();
        }
        this.version = version;
    }

    public void updateVersion() {
        this.version++;
    }
}
