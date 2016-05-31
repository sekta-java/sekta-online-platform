package sekta.platform.core.dao;

import sekta.platform.core.entity.Grade;

public interface GradeDao extends BaseDao<Grade> {
    Grade getById(Long id);
}
