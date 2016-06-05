package sekta.platform.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sekta.platform.core.dao.UserDao;
import sekta.platform.core.entity.User;
import sekta.platform.core.service.UserService;

import java.util.List;

/**
 * Created by natad on 18.05.2016.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    @Override
    @Transactional
    public User getUserById(Long id) {
        return userDao.getById(id);
    }

    @Override
    @Transactional
    public User createUser(User user) {
        userDao.create(user);
        return user;
    }

    @Override
    @Transactional
    public User updateUser(User user) {
        userDao.update(user);
        return user;
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        User user = new User();
        user.setUserId(id);
        userDao.delete(user);
    }
}
