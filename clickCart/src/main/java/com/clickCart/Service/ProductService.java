package com.clickCart.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.clickCart.Exceptions.ProductException;
import com.clickCart.Model.Product;
import com.clickCart.Repository.ProductRepository;

public interface ProductService { 
	 
	  
	
	 public Product createProduct(Product product)throws ProductException; 
	 public Product deleteProduct(Product product)throws ProductException;
	 

}
