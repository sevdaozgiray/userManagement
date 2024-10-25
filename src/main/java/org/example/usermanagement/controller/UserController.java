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


  @GetMapping
  public User getUser() {

    return new User();
  }

  @GetMapping("/json")
  public UserJson getUserJson() {
    return new UserJson();
  }


}
