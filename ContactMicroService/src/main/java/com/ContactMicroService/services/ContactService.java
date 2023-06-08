package com.ContactMicroService.services;

import java.util.List;

import com.ContactMicroService.entities.Contact;

public interface ContactService {

	List<Contact> getContact(int id);
}
