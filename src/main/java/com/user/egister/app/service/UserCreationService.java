package com.user.egister.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.egister.app.dao.UserregisterationDAO;
import com.user.egister.app.entities.User;

@Service
public class UserCreationService {
	
	@Autowired
	private UserregisterationDAO userregisterationDAO;

	public User createUser(User user) {
		// TODO Auto-generated method stub
		return userregisterationDAO.save(user);
	}

/*	public Optional<User> getUserByRole(Integer userId) {
		// TODO Auto-generated method stub
		return userregisterationDAO.findById(userId);
	}*/

	public Optional<User> getUserByRole(Integer userId) {
		// TODO Auto-generated method stub
		return userregisterationDAO.findById(userId);
	}

	
	
	//added newly
	
	/*public Optional<User> findByRoleAndLocation(String userrole, String userlocation) {
		// TODO Auto-generated method stub
		return userregisterationDAO.findByRoleAndLocation(userrole, userlocation);
	}
*/
	
	public Optional<User> findByRoleAndLocation(String userName, String userLocation) {
		// TODO Auto-generated method stub
		return userregisterationDAO.findByRoleAndLocation(userName, userLocation);
	}
}
