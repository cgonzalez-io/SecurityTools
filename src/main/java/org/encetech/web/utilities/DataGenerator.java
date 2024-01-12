package org.encetech.web.utilities;

import java.time.LocalDateTime;
import org.encetech.web.schema.Profile;
import org.encetech.web.schema.User;

public class DataGenerator {

  public static User insertUser(String profileName) {
    Profile standardProfile = new Profile();
    String uniqueUserName =
      "standarduser" + LocalDateTime.now() + "@testorg.com";
    return new User(
      "standt",
      "standarduser@testorg.com",
      "UTF-8",
      "Testing",
      "en_US",
      "en_US",
      "standardProfile",
      "America/Los_Angeles",
      uniqueUserName
    );
  }
}
