package sekta.platform.core.dao;

import sekta.platform.core.entity.Grade;

/**
 * Created by Retro on 19.05.2016.
 */
public interface GradeDao extends BaseDao<Grade> {

    Grade getById(Long id);

}
