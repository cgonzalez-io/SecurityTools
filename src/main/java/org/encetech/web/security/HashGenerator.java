package org.encetech.web.security;

import java.security.SecureRandom;
import org.mindrot.jbcrypt.BCrypt;

public class HashGenerator {

  public HashGenerator() {
    SecureRandom random = new SecureRandom();
  }

  public static String generateHash(String password) {
    String salt = BCrypt.gensalt(12);
    String hash = BCrypt.hashpw(password, salt);
    System.out.println(hash);
    return hash;
  }
}
