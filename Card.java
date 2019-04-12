
/**
 * Card.java - This class provides a template for constructing card instances
 * @author Mohammed Kadiri
 * @version 1.8.0_191
 */

 

 public class Card {

    // Constants for suits of the card
    public static final int Hearts = 0;
    public static final int Clubs = 1;
    public static final int Spades = 2;
    public static final int Diamonds = 3;

    private int rank;
    private int suit;

    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }
    
 }
