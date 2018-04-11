import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Deck myDeck;
    private Player myPlayer;
    private Card myCard1;
    private Card myCard2;

    @Before
    public void before(){
        myPlayer = new Player("Tom Sawyer");
        myDeck = new Deck();
        myDeck.populate();
        myCard1 = new Card(Suit.CLUBS, CardValue.EIGHT);
        myCard2 = new Card(Suit.CLUBS, CardValue.SEVEN);
    }

    @Test
    public void canDrawCards(){
        myPlayer.drawCards(myDeck,4);
        assertEquals(4, myPlayer.countCards());
        assertEquals(48, myDeck.countCards());
    }

    @Test
    public void canGetHand(){
        myPlayer.drawCards(myDeck,4);
        assertEquals(4, myPlayer.getHand().size());
    }

    @Test
    public void canDiscardHand(){
        myPlayer.drawCards(myDeck,4);
        assertEquals(4, myPlayer.getHand().size());
        myPlayer.discardHand();
        assertEquals(0, myPlayer.getHand().size());
    }

    @Test
    public void canGetTotalPoints(){
        myPlayer.addCard(myCard1);
        myPlayer.addCard(myCard2);
        assertEquals(15, myPlayer.totalPoints());
    }

}
