package org.encetech.web.security;

import java.security.SecureRandom;
import java.util.Random;

public class PasswordGenerator {
  private static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  private static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
  private static final String DIGITS = "0123456789";
  private static final String SPECIAL_CHARACTERS = "!@#$%^&*()";
  public static final int DEFAULT_LENGTH = 8;
  private static final String CHARACTERS =
    UPPERCASE_LETTERS + LOWERCASE_LETTERS + DIGITS + SPECIAL_CHARACTERS;

  private final Random random;

  //instance for secure random
  public PasswordGenerator() {
    random = new SecureRandom();
  }

  //default constructor using secure random
  public String generatePassword() {
    StringBuilder password = new StringBuilder(DEFAULT_LENGTH);
    for (int i = 0; i < DEFAULT_LENGTH; i++) {
      int randomIndex = random.nextInt(CHARACTERS.length());
      password.append(CHARACTERS.charAt(randomIndex));
    }
    return password.toString();
  }

  //constructor with length parameter
  public String generatePassword(int length) {
    StringBuilder password = new StringBuilder();

    // Generate the first two characters as uppercase letters
    password.append(generateRandomCharacter(UPPERCASE_LETTERS));
    password.append(generateRandomCharacter(UPPERCASE_LETTERS));

    // Generate the remaining characters
    for (int i = 2; i < length - 2; i++) {
      if (i % 2 == 0) {
        // Generate a digit
        password.append(generateRandomCharacter(DIGITS));
      } else {
        // Generate a special character
        password.append(generateRandomCharacter(SPECIAL_CHARACTERS));
      }
    }

    // Generate the last two characters as lowercase letters
    password.append(generateRandomCharacter(LOWERCASE_LETTERS));
    password.append(generateRandomCharacter(LOWERCASE_LETTERS));

    return password.toString();
  }

  //changing method to secure random instead of math random for security
  private char generateRandomCharacter(String characters) {
    int index = random.nextInt(characters.length());
    return characters.charAt(index);
  }
}
