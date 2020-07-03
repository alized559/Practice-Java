public class SpecialStrings {
  public static void main(String[] args) {
    int nb = Integer.parseInt(args[0]); // number of strings
		for(int i = 1; i <= nb; i++) {
			System.out.print(sameChar(args[i]) + " ");
		}
  }

  public static boolean sameChar(String str) {
    return str.charAt(0) == str.charAt(str.length() - 1);
  }
}
