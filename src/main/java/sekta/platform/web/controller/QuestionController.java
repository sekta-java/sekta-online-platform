package sekta.platform.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import sekta.platform.core.entity.Answer;
import sekta.platform.core.entity.Question;
import sekta.platform.core.entity.Quiz;
import sekta.platform.core.service.QuestionService;
import sekta.platform.core.service.QuizService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by natad on 30.05.2016.
 */
@Controller
@RequestMapping("questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @Autowired
    private QuizService quizService;

    @RequestMapping("{quizId}")
    public String showQuestionsByQuiz(@PathVariable("quizId") Long quizId, ModelMap model) {
        List<Question> questions = quizService.getQuizById(quizId).getQuestions();
        if (questions.size() == 0) {
            model.addAttribute("quizId", quizId);
            return "questions/no-questions";
        }
        model.addAttribute("questions", questions);

        return "questions/question-list";
    }

//    @RequestMapping("create/{quizId}")
//    public String create(@PathVariable("quizId") Long quizId){
//        Question question = new Question();
//        question.setQuiz(quizService.getQuizById(quizId));
//        questionService.createQuestion(question);
//        return "question-list";
//    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public String create(@RequestParam("answers") String[] answerTexts,
                         @RequestParam("quizId") Long quizId,
                         @RequestParam("text") String text) {
        Question question = new Question();
        question.setText(text);
        List<Answer> answers = new ArrayList<Answer>();
        for(String answerText : answerTexts){
            Answer ans = new Answer();
            ans.setText(text);
            answers.add(ans);
        }
        question.setAnswers(answers);
        Quiz quiz = quizService.getQuizById(quizId);
        question.setQuiz(quiz);
        questionService.createQuestion(question);

        return "redirect:/questions/"+quizId;
    }
}
