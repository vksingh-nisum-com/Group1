package com.nisum.dto;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import com.nisum.dao.User;
import com.nisum.util.HibernateUtil;

public class DatabaseConnector {
	
public boolean createNewUser(User user){

		
		if(!user.equals(null)){
			try{
				Session session = HibernateUtil.getSessionFactory().openSession();
				session.beginTransaction();
				session.save(user);
			    session.getTransaction().commit();
			    return true;
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		return false;
	}
public static List<User> listEmployees(){ 
	
	System.out.println("check.........list...............................");
    List<User> employees=null;

	 try {
    Session session = HibernateUtil.getSessionFactory().openSession();
    //Transaction tx = null;
       session.beginTransaction();
        employees = session.createCriteria(User.class).list();

      // List <User> employees = session.createQuery("FROM USER").list(); 
       System.out.println("check.........list.......AFTER QUARY FIRE........................");
       for (Iterator iterator = employees.iterator(); iterator.hasNext();){
          User user = (User) iterator.next(); 
          System.out.print("Email: " + user.getEmail()); 
          System.out.print("  password: " + user.getPassword());           
       }
       session.getTransaction().commit();
       return employees;
    } 
	 catch(Exception e){		 
			e.printStackTrace();
			
		}
	return employees;	
 }
	

}
