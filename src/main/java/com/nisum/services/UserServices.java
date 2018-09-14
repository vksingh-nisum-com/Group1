package com.nisum.services;
import java.util.Iterator;
import java.util.List;

import com.nisum.dao.User;
import com.nisum.dto.DatabaseConnector;

public class UserServices {
	public User setValues(String fullname,String username, String email,String password,String phone) {
		User user=new User();
		user.setFullName(fullname);
		user.setUserName(username);
		user.setEmail(email);
		user.setPassword(password);
		user.setPhone(phone);
		return user;
	}
	public String encrypted(String password) {
		String password1="";
		for(int i=0;i<password.length();i++) {
			password1 +=(char)(password.charAt(i)+6);
		}
		// TODO Auto-generated method stub
		return password1;
	}
	public String dycrypted(String password) {
		String password1="";
		for(int i=0;i<password.length();i++) {
			password1 +=(char)(password.charAt(i)+6);
		}
		// TODO Auto-generated method stub
		return password1;
	}
	public boolean checkvaliduser(String username, String password) {
		DatabaseConnector dbcon= new DatabaseConnector();
		List<User> dbobj=dbcon.listEmployees();
		for (Iterator iterator = dbobj.iterator(); iterator.hasNext();){
	          User user = (User) iterator.next(); 
	          if(user.getEmail().equals(username) && user.getPassword().equals(password)) {
	        	  return true;
	          }
	          
	         // System.out.print("Email: " + user.getEmail()); 
	          //System.out.print("  password: " + user.getPassword()); 
	       }
		return false;
		
		
	}

}
