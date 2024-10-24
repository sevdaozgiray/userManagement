package org.example.usermanagement.test;

import org.example.usermanagement.model.User;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @Author Sevda Ozgiray Bozkurt
 *
 * @create 24.10.2024 09:52
 */
public class JsonTest {
  public static void main(String[] args) {
    User user = new User(1L, "sevda", "password123", "sevda@example.com");
    ObjectMapper mapper = new ObjectMapper();

    try {
      // Serileştirme işlemi
      String jsonResult = mapper.writeValueAsString(user);
      System.out.println("Serileştirilmiş JSON: " + jsonResult);

      // Deserializasyon işlemi
      User deserializedUser = mapper.readValue(jsonResult, User.class);
      System.out.println("Deserialized Username: " + deserializedUser.getUsername());
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }
  }
}
