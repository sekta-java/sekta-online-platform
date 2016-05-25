package sekta.platform.persistence;

import org.springframework.stereotype.Repository;
import sekta.platform.core.dao.QuizDao;
import sekta.platform.core.entity.Quiz;

/**
 * Created by natad on 25.05.2016.
 */
@Repository
public class QuizDaoImpl extends BaseDaoImpl<Quiz> implements QuizDao{
    @Override
    public Quiz getById(Long id) {
        return (Quiz) sessionFactory.getCurrentSession().get(Quiz.class, id);
    }
}
