package eapli.base.app.other.console.presentation.courseclasses;

import eapli.base.courseclasses.application.RescheduleClassController;
import eapli.base.courseclasses.dto.ClassWithIdAndTittleDTO;
import eapli.base.courseclasses.dto.ClassWithWeeklyDateDTO;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import org.springframework.data.util.Pair;

import java.util.Date;
import java.util.List;


public class RescheduleClassUI extends AbstractUI {
    private final RescheduleClassController theController = new RescheduleClassController();


    @Override
    protected boolean doShow() {
        Pair<List<ClassWithWeeklyDateDTO>, List<ClassWithIdAndTittleDTO>> pair = theController.requestInformation();
        List<ClassWithWeeklyDateDTO> dates = pair.getFirst();
        List<ClassWithIdAndTittleDTO> classes = pair.getSecond();
        if (!classes.isEmpty()) {
            System.out.println("Classes:");
            int i = 0;
            for (ClassWithIdAndTittleDTO c : classes) {
                i++;
                System.out.println(i+". "+c.id + " - " + c.tittle);
            }
            System.out.println("Select one:");
            int option = Console.readOption(1, classes.size(), classes.size() + 1);
            if (option == classes.size() + 1) {
                do {
                    option = Console.readOption(1, classes.size(), classes.size() + 1);
                }while (option == classes.size() + 1);
            }
            ClassWithIdAndTittleDTO selectedClass = classes.get(option - 1);

            System.out.println("Dates:");

            ClassWithWeeklyDateDTO datesDTO = dates.get(option - 1);

            i = 0;

            for (int j = 0; j < datesDTO.dates.size(); j++) {
                i++;
                System.out.println(i+". "+datesDTO.dates.get(j) + " - " + datesDTO.durations.get(j));
            }

            System.out.println("Select one you want to change:");

            option = Console.readOption(1, datesDTO.dates.size(), datesDTO.dates.size() + 1);

            if (option == datesDTO.dates.size() + 1) {
                do {
                    option = Console.readOption(1, datesDTO.dates.size(), datesDTO.dates.size() + 1);
                }while (option == datesDTO.dates.size() + 1);
            }

            Date newDate = Console.readDate("Specify the new date", "dd-MM-yyyy");

            datesDTO.dates.set(option - 1, newDate);
            datesDTO.durations.set(option - 1, Console.readInteger("Specify the new duration"));

            if (theController.rescheduleClass(datesDTO.dates, datesDTO.durations, selectedClass)) {
                System.out.println("Class rescheduled");
                return true;
            }
        }
        else {
            System.out.println("There are no classes to reschedule");
            return false;
        }
        return false;
    }

    @Override
    public String headline() {
        return "Reschedule a class";
    }
}
