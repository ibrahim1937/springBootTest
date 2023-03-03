package com.example.springboottest;

import com.example.springboottest.controller.UserControllerIntegrationTest;
import com.example.springboottest.repository.UserRepositoryIntegrationTest;
import com.example.springboottest.service.UserServiceIntegrationTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        UserServiceIntegrationTest.class,
        UserControllerIntegrationTest.class,
        UserRepositoryIntegrationTest.class
})
public class AddUserFeatureTestSuite {

    // intentionally empty - Test Suite
}
