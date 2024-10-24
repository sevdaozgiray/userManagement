package org.example.usermanagement.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Author Sevda Ozgiray Bozkurt
 *
 * @create 21.10.2024 16:37
 */
public class UserJson {
  @JsonProperty(value = "identity")
  private Long id;

  @JsonProperty(value = "user_name")
  private String username;

  @JsonProperty(value = "sıfre")
  private String password;

  @JsonProperty(value = "e-mail")
  private String email;

  public UserJson() {
  }

  public UserJson(Long id, String username, String password, String email) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.email = email;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
