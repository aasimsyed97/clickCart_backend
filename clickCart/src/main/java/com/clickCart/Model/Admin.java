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
	public Integer getAdminId() {
		return adminId;
	}
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
     
	
       
}
