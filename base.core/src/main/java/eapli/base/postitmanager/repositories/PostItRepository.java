package eapli.base.postitmanager.repositories;

import eapli.base.postitmanager.domain.PostIt;
import eapli.base.postitmanager.domain.PostItIdentifier;
import eapli.base.postitmanager.domain.PostItKey;
import eapli.framework.domain.repositories.DomainRepository;

public interface PostItRepository extends DomainRepository<PostItKey, PostIt> {

}
