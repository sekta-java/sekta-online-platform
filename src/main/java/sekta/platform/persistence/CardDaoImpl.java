package sekta.platform.persistence;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sekta.platform.core.dao.CardDao;
import sekta.platform.core.entity.Card;

/**
 * Created by FreeFly on 12.05.2016.
 */
@Repository
public class CardDaoImpl implements CardDao{
    @Autowired
    private SessionFactory session;

    public void save(Card card) {
        session.getCurrentSession().save(card);
    }
}
