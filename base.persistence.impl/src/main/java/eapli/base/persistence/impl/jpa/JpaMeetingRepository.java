package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.meetingmanagement.domain.Meeting;
import eapli.base.meetingmanagement.domain.MeetingIdentifier;
import eapli.base.usermanagement.domain.MeetingOwner;
import eapli.base.meetingmanagement.repositories.MeetingRepository;
import eapli.base.usermanagement.domain.Person;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.List;

public class JpaMeetingRepository extends JpaAutoTxRepository<Meeting, MeetingIdentifier,MeetingIdentifier> implements MeetingRepository {

    public JpaMeetingRepository(final TransactionalContext autoTx) {
        super(autoTx, "idMeeting");
    }
    public JpaMeetingRepository(final String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "idMeeting");
    }

    @Override
    public List<Meeting> findAllMeetingsWhoMatch(List<Person> people) {
        return createQuery("SELECT m FROM Meeting m JOIN m.invitation inv WHERE inv.person IN ( :people ) ",
                 Meeting.class)
                .setParameter("people", people).getResultList();
    }

    @Override
    public long findTotalNumberOfMeetings() {
        return count();
    }

    @Override
    public List<MeetingOwner> findIfPersonIsAMeetingOwner(Person person) {
        return createQuery("SELECT m FROM MeetingOwner m " +
                "WHERE m.person = :person", MeetingOwner.class)
                .setParameter("person", person).getResultList();
    }

    @Override
    public List<Meeting> findAllOwnerMeetings(SystemUser systemUser){
        return createQuery("SELECT m FROM Meeting m where m.meetingOwner.person IN (SELECT p FROM Person p WHERE p.systemUser = :systemUser) AND m.meetingState.isActive = TRUE", Meeting.class)
                .setParameter("systemUser", systemUser).getResultList();
    }

    @Override
    public long countNumberOfOwners() {
        return createQuery("SELECT COUNT(m) FROM MeetingOwner m", Long.class).getSingleResult();
    }
}
