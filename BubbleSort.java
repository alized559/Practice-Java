import java.util.Scanner;
import java.util.Arrays;

// This program sort a random numbers between 0 and 1000

public class BubbleSort {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of times to perform bubble sort: ");
    int nb = input.nextInt();
    int[] array = new int[10];
    for (int i = 1; i <= nb; i++) {
      createArray(array);
      int[] newArray = Arrays.copyOf(array, array.length);
      sort(newArray);
      System.out.println("\nbefore: " + printArray(array));
      System.out.println("after: " + printArray(newArray) + "\n");
    }
  }

  /*
   * Creates and fills the array
   * @param array  An array of random numbers between 0 and 1000
   * @return array represeting the random numbers
  */
  public static int[] createArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      int rand = (int)(Math.random() * (1000 - 0) + 0);
      array[i] = rand;
    }
    return array;
  }

  /*
   * Prints the array
   * @param array  An array of random numbers between 0 and 1000
   * @return  array represeting the random numbers
  */
  public static String printArray(int[] array) {
    String str = "";
    for (int i = 0; i < array.length; i++) {
      str += array[i] + " ";
    }
    return str;
  }

  /*
   * Sort the array
   * @param array  An array of random numbers between 0 and 1000
   * @return  sorted array
  */
  public static int[] sort(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = 1; j < array.length - i; j++) {
        if (array[j - 1] < array[j]) {
          int temp = array[j - 1];
          array[j - 1] = array[j];
          array[j] = temp;
        }
      }
    }
    return array;
  }
}
