package sekta.platform.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import sekta.platform.core.entity.Card;
import sekta.platform.core.service.CardService;

@Controller
@RequestMapping("card")
public class CardController {
    @Autowired
    private CardService cardService;

    @RequestMapping(value = "")
    public String getCards() {
        Card card = new Card();
        card.setName("Some test card");
        cardService.createCard(card);
        return "cardCreated";
    }
}
