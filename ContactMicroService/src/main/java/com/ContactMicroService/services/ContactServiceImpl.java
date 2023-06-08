package com.ContactMicroService.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ContactMicroService.entities.Contact;

@Service
public class ContactServiceImpl implements ContactService {
	
	List<Contact> list = List.of(
			new Contact(101,"7500495652","Dariyapur",1),
			new Contact(102,"9690867474","Noida",1),
			new Contact(103,"7351557219","Delhi",1),
			new Contact(104,"8877665566","Kali Nadi",2),
			new Contact(104,"6655898789","Delhi",2)
			);

	@Override
	public List<Contact> getContact(int userId) {
		
		return this.list.stream().filter(e->e.getUserId()==userId).collect(Collectors.toList());
	}
}
