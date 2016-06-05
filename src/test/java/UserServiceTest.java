import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sekta.platform.Application;
import sekta.platform.core.entity.User;
import sekta.platform.core.service.UserService;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by natad on 18.05.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class UserServiceTest {
    @Autowired
    UserService userService;

    @Test
    public void testSaveToDb(){
        User user = new User();

        int countBefore = userService.getAllUsers().size();
        userService.createUser(user);
        int countAfter = userService.getAllUsers().size();

        assertThat(countAfter, equalTo(countBefore+1));
    }

    @Test
    public void testGetById(){
        User testUser = new User();

        userService.createUser(testUser);
        Long id = testUser.getUserId();
        User userFromDb = userService.getUserById(id);

        assertThat(userFromDb.getUserId(), equalTo(testUser.getUserId()));
    }

    @Test
    public void testDeleteUser(){
        User user = new User();

        userService.createUser(user);
        userService.deleteUser(user.getUserId());

        assertThat(userService.getUserById(user.getUserId()), equalTo(null));
    }
}
