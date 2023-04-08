package com.clickCart.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Cart {
      @jakarta.persistence.Id
      @GeneratedValue(strategy = GenerationType.AUTO)
	 private Integer Id;
	 
}
