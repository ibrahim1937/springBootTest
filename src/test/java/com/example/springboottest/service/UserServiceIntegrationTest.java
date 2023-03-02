package com.example.springboottest.service;

import com.example.springboottest.entity.Role;
import com.example.springboottest.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserServiceIntegrationTest {

    @Autowired
    private UserService userService;

    @Test
    public void createUserTest() {

        // Create a user
        User user = new User();
        user.setNom("Chahboune");
        user.setPrenom("Ibrahim");
        user.setEmail("ibrahimchahboune@gmail.com");
        user.setPwd("123456");
        user.setRole(Role.USER);

        // Test adding the user
        User newUser = userService.createUser(user);

        // Verify the addition
        assertNotNull(newUser);
        assertNotNull(newUser.getId());
        assertEquals("Chahboune", newUser.getNom());
        assertEquals("Ibrahim", newUser.getPrenom());
        assertEquals("ibrahimchahboune@gmail.com", newUser.getEmail());
        assertEquals("123456", newUser.getPwd());
        assertEquals(Role.USER, newUser.getRole());

    }
}
