import java.util.Scanner;

public class Triangle {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float len1 = input.nextFloat(), len2 = input.nextFloat(), len3 = input.nextFloat();
    if (isValid(len1, len2, len3)) {
      System.out.println("Valid triangle. Area is " + area(len1, len2, len3));
    } else {
      System.out.println("Invalid triangle. ");
    }
  }

  public static boolean isValid(double side1, double side2, double side3) {
    return ((side1 + side2) > side3 && (side1 + side3) > side2 && (side2 + side3) > side1);
  }

  public static double area(double side1, double side2, double side3) {
    double s = (side1 + side2 + side3) / 2;
    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
  }
}
