public class Palindrome {
  public static void main(String[] args) {
    System.out.println("Madam is palidrome: " + isPalindrome("Madam"));
  }

  public static boolean isPalindrome(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		boolean test = str.toLowerCase().equals(reverse.toLowerCase());
		return test;
  }
}
