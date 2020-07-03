import java.util.Scanner;

public class StrongNumber {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    int n = s.nextInt();
    System.out.println("The strong numbers between 1 and " + n + " are: ");
    for (int i = 1; i <= n; i++) {
      if (isStrongNumber(i)) {
        System.out.print(i + " ");
      }
    }
  }

  public static int factorial(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact *= i;
    }
    return fact;
  }

  public static boolean isStrongNumber(int x) {
    int result = 0;
		int temp = x;
		while(temp > 0) {
			int num = temp % 10;
			temp /= 10;
			result += factorial(num);
    }
		return result == x ? true : false;
  }
}
