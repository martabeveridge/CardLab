public class Card {
    private Suit suit;
    private CardValue cardValue;

    public Card(Suit suit, CardValue cardValue){
        this.suit = suit;
        this.cardValue = cardValue;
    }

    public int getcardValue(){
        return cardValue.getValue();
    }



}
