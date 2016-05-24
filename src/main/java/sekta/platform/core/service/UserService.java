package sekta.platform.core.service;

import sekta.platform.core.entity.User;

import java.util.List;

/**
 * Created by natad on 18.05.2016.
 */
public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    User createUser(User user);
    User updateUser(User user);
    void deleteUser(Long id);
}
