package sekta.platform.core.dao;

import sekta.platform.core.entity.Message;

/**
 * Created by Retro on 19.05.2016.
 */
public interface MessageDao extends BaseDao<Message> {

    Message getById(Long id);

}
