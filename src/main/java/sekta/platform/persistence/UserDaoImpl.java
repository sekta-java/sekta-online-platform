package sekta.platform.persistence;

import org.springframework.stereotype.Repository;
import sekta.platform.core.dao.UserDao;
import sekta.platform.core.entity.User;

/**
 * Created by natad on 18.05.2016.
 */
@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{
    @Override
    public User getById(Long id) {
        return (User) sessionFactory.getCurrentSession().get(User.class, id);
    }
}
