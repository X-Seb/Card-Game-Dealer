import java.util.ArrayList;
import java.util.Scanner;

public class CardGameDealer
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        // Create a new deck of cards using 0 parameter constructor
        Deck deck = new Deck();
        
        // Randomize the deck
        deck.shuffle();
        
        // Print out the initial deck
        System.out.println("Here's the deck: ");
        System.out.println();
        deck.print();
        System.out.println();
        System.out.println();
        
        // Get user input
        System.out.println("How many people are playing?");
        int handNum = scanner.nextInt();
        
        System.out.println("How many cards per hand?");
        int cardNum = scanner.nextInt();
        
        System.out.println();
        System.out.println();
        
        // Deal the hands
        ArrayList<ArrayList<Card>> hands = new ArrayList<ArrayList<Card>>();
        
        // Create an arrayList for each hand
        for (int i = 0; i < handNum; i++) {
            hands.add(new ArrayList<Card>());
        }
        
        // Add cards to each hand
        for (int i = 0; i < cardNum; i++) {
            for (int j = 0; j < handNum; j++) {
                Card card = deck.dealCard();
                if (card != null) {
                    hands.get(j).add(card);
                }
            }
        }
        
        // Print out the hands:
        System.out.println("Here are the hands: ");
        System.out.println();
        for (int i = 0; i < handNum; i++) {
            System.out.println("Hand of player " + (i + 1) + ": ");
            for (Card card : hands.get(i)) {
                System.out.print(card + ", ");
            }
            System.out.println();
            System.out.println();
        }
    }
}
