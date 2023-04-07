package com.clickCart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clickCart.Model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
