package sekta.platform.core.dao;

import sekta.platform.core.entity.ForumCategory;
import sekta.platform.core.entity.Message;
import sekta.platform.core.entity.User;

import java.util.List;

/**
 * Created by Retro on 19.05.2016.
 */
public interface MessageDao extends BaseDao<Message> {

    Message getById(Long id);
    List getByUserName(User user);
    List<Message> getByForumCategory(ForumCategory forumCategory);

}
