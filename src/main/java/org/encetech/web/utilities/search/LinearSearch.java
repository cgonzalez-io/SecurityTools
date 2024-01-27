package org.encetech.web.utilities.search;

import java.util.List;

public class LinearSearch {
  private Boolean valueFound = false;
  private int indexFound;

  public <T extends Comparable<T>> int linearSearch(List<T> list, T target) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).equals(target)) {
        valueFound = true;
        indexFound = i;
        break;
      }
    }
    if (valueFound) {
      return indexFound;
    } else {
      return -1;
    }
  }
}
