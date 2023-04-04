package com.clickCart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clickCart.Model.Category;


@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
