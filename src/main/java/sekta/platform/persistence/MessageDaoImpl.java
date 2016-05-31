package sekta.platform.persistence;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import sekta.platform.core.dao.MessageDao;
import sekta.platform.core.entity.ForumCategory;
import sekta.platform.core.entity.Message;
import sekta.platform.core.entity.User;

import java.util.List;

/**
 * Created by Retro on 19.05.2016.
 */
@Repository
public class MessageDaoImpl extends BaseDaoImpl<Message> implements MessageDao {

    @Override
    public Message getById(Long id) {
        return (Message) sessionFactory.getCurrentSession().get(Message.class, id);
    }

    @Override
    public List<Message> getByUserName(User user) {
       return sessionFactory
               .getCurrentSession()
               .createCriteria(Message.class)
               .add(Restrictions.eq("user_id",user.getUser_id()))
               .list();
    }

    @Override
    public List<Message> getByForumCategory(ForumCategory forumCategory) {
        Criteria cr=sessionFactory.getCurrentSession().createCriteria(ForumCategory.class);
        cr.add(Restrictions.eq("forum_category_id",forumCategory.getForum_category_id()));
        return cr.list();
    }


}
