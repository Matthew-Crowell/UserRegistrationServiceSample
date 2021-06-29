package com.beardtrust.webapp.userregistration.repos;

import com.beardtrust.webapp.userregistration.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface User repository.
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
