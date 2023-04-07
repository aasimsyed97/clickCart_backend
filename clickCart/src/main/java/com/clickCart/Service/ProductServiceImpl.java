package com.clickCart.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clickCart.Exceptions.ProductException;
import com.clickCart.Model.Product;
import com.clickCart.Repository.ProductRepository;


@Service
public class ProductServiceImpl implements ProductService {
	
	  @Autowired
	  ProductRepository pRepo;
	  
	

	@Override
	public Product createProduct(Product product) throws ProductException {
		// TODO Auto-generated method stub
		 Optional<Product> op = pRepo.findById(product.getId());
		  if(op.isEmpty()) { 
			  throw new ProductException("product with this id already exist");
		  }
		return op.get();
	}

	@Override
	public Product deleteProduct(Product product) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProdcut(Integer id) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProduct() throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductByName() throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

}
