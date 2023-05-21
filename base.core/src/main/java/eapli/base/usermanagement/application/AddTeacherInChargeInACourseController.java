package eapli.base.usermanagement.application;

import eapli.base.coursemanagement.dto.CourseDTOWithIdTitle;
import eapli.base.usermanagement.application.services.SetTeacherService;
import eapli.base.usermanagement.dto.TeacherDTOWithAcronym;

public class AddTeacherInChargeController {

    private final SetTeacherService theService = new SetTeacherService();

    public boolean addTeacherInCharge(TeacherDTOWithAcronym teacherDTO, CourseDTOWithIdTitle courseDTO) {
        return this.theService.addTeacherInCharge(teacherDTO, courseDTO);
    }

}
