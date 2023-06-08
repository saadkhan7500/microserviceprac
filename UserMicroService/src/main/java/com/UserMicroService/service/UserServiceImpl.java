package com.UserMicroService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UserMicroService.entitty.User;

@Service
public class UserServiceImpl implements UserService {
	

	List<User> list = List.of(
			new User(1,"Mohammad Saad","mohammadsaad7500@gmail.com"),
			new User(2,"Mohammad Aasim Ansari","aasimjazah8@gmail.com"),
			new User(3,"Mohammad Maaz","mohammadmaaz7310@gmail.com"),
			new User(4,"Yasir Khan","yasirkhan8449@gmail.com"),
			new User(5,"Dinesh Lodhi","dineshlodhi833@gmail.com")
			);
	
    @Override
    public User getUser(int id)
    {
    	return this.list.stream().filter(e->e.getId()==id).findAny().orElse(null);
    }
}
