package org.example.usermanagement.test;

import org.example.usermanagement.model.User;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @Author Sevda Ozgiray Bozkurt
 *
 * @create 23.10.2024 09:56
 */
public class MemoryUsageTest {  public static void main(String[] args) throws JsonProcessingException {
  ObjectMapper mapper = new ObjectMapper();
  Runtime runtime = Runtime.getRuntime();


  long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();


  User user = new User();
  user.setId(1L);
  user.setUsername("johndoe");
  user.setPassword("password123");
  user.setEmail("johndoe@example.com");


  String json = mapper.writeValueAsString(user);


  User deserializedUser = mapper.readValue(json, User.class);

  long usedMemoryAfter = runtime.totalMemory() - runtime.freeMemory();


  System.out.println("Bellek Kullanımı (byte cinsinden): " + (usedMemoryAfter));
}
}
