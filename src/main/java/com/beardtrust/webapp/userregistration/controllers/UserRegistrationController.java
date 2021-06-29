package com.beardtrust.webapp.userregistration.controllers;

import com.beardtrust.webapp.userregistration.dtos.UserDTO;
import com.beardtrust.webapp.userregistration.entities.User;
import com.beardtrust.webapp.userregistration.services.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * The type User registration controller.
 */
@RestController
@CrossOrigin
@RequestMapping(path = "/users")
public class UserRegistrationController {
	private final UserRegistrationService userRegistrationService;

	/**
	 * Instantiates a new User registration controller.
	 *
	 * @param userRegistrationService the user registration service
	 */
	@Autowired
	public UserRegistrationController(UserRegistrationService userRegistrationService) {
		this.userRegistrationService = userRegistrationService;
	}

	/**
	 * Register user user.
	 *
	 * @param user the user dto
	 * @return the user
	 */
	@PostMapping
	public ResponseEntity<User> registerUser(@RequestBody UserDTO user) {
		return new ResponseEntity<>(userRegistrationService.registerUser(user), HttpStatus.OK);
	}
}
