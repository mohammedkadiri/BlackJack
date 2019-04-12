
public class Deck {

    // Create a Card object
    public Card[] cards;

    public Deck(Card[] cards) {
        this.cards = cards;
    }

    public void displayDeck() {
        for(int i = 0; i < 52; i++) {
            if(i % 13 == 0)
                System.out.println("\n\n");
            System.out.print(cards[i].toString());
        }
    }
}