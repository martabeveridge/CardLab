import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome. Player 1:");
        Player player1 = new Player(reader.next());
        System.out.println("Player 2:");
        Player player2 = new Player(reader.next());
        System.out.println("How many cards per round?");
        int cardNumber = reader.nextInt();

        Deck deck = new Deck();
        deck.populate();

        while (deck.hasEnoughCards(cardNumber * 2 )){
            player1.drawCards(deck, cardNumber);
            player2.drawCards(deck, cardNumber);

            compare(player1, player2);

            System.out.println("Player 1: "+ player1.getScore() + " Payer 2: "+player2.getScore());


            player1.discardHand();
            player2.discardHand();
        }

        winner(player1, player2);

    }

    public static void compare(Player player1, Player player2){
        int p1points = player1.totalPoints();
        int p2points = player2.totalPoints();
        if (p1points > p2points){
            player1.addToScore();
        } else if (p2points > p1points){
            player2.addToScore();
        }
    }

    public static void winner(Player player1, Player player2){
        int p1score = player1.getScore();
        int p2score = player2.getScore();
        if (p1score > p2score){
            System.out.println("Player 1 wins, with " + p1score);
        } else if (p2score > p1score){
            System.out.println("Player 2 wins, with " + p2score);
        } else if (p1score == p2score){
            System.out.println("It was a draw, both with " + player1.getScore());
        }
    }


}
