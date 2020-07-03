import java.util.Arrays;
import java.util.Scanner;

public class MaximumLocalAlpha {
  public static void main(String[] args) {
    System.out.print(Integer.MAX_VALUE);
    Scanner s = new Scanner(System.in);
    System.out.println("How many numbers that you are gonna enter?");
    int len = s.nextInt();
    System.out.println("Please enter a sequence of positive integers: ");
    int[] arr = new int[len];
    for(int i = 0; i < len; i++) {
      arr[i] = s.nextInt();
    }
    Arrays.toString(arr);

    int localMax = localMax(arr);
    System.out.println("Maximum Local Alpha = " + localMax);
  }

  public static int localMax(int[] a) {
    int localMax = Integer.MIN_VALUE;
    for (int i = 1; i + 1 < a.length; i++) {
      if (a[i -1] < a[i] && a[i] > a[i + 1]) {
        if (a[i] > localMax) {
          localMax = a[i];
        }
      }
    }
    return localMax;
  }
}
