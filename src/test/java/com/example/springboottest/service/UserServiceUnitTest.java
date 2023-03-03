package com.example.springboottest.service;

import com.example.springboottest.entity.User;
import com.example.springboottest.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class UserServiceUnitTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Before
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void addUserTest() {

        // Create a user
        User user = new User();
        user.setNom("Chahboune");
        user.setPrenom("Ibrahim");


        when(userRepository.save(any(User.class))).thenReturn(user);

        // Save the user
        User newUser = userService.createUser(new User());


        // Verify the save
        assertEquals("Chahboune", newUser.getNom());

    }

}
