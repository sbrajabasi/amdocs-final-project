package com.project.backend.DAO_Implementation;

import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.project.backend.DAO.UserDAO;
import com.project.backend.DB_Utility.DbConfig;
import com.project.backend.models.User;

public class UserDaoImp implements UserDAO {
	
	Connection conn = DbConfig.getConection();

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		
		List<User> users = new ArrayList<>();
		String sql = "select * from user1";
		
		try {
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				
				Long id = rs.getLong("user_id");
				String name = rs.getString("name");
				String password = rs.getString("password");
				String email = rs.getString("email");

				String address = rs.getString("address");
				String phoneNo = rs.getString("phone_no");
				String photo = rs.getString("upload_photo");
				String regDate = rs.getString("reg_date");

				
				User user = new User(id,name,password,phoneNo,email,regDate,address,photo);
				users.add(user);
			}
			
			return users;
			
			
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		
		String sql = "insert into user1(name,phone_no,email,address,reg_date,password,upload_photo,user_id)"
				+ " values(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPhoneNo());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getAddress());
			ps.setString(5, user.getRegDate());
			ps.setString(6, user.getPassword());
			ps.setString(7, user.getPhoto());
			ps.setLong(8, user.getId());
			
			ps.executeUpdate();
			
			return true;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public User getUserById(Long userId) {
		// TODO Auto-generated method stub
		
		String sql = "select * from user1 where user_id = ?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);			
			ps.setLong(1, userId);
			
			ResultSet rs = ps.executeQuery();
			
			User user = null;
			
			while(rs.next()) {
			Long id = rs.getLong("user_id");
			String name = rs.getString("name");
			String password = rs.getString("password");
			String email = rs.getString("email");

			String address = rs.getString("address");
			String phoneNo = rs.getString("phone_no");
			String photo = rs.getString("upload_photo");
			String regDate = rs.getString("reg_date");
			
			user = new User(id,name,password,phoneNo,email,regDate,address,photo);
			}
			
			return user;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteUser(Long id) {
		// TODO Auto-generated method stub
		
	    String sql = "delete from user1 where user_id =?";
	    
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
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		
		String sql = "update user1 set name=?,phone_no=?,email=?,address=?,"
				+ "reg_date=?,password=?,upload_photo=? where user_id = ?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPhoneNo());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getAddress());
			ps.setString(5, user.getRegDate());
			ps.setString(6, user.getPassword());
			ps.setString(7, user.getPhoto());
			ps.setLong(8, user.getId());
			
			ps.executeUpdate();
			
			return true;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

}
