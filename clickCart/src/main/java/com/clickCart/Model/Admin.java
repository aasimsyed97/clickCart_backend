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
     
	
}
