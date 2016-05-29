package sekta.platform.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import sekta.platform.core.dao.AnswerDao;
import sekta.platform.core.entity.Answer;
import sekta.platform.core.service.AnswerService;

import java.util.List;

/**
 * Created by natad on 29.05.2016.
 */
public class AnswerServiceImpl implements AnswerService {
    @Autowired
    AnswerDao answerDao;

    @Override
    public List<Answer> getAllAnswers() {
        return answerDao.findAll();
    }

    @Override
    public Answer getAnswerById(Long id) {
        return answerDao.getById(id);
    }

    @Override
    public Answer createAnswer(Answer answer) {
        answerDao.create(answer);
        return answer;
    }

    @Override
    public Answer updateAnswer(Answer answer) {
        answerDao.update(answer);
        return answer;
    }

    @Override
    public void deleteAnswer(Long answerId) {
        Answer answer = new Answer();
        answer.setId(answerId);
        answerDao.delete(answer);
    }
}
