package com.example.springboottest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
/**
 * User entity
 */
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nom;

	private String prenom;

	@Column(unique = true)
	private String email;

	private String pwd;

	@Enumerated(EnumType.STRING)
	private Role role;
	private boolean enabled;

}
