package sekta.platform.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import sekta.platform.core.entity.Quiz;
import sekta.platform.core.service.QuizService;
import sekta.platform.core.service.UserService;

import java.util.List;


/**
 * Created by natad on 25.05.2016.
 */
@Controller
@RequestMapping("quizzes")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @Autowired
    private UserService userService;

    @RequestMapping("")
    public String getAll(ModelMap model){
        List<Quiz> quizzes = quizService.getAllQuizzes();
        model.addAttribute("quizzes", quizzes);
        model.addAttribute("users", userService.getAllUsers());
        return "quizzes/quiz-list";
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public String create(@RequestParam("userId") Long creatorId, @RequestParam("title") String title, ModelMap model){
        Quiz quiz = new Quiz();
        quiz.setCreator(userService.getUserById(creatorId));
        quiz.setTitle(title);
        quizService.createQuiz(quiz);
        model.addAttribute("quizzes", quizService.getAllQuizzes());
        return "quizzes/quiz-list";
    }
     @RequestMapping("edit/{quizId}")
    public String editQuiz(@PathVariable("quizId") Long quizId, ModelMap model){
         model.addAttribute("quiz", quizService.getQuizById(quizId));
         model.addAttribute("users", userService.getAllUsers());
         return "quizzes/quiz-edit";
     }
}
