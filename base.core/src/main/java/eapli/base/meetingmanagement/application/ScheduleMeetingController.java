package eapli.base.meetingmanagement.application;

import eapli.base.meetingmanagement.application.service.ScheduleMeetingService;

import java.util.Date;
import java.util.List;

public class ScheduleMeetingController {

    ScheduleMeetingService theService = new ScheduleMeetingService();
    public boolean verifyMeeting(List<String> emails, Date date, int duration) {
        // TODO
        return theService.verifyMeeting(emails, date, duration);

    }
    public void scheduledMeeting(List<String> emails, Date date, int duration) {
        // TODO
        theService.scheduledMeeting(emails, date, duration);
    }
}
