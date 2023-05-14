package eapli.base.app.backoffice.console.presentation.course;

import eapli.base.coursemanagement.dto.CourseDTOWithIdTitle;
import eapli.base.usermanagement.application.SetTeacherController;
import eapli.base.usermanagement.dto.TeacherDTOWithAcronym;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import org.springframework.data.util.Pair;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SetTeacherUI extends AbstractUI  {
    private final SetTeacherController theController = new SetTeacherController();

    @Override
    protected boolean doShow() {

        // Declaration of variables to get the information from the system
        Pair<List<TeacherDTOWithAcronym>,List<CourseDTOWithIdTitle>> pair = theController.requestInformation();
        List<TeacherDTOWithAcronym> teachers = pair.getFirst();
        List<CourseDTOWithIdTitle> courses = pair.getSecond();

        int option = 0;
        int i = 0;
        // Show courses
        System.out.println("Select one of the following courses:");
        for (CourseDTOWithIdTitle course : courses) {
            i++;
            System.out.println(i+". "+course.courseIdentifier+" | "+course.courseTitle);
        }
        System.out.println(i+1+". Cancel");

        // Select course
        option = Console.readOption(1,courses.size(),courses.size()+1);

        // Get the selected course
        CourseDTOWithIdTitle selectedCourse = courses.get(option-1);

        // Show teachers
        i = 0;
        System.out.println("Select the following teachers:");
        for (TeacherDTOWithAcronym teacher : teachers) {
            i++;
               System.out.println(i+". Acronym: "+teacher.acronym);
        }
        System.out.println(i+1+". Cancel");

        // Select teachers
        option=0;
        HashSet<Integer> options = new HashSet<>();
        while (option!=teachers.size()+1) {
            option = Console.readOption(1,teachers.size(),teachers.size()+1);
            if (option!=teachers.size()+1) {
                options.add(option);
            }
        }
        i=0;

        // Get the selected teachers
        List<TeacherDTOWithAcronym> selectedTeachers = new ArrayList<>();
        for (Integer integer : options) {
            selectedTeachers.add(teachers.get(integer-1));
        }


        // Set the teacher in charge
        if (theController.addTeacher(selectedTeachers, selectedCourse)) {
            System.out.println("Teachers added successfully");
        } else {
            System.out.println("Error adding teachers");
            return false;
        }

        // Select teacher in charge
        System.out.println("Select the teacher in charge: ");

        option = Console.readInteger("Select an option:");
        if (option>teachers.size()||option<1){
            do {
                option = Console.readInteger("Please select a valid option from the list of teachers");
            }while (option>teachers.size()||option<1);
        }

        // Get the teacher in charge
        TeacherDTOWithAcronym teacherInCharge = teachers.get(option-1);

        // Set the teachers
        if(theController.addTeacherInCharge(teacherInCharge, selectedCourse)) {
            System.out.println("Teacher in charge added successfully");
        } else {
            System.out.println("Error adding teacher in charge");
            return false;
        }

        return true;
    }

    @Override
    public String headline() {
        return "Set Teachers";
    }

}
