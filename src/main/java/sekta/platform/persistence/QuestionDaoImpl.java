package sekta.platform.persistence;

import sekta.platform.core.dao.QuestionDao;
import sekta.platform.core.entity.Question;

/**
 * Created by natad on 28.05.2016.
 */
public class QuestionDaoImpl extends BaseDaoImpl<Question> implements QuestionDao {
    @Override
    public Question getById(Long id) {
        return (Question) sessionFactory.getCurrentSession().get(Question.class, id);
    }
}
