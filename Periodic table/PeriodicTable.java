import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class PeriodicTable {
  private Element[] elements;

  public PeriodicTable(File file) throws FileNotFoundException {
    int size = countLines(file);
    elements = new Element[size];
    Scanner readFile = new Scanner(file);
    while (readFile.hasNextLine()) {
      String line = readFile.nextLine();
      Scanner readLine = new Scanner(line);
      int nb = readLine.nextInt();
      String symbol = readLine.next();
      double weight = readLine.nextDouble();
      elements[nb] = new Element(nb, symbol, weight);
    }
  }

  public int countLines(File file) throws FileNotFoundException {
    Scanner readFile = new Scanner(file);
    int count = 0;
    while (readFile.hasNextLine()) {
      count++;
      readFile.nextLine();
    }
    return count;
  }

  public double getAtomWeight(String atom) {
    for (int i = 0; i < elements.length; i++) {
      if (elements[i].getSymbol().compareTo(atom) == 0) {
        return elements[i].getWeight();
      }
    }
    return 0;
  }

  public double molecularWeight(String atom) {
    String[] a = atom.split(" ");
    double sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += getAtomWeight(a[i]);
    }
    return sum;
  }

  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("elements.txt");
    PeriodicTable table = new PeriodicTable(file);
    System.out.println("Number of lines in file: " + table.countLines(file) + "\n");
    System.out.println("elements = " + Arrays.toString(table.elements) + "\n");
    System.out.println("Atom weight = " + table.getAtomWeight("H") + "\n");
    System.out.println("Molecular weight = " + table.molecularWeight("H2 O") + "\n");
  }
}
