package com.ContactMicroService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ContactMicroService.entities.Contact;
import com.ContactMicroService.services.ContactServiceImpl;

@RestController
@RequestMapping("/contact")
public class ContactController {

	@Autowired
	private ContactServiceImpl contactServiceImpl;
	
	
	@GetMapping("/{userId}")
	public List<Contact> getContact(@PathVariable("userId")int userId) {
		return contactServiceImpl.getContact(userId);
	}
}
