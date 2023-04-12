package com.clickCart.Model;


import jakarta.persistence.*;

@Entity
public class Product { 
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	private String name;
	private String description;
	private String url;
	private Integer price;
	
	  
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Integer getId() {
		return Id;
	}


	public void setId(Integer id) {
		Id = id;
	}


	public String getName() {
		return name;
	}


   
	 
}
