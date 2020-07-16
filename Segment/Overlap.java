import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Overlap {
  private Segment[] segs;

  // Fills segs array read from file
  public Overlap(File file) throws FileNotFoundException {
    Scanner readFromFile = new Scanner(file);
    int nb = readFromFile.nextInt();
    this.segs = new Segment[nb];
    for (int i = 0; i < nb; i++) {
      double x0 = readFromFile.nextDouble();
      double x1 = readFromFile.nextDouble();
      this.segs[i] = new Segment(x0, x1);
    }
  }

  /*
   * This function sort the segments in segs by their midpoint
   * @return sorted segments array
  */
  public Segment[] sortByMidpoint() {
    final int n = this.segs.length;
    Pair[] pairs = new Pair[n];
    for (int i = 0; i < n; ++i) {
      pairs[i] = new Pair(i, this.segs[i].midpoint());
    }
    for(int j = 0; j < n - 1; j++) {
      for (int k = 1; k < n - j; k++) {
        if (pairs[k - 1].mid > pairs[k].mid) {
          Pair tmp = new Pair(pairs[k - 1]);
          pairs[k - 1] = new Pair(pairs[k]);
          pairs[k] = new Pair(tmp);
        }
      }
    }
    Segment[] sortedSegments = new Segment[n];
    for (int i = 0; i < n; ++i) {
      sortedSegments[i] = this.segs[pairs[i].idx];
    }
    return sortedSegments;
  }

  /*
   * This function prints the segments that overlap each other
   * @param sortedSegments  An array representing the sorted segemnts
  */
  public void overlaps(Segment[] sortedSegments) {
    sortByMidpoint();
    for (int i = 0; i < sortedSegments.length - 1; i++) {
      Segment seg = new Segment(sortedSegments[i]);
      if (seg.overlaps(sortedSegments[i + 1])) {
        System.out.println("[" + sortedSegments[i] + "]" + " overlaps " + "[" +
                           sortedSegments[i + 1] + "]");
      }
    }
  }

  /*
   * This function get the bounds of sortedSegments array
   * @param sortedSegments  An array representing the sorted segments
   * @return string of the first and the last bound in sortedSegments array
  */
  public String bounds(Segment[] sortedSegments) {
    sortByMidpoint();
    String a = sortedSegments[0].toString(); // Convert first segment to String to split it
    String[] min = a.split(" -- ");
    String x0 = min[0]; // minimum bound
    String b = sortedSegments[sortedSegments.length - 1].toString(); // Convert last segment to String to split it
    String[] max = b.split(" -- ");
    String x1 = max[max.length - 1]; // maximum bound
    String s = "[" + x0 + " -- " + x1 + "]";
    return s;
  }

  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("segments.txt");
    Overlap obj = new Overlap(file);
    Segment[] sortedSegments = obj.sortByMidpoint();
    System.out.println("segs = " + Arrays.toString(obj.segs) + "\n");
    System.out.println("Sorted segments = " + Arrays.toString(obj.sortByMidpoint()) + "\n");
    obj.overlaps(sortedSegments);
    System.out.println("\nBounding segment is: " + obj.bounds(sortedSegments));
  }
}
