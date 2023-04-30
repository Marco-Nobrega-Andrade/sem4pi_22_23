package eapli.base.usermanagement.domain.builder;

import eapli.base.clientusermanagement.domain.ClientUser;
import eapli.base.clientusermanagement.domain.ClientUserBuilder;
import eapli.base.usermanagement.domain.*;
import eapli.framework.domain.model.DomainFactory;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

public class PersonBuilder implements DomainFactory<Person> {

    private SystemUser systemUser;
    private FullName fullName;

    private ID_Person id;

    public PersonBuilder with(String fullName ,SystemUser user){
        withSystemUser(user);
        withfullName(fullName);
        return this;
    }

    public PersonBuilder withSystemUser(final SystemUser systemUser) {
        this.systemUser = systemUser;
        return this;
    }

    public PersonBuilder withID(final int id) {
        this.id = new ID_Person(id);
        return this;
    }

    public PersonBuilder withfullName(final String fullName) {
        this.fullName = new FullName(fullName);
        return this;
    }

    @Override
    public Person build() {
        // since the factory knows that all the parts are needed it could throw
        // an exception. however, we will leave that to the constructor
        return new Person(systemUser,fullName,id);
    }
}

