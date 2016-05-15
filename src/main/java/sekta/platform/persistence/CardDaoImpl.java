package sekta.platform.persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sekta.platform.core.dao.CardDao;
import sekta.platform.core.entity.Card;

/**
 * Created by FreeFly on 12.05.2016.
 */
@Repository
public class CardDaoImpl implements CardDao {
    @Autowired
    private SessionFactory sessionFactory;

    public void save(Card card) {
        getSession().save(card);
    }

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}
