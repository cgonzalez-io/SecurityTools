package org.encetech.web.utilities;

public class ArrayUtility {
  protected String[] inputArray;

  public ArrayUtility(String[] inputArray) {
    this.inputArray = inputArray;
  }

  public void printArray() {
    int i = 0;
    System.out.println("----------------------------");
    for (String s : inputArray) {
      System.out.print("| " + i + " | ");
      System.out.println(s + " |");
      System.out.println("----------------------------");
      i++;
    }
  }

  public String getArrayElement(int index) {
    return inputArray[index];
  }

  public void deleteArrayElement(int index) {
    String[] newArray = new String[inputArray.length - 1];
    int j = 0;
    for (int i = 0; i < inputArray.length; i++) {
      if (i != index) {
        newArray[j] = inputArray[i];
        j++;
      }
    }
    inputArray = newArray;
  }

  public void insertArrayElement(int index, String element) {
    String[] newArray = new String[inputArray.length + 1];
    int j = 0;
    for (int i = 0; i < inputArray.length; i++) {
      if (i == index) {
        newArray[j] = element;
        j++;
      }
      newArray[j] = inputArray[i];
      j++;
    }
    inputArray = newArray;
  }

  public int findArrayElement(String element) {
    //linear search
    int i = 0;
    for (String s : inputArray) {
      if (s.equals(element)) {
        return i;
      }
      i++;
    }
    return -1;
  }

  // bubble sort will sort everything from smallest to largest
  public void bubbleSort() {
    // i starts at the end of the Array
    // As it is decremented all indexes greater
    // then it are sorted
    for (int i = inputArray.length - 1; i > 1; i--) {
      // The inner loop starts at the beginning of
      // the array and compares each value next to each
      // other. If the value is greater then they are
      // swapped
      for (int j = 0; j < i; j++) {
        // To change sort to Descending change to <
        if (inputArray[j].compareTo(inputArray[j + 1]) > 0) {
          swapValues(j, j + 1);
        }
      }
    }
  }

  public void swapValues(int indexOne, int indexTwo) {
    String temp = inputArray[indexOne];

    inputArray[indexOne] = inputArray[indexTwo];
    inputArray[indexTwo] = temp;
  }
}
