package DAO_Implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DAO.ContactDAO;
import DB_Utility.DbConfig;
import models.Contact;

public class ContactDaoImp implements ContactDAO {
	
	Connection conn = DbConfig.getConection();

	@Override
	public List<Contact> findAll() {
		
		List<Contact> contacts = new ArrayList<>();
		String sql = "select * from contact";
		
		try {
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				
				Long contactId = rs.getLong("contact_id");
				Long userId = rs.getLong("user_id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String phoneNo = rs.getString("phone_no");
				String message = rs.getString("message");

				
				Contact contact = new Contact(contactId,userId,name,email,phoneNo,message);
				contacts.add(contact);
			}
			
			return contacts;
			
			
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean addContact(Contact contact) {
		// TODO Auto-generated method stub
        String sql = "insert into contact (contact_id,user_id,name,email,phone_no,message) "
        		+ "values(?,?,?,?,?,?)";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setLong(1, contact.getContactId());
			ps.setLong(2, contact.getUserId());
			ps.setString(3, contact.getName());
			ps.setString(4, contact.getEmail());
			ps.setString(5, contact.getPhoneNo());
			ps.setString(6, contact.getMessage());
			
			
			ps.executeUpdate();
			return true;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Contact getContactById(Long contactId) {
		
        String sql = "select * from contact where contact_id = ?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);			
			ps.setLong(1, contactId);
			
			ResultSet rs = ps.executeQuery();
			
			Contact contact = null;
			
			while(rs.next()) {
			
				Long cId = rs.getLong("contact_id");
				Long userId = rs.getLong("user_id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String phoneNo = rs.getString("phone_no");
				String message = rs.getString("message");
				
			    contact = new Contact(cId,userId,name,email,phoneNo,message);
			}
			
			return contact;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteContact(Long id) {
		
	       String sql = "delete from contact where contact_id =?";
		    
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
	public boolean updateContact(Contact contact) {
		
		String sql = "update contact set user_id=?,name=?,email=?,phone_no=?,message=? where contact_id=?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setLong(1, contact.getUserId());
			ps.setString(2, contact.getName());
			ps.setString(3, contact.getEmail());
			ps.setString(4, contact.getPhoneNo());
			ps.setString(5, contact.getMessage());
			ps.setLong(6, contact.getContactId());
			
			ps.executeUpdate();
			
			return true;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

}
