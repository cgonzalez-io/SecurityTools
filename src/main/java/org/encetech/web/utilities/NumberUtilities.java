package org.encetech.web.utilities;

/**
 * This class contains utility methods for number operations.
 */
public class NumberUtilities {
  /**
   * Field to store input number.
   */
  private int inputNumber;

  /**
   * Constructor to initialize the object with a number.
   *
   * @param number The number to initialize the object.
   */
  public NumberUtilities(int number) {
    this.inputNumber = number;
  }

  /**
   * Method to check if the inputNumber is even.
   *
   * @return true if the inputNumber is even, false otherwise.
   */
  public Boolean isEven() {
    return inputNumber % 2 == 0;
  }
}
