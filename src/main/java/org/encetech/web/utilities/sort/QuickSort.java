package org.encetech.web.utilities.sort;

/*
 *Web Utilities
 * Quick Sort
 * Author: Christian J Gonzalez
 * Time Complexity: O(n*log(n) )
 */
public class QuickSort<T extends Comparable<T>> {
  private final String SUCCESS_MESSAGE = "Quick Sort Successful";

  private T[] array;
  private int arraySize;

  private String completed() {
    return SUCCESS_MESSAGE;
  }

  public String sort(T[] array) {
    this.array = array;
    this.arraySize = array.length;
    partition(0, arraySize - 1, arraySize - 1);
    return this.completed();
  }

  private void partition(int low, int high, int pivot) {
    int i = low;
    int j = high;
    while (i <= j) {
      while (array[i].compareTo(array[pivot]) < 0) {
        i++;
      }
      while (array[j].compareTo(array[pivot]) > 0) {
        j--;
      }
      if (i <= j) {
        swap(i, j);
        i++;
        j--;
      }
    }
    if (low < j) {
      partition(low, j, j);
    }
    if (i < high) {
      partition(i, high, i);
    }
  }

  private void swap(int i, int j) {
    T temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}
