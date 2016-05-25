package sekta.platform.core.dao;

import sekta.platform.core.entity.Quiz;

/**
 * Created by Retro on 24.05.2016.
 */
public interface QuizDao extends BaseDao<Quiz> {
    Quiz getById(Long id);
}
