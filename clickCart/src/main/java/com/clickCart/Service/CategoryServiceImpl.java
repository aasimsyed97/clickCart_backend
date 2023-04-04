package com.clickCart.Service;

import java.util.List;
import java.util.Optional;

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
		    Optional <Category>  opt = cRepo.findById(id); 
		     if(opt.isEmpty()) { 
		    	 throw new CategoryException("category does not exist with this id");
		    	 
		     }
		    Category cat = opt.get();
		return cat;
	}

	@Override
	public String deleteCategory(Integer id) throws CategoryException {
		// TODO Auto-generated method stub
		 Optional <Category>  opt = cRepo.findById(id); 
	     if(opt.isEmpty()) { 
	    	 throw new CategoryException("category does not exist with this id");
	    	 
	     }
	    Category cat =  opt.get(); 
	           cRepo.delete(cat);
	return "Category deleted successfully";
	}	

	@Override
	public List<Category> getAllCategory() throws CategoryException {
		// TODO Auto-generated method stub
		List<Category> list = cRepo.findAll() ;
		 if(list.size()==0) { 
			 throw new CategoryException("no category found ");
			 }
		 return list;
		 }
		
}
