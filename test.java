import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class test {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner readFile = new Scanner(new File("data.txt"));
    while (readFile.hasNextLine()) {
      String line = readFile.nextLine();
      Scanner readLine = new Scanner(line);

      int id = readLine.nextInt();
      String name = readLine.next();
      float sum = 0f;
      int count = 0;
      while (readLine.hasNextDouble()) {
        sum += readLine.nextDouble();
        count++;
      }
      float average = sum / count;
      System.out.println(name + " (ID#" + id + ") worked " + sum + " hours ("
        + average + " hours/day)");
    }
  }
}
