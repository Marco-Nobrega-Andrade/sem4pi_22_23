package eapli.base.usermanagement.application;

import eapli.base.coursemanagement.dto.CourseDTOWithIdTitle;
import eapli.base.usermanagement.application.services.SetTeacherService;
import eapli.base.usermanagement.dto.TeacherDTOWithAcronym;
import org.springframework.data.util.Pair;

import java.util.List;

public class SetTeacherController {
    private final SetTeacherService theService = new SetTeacherService();

    public Pair<List<TeacherDTOWithAcronym>, List<CourseDTOWithIdTitle>> requestInformation() {
        return this.theService.requestInformation();
    }

    public boolean addTeacher(List<TeacherDTOWithAcronym> teacherDTO, CourseDTOWithIdTitle courseDTO) {
        return this.theService.addTeacher(teacherDTO, courseDTO);
    }

    public boolean addTeacherInCharge(TeacherDTOWithAcronym teacherDTO, CourseDTOWithIdTitle courseDTO) {
        return this.theService.addTeacherInCharge(teacherDTO, courseDTO);
    }

}
