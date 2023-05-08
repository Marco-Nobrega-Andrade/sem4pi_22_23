package eapli.base.app.backoffice.console.presentation.course;

import eapli.base.coursemanagement.application.OpenCloseCourseEnrollmentsController;
import eapli.base.coursemanagement.dto.CourseDTOWithIdTitleStatus;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import java.util.List;

public class OpenCloseCourseEnrollmentsUI extends AbstractUI {

    private final OpenCloseCourseEnrollmentsController openCloseCourseEnrollmentsController = new OpenCloseCourseEnrollmentsController();
    @Override
    protected boolean doShow() {
        List<CourseDTOWithIdTitleStatus> courseDTOWithIdTitleStatusList = openCloseCourseEnrollmentsController.listAllOpenCloseEnrollmentsAvailableCourses();

        if(!courseDTOWithIdTitleStatusList.isEmpty()){

            int size = courseDTOWithIdTitleStatusList.size();
            for (int i = 0; i < size-1; i++) {
                System.out.println(i + ". " + courseDTOWithIdTitleStatusList.get(i));
            }

            System.out.println("Introduce the number of the course you want to change:\n");
            int idx = Console.readOption(1,size,0);

            System.out.println("1. Open Enrollments\n 2. Close Enrollments");
            int changeOption = Console.readOption(1,2,0);

            if(changeOption == 1){
                openCloseCourseEnrollmentsController.changeStatus(courseDTOWithIdTitleStatusList.get(idx-1), "OPEN_ENROLLMENTS");
            }else{
                openCloseCourseEnrollmentsController.changeStatus(courseDTOWithIdTitleStatusList.get(idx-1), "CLOSE_ENROLLMENTS");
            }

        }else{
            System.out.println("There are no courses available for open/close enrollments currently!");
        }

        return true;
    }

    @Override
    public String headline() {
        return "Open/Close Course Enrollments";
    }
}
