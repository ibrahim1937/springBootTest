package com.example.springboottest.service;

import com.example.springboottest.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.springboottest.repository.UserRepository;


@Service
@RequiredArgsConstructor
/**
 * Service class for User entity
 */
public class UserService {

	/**
	 * User repository
	 */
	private final UserRepository userRepository;

	/**
	 * Create a new user
	 * @param user
	 * @return created user
	 */
	public User createUser(User user) {
		return userRepository.save(user);
	}

}
