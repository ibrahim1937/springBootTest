package com.example.springboottest.repository;

import com.example.springboottest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * User repository
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
