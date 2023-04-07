package com.clickCart.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clickCart.Exceptions.ProductException;
import com.clickCart.Model.Product;
import com.clickCart.Service.ProductService;

@RestController
public class ProductController {
	
	
	@Autowired
	ProductService pService;
	
	@RequestMapping("/product")
	public ResponseEntity<Product> createProductHandler(@RequestBody Product product) throws ProductException{ 
		 
		 Product p = pService.createProduct(product);
		 
		 return new ResponseEntity<Product>(p,HttpStatus.CREATED);
	}

}
