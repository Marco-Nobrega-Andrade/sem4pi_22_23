package eapli.base.postitmanager.repositories;

import eapli.base.postitmanager.domain.PostIt;
import eapli.base.postitmanager.domain.PostItIdentifier;
import eapli.framework.domain.repositories.DomainRepository;

public interface PostItRepository extends DomainRepository<PostItIdentifier, PostIt> {

}
