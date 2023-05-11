package eapli.base.meetingmanagement.repositories;

import eapli.base.courseclasses.domain.Date;
import eapli.base.meetingmanagement.domain.Meeting;
import eapli.base.meetingmanagement.domain.MeetingIdentifier;
import eapli.base.usermanagement.domain.Person;
import eapli.framework.domain.repositories.DomainRepository;


import java.util.Optional;

public interface MeetingRepository extends DomainRepository<MeetingIdentifier, Meeting> {
    public Optional<Meeting> findAllMeetingsWhoMatch(Person person, Date date);

}
