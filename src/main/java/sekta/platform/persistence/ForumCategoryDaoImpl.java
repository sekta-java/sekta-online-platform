package sekta.platform.persistence;

import org.springframework.stereotype.Repository;
import sekta.platform.core.dao.ForumCategoryDao;
import sekta.platform.core.entity.ForumCategory;

/**
 * Created by Retro on 19.05.2016.
 */
@Repository
public class ForumCategoryDaoImpl extends BaseDaoImpl<ForumCategory> implements ForumCategoryDao {

    @Override
    public ForumCategory getById(Long id) {
        return (ForumCategory) sessionFactory.getCurrentSession().get(ForumCategory.class, id);
    }

}
