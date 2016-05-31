package sekta.platform.persistence;

import org.springframework.stereotype.Repository;
import sekta.platform.core.dao.GradeDao;
import sekta.platform.core.entity.Grade;

/**
 * Created by natad on 18.05.2016.
 */
@Repository
public class GradeDaoImpl extends BaseDaoImpl<Grade> implements GradeDao{
    @Override
    public Grade getById(Long id) {
        return (Grade) sessionFactory.getCurrentSession().get(Grade.class, id);
    }
}
