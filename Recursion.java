public class Recursion {
  public static void printStars(int n) {
    for (int i = 0; i < n; ++i)
      System.out.print("*");
    System.out.println();
  }

  public static void printStarsRec(int n) {
    if (n == 0) {
      System.out.println();
      return;
    }
    System.out.print("*");
    printStarsRec(n - 1);
  }

  public static int powIter(int a, int b) {
    int res = 1;
    for (int i = 0; i < b; ++i)
      res *= a;
    return res;
  }

  public static int powRec(int a, int b) {
    if (b == 0)
      return 1;
    return a * powRec(a, b - 1);
  }

  public static boolean isPalIter(String s) {
    for (int i = 0; i < s.length() / 2; ++i) {
      if (s.charAt(i) != s.charAt(s.length() - 1 - i))
        return false;
    }
    return true;
  }

  public static boolean isPalRec(String s) {
    if (s.length() <= 1)
      return true;
    return s.charAt(0) == s.charAt(s.length() - 1) &&
      isPalRec(s.substring(1, s.length() - 1));
  }

  public static void main(String[] args) {
    System.out.println(powRec(3, 2));
    System.out.println(isPalRec("aaaaa"));
  }
}
