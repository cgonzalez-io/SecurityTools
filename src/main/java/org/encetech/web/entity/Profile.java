package org.encetech.web.entity;

import java.util.Date;
import java.util.Objects;

public class Profile extends User {
  private String Bio;
  private String Type;
  private String Location;
  private String Website;
  private String Github;
  private String Twitter;
  private String LinkedIn;
  private String Facebook;
  private String Instagram;
  private Boolean isAdmin;
  private Date timezonedate;
  private String UserCategory;
  private String Permission;

  public Profile(
    String bio,
    String type,
    String location,
    String website,
    String github,
    String twitter,
    String linkedIn,
    String facebook,
    String instagram,
    Boolean isAdmin,
    Date timezonedate,
    String userCategory,
    String permission
  ) {
    Bio = bio;
    Type = type;
    Location = location;
    Website = website;
    Github = github;
    Twitter = twitter;
    LinkedIn = linkedIn;
    Facebook = facebook;
    Instagram = instagram;
    this.isAdmin = isAdmin;
    this.timezonedate = timezonedate;
    UserCategory = userCategory;
    Permission = permission;
  }

  public Profile(
    String Alias,
    String Email,
    String EmailEncodingKey,
    String LastName,
    String LanguageLocaleKey,
    String LocaleSidKey,
    String ProfileId,
    String TimeZoneSidKey,
    String Username,
    String bio,
    String type,
    String location,
    String website,
    String github,
    String twitter,
    String linkedIn,
    String facebook,
    String instagram,
    Boolean isAdmin,
    Date timezonedate,
    String userCategory,
    String permission
  ) {
    super(
      Alias,
      Email,
      EmailEncodingKey,
      LastName,
      LanguageLocaleKey,
      LocaleSidKey,
      ProfileId,
      TimeZoneSidKey,
      Username
    );
    Bio = bio;
    Type = type;
    Location = location;
    Website = website;
    Github = github;
    Twitter = twitter;
    LinkedIn = linkedIn;
    Facebook = facebook;
    Instagram = instagram;
    this.isAdmin = isAdmin;
    this.timezonedate = timezonedate;
    UserCategory = userCategory;
    Permission = permission;
  }

  //default no-arg constructor
  public Profile() {
    super();
  }

  public String getBio() {
    return Bio;
  }

  public void setBio(String bio) {
    Bio = bio;
  }

  public String getType() {
    return Type;
  }

  public void setType(String type) {
    Type = type;
  }

  public String getLocation() {
    return Location;
  }

  public void setLocation(String location) {
    Location = location;
  }

  public String getWebsite() {
    return Website;
  }

  public void setWebsite(String website) {
    Website = website;
  }

  public String getGithub() {
    return Github;
  }

  public void setGithub(String github) {
    Github = github;
  }

  public String getTwitter() {
    return Twitter;
  }

  public void setTwitter(String twitter) {
    Twitter = twitter;
  }

  public String getLinkedIn() {
    return LinkedIn;
  }

  public void setLinkedIn(String linkedIn) {
    LinkedIn = linkedIn;
  }

  public String getFacebook() {
    return Facebook;
  }

  public void setFacebook(String facebook) {
    Facebook = facebook;
  }

  public String getInstagram() {
    return Instagram;
  }

  public void setInstagram(String instagram) {
    Instagram = instagram;
  }

  public Boolean getAdmin() {
    return isAdmin;
  }

  public void setAdmin(Boolean admin) {
    isAdmin = admin;
  }

  public Date getTimezonedate() {
    return timezonedate;
  }

  public void setTimezonedate(Date timezonedate) {
    this.timezonedate = timezonedate;
  }

  public String getUserCategory() {
    return UserCategory;
  }

  public void setUserCategory(String userCategory) {
    UserCategory = userCategory;
  }

  public String getPermission() {
    return Permission;
  }

  public void setPermission(String permission) {
    Permission = permission;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Profile)) return false;
    Profile profile = (Profile) o;
    return (
      Objects.equals(Bio, profile.Bio) &&
      Objects.equals(Type, profile.Type) &&
      Objects.equals(Location, profile.Location) &&
      Objects.equals(Website, profile.Website) &&
      Objects.equals(Github, profile.Github) &&
      Objects.equals(Twitter, profile.Twitter) &&
      Objects.equals(LinkedIn, profile.LinkedIn) &&
      Objects.equals(Facebook, profile.Facebook) &&
      Objects.equals(Instagram, profile.Instagram) &&
      Objects.equals(isAdmin, profile.isAdmin) &&
      Objects.equals(timezonedate, profile.timezonedate) &&
      Objects.equals(UserCategory, profile.UserCategory) &&
      Objects.equals(Permission, profile.Permission)
    );
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      Bio,
      Type,
      Location,
      Website,
      Github,
      Twitter,
      LinkedIn,
      Facebook,
      Instagram,
      isAdmin,
      timezonedate,
      UserCategory,
      Permission
    );
  }

  @Override
  public String toString() {
    return (
      "Profile{" +
      "Bio='" +
      Bio +
      '\'' +
      ", Type='" +
      Type +
      '\'' +
      ", Location='" +
      Location +
      '\'' +
      ", Website='" +
      Website +
      '\'' +
      ", Github='" +
      Github +
      '\'' +
      ", Twitter='" +
      Twitter +
      '\'' +
      ", LinkedIn='" +
      LinkedIn +
      '\'' +
      ", Facebook='" +
      Facebook +
      '\'' +
      ", Instagram='" +
      Instagram +
      '\'' +
      ", isAdmin=" +
      isAdmin +
      ", timezonedate=" +
      timezonedate +
      ", UserCategory='" +
      UserCategory +
      '\'' +
      ", Permission='" +
      Permission +
      '\'' +
      '}'
    );
  }
}
