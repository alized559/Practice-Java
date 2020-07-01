import java.util.Scanner;

public class ascii {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an ASCII code: ");
    int num = input.nextInt();
    char c = (char)num;
    System.out.println("The character is " + c);
  }
}
