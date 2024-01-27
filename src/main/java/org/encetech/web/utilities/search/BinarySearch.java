package org.encetech.web.utilities.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {

  public static void main(String[] args) {
    List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println(binarySearch(intList, 5));
    List<String> stringList = new ArrayList<>(
      Arrays.asList("a", "b", "c", "d", "e")
    );
    System.out.println(binarySearch(stringList, "e"));
    List<Double> doubleList = new ArrayList<>(
      Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0)
    );
    System.out.println(binarySearch(doubleList, 4.0));
    List<Character> charList = new ArrayList<>(
      Arrays.asList('a', 'b', 'c', 'd', 'e')
    );
    System.out.println(binarySearch(charList, 'e'));
  }

  public static <T extends Comparable<T>> int binarySearch(
    List<T> list,
    T target
  ) {
    if (list.isEmpty()) {
      return -1;
    }
    if (
      target instanceof Integer ||
      target instanceof Double ||
      target instanceof String ||
      target instanceof Character ||
      target instanceof Float ||
      target instanceof Long ||
      target instanceof Short ||
      target instanceof Byte ||
      target instanceof Boolean
    ) {
      return implementBinarySearch(list, target);
    } else {
      return -1;
    }
  }

  private static <T extends Comparable<T>> int implementBinarySearch(
    List<T> list,
    T target
  ) {
    int left = 0, right = list.size() - 1, mid;
    while (left <= right) {
      mid = (left + right) >> 1;
      if (list.get(mid).equals(target)) return mid; else if (
        list.get(mid).compareTo(target) < 0
      ) left = mid + 1; else right = mid - 1;
    }
    return -1;
  }
}
