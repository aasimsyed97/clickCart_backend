package com.clickCart.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	      
	      
	      @GetMapping("/get/{id}")
	      public ResponseEntity<Category> getCategorybyIdHandler(@PathVariable("id") Integer id){ 
	    	  Category category = cService.getCategory(id);
	    	  return new ResponseEntity<>(category,HttpStatus.OK);
	    	  
	      }
	      
	      
	    
	      
	      @GetMapping("/getlist/")
	      public ResponseEntity<List<Category>> getAllCategoryHandler(){ 
	    	  List<Category> list = cService.getAllCategory();
	    	  return new ResponseEntity<>(list,HttpStatus.OK);
	    	  
	      }
	      
	

}
