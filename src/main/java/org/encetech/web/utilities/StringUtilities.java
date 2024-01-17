package org.encetech.web.utilities;

/**
 * Utility class offering various operations on strings.
 */
public class StringUtilities {

  /**
   * Count the number of words in a string.
   *
   * @param input the string to be counted
   * @return the number of words in the string, or 0 if the string is null or empty
   */
  public static int countWords(String input) {
    if (input == null || input.isEmpty()) {
      return 0;
    }

    String[] words = input.trim().split("\\s+");
    return words.length;
  }

  /**
   * Count the number of spaces in a string.
   *
   * @param input the string to be counted
   * @return the number of spaces in the string, or 0 if the string is null or empty
   */
  public static int countSpaces(String input) {
    if (input == null || input.isEmpty()) {
      return 0;
    }

    int count = 0;
    for (char c : input.toCharArray()) {
      if (c == ' ') {
        count++;
      }
    }

    return count;
  }

  /**
   * Count the instances of a specific character in a string.
   *
   * @param input the string to be searched
   * @param specialChar the character to count
   * @return the count of the specific character, or 0 if the string is null, empty or the character does not exist
   */
  public static int countSpecialCharacters(String input, char specialChar) {
    if (input == null || input.isEmpty()) {
      return 0;
    }

    int count = 0;
    for (char c : input.toCharArray()) {
      if (c == specialChar) {
        count++;
      }
    }

    return count;
  }

  /**
   * Count the number of sentences in a string.
   * A sentence is considered as a sequence of characters that ends with ".", "?", or "!".
   *
   * @param input the string to be counted
   * @return the number of sentences in the string, or 0 if the string is null or empty
   */
  public static int countSentences(String input) {
    if (input == null || input.isEmpty()) {
      return 0;
    }

    String[] sentences = input.trim().split("[.!?]+");
    return sentences.length;
  }

  /**
   * Count the number of newline characters ('\n') in a string.
   *
   * @param input the string to be counted
   * @return the number of newline characters in the string, or 0 if the string is null or empty
   */
  public static int countNewLines(String input) {
    if (input == null || input.isEmpty()) {
      return 0;
    }

    int count = 0;
    for (char c : input.toCharArray()) {
      if (c == '\n') {
        count++;
      }
    }

    return count;
  }

  /**
   * Count the number of line breaks ("\r" or "\n") in a string.
   *
   * @param input the string to be counted
   * @return the number of line breaks in the string, or 0 if the string is null or empty
   */
  public static int countLineBreaks(String input) {
    if (input == null || input.isEmpty()) {
      return 0;
    }

    int count = 0;
    for (char c : input.toCharArray()) {
      if (c == '\r' || c == '\n') {
        count++;
      }
    }

    return count;
  }

  /**
   * Find the index of a specific character in a string.
   *
   * @param input the string to be searched
   * @param character the character to find
   * @return the index of first occurrence of the specific character, or -1 if the string is null, empty or the character does not exist
   */
  public static int indexOfCharacter(String input, char character) {
    if (input == null || input.isEmpty()) {
      return -1;
    }

    return input.indexOf(character);
  }

  /**
   * Find the index of a specific string in another string.
   *
   * @param input the string to be searched
   * @param searchString the string to find
   * @return the index of first occurrence of the searchString in input, or -1 if either string is null, the input is empty, or the searchString does not exist
   */
  public static int indexOfString(String input, String searchString) {
    if (
      input == null ||
      input.isEmpty() ||
      searchString == null ||
      searchString.isEmpty()
    ) {
      return -1;
    }

    return input.indexOf(searchString);
  }
}
