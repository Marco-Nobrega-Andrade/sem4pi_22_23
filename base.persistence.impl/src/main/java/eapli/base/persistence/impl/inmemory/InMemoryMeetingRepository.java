package eapli.base.persistence.impl.inmemory;

import eapli.base.courseclasses.domain.Date;
import eapli.base.meetingmanagement.domain.Meeting;
import eapli.base.meetingmanagement.domain.MeetingIdentifier;
import eapli.base.meetingmanagement.repositories.MeetingRepository;
import eapli.base.usermanagement.domain.Person;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.Optional;

public class InMemoryMeetingRepository extends InMemoryDomainRepository<Meeting, MeetingIdentifier>
        implements MeetingRepository {

    @Override
    public Optional<Meeting> findAllMeetingsWhoMatch(Person person, Date date, int duration) {
        return Optional.empty();
    }

    @Override
    public long findTotalNumberOfMeetings() {
        return 0;
    }
}
