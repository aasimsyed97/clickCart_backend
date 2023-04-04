package com.clickCart.Service;

import java.util.List;

import com.clickCart.Exceptions.CategoryException;
import com.clickCart.Model.Category;

public interface CategoryService {
 
	 public Category createCategory(Category category)throws CategoryException; 
	  public Category getCategory(Integer id)throws CategoryException;
	  public Category deleteCategory(Integer id)throws CategoryException;
	  public List<Category> getAllCategory()throws CategoryException;
}
