package com.SpringBootMVC.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootMVC.demo.domain.User;
import com.SpringBootMVC.demo.repository.UserRepository;
import com.SpringBootMVC.demo.services.exceptions.UserNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> listAll(){
		return (List<User>) repo.findAll();
	}
	
	public void save(User user) {
		repo.save(user);
	}
	
	public User get(Integer id) throws UserNotFoundException{
		Optional<User> result = repo.findById(id);
		if(result.isPresent()) {
			return result.get();
		}
		throw new UserNotFoundException("Could not find users with Id " + id);
		
	}
	
	public void delete(Integer id){
		repo.deleteById(id);
		
	}
}
