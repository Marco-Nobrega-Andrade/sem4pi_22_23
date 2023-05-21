package eapli.base.questionmanagement.application;

import eapli.base.coursemanagement.application.ListCourseController;
import eapli.base.coursemanagement.dto.CourseDTOWithIdTitle;
import eapli.base.questionmanagement.application.services.AddUpdateQuestionService;
import eapli.base.questionmanagement.dto.QuestionDTOWithId;

import java.util.List;

public class UpdateQuestionController {
    public List<CourseDTOWithIdTitle> listCourse(){
        ListCourseController controller = new ListCourseController();
        return controller.listCourse();
    }

    public List<QuestionDTOWithId> listCourseQuestions(CourseDTOWithIdTitle courseDTO){
        ListCourseQuestionsController controller = new ListCourseQuestionsController();
        return controller.listCourseQuestions(courseDTO);
    }
    public void updateQuestion(QuestionDTOWithId questionDTO, String updatedQuestion){
        AddUpdateQuestionService service = new AddUpdateQuestionService();
        service.updateQuestion(questionDTO, updatedQuestion);
    }
}
