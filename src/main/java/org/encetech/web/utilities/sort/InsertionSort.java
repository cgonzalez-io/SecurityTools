package org.encetech.web.utilities.sort;
/*
* Web Utilities
* Insertion Sort
* Author: Christian J Gonzalez
 */
import java.util.ArrayList;

/**
 * The InsertionSort class provides methods to sort an array or ArrayList using the Insertion Sort algorithm.
 * It supports sorting elements of any type that extends Comparable.
 * Time Complexity: O(n)
 */
public class InsertionSort<T extends Comparable<T>> {
  private Boolean isSorted = false;
  private final String SUCCESS_MESSAGE = "Insertion Sort Successful";

  private String completed() {
    return SUCCESS_MESSAGE;
  }

  public String sort(T[] array) {
    for (int i = 1; i < array.length; i++) {
      T key = array[i];
      int j = i - 1;

      while (j >= 0 && array[j].compareTo(key) > 0) {
        array[j + 1] = array[j];
        j = j - 1;
      }
      array[j + 1] = key;
    }
    return this.completed();
  }

  public String sort(ArrayList<T> array) {
    for (int i = 1; i < array.size(); i++) {
      T key = array.get(i);
      int j = i - 1;
      while (j >= 0 && array.get(j).compareTo(key) > 0) {
        array.set(j + 1, array.get(j));
        j = j - 1;
      }
      array.set(j + 1, key);
    }
    return this.completed();
  }
}
