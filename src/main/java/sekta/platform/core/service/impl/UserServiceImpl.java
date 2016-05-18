package sekta.platform.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import sekta.platform.core.dao.UserDao;
import sekta.platform.core.entity.User;
import sekta.platform.core.service.UserService;

import java.util.List;

/**
 * Created by natad on 18.05.2016.
 */
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userDao.getById(id);
    }

    @Override
    public User createUser(User user) {
        userDao.create(user);
        return user;
    }

    @Override
    public User updateUser(User user) {
        userDao.update(user);
        return user;
    }

    @Override
    public void deleteUser(Long id) {
        User user = new User();
        user.setId(id);
        userDao.delete(user);
    }
}
