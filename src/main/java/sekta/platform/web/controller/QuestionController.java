package sekta.platform.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import sekta.platform.core.entity.Answer;
import sekta.platform.core.entity.Question;
import sekta.platform.core.entity.Quiz;
import sekta.platform.core.service.AnswerService;
import sekta.platform.core.service.QuestionService;
import sekta.platform.core.service.QuizService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by natad on 30.05.2016.
 */
@Controller
@RequestMapping("quizzes/{quizId}/questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @Autowired
    private QuizService quizService;

    @Autowired
    private AnswerService answerService;

    @RequestMapping("")
    public String showQuestionsByQuiz(@PathVariable("quizId") Long quizId,
                                      ModelMap model) {
        List<Question> questions = quizService.getQuizById(quizId).getQuestions();
        if (questions.size() == 0 && !model.containsAttribute("message")) {
            model.addAttribute("message", "This quiz has no questions yet.");
        }
        model.addAttribute("questions", questions);
        model.addAttribute("quizId", quizId);
        return "questions/question-list";
    }

    @RequestMapping(value = "create", method = RequestMethod.GET)
    public String showCreateQuestionForm(@PathVariable("quizId") Long quizId, ModelMap model) {
        model.addAttribute("quizId", quizId);
        return "questions/question-create";
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public String create(@RequestParam("answers") String[] answerTexts,
                         @RequestParam("quizId") Long quizId,
                         @RequestParam("text") String text) {
        Question question = new Question();
        question.setText(text);
        List<Answer> answers = getAnswersFromStringArray(answerTexts, question);
        question.setAnswers(answers);
        Quiz quiz = new Quiz();
        quiz.setId(quizId);
        question.setQuiz(quiz);
        questionService.createQuestion(question);
        return "redirect:/quizzes/" + quizId + "/questions/";
    }

    @RequestMapping("{questionId}/edit")
    public String edit(@PathVariable("questionId") Long questionId, ModelMap model) {
        Question question = questionService.getQuestionById(questionId);
        List<Answer> answers = question.getAnswers();
        model.addAttribute("answers", answers);
        model.addAttribute("question", question);
        return "questions/question-edit";
    }

    @RequestMapping(value = "edit", method = RequestMethod.POST)
    public String update(@RequestParam("questionId") Long questionId,
                         @RequestParam("questionText") String text,
                         @RequestParam("answers") String[] answersTexts,
                         @RequestParam("quizId") Long quizId) {
        Question question = questionService.getQuestionById(questionId);
        question.setText(text);
        question.setAnswers(getAnswersFromStringArray(answersTexts, question));
        questionService.updateQuestion(question);
        return "redirect:/quizzes/" + quizId + "/questions/";
    }

    @RequestMapping(value = "{questionId}/answers/create", method = RequestMethod.GET)
    public String showForm(@PathVariable("questionId") Long questionId,
                           ModelMap model) {
        Question question = questionService.getQuestionById(questionId);
        model.addAttribute("question", question);
        return "questions/answer-create";
    }

    @RequestMapping(value = "{questionId}/answers/create", method = RequestMethod.POST)
    public String createAnswer(@PathVariable("questionId") Long questionId,
                               @RequestParam("answerText") String answerText) {
        Question question = questionService.getQuestionById(questionId);
        Answer answer = new Answer();
        answer.setText(answerText);
        answer.setQuestion(question);
        answerService.createAnswer(answer);
        Long quizId = question.getQuiz().getId();
        return "redirect:/quizzes/" + quizId + "/questions";
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public String deleteQuestion(@RequestParam("questionId") Long questionId,
                                 RedirectAttributes redirectAttributes) {
        Long quizId = questionService.getQuestionById(questionId).getQuiz().getId();
        questionService.deleteQuestion(questionId);
        redirectAttributes.addFlashAttribute("message", "Question successfully deleted!");
        return "redirect:/quizzes/" + quizId + "/questions";
    }

    private List<Answer> getAnswersFromStringArray(String[] answerTexts, Question question) {
        List<Answer> answers = new ArrayList<Answer>();
        for (String answerText : answerTexts) {
            Answer ans = new Answer();
            ans.setText(answerText);
            ans.setQuestion(question);
            answers.add(ans);
        }
        return answers;
    }
}
