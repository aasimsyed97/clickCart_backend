package com.clickCart.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.clickCart.Model.Category;
import com.clickCart.Service.CategoryService;

@CrossOrigin
@RestController
public class CategoryController { 
	    
	   @Autowired
	     CategoryService cService;
	 
	     
	      @PostMapping("/create")
	  public ResponseEntity<Category> createCategoryHandler(@RequestBody Category category){ 
		   
		       Category newCategory =  cService.createCategory(category);
		       return new ResponseEntity<Category>(newCategory,HttpStatus.CREATED);
	  }
	

}
