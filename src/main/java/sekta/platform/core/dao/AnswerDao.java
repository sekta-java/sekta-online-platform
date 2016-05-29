package sekta.platform.core.dao;

import sekta.platform.core.entity.Answer;

/**
 * Created by natad on 29.05.2016.
 */
public interface AnswerDao extends BaseDao<Answer> {
    Answer getById(Long id);
}
