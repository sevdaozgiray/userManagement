package org.example.usermanagement.controller;

import java.util.List;

import org.example.usermanagement.model.User;
import org.example.usermanagement.model.UserJson;
import org.example.usermanagement.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Sevda Ozgiray Bozkurt
 *
 * @create 21.10.2024 16:36
 */
@RestController
@RequestMapping("/api/users")
public class UserController {

  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }


  @PostMapping
  public User createUser(@RequestBody User user) {
    return userService.saveUser(user);
  }
  @PostMapping("/json")
  public UserJson createUser(@RequestBody UserJson userJson) {
    return userService.saveUserJson(userJson);
  }


  @GetMapping
  public List<User> getUsers() {
    return userService.getAllUsers();
  }


  @GetMapping("/{id}")
  public User getUserById(@PathVariable Long id) {
    return userService.getUserById(id);
  }
}
