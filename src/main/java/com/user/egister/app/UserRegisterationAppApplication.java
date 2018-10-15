package com.user.egister.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.user.egister.app.entities.User;
import com.user.egister.app.service.UserCreationService;

@SpringBootApplication
public class UserRegisterationAppApplication {

	public static void main(String[] args) {
		//SpringApplication.run(UserRegisterationAppApplication.class, args);
		ConfigurableApplicationContext applicationContext = SpringApplication.run(UserRegisterationAppApplication.class, args);
	    
		
		UserCreationService usercreationservice = applicationContext.getBean("userCreationService",UserCreationService.class);
	    User userDet = new User();
	    userDet.setUserName("Prabhu");
	    userDet.setUserRole("Admin");
	    userDet.setUserEmail("EndUser@yahoo.com");
	    userDet.setUserLocation("chennai");
	    //userDet.setUserId(2);
	    
	    usercreationservice.createUser(userDet);
	}
}
