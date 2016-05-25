package sekta.platform.core.dao;

import sekta.platform.core.entity.Quiz;

/**
 * Created by natad on 25.05.2016.
 */
public interface QuizDao extends BaseDao<Quiz> {
    Quiz getById(Long id);
}
