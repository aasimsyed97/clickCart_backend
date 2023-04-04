package com.clickCart.Service;

import com.clickCart.Exceptions.CategoryException;
import com.clickCart.Model.Category;

public interface CategoryService {
 
	 public Category createCategory(Category category)throws CategoryException;
}
