package eapli.base.persistence.impl.inmemory;

import eapli.base.courseclasses.domain.Date;
import eapli.base.meetingmanagement.domain.Meeting;
import eapli.base.meetingmanagement.domain.MeetingIdentifier;
import eapli.base.meetingmanagement.domain.MeetingOwner;
import eapli.base.meetingmanagement.repositories.MeetingRepository;
import eapli.base.usermanagement.domain.Person;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.List;
import java.util.Optional;

public class InMemoryMeetingRepository extends InMemoryDomainRepository<Meeting, MeetingIdentifier>
        implements MeetingRepository {

    @Override
    public List<Meeting> findAllMeetingsWhoMatch(List<Person> person) {
        return null;
    }

    @Override
    public long findTotalNumberOfMeetings() {
        return 0;
    }

    @Override
    public List<MeetingOwner> findIfPersonIsAMeetingOwner(Person person) {
        return null;
    }

    @Override
    public long countNumberOfOwners() {
        return 0;
    }
}
