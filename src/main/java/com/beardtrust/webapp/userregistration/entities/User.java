package com.beardtrust.webapp.userregistration.entities;

import com.beardtrust.webapp.userregistration.dtos.UserDTO;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.UUID;

/**
 * The type User.
 */
@Entity
@Table(name = "users")
@Data
public class User {
	@Id
	private String userId;
	private String username;
	private String password;
	private String email;
	private String phone;
	private String firstName;
	private String lastName;
	@Column(name = "dob")
	private Date dateOfBirth;
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
				Date dateOfBirth, String role) {
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


	/**
	 * Instantiates a new User.
	 *
	 * @param userDTO the user dto
	 */
	public User(UserDTO userDTO) {
		this.userId = UUID.randomUUID().toString();
		this.username = userDTO.getUsername();
		this.password = userDTO.getPassword();
		this.email = userDTO.getEmail();
		this.phone = userDTO.getPhone();
		this.firstName = userDTO.getFirstName();
		this.lastName = userDTO.getLastName();
		this.dateOfBirth = userDTO.getDateOfBirth();
		this.role = userDTO.getRole();
	}
}
