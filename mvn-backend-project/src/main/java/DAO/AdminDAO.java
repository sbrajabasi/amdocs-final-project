package DAO;

import java.util.*;

import models.Admin;

public interface AdminDAO {

	List<Admin> findAll();

	boolean addAdmin(Admin Admin);

	Admin getAdminById(Long id);

	boolean deleteAdmin(Long id);
	
	boolean updateAdmin(Admin Admin);
}
