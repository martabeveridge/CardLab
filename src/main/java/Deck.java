import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();
    }

    public int countCards(){
        return cards.size();
    }

    public void addCard(Card card){
        cards.add(card);
    }


    public void populate(){
        for(Suit suit : Suit.values()){
            for(CardValue cardValue : CardValue.values()){
                addCard(new Card(suit, cardValue));
            }
        }
        Collections.shuffle(cards);
    }

    public boolean hasEnoughCards(int number){
        if (countCards() >= number){
            return true;
        } else {
            return false;
        }
    }

    public Card getCard(){
        return cards.remove(0);
    }

}
