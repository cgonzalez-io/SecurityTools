package org.encetech.web.utilities.sort;

/*
 *Web Utilities
 * Selection Sort
 * Author: Christian J. Gonzalez
 */
import java.util.ArrayList;

/**
 * A class that implements the Selection Sort algorithm for sorting arrays and ArrayLists.
 *
 * @param <T> the type of elements to be sorted, must implement Comparable<T>
 *  Time Complexity: O(n^2)
 */

public class SelectionSort<T extends Comparable<T>> {
  private Boolean isSorted = false;
  private final String SUCCESS_MESSAGE = "Selection Sort Successful";

  private String completed() {
    return SUCCESS_MESSAGE;
  }

  public String sort(T[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      int minIndex = i;

      for (int j = i + 1; j < array.length; j++) {
        if (array[j].compareTo(array[minIndex]) < 0) {
          minIndex = j;
        }
      }

      T temp = array[minIndex];
      array[minIndex] = array[i];
      array[i] = temp;
    }
    return this.completed();
  }

  public String sort(ArrayList<T> array) {
    for (int i = 0; i < array.size() - 1; i++) {
      int minIndex = i;

      for (int j = i + 1; j < array.size(); j++) {
        if (array.get(j).compareTo(array.get(minIndex)) < 0) {
          minIndex = j;
        }
      }

      T temp = array.get(minIndex);
      array.set(minIndex, array.get(i));
      array.set(i, temp);
    }
    return this.completed();
  }
}
