package com.Gauttam.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Gauttam.demo.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
