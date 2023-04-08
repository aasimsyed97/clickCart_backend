package com.clickCart.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Cart {
      @jakarta.persistence.Id
      @GeneratedValue(strategy = GenerationType.AUTO)
	 private Integer Id;
	 private  Integer total;
	 private String name;
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(Integer id, Integer total, String name) {
		super();
		Id = id;
		this.total = total;
		this.name = name;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
	 
	 
}
