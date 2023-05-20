package eapli.base.app.common.console.presentation.meeting;


import eapli.base.meetingmanagement.application.ScheduleMeetingController;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScheduleMeetingUI extends AbstractUI {
    private ScheduleMeetingController theController = new ScheduleMeetingController();
    public ScheduleMeetingUI() {}

    @Override
    protected boolean doShow() {
        // TODO
        boolean conf = true;
        List<String> emails = new ArrayList<>();
        while (conf) {
            String email = Console.readLine("Email of the invited user:");
            emails.add(email);
            conf = Console.readBoolean("Want to invitate someone else?(y/n)");
        }

        Date date = Console.readDate("Date to be scheduled:", "dd-MM-yyyy");

        int duration = Console.readInteger("Duration of the meeting in minutes:");

        System.out.print("\n\n");

        if (theController.verifyMeeting(emails, date, duration)) {
            boolean op = Console.readBoolean("Do you want to schedule the meeting?(y/n)");
            if (op) {
                theController.scheduledMeeting(emails, date,duration);
                return true;
            } else {
                return false;
            }
        } else {
            boolean op = Console.readBoolean("One or more persons are not available, do you want to schedule the meeting anyway?(y/n)");
            if (op) {
                theController.scheduledMeeting(emails, date,duration);
                return true;
            } else {
                return false;
            }
        }

    }

    @Override
    public String headline() {
        return "Schedule a meeting";
    }
}
