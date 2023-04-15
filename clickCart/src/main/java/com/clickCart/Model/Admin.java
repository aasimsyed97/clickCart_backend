package com.clickCart.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admin {
  
	@Id
	private Integer adminId;
     private String name;
     private String username;
     private String password;
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(Integer adminId, String name, String username, String password) {
		super();
		this.adminId = adminId;
		this.name = name;
		this.username = username;
		this.password = password;
	}

	
       
}
