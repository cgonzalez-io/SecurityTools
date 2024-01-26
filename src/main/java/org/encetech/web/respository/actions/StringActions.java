package org.encetech.web.respository.actions;

import java.util.*;

/**
 * This Class makes certain operations on a String.
 * All the operations are related to its member variables, such as replacing characters
 */
public class StringActions {
  private String input;
  private List<Integer> indexes;
  private Set<Character> targetCharacters;
  private Map<Character, List<Character>> replacementRules;
  private Random random;

  /**
   * Constructor for the StringActions class. Will initialize the replacementRules and indexes lists.
   *
   * @param input                 The original String on which operations will be performed
   * @param targetCharacters      The set of characters that are considered for certain operations
   */
  public StringActions(String input, Set<Character> targetCharacters) {
    this.input = input;
    this.indexes = new ArrayList<>();
    this.targetCharacters =
      targetCharacters == null
        ? new HashSet<>()
        : new HashSet<>(targetCharacters);
    this.replacementRules = new HashMap<>();
    this.random = new Random();
    initializeReplacementRules();
    findIndexes();
  }

  /**
   * Initializes the replacement rules that would be used in replaceCharacters function
   */
  private void initializeReplacementRules() {
    replacementRules.put('a', List.of('@', '4'));
    replacementRules.put('e', List.of('3', '€'));
    replacementRules.put('i', List.of('1', '!'));
    replacementRules.put('o', List.of('0', '8'));
    replacementRules.put('u', List.of('v', 'w'));
    // Add more vowel rules here
  }

  /**
   * Adds a target character to the list of target characters.
   * Recomputes the indexes if the character is newly added.
   *
   * @param character         character to be added to targetCharacters list
   */
  public void addTargetCharacter(char character) {
    if (targetCharacters.add(character)) {
      findIndexes(); // Update indexes if a new character is added
    }
  }

  /**
   * Finds the indexes of the characters in the targetCharacters set and stores them.
   */
  private void findIndexes() {
    indexes.clear();
    for (int i = 0; i < input.length(); i++) {
      if (targetCharacters.contains(input.charAt(i))) {
        indexes.add(i);
      }
    }
  }

  /**
   * Returns the index of the given character in the input string.
   *
   * @param character         character to find in the input string
   * @return                  the index of the character (if found), otherwise -1
   */
  public int indexOfCharacter(char character) {
    return input.indexOf(character);
  }

  /**
   * Returns the index of the given searchString in the input string.
   *
   * @param searchString      string to find in the input string
   * @return                  the index of the start of the searchString (if found), otherwise -1
   */
  public int indexOfString(String searchString) {
    return input.indexOf(searchString);
  }

  /**
   * Replaces the target characters in the input string with certain other characters depending on the replacement rules.
   */
  public void replaceCharacters() {
    StringBuilder sb = new StringBuilder(input);
    for (int index : indexes) {
      char currentChar = input.charAt(index);
      if (replacementRules.containsKey(currentChar)) {
        List<Character> possibleReplacements = replacementRules.get(
          currentChar
        );
        char replacement = possibleReplacements.get(
          random.nextInt(possibleReplacements.size())
        );
        sb.setCharAt(index, replacement);
      }
    }
    input = sb.toString();
  }

  /**
   * Returns the modified input string after operations are performed on it.
   *
   * @return          the modified input string
   */
  public String getInput() {
    return input;
  }
}
