import java.util.Arrays;

public class Set {
  public static void main(String[] args) {
    boolean[] set = createSet("611");
    System.out.println("set = " + Arrays.toString(set));

    int count = cardinality(set);
    System.out.println("card(set) = " + count);

    boolean found = inSet(set, 4);
    System.out.println("digit d in set: " + found);

    addElement(set, 4);
    System.out.println("set = " + Arrays.toString(set));

    boolean[] set1 = createSet("1234");
    boolean[] set2 = createSet("7624");
    System.out.println("set1 = " + Arrays.toString(set1));
    System.out.println("set2 = " + Arrays.toString(set2));
    boolean equal = Arrays.equals(set1, set2);
    System.out.println("set1 and set2 are equal: " + equal);

    boolean[] set3 = union(set1, set2);
    System.out.println("set1 u set2 = " + Arrays.toString(set3));

    boolean[] set4 = intersect(set1, set2);
    System.out.println("set1 n set2 = " + Arrays.toString(set4));

    String s = toString(set);
    System.out.println("string of set = {" + s + "}");
  }

  public static boolean[] createSet(String s) {
    boolean[] set = new boolean[10];
    for (int i = 0; i < s.length(); i++) {
      set[s.charAt(i) - '0'] = true;
    }
    return set;
  }

  public static int cardinality(boolean[] set) {
    int count = 0;
    for (int i = 0; i < set.length; i++) {
      if (set[i] != false) {
        count ++;
      }
    }
    return count;
  }

  public static boolean inSet(boolean[] set, int d) {
    return set[d];
  }

  public static void addElement(boolean[] set, int d) {
    set[d] = true;
  }
  public static boolean equals(boolean[] set1, boolean[] set2) {
    set1 = new boolean[10];
    set2 = new boolean[10];
    return Arrays.equals(set1, set2);
  }

  public static boolean[] union(boolean[] set1, boolean[] set2) {
    boolean[] set3 = new boolean[10];
    for (int i = 0; i < set3.length; i++){
      if (set1[i] == true || set2[i] == true) {
        set3[i] = true;
      }
    }
    return set3;
  }

  public static boolean[] intersect(boolean[] set1, boolean[] set2) {
    boolean[] set4 = new boolean[10];
    for (int i = 0; i < set4.length; i++) {
      if (set1[i] == true && set2[i] == true) {
        set4[i] = true;
      }
    }
    return set4;
  }

  public static String toString(boolean[] set) {
    String s = "";
    for (int i = 0; i < set.length; i++) {
      if (set[i] == true) {
        s += Integer.toString(i);
      }
    }
    return s;
  }
}
