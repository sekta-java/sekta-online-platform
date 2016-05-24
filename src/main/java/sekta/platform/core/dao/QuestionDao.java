package sekta.platform.core.dao;


import sekta.platform.core.entity.Question;

/**
 * Created by Retro on 24.05.2016.
 */
public interface QuestionDao extends BaseDao<Question> {
    Question getById(Long id);
}
