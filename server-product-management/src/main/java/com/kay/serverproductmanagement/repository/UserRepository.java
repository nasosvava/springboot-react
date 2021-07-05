package com.kay.serverproductmanagement.repository;

import com.kay.serverproductmanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
	
	//findBy + fieldName
    Optional<User> findByUsername(String username);
}
