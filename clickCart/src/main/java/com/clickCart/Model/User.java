package com.clickCart.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	private String name;
	private String userName;
	private String email;
	private String password;
	private String mobile;
	
	 
	public User() {
		
	}


	public User(Integer userId, String name, String userName, String email, String password, String mobile) {
		super();
		this.userId = userId;
		this.name = name;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
	} 
	
	

}
