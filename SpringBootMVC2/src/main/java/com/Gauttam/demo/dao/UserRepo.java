package com.Gauttam.demo.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Gauttam.demo.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	List<User> getUserByUname(String uname);


	

}
