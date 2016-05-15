package sekta.platform.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sekta.platform.core.dao.CardDao;
import sekta.platform.core.entity.Card;
import sekta.platform.core.service.CardService;

import java.util.List;

@Service
public class CardServiceImpl implements CardService {
    @Autowired
    private CardDao cardDao;

    @Override
    @Transactional
    public List<Card> getAllCards() {
        return cardDao.findAll();
    }

    @Override
    @Transactional
    public Card getCardById(Long id) {
        return cardDao.getById(id);
    }

    @Override
    @Transactional
    public Card createCard(Card card) {
        cardDao.create(card);
        return card;
    }

    @Override
    @Transactional
    public Card updateCard(Card card) {
        cardDao.update(card);
        return card;
    }

    @Override
    @Transactional
    public void deleteCard(Long id) {
        Card card = new Card();
        card.setCardId(id);
        cardDao.delete(card);
    }
}
