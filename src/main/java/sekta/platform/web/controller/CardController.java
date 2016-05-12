package sekta.platform.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import sekta.platform.core.entity.Card;
import sekta.platform.core.service.CardService;

@Controller
public class CardController {
    @Autowired
    private CardService cardService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String greeting(Model model, @RequestParam(value = "name", required = false) String paramName) {

        if(paramName == null) {
            paramName = "World";
        }

        if (paramName.equals("")) {
            return "redirect:/";
        }

        model.addAttribute("name", paramName);

        return "main";
    }

    @RequestMapping(value = "addCard")
    public void addCard() {
        Card card = new Card();
        card.setName("Some test card");
        cardService.createCard(card);
    }

}
