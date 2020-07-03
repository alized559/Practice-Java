import java.util.Arrays;

public class CardDeck {
  private Card[] cards;
  private int top;

  String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};
  String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};

  public CardDeck() {
    int n = rank.length * suit.length;
    this.cards = new Card[n];
    for (int i = 0; i < rank.length; i++) {
      for (int j = 0; j < suit.length; j++) {
        this.cards[suit.length * i + j] = new Card(rank[i], suit[j]);
      }
    }
    this.top = 0;
  }

  public void shuffle() {
    for (int i = 0; i < this.cards.length; i++) {
      int j = (int)(Math.random() * this.cards.length);
      Card value = this.cards[i];
      this.cards[i] = this.cards[j];
      this.cards[j] = value;
      System.out.println("Deck after shuffle = " + Arrays.toString(this.cards) + "\n");
    }
  }

  public Card draw() {
    return this.cards[this.top++];
  }

  public boolean isEmpty() {
    return this.top >= this.cards.length;
  }

  public int cardsLeft() {
    return this.cards.length - this.top;
  }

  public static void main(String[] args) {
    CardDeck deck = new CardDeck();
    System.out.println(Arrays.toString(deck.cards) + "\n\n");
    deck.shuffle();
    System.out.println(deck.draw() + "\n");
    System.out.println("Deck is empty: " + deck.isEmpty() + "\n");
    System.out.println("Cards left in the deck: " + deck.cardsLeft());
  }
}
