package com.ojas.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.spring.model.UserRegistration;
import com.ojas.spring.repo.useRepo;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class userController {
	
	@Autowired
	private useRepo user;

	@PostMapping("/register")
	public UserRegistration RegistetUser(@RequestBody UserRegistration userigstration){
		return user.save(userigstration); 
	}
	
	@GetMapping("/login")
	public List<UserRegistration> getUsers(){
		return user.findAll();
	}

}
