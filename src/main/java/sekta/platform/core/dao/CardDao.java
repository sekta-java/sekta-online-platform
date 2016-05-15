package sekta.platform.core.dao;

import sekta.platform.core.entity.Card;

/**
 * Created by FreeFly on 12.05.2016.
 */
public interface CardDao extends BaseDao<Card>{

    Card getById(Long id);
}
