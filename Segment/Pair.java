public class Pair {
  int idx;
  double mid;

  public Pair(int idx, double mid) {
    this.idx = idx;
    this.mid = mid;
  }

  // Copy constructor
  public Pair(Pair other) {
    this(other.idx, other.mid);
  }
}
