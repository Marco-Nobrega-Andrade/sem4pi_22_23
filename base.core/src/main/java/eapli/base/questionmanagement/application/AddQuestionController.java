package eapli.base.questionmanagement.application;

import eapli.base.coursemanagement.application.ListCourseController;
import eapli.base.coursemanagement.dto.CourseDTOWithIdTitle;
import eapli.base.questionmanagement.application.services.AddUpdateQuestionService;

import java.util.List;

public class AddQuestionController {
    public List<CourseDTOWithIdTitle> listCourse(){
        ListCourseController controller = new ListCourseController();
        return controller.listCourse();
    }

    public void addQuestion(String questionStructure){
        AddUpdateQuestionService service = new AddUpdateQuestionService();
        service.addQuestion(questionStructure);
    }
}
