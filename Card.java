
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

    // Constants for non-numerical cards
    public static final int J = 10;
    public static final int Q = 10;
    public static final int K = 10;
    public static final int A = 1;

    private int rank;
    private int suit;
    

    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

   
    public String toString() {
        return suit  + "-" +getFaceName() + ",  ";
    }

    public String getFaceName() {
        switch(rank) {  
            case 11 : return "J";
            case 12 : return "K";
            case 13 : return "Q";
            case 14 : return "A";
            default : return String.valueOf(rank);
        }
    }
   
    
 }
