package com.project.backend.DAO;

import java.util.*;

import com.project.backend.models.User;

public interface UserDAO {
      
	List<User> findAll();

	boolean addUser(User user);

	User getUserById(Long id);

	boolean deleteUser(Long id);
	
	boolean updateUser(User user);

}