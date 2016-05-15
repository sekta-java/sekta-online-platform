package sekta.platform.core.service;

import sekta.platform.core.entity.Card;

import java.util.List;

public interface CardService {
    List<Card> getAllCards();
    Card getCardById(Long id);
    Card createCard(Card card);
    Card updateCard(Card card);
    void deleteCard(Long id);
}
