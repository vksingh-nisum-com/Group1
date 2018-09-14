package com.nisum.dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.nisum.dto.Product;
import com.nisum.util.HibernateUtil;

public class ProductDao {
/**
* @param args
*/
	
public Product selectProductByPid(String pid)
{
		Product prod=null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();


		  String hql = "FROM catalog E WHERE E.PId ='"+pid+"'";
		  Query query = session.createQuery(hql);
		  List<Product> results = query.list();
		  
		  
		for(Product p:results)
		{
			prod=p;
			break;
		}
		
		  session.getTransaction().commit();
		  return prod;
}


public void saveProduct(Product s){  
	//    template.save(s);  
		
	    System.out.println("...Saving...");
	    
	    
	    Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(s);
	    session.getTransaction().commit();
	    
	}  
	

}