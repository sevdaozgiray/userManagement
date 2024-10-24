package org.example.usermanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.example.usermanagement.model.User;
import org.example.usermanagement.model.UserJson;
import org.springframework.stereotype.Service;

/**
 * @Author Sevda Ozgiray Bozkurt
 *
 * @create 21.10.2024 16:37
 */
@Service
public class UserService {

  private List<User> users = new ArrayList<>();
  private List<UserJson> userJsons = new ArrayList<>();


  public User saveUser(User user) {
    user.setId((long) (users.size() + 1));
    users.add(user);
    return user;
  }
  public UserJson saveUserJson(UserJson userJson) {
    userJson.setId((long) (users.size() + 1));
    userJsons.add(userJson);
    return userJson;
  }


  public List<User> getAllUsers() {
    return users;
  }


  public User getUserById(Long id) {
    return users.stream()
        .filter(user -> user.getId().equals(id))
        .findFirst()
        .orElse(null);
  }
}
