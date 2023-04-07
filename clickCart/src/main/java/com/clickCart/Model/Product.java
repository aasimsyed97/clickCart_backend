package com.clickCart.Model;


import jakarta.persistence.*;

@Entity
public class Product { 
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	private String name;
	private String desc;
	private String url;
	private Integer price;
	
	  
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Product(Integer id, String name, String desc, String url, Integer price) {
		super();
		Id = id;
		this.name = name;
		this.desc = desc;
		this.url = url;
		this.price = price;
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


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
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
