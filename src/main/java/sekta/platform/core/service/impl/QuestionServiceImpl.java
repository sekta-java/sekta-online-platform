package sekta.platform.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sekta.platform.core.dao.QuestionDao;
import sekta.platform.core.entity.Question;
import sekta.platform.core.service.QuestionService;

import java.util.List;

/**
 * Created by Retro on 24.05.2016.
 */
@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionDao questionDao;

    @Override
    @Transactional
    public List<Question> getAllQues() {
        return questionDao.findAll();
    }

    @Override
    @Transactional
    public Question getQuestionById(Long id) {
        return questionDao.getById(id);
    }

    @Override
    @Transactional
    public Question createQuestion(Question question) {
        questionDao.create(question);
        return question;
    }

    @Override
    @Transactional
    public Question updateQuestion(Question question) {
        questionDao.update(question);
        return question;
    }

    @Override
    public void deleteQuestion(Long id) {
        Question question= new Question();
        question.setId(id);
        questionDao.delete(question);
    }
}
