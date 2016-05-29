package sekta.platform.persistence;

import org.springframework.stereotype.Repository;
import sekta.platform.core.dao.AnswerDao;
import sekta.platform.core.entity.Answer;

/**
 * Created by natad on 29.05.2016.
 */
@Repository
public class AnswerDaoImpl extends BaseDaoImpl<Answer> implements AnswerDao {
    @Override
    public Answer getById(Long id) {
        return (Answer) sessionFactory.getCurrentSession().get(Answer.class, id);
    }
}
