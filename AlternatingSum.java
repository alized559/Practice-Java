import java.util.Scanner;

public class AlternatingSum {
  public static void main(String[] args) {
    double n = Double.parseDouble(args[0]);
    float sum = 0;
    for (int i = 1; i <= n; i++) {
      double nb = Double.parseDouble(args[i]);
      sum += Math.pow(-1, i + 1) * nb;
    }
    System.out.println("Alternating sum is: " + sum);
    System.out.println("Rounded alternating sum is: " + Math.round(sum));
  }
}
