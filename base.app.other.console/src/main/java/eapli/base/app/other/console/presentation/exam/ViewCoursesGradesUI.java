package eapli.base.app.other.console.presentation.exam;

import eapli.base.exams.application.ViewCourseGradesController;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

import java.util.*;

public class ViewCoursesGradesUI extends AbstractUI {

    private static ViewCourseGradesController viewCourseGradesController;

    @Override
    protected boolean doShow() {

        List<String> courseList = viewCourseGradesController.listTeacherCourses();

        if(!courseList.isEmpty()){

            Map<Integer, List<String>> gradesByCourse = new HashMap<>();
            int changeOption = 0;

            System.out.println("\n1. Select a set of courses\n2. Select All Courses\n0. Return\n");
            changeOption = Console.readOption(1, 2, 0);

            while (changeOption != -1) {
                if (changeOption == 1) {

                    List<String> newCourseList = new ArrayList<>();
                    int size = courseList.size();

                    for (int i = 0; i < size; i++) {

                        System.out.printf("%d. Course Id: %s", i + 1, courseList.get(i));
                    }

                    int option = 0;
                    List<Integer> selectedCourses = new ArrayList<>();

                    while (option == 0) {

                        System.out.println("0. end\n");
                        selectedCourses.add(Console.readOption(1, size, 0));

                    }

                    if(!selectedCourses.contains(0)) {

                        for (int idx : selectedCourses) {
                            newCourseList.add(courseList.get(idx - 1));
                        }

                        gradesByCourse = viewCourseGradesController.listGradesFromTeacherCourse(newCourseList);

                        gradesByCoursePrinter(gradesByCourse, newCourseList);

                    }

                    changeOption = -1;

                } else if (changeOption == 2) {

                    gradesByCourse = viewCourseGradesController.listGradesFromTeacherCourse(courseList);

                    gradesByCoursePrinter(gradesByCourse, courseList);

                    changeOption = -1;

                }
            }
        }else{

            System.out.println("You have no courses available!");

        }
        return false;
    }

    @Override
    public String headline() {
        return "View Courses Grades";
    }

    private void gradesByCoursePrinter(Map<Integer, List<String>> gradesByCourse, List<String> courses){

        for (Map.Entry<Integer, List<String>> info: gradesByCourse.entrySet()) {

            System.out.printf("Course: %s\n", courses.get(info.getKey()-1));
            int size = info.getValue().size();

            for (int i = 0; i < size; i++) {
                System.out.println("Grades List:");
                System.out.printf("%d. %s \n", info.getValue().get(i));
            }

        }

    }
}
