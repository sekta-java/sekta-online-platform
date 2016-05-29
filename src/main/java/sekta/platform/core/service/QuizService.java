package sekta.platform.core.service;

import sekta.platform.core.entity.Quiz;

import java.util.List;

/**
 * Created by natad on 25.05.2016.
 */
public interface QuizService {
    List<Quiz> getAllQuizzes();
    Quiz getQuizById(Long id);
    Quiz createQuiz(Quiz quiz);
    Quiz updateQuiz(Quiz quiz);
    void deleteQuiz(Long id);
    List<Quiz> findByCreatorId(Long creatorId);
    List<Quiz> findByTitle(String quizTitle);
}
