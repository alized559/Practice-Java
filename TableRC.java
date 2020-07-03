public class TableRC {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int r = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);
    table(n, r, c);
  }

  public static void table(int n, int r, int c) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (j == c || i == r) {
          System.out.print("o ");
        } else {
          System.out.print("x ");
        }
      }
      System.out.println();
    }
  }
}
