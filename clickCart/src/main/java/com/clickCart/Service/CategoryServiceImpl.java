package com.clickCart.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clickCart.Exceptions.CategoryException;
import com.clickCart.Model.Category;
import com.clickCart.Repository.CategoryRepo;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	 CategoryRepo cRepo;
	
	@Override
	public Category createCategory(Category category) throws CategoryException {
		// TODO Auto-generated method stub 
		    Category savedCategory =  cRepo.save(category);
		return savedCategory;
	}

	@Override
	public Category getCategory(Integer id) throws CategoryException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category deleteCategory(Integer id) throws CategoryException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> getAllCategory() throws CategoryException {
		// TODO Auto-generated method stub
		return null;
	}

}
