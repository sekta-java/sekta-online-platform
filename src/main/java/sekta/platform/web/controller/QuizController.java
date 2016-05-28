package sekta.platform.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import sekta.platform.core.entity.Quiz;
import sekta.platform.core.service.QuizService;

import java.util.List;


/**
 * Created by natad on 25.05.2016.
 */
@Controller
@RequestMapping("quizzes")
public class QuizController {

    @Autowired
    QuizService quizService;

    @RequestMapping("")
    public String getAll(ModelMap model){
        List<Quiz> quizzes = quizService.getAllQuizzes();
        model.addAttribute("quizzes", quizzes);
        return "quizzes/quiz-list";
    }

    @RequestMapping("create")
    public String create(){
        return "";
    }
}
