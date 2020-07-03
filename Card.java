public class Card {
  private String rank;
  private String suit;
  
  public Card(String r, String s) {
    this.rank = r;
    this.suit = s;
  }

   public String getRank() {
     return this.rank;
   }

   public String getSuit() {
     return this.suit;
   }

   public boolean isOfSuit(String s) {
     return s == this.suit;
   }

   public boolean stronger(Card c) {
     if (this.rank.equals(c.rank)) {
       if (this.suit.equals("Spades")) {
         return true;
       } else if (this.suit.equals("Hearts") && !c.suit.equals("Spades")) {
         return true;
       } else if (this.suit.equals("Diamond") && c.suit.equals("Clubs")) {
         return true;
       }
     } else if (this.rank.compareTo(c.rank) > 0) {
       return true;
     }
     return false;
   }

   public String toString() {
     return this.rank + "-" + this.suit;
   }

   public static void main(String[] args) {
     Card c1 = new Card("10", "Hearts");
     Card c2 = new Card("Q", "Spades");
     Card c3 = new Card("K", "Spades");
     Card c4 = new Card("2", "Clubs");
     Card c5 = new Card("8", "Diamonds");
     Card c6 = new Card("8", "Hearts");
     System.out.println("c1 = " + c1);
     System.out.println("c2 = " + c2);
     System.out.println("c3 = " + c3);
     System.out.println("c4 = " + c4);
     System.out.println("c5 = " + c5);
     System.out.println("c6 = " + c6);
     System.out.println("c1 is of suit Hearts: " + c1.isOfSuit("Hearts"));
     System.out.println("c2 is of suit Hearts: " + c2.isOfSuit("Hearts"));
     System.out.println("c1 is stronger than c2: " + c1.stronger(c2));
     System.out.println("c3 is stronger than c4: " + c3.stronger(c4));
     System.out.println("c5 is stronger than c6: " + c5.stronger(c6));
   }
 }
