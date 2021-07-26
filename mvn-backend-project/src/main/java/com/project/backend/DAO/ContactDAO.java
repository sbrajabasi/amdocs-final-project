package com.project.backend.DAO;

import java.util.List;

import com.project.backend.models.Contact;

public interface ContactDAO {

	List<Contact> findAll();

	boolean addContact(Contact Contact);

	Contact getContactById(Long id);

	boolean deleteContact(Long id);
	
	boolean updateContact(Contact Contact);
}
