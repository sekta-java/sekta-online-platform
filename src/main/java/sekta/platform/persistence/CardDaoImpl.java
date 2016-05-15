package sekta.platform.persistence;

import org.springframework.stereotype.Repository;
import sekta.platform.core.dao.CardDao;
import sekta.platform.core.entity.Card;

/**
 * Created by FreeFly on 12.05.2016.
 */
@Repository
public class CardDaoImpl extends BaseDaoImpl<Card> implements CardDao {
    @Override
    public Card getById(Long id) {
        return (Card) sessionFactory.getCurrentSession().get(Card.class, id);
    }
}
