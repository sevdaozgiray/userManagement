package org.example.usermanagement.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Author Sevda Ozgiray Bozkurt
 *
 * @create 21.10.2024 16:37
 */
public class User {
  private Long id;

  private String username;

  private String password;

  private String email;

  private String username1;

  private String password1;

  private String email1;

  private String username2;

  private String password2;

  private String email2;

  private String username3;

  private String password3;

  private String email3;

  private String username4;

  private String password4;

  public String getUsername3() {
    return username3;
  }

  public void setUsername3(String username3) {
    this.username3 = username3;
  }

  public String getPassword3() {
    return password3;
  }

  public void setPassword3(String password3) {
    this.password3 = password3;
  }

  public String getEmail3() {
    return email3;
  }

  public void setEmail3(String email3) {
    this.email3 = email3;
  }

  public String getUsername4() {
    return username4;
  }

  public void setUsername4(String username4) {
    this.username4 = username4;
  }

  public String getPassword4() {
    return password4;
  }

  public void setPassword4(String password4) {
    this.password4 = password4;
  }

  public String getEmail4() {
    return email4;
  }

  public void setEmail4(String email4) {
    this.email4 = email4;
  }

  private String email4;

  public String getUsername1() {
    return username1;
  }

  public void setUsername1(String username1) {
    this.username1 = username1;
  }

  public String getPassword1() {
    return password1;
  }

  public void setPassword1(String password1) {
    this.password1 = password1;
  }

  public String getEmail1() {
    return email1;
  }

  public void setEmail1(String email1) {
    this.email1 = email1;
  }

  public String getUsername2() {
    return username2;
  }

  public void setUsername2(String username2) {
    this.username2 = username2;
  }

  public String getPassword2() {
    return password2;
  }

  public void setPassword2(String password2) {
    this.password2 = password2;
  }

  public String getEmail2() {
    return email2;
  }

  public void setEmail2(String email2) {
    this.email2 = email2;
  }

  public User() {
  }

  public User(Long id, String username, String password, String email) {
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
