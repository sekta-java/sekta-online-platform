package sekta.platform.persistence;

import sekta.platform.core.dao.UserDao;
import sekta.platform.core.entity.User;

/**
 * Created by natad on 18.05.2016.
 */
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{
    @Override
    public User getById(Long id) {
        return (User) sessionFactory.getCurrentSession().get(User.class, id);
    }
}
