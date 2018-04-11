import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DeckTest {

    private Deck myDeck;
    private Card myCard;

    @Before
    public void before(){
        myDeck = new Deck();
        myCard = new Card(Suit.CLUBS, CardValue.EIGHT);
    }

    @Test
    public void deckStartsEmpty(){
        assertEquals(0, myDeck.countCards());
    }

    @Test
    public void canAddCard(){
        myDeck.addCard(myCard);
        assertEquals(1, myDeck.countCards());
    }

    @Test
    public void deckIsFull(){
        myDeck.populate();
        assertEquals(52, myDeck.countCards());
    }

    @Test
    public void deckCanGetCard(){
        myDeck.addCard(myCard);
        assertEquals(myCard, myDeck.getCard());
        assertEquals(0, myDeck.countCards());

    }
}
