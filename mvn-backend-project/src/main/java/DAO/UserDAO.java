package DAO;

import java.util.*;
import models.User;

public interface UserDAO {
      
	List<User> findAll();

	boolean addUser(User user);

	User getUserById(Long id);

	boolean deleteUser(Long id);
	
	boolean updateUser(User user);

}