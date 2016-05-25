package sekta.platform.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sekta.platform.core.dao.QuizDao;
import sekta.platform.core.entity.Quiz;
import sekta.platform.core.service.QuizService;

import java.util.List;

/**
 * Created by natad on 25.05.2016.
 */
@Service
public class QuizServiceImpl implements QuizService {

    @Autowired
    private QuizDao quizDao;

    @Override
    @Transactional
    public List<Quiz> getAllQuizzes() {
        return quizDao.findAll();
    }

    @Override
    @Transactional
    public Quiz getQuizById(Long id) {
        return quizDao.getById(id);
    }

    @Override
    @Transactional
    public Quiz createQuiz(Quiz quiz) {
        quizDao.create(quiz);
        return quiz;
    }

    @Override
    @Transactional
    public Quiz updateQuiz(Quiz quiz) {
        quizDao.update(quiz);
        return quiz;
    }

    @Override
    @Transactional
    public void deleteQuiz(Long id) {
        Quiz quiz = new Quiz();
        quiz.setId(id);
        quizDao.delete(quiz);
    }
}
