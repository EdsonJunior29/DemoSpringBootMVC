package com.SpringBootMVC.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootMVC.demo.domain.User;
import com.SpringBootMVC.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> listAll(){
		return (List<User>) repo.findAll();
	}
}
