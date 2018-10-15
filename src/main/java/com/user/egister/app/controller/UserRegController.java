package com.user.egister.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.egister.app.entities.User;
import com.user.egister.app.service.UserCreationService;

@RestController
@RequestMapping(value="/api/userdet")
public class UserRegController {
	@Autowired
	private UserCreationService userCreationService;
	@PostMapping(value="/createuser")
    public User createUser(@RequestBody User user) {
		
    	
    	return userCreationService.createUser(user);
    	
    	
    }
	@GetMapping(value="/user/{userId}")
	public Optional<User> getUserByRole( @PathVariable("userId") Integer userId) {
		return userCreationService.getUserByRole(userId);
	}
	
	//added newly
	//UserRole
	@GetMapping(value="/user/{userName}/{userLocation}")
	public Optional<User> getUserByRoleAndLocation( @PathVariable("userName") String userName,@PathVariable("userLocation") String userLocation) {
		return userCreationService.findByRoleAndLocation(userName,userLocation);
	}
	
}
