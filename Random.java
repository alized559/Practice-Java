import java.util.Scanner;

public class Problem_2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int nb = 1, greater = 0;
    while (nb <= 10 && greater < 5) {
      int rand = (int)(Math.random() * (77 - 8 + 1) + 8);
      if (rand > 40) {
        greater++;
      }
      nb++;
      System.out.print(rand + " ");
    }
  }
}
