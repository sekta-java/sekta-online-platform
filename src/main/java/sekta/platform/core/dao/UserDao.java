package sekta.platform.core.dao;

import sekta.platform.core.entity.User;

/**
 * Created by natad on 18.05.2016.
 */
public interface UserDao extends BaseDao<User> {
    User getById(Long id);
}
