package com.beardtrust.webapp.userregistration.dtos;

import lombok.Data;

import java.util.Date;

/**
 * The type User dto.
 */
@Data
public class UserDTO {
	private String username;
	private String email;
	private String phone;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String password;
	private String role;
}
