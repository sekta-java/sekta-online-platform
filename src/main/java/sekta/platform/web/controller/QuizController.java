package sekta.platform.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import sekta.platform.core.service.QuizService;


/**
 * Created by natad on 25.05.2016.
 */
@Controller
@RequestMapping("quiz")
public class QuizController {

    @Autowired
    QuizService quizService;

    @RequestMapping("")
    public String getAll(ModelMap model){
        model.addAttribute("quizzes", quizService.getAllQuizzes());
        return "quiz-list";
    }

    @RequestMapping("create")
    public String create(){
        return "";
    }
}
