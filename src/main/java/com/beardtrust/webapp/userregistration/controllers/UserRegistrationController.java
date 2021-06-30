package com.beardtrust.webapp.userregistration.controllers;


import com.beardtrust.webapp.userregistration.api.UsersApi;
import com.beardtrust.webapp.userregistration.entities.UserRegistration;
import com.beardtrust.webapp.userregistration.services.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.ws.rs.Consumes;

/**
 * The type User registration controller.
 */
@RestController
@CrossOrigin
public class UserRegistrationController implements UsersApi {

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

	@Override
	public ResponseEntity<Void> registerUser(@Valid @RequestBody UserRegistration body) {
		ResponseEntity<Void> response;
		if(userRegistrationService.registerUser(body) != null){
			response = new ResponseEntity<>(HttpStatus.OK);
		} else {
			response = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return response;
	}
}
