package com.example.springboottest.service;

import com.example.springboottest.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import com.example.springboottest.repository.UserRepository;


@Service
/**
 * Service class for User entity
 */
public class UserService {

	/**
	 * User repository
	 */
	@Autowired
	private UserRepository userRepository;

	/**
	 * Create a new user
	 * @param user
	 * @return created user
	 */
	public User createUser(User user) {
		try {
			return userRepository.save(user);
		} catch (DataIntegrityViolationException e) {
			throw new RuntimeException("User already exists");
		}
	}

}
