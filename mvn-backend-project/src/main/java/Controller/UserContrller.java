package Controller;

import java.util.*;


import DAO.UserDAO;
import DAO_Implementation.UserDaoImp;
import models.User;

public class UserContrller {

	public static void main(String[] args){

		UserDAO dao = new UserDaoImp();
		
		
//        // Insertion		
//        User user = new User(109L,"sujit","56789","sujit@gmail.com","alipurduar","5th july 2021","hellopass","img6.png");
//		
//		if(dao.addUser(user))
//		System.out.println("Row Added Successfully");
//		else
//			System.out.println("Error , Can't Add");
		
		
		
//		//Deletion
//		if(dao.deleteUser(109L))
//			System.out.println("Row Deleted successfully");
//		
//		else
//			System.out.println("ERROR, can't Delete");

		
//		//Get User by Id
//		User user = dao.getUserById(109L);
//		System.out.println(user);
//		System.out.println();
		
		
//		// Update 
//		user.setUsername("sujit");
//		if(dao.updateUser(user)) {
//			System.out.println("Row Updated successfully");
//		}
//		else
//			System.out.println("Error , Can't Update");
		
		
		
		// Get All Users
		List<User> res = dao.findAll();
		
		for(User u: res) {
			System.out.println(u);
		}
		
		
		
	}

}
