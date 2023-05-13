import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    
    // Card ArrayList holds all the cards
    public ArrayList<Card> deck;
    
    /*
    * 0 parameter deck constructor: creates a standard 52 card deck
    * returns nothing
    */
    public Deck() {
        deck = new ArrayList<Card>();
        
        String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        
        // Add all the cards to the deck
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new Card(suit, rank));
            }
        }
    }
    
    /*
    * Shuffles the deck with Collections.shuffle
    * returns nothing
    */
    public void shuffle() {
        Collections.shuffle(deck);
    }
    
    /*
    * Prints out every card in the deck
    * returns nothing
    */
    public void print(){
        for (Card card: deck){
            System.out.println(card);
        }
    }
    
    
    /*
    * Returns the first card from the deck
    * returns a Card if the deck isn't empty or null if it is empty
    */
    public Card dealCard() {
        if (deck.size() > 0) {
            return deck.remove(0);
        } else {
            return null;
        }
    }
}
