package org.encetech.web.utilities;

import java.time.LocalDateTime;
import java.util.List;
import org.encetech.web.entity.Profile;
import org.encetech.web.entity.User;

/**
 * Represents a utility class for creating and manipulating User and Profile objects.
 */
public class DataGenerator {
  private Profile profile = new Profile();
  private User user = new User();

  /**
   * This method inserts a user with a given profile name.
   *
   * @param profileName A string representing the profile name.
   * @return A new User object.
   */
  public static User insertUser(String profileName) {
    Profile standardProfile = new Profile();
    String uniqueUserName =
      "standarduser" + LocalDateTime.now() + "@testorg.com";
    standardProfile.setAlias(uniqueUserName);
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

  /**
   * Sets the profile data.
   *
   * @param profile A Profile object.
   */
  public void setProfile(Profile profile) {
    this.profile = profile;
  }

  /**
   * Sets the user profile data.
   *
   * @param user A User object.
   */
  public void setUser(User user) {
    this.user = user;
  }

  /**
   * Retrieves the profile data.
   *
   * @return A Profile object.
   */
  public Profile getProfile() {
    return this.profile;
  }

  /**
   * Retrieves the user data.
   *
   * @return A User object.
   */
  public User getUser() {
    return this.user;
  }

  /**
   * Assigns permissions to a user.
   *
   * @param user          The User to assign permissions to.
   * @param permission    The permissions to assign.
   */
  public void assignPermission(User user, String permission) {
    Profile profile = getProfile();
    profile.setPermission(permission);
  }

  /**
   * Generates a list of user profiles.
   *
   * @param size The number of user profiles to generate.
   * @return A List of User objects.
   */
  public static List<User> generateUserList(int size) {
    int i = 0;
    List<User> listUser = null;
    while (i != size) {
      listUser.add(
        insertUser("standarduser" + i + LocalDateTime.now() + "@testorg.com")
      );
      i++;
    }
    return listUser;
  }
}
