package com.user.egister.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_dettab")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="user_id")
	
	private Integer userId;
	@Column(name="user_location",nullable=false)
	private String userLocation;
	
	@Column(name="user_name",nullable=false)
	private String userName;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Column(name="user_email",nullable=false)
	private String userEmail;
	@Column(name="User_role",nullable=false)
	private String UserRole;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserLocation() {
		return userLocation;
	}
	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserRole() {
		return UserRole;
	}
	public void setUserRole(String userRole) {
		UserRole = userRole;
	}
	
	
}
