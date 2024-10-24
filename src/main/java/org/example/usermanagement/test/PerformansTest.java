package org.example.usermanagement.test;

import org.example.usermanagement.model.User;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @Author Sevda Ozgiray Bozkurt
 *
 * @create 23.10.2024 09:53
 */
public class PerformansTest { public static void main(String[] args) throws JsonProcessingException {

  ObjectMapper mapper = new ObjectMapper();


  User user = new User();
  user.setId(1L);
  user.setUsername("johndoe");
  user.setPassword("password123");
  user.setEmail("johndoe@example.com");


  long startTimeSerialization = System.nanoTime();
  String json = mapper.writeValueAsString(user);
  long endTimeSerialization = System.nanoTime();

  System.out.println("Serileştirme Süresi: " + (endTimeSerialization - startTimeSerialization) + " nanoseconds");


  long startTimeDeserialization = System.nanoTime();
  User deserializedUser = mapper.readValue(json, User.class);
  long endTimeDeserialization = System.nanoTime();

  System.out.println("Deserializasyon Süresi: " + (endTimeDeserialization - startTimeDeserialization) + " nanoseconds");
}
}