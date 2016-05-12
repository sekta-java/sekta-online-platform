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
    public List<Card> getAllCards() {
        return null;
    }

    @Override
    public Card getCardById() {
        return null;
    }

    @Override
    @Transactional
    public Card createCard(Card card) {
        cardDao.save(card);
        return card;
    }

    @Override
    public Card updateCard(Card card) {
        return null;
    }

    @Override
    public void deleteCard(Long id) {

    }
}
