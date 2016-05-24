package sekta.platform.core.dao;

import sekta.platform.core.entity.Answer;

/**
 * Created by Retro on 24.05.2016.
 */
public interface AnswerDao extends BaseDao<Answer> {
    Answer getById(Long id);
}
