import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> hand;
    private int score;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<>();
        this.score = 0;
    }

    public int countCards(){
        return hand.size();
    }

    public void drawCards(Deck deck, int numberOfCards){
        if (deck.hasEnoughCards(numberOfCards)){
            for (int i = 0; i < numberOfCards; i++) {
                hand.add(deck.getCard());
            }
        }
    }

    public void addToScore(){
        score += 1;
    }

    public int getScore(){
        return score;
    }

    public ArrayList<Card> getHand(){
        return hand;
    }

    public void discardHand(){
        hand.clear();
    }

    public int totalPoints(){
        int total = 0;
        for (Card card : hand){
            total += card.getcardValue();
        }
        return total;
    }

    public void addCard(Card card){
        hand.add(card);
    }

}
