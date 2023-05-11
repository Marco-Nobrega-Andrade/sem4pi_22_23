package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.courseclasses.domain.Date;
import eapli.base.meetingmanagement.domain.Meeting;
import eapli.base.meetingmanagement.domain.MeetingIdentifier;
import eapli.base.meetingmanagement.repositories.MeetingRepository;
import eapli.base.usermanagement.domain.Person;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class JpaMeetingRepository extends JpaAutoTxRepository<Meeting, MeetingIdentifier,MeetingIdentifier> implements MeetingRepository {

    public JpaMeetingRepository(final TransactionalContext autoTx) {
        super(autoTx, "idMeeting");
    }
    public JpaMeetingRepository(final String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "idMeeting");
    }
    @Override
    public Optional<Meeting> findAllMeetingsWhoMatch(Person person, Date date) {
        final Map<String, Object> params = new HashMap<>();
        params.put("person", person);
        params.put("date", date);
        return matchOne("e.person=:person AND e.date=:date", params);
    }
}
