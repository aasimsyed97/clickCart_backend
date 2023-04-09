package com.clickCart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clickCart.Model.User;

public interface UserRepository extends JpaRepository<User, Integer> { 
	

}
