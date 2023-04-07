package com.clickCart.Service;

import java.util.List;

import com.clickCart.Exceptions.ProductException;
import com.clickCart.Model.Product;

public interface ProductService { 
	 
	  
	
	 public Product createProduct(Product product)throws ProductException; 
	 public Product deleteProduct(Product product)throws ProductException;
	 public Product getProdcut(Integer id)throws ProductException;
	 public List<Product> getAllProduct()throws ProductException;
	 public List<Product>getProductByName()throws ProductException;
	 

}
