package eapli.base.usermanagement.application;

import eapli.base.coursemanagement.dto.CourseDTOWithIdTitle;
import eapli.base.usermanagement.application.services.SetTeacherService;
import eapli.base.usermanagement.dto.TeacherDTOWithAcronym;

import java.util.List;

public class AddTeacherController {
    private final SetTeacherService theService = new SetTeacherService();
    public boolean addTeacher(List<TeacherDTOWithAcronym> teacherDTO, CourseDTOWithIdTitle courseDTO) {
        return this.theService.addTeacher(teacherDTO, courseDTO);
    }
}
