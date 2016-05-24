package sekta.platform.persistence;

import org.springframework.stereotype.Repository;
import sekta.platform.core.dao.MessageDao;
import sekta.platform.core.entity.Message;

/**
 * Created by Retro on 19.05.2016.
 */
@Repository
public class MessageDaoImpl extends BaseDaoImpl<Message> implements MessageDao {

    @Override
    public Message getById(Long id) {
        return (Message) sessionFactory.getCurrentSession().get(Message.class, id);
    }
}
