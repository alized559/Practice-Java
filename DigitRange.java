import java.util.Scanner;

public class DigitRange {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter two numbers: ");
    int nb1 = input.nextInt();
    String nb2 = input.next();
    System.out.println("The digit range of " + nb1 + " is " + DigitRangeNoStr(nb1));
    System.out.println("The digit range of " + nb2 + " is " + DigitRangeStr(nb2));
  }

  public static int DigitRangeNoStr(int nb1) {
    int max = 0, min = 101;
    while (nb1 != 0) {
      int digit = nb1 % 10;
      if (digit == 1) {
        return 1;
      } else {
        if (digit > max) {
          max = digit;
        }
        nb1 /= 10;
        if (digit < min) {
          min = digit;
        }
      }
    }
    return max - min + 1;
  }

  public static int DigitRangeStr(String nb2) {
    int max = 0, min = 101;
    if (nb2.length() == 1) {
      return 1;
    }
    for (int i = 0; i < nb2.length(); i++) {
      if (nb2.charAt(i) - '0' > max) {
        max = nb2.charAt(i) - '0';
      }
      if (nb2.charAt(i) - '0' < min) {
        min = nb2.charAt(i) - '0';
      }
    }
    return max - min + 1;
  }
}
