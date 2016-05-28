package sekta.platform.core.dao;

import sekta.platform.core.entity.Question;

import java.util.List;

/**
 * Created by natad on 28.05.2016.
 */
public interface QuestionDao extends BaseDao<Question> {
    Question getById(Long id);
}
