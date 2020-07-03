import java.util.Scanner;

public class Problem_1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter 2 integers number n1 and n2: ");
    int n1 = input.nextInt(), n2 = input.nextInt();
    System.out.println("The sum of odd integers is: " + oddSum(n1, n2));
  }

  public static int oddSum(int n1, int n2) {
    int sum = 0;
    if (n1 == n2) {
      return 0;
    }
    else if (n1 < n2) {
      for (int i = n1; i <= n2; i++) {
        if (i % 2 != 0) {
          sum += i;
        }
      }
    } else {
      for (int i = n2; i <= n1; i++) {
        if (i % 2 != 0) {
            sum += i;
        }
      }
    }
    return sum;
  }
}
