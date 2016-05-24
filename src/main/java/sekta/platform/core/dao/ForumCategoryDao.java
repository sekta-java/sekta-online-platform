package sekta.platform.core.dao;

import sekta.platform.core.entity.ForumCategory;

/**
 * Created by Retro on 19.05.2016.
 */
public interface ForumCategoryDao extends BaseDao<ForumCategory> {
    ForumCategory getById(Long id);
}
