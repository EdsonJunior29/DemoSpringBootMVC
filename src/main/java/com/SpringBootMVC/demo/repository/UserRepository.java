package com.SpringBootMVC.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBootMVC.demo.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	public Long countById(Integer id);
}
