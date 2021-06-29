package com.beardtrust.webapp.userregistration.services;

import com.beardtrust.webapp.userregistration.controllers.UserRegistrationController;
import com.beardtrust.webapp.userregistration.dtos.UserDTO;
import com.beardtrust.webapp.userregistration.entities.User;
import com.beardtrust.webapp.userregistration.repos.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserRegistrationController.class);
	private final UserRepository userRepository;

	@Autowired
	public UserRegistrationServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User registerUser(UserDTO user) {

		return userRepository.save(new User(user));
	}
}
