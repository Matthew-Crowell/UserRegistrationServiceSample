package com.beardtrust.webapp.userregistration.entities;

import lombok.Data;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

/**
 * The type User.
 */
@Entity
@Table(name = "users")
@Data
public class User implements Serializable {
	@Id
	@Column(unique = true)
	private String userId;
	@Column(unique = true)
	private String username;
	private String password;
	@Column(unique = true)
	private String email;
	@Column(unique = true)
	private String phone;
	private String firstName;
	private String lastName;
	@Column(name = "dob")
	private LocalDate dateOfBirth;
	private String role;

	/**
	 * Instantiates a new User.
	 */
	public User() {
	}

	/**
	 * Instantiates a new User.
	 *
	 * @param username    the username
	 * @param password    the password
	 * @param email       the email
	 * @param phone       the phone
	 * @param firstName   the first name
	 * @param lastName    the last name
	 * @param dateOfBirth the creation date
	 */
	public User(String username, String password, String email,
				String phone, String firstName, String lastName,
				LocalDate dateOfBirth, String role) {
		this.userId = UUID.randomUUID().toString();
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.role = role;
	}

	public User(UserRegistration user) {
		this.userId = UUID.randomUUID().toString();
		this.username = user.getUsername();
		this.password = user.getPassword();
		this.email = user.getEmail();
		this.phone = user.getPhone();
		this.firstName = user.getFirstName();
		this.lastName = user.getLastName();
		this.dateOfBirth = user.getDateOfBirth();
		this.role = user.getRole();
	}
}
