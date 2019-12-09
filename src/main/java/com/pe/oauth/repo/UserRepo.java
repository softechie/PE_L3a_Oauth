package com.pe.oauth.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pe.oauth.model.UserModel;

@Repository
public interface UserRepo extends CrudRepository<UserModel, Integer> {
	
	UserModel findByUsername(String username);
	
}