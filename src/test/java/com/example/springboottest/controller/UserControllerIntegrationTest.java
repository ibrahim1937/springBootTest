package com.example.springboottest.controller;

import com.example.springboottest.entity.Role;
import com.example.springboottest.entity.User;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.MethodName.class)
public class UserControllerIntegrationTest {

    @Autowired
    UserController userController;

    @Test
    public void createUserTestA() {

        User user = new User();
        user.setNom("Chahboune");
        user.setPrenom("Ibrahim");
        user.setEmail("email@email.com");
        user.setPwd("123456");
        user.setRole(Role.USER);

        // POST our user to the controller
        String outcome = userController.createUser(user);

        // Verify the addition
        assertThat(outcome, is(equalTo("success")));
    }

    @Test
    public void createUserTestB(){

        User user = new User();
        user.setEmail("email@email.com");

        // POST our user to the controller
        String outcome = userController.createUser(user);

        // Verify the addition
        assertThat(outcome, is(equalTo("failure")));

    }

}
