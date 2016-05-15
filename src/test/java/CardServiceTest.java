import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sekta.platform.Application;
import sekta.platform.core.entity.Card;
import sekta.platform.core.service.CardService;

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
        cardService.createCard(card);
    }
}
