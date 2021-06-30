package com.beardtrust.webapp.userregistration.services;

import com.beardtrust.webapp.userregistration.entities.User;
import com.beardtrust.webapp.userregistration.entities.UserRegistration;

/**
 * The interface User registration service.
 */
public interface UserRegistrationService {

	/**
	 * Register user user.
	 *
	 * @param user the user
	 * @return the user
	 */
	User registerUser(UserRegistration user);
}
