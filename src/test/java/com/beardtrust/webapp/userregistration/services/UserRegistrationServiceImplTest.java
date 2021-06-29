package com.beardtrust.webapp.userregistration.services;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.beardtrust.webapp.userregistration.dtos.UserDTO;
import com.beardtrust.webapp.userregistration.entities.User;
import com.beardtrust.webapp.userregistration.repos.UserRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {UserRegistrationServiceImpl.class})
@ExtendWith(SpringExtension.class)
public class UserRegistrationServiceImplTest {
	@Autowired
	private UserRegistrationServiceImpl userRegistrationServiceImpl;

	@MockBean
	private UserRepository userRepository;

	@Test
	public void testConstructor() {
		// TODO: This test is incomplete.
		//   Reason: Nothing to assert: the constructed class does not have observers (e.g. getters or public fields).
		//   Add observers (e.g. getters or public fields) to the class.
		//   See https://diff.blue/R002

		new UserRegistrationServiceImpl(mock(UserRepository.class));
	}

	@Test
	public void testRegisterUser() {
		User user = new User();
		user.setLastName("Doe");
		user.setPassword("iloveyou");
		user.setEmail("jane.doe@example.org");
		LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
		user.setDateOfBirth(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
		user.setRole("Role");
		user.setUserId("42");
		user.setUsername("janedoe");
		user.setPhone("4105551212");
		user.setFirstName("Jane");
		when(this.userRepository.save((User) any())).thenReturn(user);
		assertSame(user, this.userRegistrationServiceImpl.registerUser(new UserDTO()));
		verify(this.userRepository).save((User) any());
	}
}

