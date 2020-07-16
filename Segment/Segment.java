public class Segment {
  private double x0, x1;

  public Segment(double x0, double x1) {
    this.x0 = x0;
    this.x1 = x1;
    if (x0 > x1) {
        throw new IllegalArgumentException("not possible segment " + this);
        // throws an exception if x0 is greater than x1
    }
  }

  // Copy constructer
  public Segment(Segment seg) {
    this(seg.x0, seg.x1);
  }

  public String toString() {
    return this.x0 + " -- " + this.x1;
  }

  public double leftEnd() {
    return x0;
  }

  public double rightEnd() {
    return x1;
  }

  // returns the midpoint of segment
  public double midpoint() {
    return (x0 + x1) / 2;
  }

  // returns true if the segment contains x
  public boolean contains(double x) {
    return x >= this.x0 && x <= this.x1;
  }

  // returns true if the segment overlap that
  public boolean overlaps(Segment that) {
    return (this.x0 >= that.x0 && this.x0 <= that.x1) ||
           (that.x0 >= this.x0 && that.x0 <= this.x1);
  }

  public static void main(String[] args) {
    Segment seg = new Segment(3.0, 4.0);
    Segment seg1 = new Segment(seg);
    Segment seg2 = new Segment(2.0, 6.0);
    System.out.println("seg = " + seg);
    System.out.println("seg1 = " + seg1);
    System.out.println("seg2 = " + seg2);
    System.out.println(seg.midpoint());
    System.out.println(seg.contains(2.0));
    System.out.println(seg2.contains(2.0));
    System.out.println(seg1.overlaps(seg2));
  }
}
