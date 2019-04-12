
public class BlackJack {

    // A simulation of black jack requires a deck, player, dealer
    public BlackJack(Deck deck, Player player, Dealer dealer) {
    }

    static final int NO_OF_CARDS = 52;
    static int i = 0;
    public static void main(String[] args) {

         
        // Array to store 52 instances of cards
        Card[] cards = new Card[NO_OF_CARDS];
        Card card;
        
        // Create an instance of a card and store it inside the array
        // Create suits 4 * 13 = 52
        for(int suits = 0; suits < 4; suits++) {
            // Create 13 ranks for each suit
            for(int ranks = 2; ranks< 15; ranks++) {
                switch(ranks) {
                    default : card = new Card(suits, ranks);
                }

                // Store each card in the array
                cards[i] = card;
                i++;
            }
        }
        
        Deck deck = new Deck(cards);
        deck.displayDeck();






    }
}