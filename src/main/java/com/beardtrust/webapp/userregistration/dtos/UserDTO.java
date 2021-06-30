package com.beardtrust.webapp.userregistration.dtos;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * The type User dto.
 */
@Data
public class UserDTO {
	@NotNull(message = "First name cannot be null")
	@Size(min=2, message = "Username is too short")
	private String username;
	@NotNull
	@Email
	private String email;
	@NotNull
	private String phone;
	@NotNull
	private String firstName;
	private String lastName;
	@NotNull
	private Date dateOfBirth;
	@NotNull
	private String password;
	@NotNull
	@Size(min=4, max=4, message="Role names are exactly four characters in length")
	private String role;
}
