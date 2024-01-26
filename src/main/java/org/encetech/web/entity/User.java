package org.encetech.web.entity;

public class User extends SObject {
  private String Alias;
  private String Email;
  private String EmailEncodingKey;
  private String LastName;
  private String LanguageLocaleKey;
  private String LocaleSidKey;
  private String ProfileId;
  private String TimeZoneSidKey;
  private String Username;

  public User() {
    super();
  }

  public User(
    String Alias,
    String Email,
    String EmailEncodingKey,
    String LastName,
    String LanguageLocaleKey,
    String LocaleSidKey,
    String ProfileId,
    String TimeZoneSidKey,
    String Username
  ) {
    super();
    this.Alias = Alias;
    this.Email = Email;
    this.EmailEncodingKey = EmailEncodingKey;
    this.LastName = LastName;
    this.LanguageLocaleKey = LanguageLocaleKey;
    this.LocaleSidKey = LocaleSidKey;
    this.ProfileId = ProfileId;
    this.TimeZoneSidKey = TimeZoneSidKey;
    this.Username = Username;
  }

  public String getAlias() {
    return Alias;
  }

  public void setAlias(String Alias) {
    this.Alias = Alias;
  }

  public String getEmail() {
    return Email;
  }

  public void setEmail(String Email) {
    this.Email = Email;
  }

  public String getEmailEncodingKey() {
    return EmailEncodingKey;
  }

  public void setEmailEncodingKey(String EmailEncodingKey) {
    this.EmailEncodingKey = EmailEncodingKey;
  }

  public String getLastName() {
    return LastName;
  }

  public void setLastName(String LastName) {
    this.LastName = LastName;
  }

  public String getLanguageLocaleKey() {
    return LanguageLocaleKey;
  }

  public void setLanguageLocaleKey(String LanguageLocaleKey) {
    this.LanguageLocaleKey = LanguageLocaleKey;
  }

  public String getLocaleSidKey() {
    return LocaleSidKey;
  }

  public void setLocaleSidKey(String LocaleSidKey) {
    this.LocaleSidKey = LocaleSidKey;
  }

  public String getProfileId() {
    return ProfileId;
  }

  public void setProfileId(String ProfileId) {
    this.ProfileId = ProfileId;
  }

  public String getTimeZoneSidKey() {
    return TimeZoneSidKey;
  }

  public void setTimeZoneSidKey(String TimeZoneSidKey) {
    this.TimeZoneSidKey = TimeZoneSidKey;
  }

  public String getUsername() {
    return Username;
  }

  public void setUsername(String Username) {
    this.Username = Username;
  }
}
