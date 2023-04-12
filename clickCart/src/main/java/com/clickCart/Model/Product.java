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


	public void setName(String name) {
		this.name = name;
	}



	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public Integer getPrice() {
		return price;
	}


	public void setPrice(Integer price) {
		this.price = price;
	} 
	
	
   
	 
}
