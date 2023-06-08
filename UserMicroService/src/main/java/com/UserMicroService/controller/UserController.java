package com.UserMicroService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.UserMicroService.entitty.User;
import com.UserMicroService.service.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId")int userId)
	{
		User user= userServiceImpl.getUser(userId);
		
		List contacts = this.restTemplate.getForObject("http://localhost:9002/contact/"+user.getId(),List.class);
		
		user.setContact(contacts);
		
		return user;
		
	}
}
