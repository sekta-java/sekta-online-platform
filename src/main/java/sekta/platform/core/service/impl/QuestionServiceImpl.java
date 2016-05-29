package sekta.platform.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sekta.platform.core.dao.QuestionDao;
import sekta.platform.core.entity.Question;
import sekta.platform.core.service.QuestionService;

import java.util.List;

/**
 * Created by natad on 29.05.2016.
 */
@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    QuestionDao questionDao;

    @Override
    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }

    @Override
    public Question getQuestionById(Long id) {
        return questionDao.getById(id);
    }

    @Override
    public Question createQuestion(Question question) {
        questionDao.create(question);
        return question;
    }

    @Override
    public Question updateQuestion(Question question) {
        questionDao.update(question);
        return question;
    }

    @Override
    public void deleteQuestion(Long questionId) {
        Question question = new Question();
        question.setId(questionId);
        questionDao.delete(question);
    }
}
