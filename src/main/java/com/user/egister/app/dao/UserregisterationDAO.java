package com.user.egister.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.user.egister.app.entities.User;

//@Repository
public interface UserregisterationDAO extends CrudRepository<User, Integer> {

	//added we have to remove

	//@Param("userrole")
	
	//@Param("userlocation")
	
	//@Query("SELECT * FROM user_dettab t where t.User_role = :userRole AND t.user_location = :userLocation")
   
	@Query(value = "SELECT * FROM user_dettab t where t.user_name = :userName AND t.user_location = :userLocation", 
	  nativeQuery = true)
	
	//public Optional<User> findByRoleAndLocation(String userRole, String userLocation);

	public Optional<User> findByRoleAndLocation(String userName, String userLocation);
                                                     
	
	
	/*@Query("SELECT t FROM user_dettab t where t.User_role = :userrole AND t.user_location = :userlocation")
    public Optional<User> findByRoleAndLocation(@Param("userrole") String userRole, 
                                                    @Param("userlocation") String userLocation);
	*/
	/*@Query("SELECT t FROM user_dettab t where t.User_role = :userrole AND t.user_location = :userlocation")
	public Optional<User> findByRoleAndLocation(String userRole, String userLocation);*/
}
