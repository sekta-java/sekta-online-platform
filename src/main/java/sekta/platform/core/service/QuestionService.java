package sekta.platform.core.service;

import sekta.platform.core.entity.Question;

import java.util.List;

/**
 * Created by natad on 29.05.2016.
 */
public interface QuestionService {
    List<Question> getAllQuestions();
    Question getQuestionById(Long id);
    Question createQuestion(Question question);
    Question updateQuestion(Question question);
    void deleteQuestion(Long questionId);
}
