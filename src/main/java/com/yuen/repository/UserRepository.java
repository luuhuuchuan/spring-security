package com.yuen.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yuen.domain.Users;

@Repository
public interface UserRepository extends CrudRepository<Users, Integer> {
	
	Users findByUsername(String username);
	
}
