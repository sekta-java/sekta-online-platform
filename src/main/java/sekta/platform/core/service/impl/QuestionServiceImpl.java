package sekta.platform.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sekta.platform.core.dao.AnswerDao;
import sekta.platform.core.dao.QuestionDao;
import sekta.platform.core.entity.Answer;
import sekta.platform.core.entity.Question;
import sekta.platform.core.service.QuestionService;

import java.util.List;

/**
 * Created by natad on 29.05.2016.
 */
@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionDao questionDao;

    @Autowired
    private AnswerDao answerDao;

    @Override
    @Transactional
    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }

    @Override
    @Transactional
    public Question getQuestionById(Long id) {
        Question question = questionDao.getById(id);
        question.getAnswers().size();
        return question;
    }

    @Override
    @Transactional
    public Question createQuestion(Question question) {
        questionDao.create(question);
        for (Answer answer : question.getAnswers()) {
            answerDao.create(answer);
        }
        return question;
    }

    @Override
    @Transactional
    public Question updateQuestion(Question question) {
        questionDao.update(question);
        List<Answer> savedAnswers = answerDao.findAllByProperty("question_id", question.getId());
        List<Answer> newAnswers = question.getAnswers();

        for(int i = 0; i < newAnswers.size(); i++){
            savedAnswers.get(i).setText(newAnswers.get(i).getText());
        }

        return question;
    }

    @Override
    @Transactional
    public void deleteQuestion(Long questionId) {
        Question question = new Question();
        question.setId(questionId);
        questionDao.delete(question);
    }
}
