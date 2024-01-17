package org.encetech.web.utilities;

public class ArrayUtility {
  protected String[] inputArray;

  //constructor
  public ArrayUtility(String[] inputArray) {
    this.inputArray = inputArray;
  }

  //print array values
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

  //return element
  public String getArrayElement(int index) {
    return inputArray[index];
  }

  /**
   * delete element from array by excluding index on array copy operation then overwrite inputArray
   * @param index pass index to delete
   */
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

  /*
   * Sorting methods
   */
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

  public void bubbleSortDescending() {
    // i starts at the end of the Array
    for (int i = 0; i < inputArray.length; i++) {
      // The inner loop starts at the beginning of
      // the array i index in more than i
      for (int j = 1; j < (inputArray.length - i); j++) {
        // To change sort to Descending change to <
        //Here we check if the 1st index is less
        // than the next during the first run through
        // Then we just increase the indexes until
        // they have all been checked
        if (inputArray[j - 1].compareTo(inputArray[j]) < 0) {
          swapValues(j - 1, j);
        }
      }
    }
  }

  /**
   * linear search that will return all instances of the value
   * @param value string value to search
   * @return string of indexes where value is found
   */
  public String linearSearch(String value) {
    boolean valueInArray = false;
    String indexsWithValue = "";
    System.out.print("The Value was Found in the Following: ");
    for (int i = 0; i < inputArray.length; i++) {
      if (inputArray[i].equals(value)) {
        valueInArray = true;
        System.out.print(i + " ");
        indexsWithValue += i + " ";
      }
    }
    if (!valueInArray) {
      indexsWithValue = "None";
      System.out.print(indexsWithValue);
    }
    System.out.println();
    return indexsWithValue;
  }

  public void binarySearch(String value) {
    //array must be sorted first in ASC order
    int lowIndex = 0;
    int highIndex = inputArray.length - 1;
    while (lowIndex <= highIndex) {
      int middleIndex = (highIndex + lowIndex) / 2;
      if (inputArray[middleIndex].compareTo(value) < 0) {
        lowIndex = middleIndex + 1;
      } else if (inputArray[middleIndex].compareTo(value) > 0) {
        highIndex = middleIndex - 1;
      } else {
        System.out.println(
          "\nFound a Match for " + value + " at Index " + middleIndex
        );
        lowIndex = highIndex + 1;
      }
    }
  }

  public void selectionSort() {
    // i starts at the beginning of the Array
    for (int i = 0; i < inputArray.length; i++) {
      // indexMin is the smallest value
      // Initially it is the first value
      int indexMin = i;
      // j is used to find the smallest value
      for (int j = i; j < inputArray.length; j++) {
        if (inputArray[indexMin].compareTo(inputArray[j]) > 0) {
          // Place the new minimum index in indexMin
          indexMin = j;
        }
      }
      // if indexMin no longer equals i than a smaller value must have been found, so a swap must occur
      if (indexMin != i) {
        swapValues(i, indexMin);
      }
    }
  }

  //best of basic sorting algorithms
  public void insertionSort() {
    for (int i = 1; i < inputArray.length; i++) {
      String temp = inputArray[i];
      int j = i;
      while (j > 0 && inputArray[j - 1].compareTo(temp) > 0) {
        inputArray[j] = inputArray[j - 1];
        j--;
      }
      inputArray[j] = temp;
    }
  }

  public void swapValues(int indexOne, int indexTwo) {
    String temp = inputArray[indexOne];

    inputArray[indexOne] = inputArray[indexTwo];
    inputArray[indexTwo] = temp;
  }

  public boolean duplicateArrayElement(String element) {
    return this.findArrayElement(element) != -1;
  }
}
