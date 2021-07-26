package com.project.backend.DAO;

import java.util.*;

import com.project.backend.models.Admin;

public interface AdminDAO {

	List<Admin> findAll();

	boolean addAdmin(Admin Admin);

	Admin getAdminById(Long id);

	boolean deleteAdmin(Long id);
	
	boolean updateAdmin(Admin Admin);
}
