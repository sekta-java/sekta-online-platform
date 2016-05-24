package sekta.platform.persistence;

import org.springframework.stereotype.Repository;
import sekta.platform.core.dao.QuestionDao;
import sekta.platform.core.entity.Question;

/**
 * Created by Retro on 24.05.2016.
 */

@Repository
public class QuestionDaoImpl extends BaseDaoImpl<Question> implements QuestionDao {
    @Override
    public Question getById(Long id) {
        return (Question) sessionFactory.getCurrentSession().get(Question.class, id);
    }
}
