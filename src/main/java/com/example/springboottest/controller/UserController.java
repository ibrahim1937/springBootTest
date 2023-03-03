package com.example.springboottest.controller;

import com.example.springboottest.entity.User;
import com.example.springboottest.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public String createUser(@RequestBody User user) throws RuntimeException {

        try {
            userService.createUser(user);
            return "success";
        } catch (RuntimeException e) {
            return "failure";
        }

    }

}
