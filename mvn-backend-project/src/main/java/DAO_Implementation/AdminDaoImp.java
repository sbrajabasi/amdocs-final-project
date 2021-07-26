package DAO_Implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DAO.AdminDAO;
import DB_Utility.DbConfig;
import models.Admin;

public class AdminDaoImp implements AdminDAO {

	Connection conn = DbConfig.getConection();
	@Override
	public List<Admin> findAll() {
		
		List<Admin> admins = new ArrayList<>();
		String sql = "select * from admin";
		
		try {
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				
				Long id = rs.getLong("admin_id");
				String name = rs.getString("name");
				String password = rs.getString("password");
				String email = rs.getString("email");

				
				Admin Admin = new Admin(id,name,password,email);
				admins.add(Admin);
			}
			
			return admins;
			
			
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		
		String sql = "insert into admin (admin_id,name,password,email) values(?,?,?,?)";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setLong(1, admin.getId());
			ps.setString(2, admin.getUsername());
			ps.setString(3, admin.getPassword());
			ps.setString(4, admin.getEmail());
			
			
			ps.executeUpdate();
			return true;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public Admin getAdminById(Long adminId) {
		
        String sql = "select * from admin where admin_id = ?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);			
			ps.setLong(1, adminId);
			
			ResultSet rs = ps.executeQuery();
			
			Admin admin = null;
			
			while(rs.next()) {
			Long id = rs.getLong("admin_id");
			String name = rs.getString("name");
			String password = rs.getString("password");
			String email = rs.getString("email");
			
			admin = new Admin(id,name,password,email);
			}
			
			return admin;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteAdmin(Long id) {
		
		
       String sql = "delete from admin where admin_id =?";
	    
	    try {
	    	PreparedStatement ps = conn.prepareStatement(sql);
	    	
	    	ps.setLong(1, id);
	    	
	    	ps.executeUpdate();
	    	
	    	return true;
	    	
	    }catch(SQLException e) {
	    	e.printStackTrace();
	    }
		return false;
	}

	@Override
	public boolean updateAdmin(Admin admin) {
		
		String sql = "update admin set name=?,password=?,email=? where admin_id = ?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, admin.getUsername());
			ps.setString(2, admin.getPassword());
			ps.setString(3, admin.getEmail());
			ps.setLong(4, admin.getId());
			
			ps.executeUpdate();
			
			return true;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}


}
