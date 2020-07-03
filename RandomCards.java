public class RandomCards {
  public static void main(String[] args) {
    int nb = Integer.parseInt(args[0]);
    for (int i = 1; i <= nb; i++) {
      System.out.println(randomRank() + " of " + randomSuit());
    }
  }

  public static int randomInteger(int max) {
    int rand = (int)(Math.random() * (max - 1) + 1);
    return rand;
  }

  public static String randomRank() {
    String cardRank = "";
    switch(randomInteger(14)) {
      case 1:
      cardRank = "Ace";
      break;
      case 2:
      cardRank = "2";
      break;
      case 3:
      cardRank = "3";
      break;
      case 4:
      break;
      case 5:
      cardRank = "5";
      break;
      case 6:
      cardRank = "6";
      break;
      case 7:
      cardRank = "7";
      break;
      case 8:
      cardRank = "8";
      break;
      case 9:
      cardRank = "9";
      break;
      case 10:
      cardRank = "10";
      break;
      case 11:
      cardRank = "Jack";
      break;
      case 12:
      cardRank = "Queen";
      break;
      case 13:
      cardRank = "King";
      break;
    }
    return cardRank;
  }

  public static String randomSuit() {
    String cardSuit = "";
    switch(randomInteger(5)) {
      case 1:
      cardSuit = "Clubs";
      break;
      case 2:
      cardSuit = "Diamonds";
      break;
      case 3:
      cardSuit = "Hearts";
      break;
      case 4:
      cardSuit = "Spades";
      break;
    }
    return cardSuit;
  }
}
