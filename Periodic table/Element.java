public class Element {
  private int number;
  private String symbol;
  private double weight;

  public Element(int nb, String symbol, double weight) {
    this.number = nb;
    this.symbol = symbol;
    this.weight = weight;
  }

  public int getNumber() {
    return this.number;
  }

  public String getSymbol() {
    return this.symbol;
  }

  public double getWeight() {
    return this.weight;
  }

  public String toString() {
    return this.number + " " + this.symbol + " " + this.weight;
  }

  public static void main(String[] args) {
    Element a = new Element(0, "h+", 0.00000);
    System.out.println(a);
  }
}
