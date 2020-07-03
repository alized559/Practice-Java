import java.util.Scanner;

public class InCircle {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float radius = input.nextFloat(), x = input.nextFloat(), y = input.nextFloat();
    float distance = (float)Math.sqrt((x * x) + (y * y));
    if (distance < radius) {
      System.out.println("The point (" + x + ", " + y + ") is inside the circle");
    } else {
      System.out.println("The point (" + x + ", " + y + ") is outside the circle");
    }
  }
}
