import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sekta.platform.Application;
import sekta.platform.core.entity.Card;
import sekta.platform.core.service.CardService;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by FreeFly on 15.05.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class CardServiceTest {
    @Autowired
    private CardService cardService;

    @Test
    public void testSaveIntoDb() {
        Card card = new Card();
        card.setName("Some card name");
        int countBefore = cardService.getAllCards().size();
        cardService.createCard(card);
        int countAfter = cardService.getAllCards().size();

        assertThat(countAfter, equalTo(countBefore+1));
    }

    @Test
    public void testGetById(){
        Card card = cardService.getCardById(2L);

        assertThat(card.getName(), equalTo("Some card"));
    }
}
