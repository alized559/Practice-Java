import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class PracticingArrayLists {

  // returns the intersection of List1 and list2
  public static List<Integer> intersect(List<Integer> list1, List<Integer> list2) {
    List<Integer> list3 = new ArrayList<Integer>();
    for (int i : list1)
      if (list2.contains(i))
        list3.add(i);
    return list3;
  }

  // returns reversed List
  public static List<String> reverse(List<String> list) {
    for (int i = 0; i < list.size() / 2; i++) {
      String temp = list.get(i);
      list.set(i, list.get(list.size() - i - 1));
      list.set(list.size() - i - 1, temp);
    }
    return list;
  }

  // returns List and capitalalize the words that ends with 's'
  public static List<String> capitalizePlurals(List<String> list) {
    for (int i = 0; i < list.size(); i++)
      if (list.get(i).charAt(list.get(i).length() - 1) == 's')
          list.set(i, list.get(i).toUpperCase());
    return list;
  }

  // returns List and removes the words that ends with 's'
  public static List<String> removePlurals(List<String> list) {
    Iterator<String> itr = list.iterator();
    while (itr.hasNext()) {
      String word = itr.next();
      if (word.charAt(word.length() - 1) == 's' ||
        word.charAt(word.length() - 1) == 'S')
        itr.remove();
    }
    return list;
  }

  // returns sorted List
  public static List<String> sortList(List<String> list) {
    for (int i = 0; i < list.size() - 1; i++) {
      for (int j = i + 1; j < list.size(); j++) {
        if (list.get(i).compareToIgnoreCase(list.get(j)) > 0) {
          String temp = list.get(i);
          list.set(i, list.get(j));
          list.set(j, temp);
        }
      }
    }
    return list;
  }

  // returns sorted List without changing the original List
  public static List<String> sortWithoutChangingList(List<String> list) {
    List<String> newList = new ArrayList<String>(list);
    for (int i = 0; i < list.size() - 1; i++) {
      for (int j = i + 1; j < list.size(); j++) {
        if (newList.get(i).compareToIgnoreCase(newList.get(j)) > 0) {
          String temp = newList.get(i);
          newList.set(i, newList.get(j));
          newList.set(j, temp);
        }
      }
    }
    return newList;
  }

  // return 2D List from 2D array
  public static List<List<String>> twoDimensionalArrayList(String[][] array) {
    List<List<String>> lists = new ArrayList<List<String>>();
    for (String[] str : array) {
      List<String> list = new ArrayList<>();
      for (String i : str) {
        list.add(i);
      }
      lists.add(list);
    }
    return lists;
  }

  public static void main(String[] args) {
    List<Integer> list1 = new ArrayList<Integer>
      (Arrays.asList(1, 4, 8, 9, 11, 15, 17, 28, 41, 59));
    List<Integer> list2 = new ArrayList<Integer>
      (Arrays.asList(4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81));
    System.out.println("List1 = " + list1);
    System.out.println("List2 = " + list2);
    System.out.println("List1 n List2 = " + intersect(list1, list2));
    List<String> list3 = new ArrayList<String>
      (Arrays.asList("Ali", "Mike", "Mhmd", "yusef", "hsen"));
    System.out.println("List3 = " + list3);
    System.out.println("reversedList = " + reverse(list3));
    List<String> list4 = new ArrayList<String>
      (Arrays.asList("ads", "acts", "ant", "is", "are"));
    System.out.println("List4 = " + list4);
    System.out.println("capitalizedList = "  + capitalizePlurals(list4));
    System.out.println("RemovedPlurals = " + removePlurals(list4));
    List<String> list5 = new ArrayList<String>
      (Arrays.asList("Mhmd", "Hsen", "Ali", "Yusef", "Mike"));
    System.out.println("sort List without changing it = " + sortWithoutChangingList(list5));
    System.out.println("List5 = " + list5);
    System.out.println("sortedList = " + sortList(list5));
    String[][] array = {{"Ali", "Mhmd", "hsn"}, {"yusef", "Mike"}};
    System.out.println(twoDimensionalArrayList(array));
  }
}
