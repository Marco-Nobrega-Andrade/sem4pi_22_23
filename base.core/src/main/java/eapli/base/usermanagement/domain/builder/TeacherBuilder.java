package eapli.base.usermanagement.domain.builder;

import eapli.base.usermanagement.domain.*;
import eapli.framework.domain.model.DomainFactory;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

public class TeacherBuilder implements DomainFactory<Teacher> {

    private SystemUser systemUser;
    private FullName fullName;

    private ID_Person id;
    private Acronym acronym;

    private DateOfBirth dateOfBirth;

    private TaxPayerNumber taxPayerNumber;

    public TeacherBuilder with(String fullName ,SystemUser user,String acronym,String dateOfBirth,int taxPayerNumber){
        withSystemUser(user);
        withfullName(fullName);
        withAcronym(acronym);
        withDateOfBirth(dateOfBirth);
        withTaxPayerNumber(taxPayerNumber);

        return this;
    }

    public TeacherBuilder withSystemUser(final SystemUser systemUser) {
        this.systemUser = systemUser;
        return this;
    }

    public TeacherBuilder withID(final int id) {
        this.id = new ID_Person(id);
        return this;
    }

    public TeacherBuilder withfullName(final String fullName) {
        this.fullName = new FullName(fullName);
        return this;
    }

    public TeacherBuilder withAcronym(final String acronym) {
        this.acronym = new Acronym(acronym);
        return this;
    }

    public TeacherBuilder withDateOfBirth(final String date) {
        this.dateOfBirth = new DateOfBirth(date);
        return this;
    }

    public TeacherBuilder withTaxPayerNumber(final int taxPayerNumber){
        this.taxPayerNumber = new TaxPayerNumber(taxPayerNumber);
        return this;
    }
    @Override
    public Teacher build() {
        // since the factory knows that all the parts are needed it could throw
        // an exception. however, we will leave that to the constructor
        return new Teacher(systemUser,fullName,id,acronym,dateOfBirth,taxPayerNumber);
    }
}
