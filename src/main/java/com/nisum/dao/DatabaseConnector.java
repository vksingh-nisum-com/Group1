package com.nisum.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.nisum.entity.CartItem;
import com.nisum.entity.Order;
import com.nisum.entity.Order1;
import com.nisum.entity.Product;
import com.nisum.entity.ShippingDetails;
import com.nisum.entity.User;
import com.nisum.util.HibernateUtil;

public class DatabaseConnector {
	
	
public static boolean createNewUser(User user){
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
       System.out.println("list.. QUARY FIRED.......................");
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
public static boolean registeringDetails(ShippingDetails sd) {
	// TODO Auto-generated method stub
	if(!sd.equals(null)){
		try{
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(sd);
		    session.getTransaction().commit();
		    return true;
		}catch(Exception e){
			e.printStackTrace();
		}
	}	
	
	return false;
}
public static boolean createNewUser(Product prod) {
	// TODO Auto-generated method stub
	
	// TODO Auto-generated method stub
		if(!prod.equals(null)){
			try{
				Session session = HibernateUtil.getSessionFactory().openSession();
				session.beginTransaction();
				session.save(prod);
			    session.getTransaction().commit();
			    return true;
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	return false;
}
public static boolean addtocart(CartItem cartobj) {
	// TODO Auto-generated method stub
	if(!cartobj.equals(null)){
		try{
			
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(cartobj);
		    session.getTransaction().commit();
		    return true;
		}catch(Exception e){
			e.printStackTrace();
		}
	}		
	return false;
	
	
}
public List<CartItem> listItems() {
	// TODO Auto-generated method stub
	
	System.out.println("check.........list...............................");
    List<CartItem> cartItems=null;

    try {
    Session session = HibernateUtil.getSessionFactory().openSession();
    //Transaction tx = null;
       session.beginTransaction();
        cartItems = session.createCriteria(CartItem.class).list();

      // List <User> employees = session.createQuery("FROM USER").list(); 
       System.out.println("list.. QUARY FIRED.......................");
       
       session.getTransaction().commit();
       return cartItems;
    } 
	 catch(Exception e){		 
			e.printStackTrace();
			
		}
		
	
	
	return cartItems;
}
///delete from table create....it
public static boolean createNewProduct(Product product) {
	// TODO Auto-generated method stub
	
	if(!product.equals(null)){
		try{
			System.out.println("before saving to db");	
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(product);
		    session.getTransaction().commit();
			System.out.println("after saving to db");

		    return true;
		}catch(Exception e){
			e.printStackTrace();
		}
	}		
	return false;

}

public List<Product> listProducts() {
	// TODO Auto-generated method stub
	
	System.out.println("check.........list...............................");
    List<Product> productList=null;

    try {
    Session session = HibernateUtil.getSessionFactory().openSession();
    //Transaction tx = null;
       session.beginTransaction();
        productList = session.createCriteria(Product.class).list();

      // List <User> employees = session.createQuery("FROM USER").list(); 
       System.out.println("list.. QUARY FIRED.......................");
      
       session.getTransaction().commit();
       return productList;
    } 
	 catch(Exception e){		 
			e.printStackTrace();
			
		}
		
	
	
	return productList;
}

public boolean deletecartByusername(String userName) {
	// TODO Auto-generated method stub
	CartItem cartitem=new CartItem();
	 try {
		    Session session = HibernateUtil.getSessionFactory().openSession();
		    //Transaction tx = null;
		       session.beginTransaction();
		        
              Query query=session.createQuery("delete from CartItem e where e.username= :username1 ");
              query.setParameter("username1", userName);
              int i=query.executeUpdate();
		      // List <User> employees = session.createQuery("FROM USER").list(); 
		       System.out.println("list.. QUARY FIRED.......................");
		       System.out.println(i+" row deleted..... ..................");
		       session.getTransaction().commit();
		       return true;
		    }  
	 
			 catch(Exception e){		 
					e.printStackTrace();
					
				}
	
	return false;
}
public List<Product> getListOfProductByFilter(String catagory, String subcatagory) {
	try {
	Session session = HibernateUtil.getSessionFactory().openSession();
	 session.beginTransaction();
	
	Query query= session.createQuery("from Product p where p.catagory= :catagory and p.subCatagory= :subcatagory");
	query.setParameter("catagory", catagory);
	query.setParameter("subcatagory", subcatagory);

	List<Product> productlist =query.list();
	session.getTransaction().commit();
	 System.out.println("list.. QUARY FIRED.......................");
     for (Iterator iterator =productlist .iterator(); iterator.hasNext();){
        Product product = (Product) iterator.next(); 
        System.out.print("ProductId: " + product.getpId() +" "+ product.getName()); 
        System.out.print("  Image: " + product.getImg());           
     }
	

	return productlist;
	}catch(Exception e){		 
		e.printStackTrace();
		
	}
	
	return null;
}
public List<CartItem> listItemsByName(String name) {
	// TODO Auto-generated method stub
	try {
		Session session = HibernateUtil.getSessionFactory().openSession();
		 session.beginTransaction();
		
		Query query= session.createQuery("from CartItem c where c.username= :userName");
		query.setParameter("userName",name);
		List<CartItem> cartlist =query.list();
		session.getTransaction().commit();
		 System.out.println(" cart list.. QUARY FIRED.......................");
	     for (Iterator iterator =cartlist .iterator(); iterator.hasNext();){
	        CartItem cartitem = (CartItem) iterator.next(); 
	        System.out.print( cartitem.getUsername()); 
	        System.out.print("  Image: " + cartitem.getItemImage());           
	     }
		return cartlist;
		}catch(Exception e){		 
			e.printStackTrace();
			
		}
		
		return null;
}
public List<ShippingDetails> listShipByName(String name) {
	// TODO Auto-generated method stub
	try {
		Session session = HibernateUtil.getSessionFactory().openSession();
		 session.beginTransaction();
		
		Query query= session.createQuery("from ShippingDetails c where c.firstName= :userName");
		query.setParameter("userName",name);
		List<ShippingDetails> shipList =query.list();
		session.getTransaction().commit();
		 System.out.println(" ship list.. QUARY FIRED.......................");
	     for (Iterator iterator =shipList .iterator(); iterator.hasNext();){
	    	 ShippingDetails ship = (ShippingDetails) iterator.next(); 
	     //   System.out.print( cartitem.getUsername()); 
	      //  System.out.print("  Image: " + cartitem.getItemImage());           
	     }
		return shipList;
		}catch(Exception e){		 
			e.printStackTrace();
			
		}
		
		return null;
}
public static boolean saveOrder(Order1 order) {
	// TODO Auto-generated method stub
	
	if(!order.equals(null)){
		try{
			System.out.println("######################### test order managment before db  ### ### #########");
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(order);
		    session.getTransaction().commit();
			System.out.println("######################### test order managment...after saving to db #########"); 
		    return true;
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	return false;
}
public List<Order1> orderListByUserName(String username) {
	// TODO Auto-generated method stub
	try {
		Session session = HibernateUtil.getSessionFactory().openSession();
		 session.beginTransaction();
		
		Query query= session.createQuery("from Order1 o where o.userName= :name");
		query.setParameter("name", username);

		List<Order1> orderList =query.list();
		session.getTransaction().commit();
		 System.out.println("list.. QUARY FIRED...and filtered Order list by name is ready to use....................");
	     for (Iterator iterator =orderList .iterator(); iterator.hasNext();){
	        Order1 order = (Order1) iterator.next(); 
	        System.out.print("ProductId: " + order.getUserName() +" "+ order.getAmount()); 	               
	     }
		return orderList;
		}catch(Exception e){		 
			e.printStackTrace();
			
		}
	return null;
}





public List<Order1> allOrderList() {
	// TODO Auto-generated method stub
	
	
	try {
		Session session = HibernateUtil.getSessionFactory().openSession();
		 session.beginTransaction();
		
		Query query= session.createQuery("from Order1 p");
		

		List<Order1> orderList =query.list();
		session.getTransaction().commit();
		 System.out.println("list.. QUARY FIRED.......................");
	     for (Iterator iterator =orderList .iterator(); iterator.hasNext();){
	      Order1 order = (Order1) iterator.next(); 
//	        System.out.print("ProductId: " + product.getpId() +" "+ product.getName()); 
//	        System.out.print("  Image: " + product.getImg()); 
	        System.out.println("quary fired....for list of Orders for admin page");
	     }
		

		return orderList;
		}catch(Exception e){		 
			e.printStackTrace();
			
		}
	return null;
}


public List<Product> allProductList() {
	// TODO Auto-generated method stub
	
	
	try {
		Session session = HibernateUtil.getSessionFactory().openSession();
		 session.beginTransaction();
		
		Query query= session.createQuery("from Product p");
		

		List<Product> productlist =query.list();
		session.getTransaction().commit();
		 System.out.println("list.. QUARY FIRED.......................");
	     for (Iterator iterator =productlist .iterator(); iterator.hasNext();){
	        Product product = (Product) iterator.next(); 
	        System.out.print("ProductId: " + product.getpId() +" "+ product.getName()); 
	        System.out.print("  Image: " + product.getImg()); 
	        System.out.println("quary fired....for list of product for admin page");
	     }
		

		return productlist;
		}catch(Exception e){		 
			e.printStackTrace();
			
		}
	return null;
}
public boolean deleteProductByPid(String pid) {
	 try {
		    Session session = HibernateUtil.getSessionFactory().openSession();
		    //Transaction tx = null;
		       session.beginTransaction();
		        
             Query query=session.createQuery("delete from Product p where p.pId= :pid1 ");
             query.setParameter("pid1", pid);
             int i=query.executeUpdate();
		      // List <User> employees = session.createQuery("FROM USER").list(); 
		       System.out.println("list.. QUARY FIRED.......................");
		       System.out.println(i+" row deleted..... ..................");
		       session.getTransaction().commit();
		       return true;
		    }  
	 
			 catch(Exception e){		 
					e.printStackTrace();
					
				}
	// TODO Auto-generated method stub
	return false;
}
public Product getProductById(String pid) {
	
	
	try {
		Session session = HibernateUtil.getSessionFactory().openSession();
		 session.beginTransaction();
		
		Query query= session.createQuery("from Product p where p.pId= :pid1");
		query.setParameter("pid1", pid);
	

		List<Product> productlist =query.list();
		session.getTransaction().commit();
		 System.out.println("list.. QUARY FIRED.......................");
	     for (Iterator iterator =productlist .iterator(); iterator.hasNext();){
	        Product product = (Product) iterator.next(); 
	        return product;         
	     }
		

		}catch(Exception e){		 
			e.printStackTrace();
			
		}
	
	// TODO Auto-generated method stub
	return null;
}
public boolean resetPasswordByUsername(String username, String password ) {
	try {
	    Session session = HibernateUtil.getSessionFactory().openSession();
	    //Transaction tx = null;
	       session.beginTransaction();
	        
         Query query=session.createQuery("update User u  set u.password= :password where u.email= :pid1 ");
         query.setParameter("pid1",username );
         query.setParameter("password", password);
         int i=query.executeUpdate();
	      // List <User> employees = session.createQuery("FROM USER").list(); 
	       System.out.println("list.. QUARY FIRED.......................");
	       System.out.println(i+" row deleted..... ..................");
	       session.getTransaction().commit();
	       return true;
	    }  
 
		 catch(Exception e){		 
				e.printStackTrace();
				
			}
	// TODO Auto-generated method stub
//	DatabaseConnector dbcon=null;
//	
//	System.out.println("updated password    :"+password);
//	 dbcon=new DatabaseConnector();
//	List<User> userlist=dbcon.listEmployees();
//	 for (Iterator iterator = userlist.iterator(); iterator.hasNext();){
//         User user = (User) iterator.next(); 
//         if(user.getEmail().equals(username)) 
//         {
//        	 
//        		System.out.println("previous password:"+user.getPassword());
//        		User user1=new User();
//        	    user1.setPassword(password);
//        	    user1.setEmail(username);
//        	    user1.setFullName(user.getFullName());
//        	    user1.setPhone(user.getPhone());
//        	    user1.setUserName(user.getUserName());
//        	    dbcon.deleteuserByusername(username);
//        	 
//        	   if( dbcon.createNewUser(user1)) {
//        		  
//        		   System.out.println("password updated successfully!!!!");
//        	    return true;
//        	   }
//         }
//         System.out.print("  password: " + password);           
//      }
//
	return false;
 }
private void deleteuserByusername(String username) {
	// TODO Auto-generated method stub
	try {
	    Session session = HibernateUtil.getSessionFactory().openSession();
	    //Transaction tx = null;
	       session.beginTransaction();
	        
         Query query=session.createQuery("delete from User u where u.email= :pid1 ");
         query.setParameter("pid1",username );
         int i=query.executeUpdate();
	      // List <User> employees = session.createQuery("FROM USER").list(); 
	       System.out.println("list.. QUARY FIRED.......................");
	       System.out.println(i+" row deleted..... ..................");
	       session.getTransaction().commit();
	      // return true;
	    }  
 
		 catch(Exception e){		 
				e.printStackTrace();
				
			}
// TODO Auto-generated method stub
//return false;
	
	
	
    }
public boolean checkUserByUsername(String email) {
	// TODO Auto-generated method stub
	DatabaseConnector dbcon=new DatabaseConnector();
	
	List<User> userlist=dbcon.listEmployees();
	for (Iterator iterator = userlist.iterator(); iterator.hasNext();){
        User user = (User)iterator.next(); 
        System.out.print("Email: " + user.getEmail()); 
        System.out.print("  password: " + user.getPassword());  
        
        if(user.getEmail().equals(email)) {
        	return true;
        }
     }
	return false;
}

public boolean reduceProductQuantityByProductId(String pid, String itemQuantity) {
	// TODO Auto-generated method stub
	DatabaseConnector dbcon=new DatabaseConnector();
	
	try {
	    Session session = HibernateUtil.getSessionFactory().openSession();
	    //Transaction tx = null;
	  
	      
	    session.beginTransaction();
	    int totalqty=dbcon.getQuantityByPid(pid);
	    int resultantQuantity=totalqty-Integer.parseInt(itemQuantity);
	    String resultString=String.valueOf(resultantQuantity);
	   
	        
         Query query=session.createQuery("update Product p  set p.quantity= :qty where p.pId= :pid1 ");
         query.setParameter("qty", resultString);
         query.setParameter("pid1", pid);
         int i=query.executeUpdate();
	      // List <User> employees = session.createQuery("FROM USER").list(); 
	       System.out.println("list.. QUARY FIRED.........Product Quantity is updated..ie reduced............");
	       System.out.println(i+" row updated..... ..................");
	       session.getTransaction().commit();
	       return true;
	    }  
 
		 catch(Exception e){		 
				e.printStackTrace();
				
			}
	
	return false;
}
private int getQuantityByPid(String pid) {
	// TODO Auto-generated method stub
	DatabaseConnector dbcon=new DatabaseConnector();
	Product product=dbcon.getProductById(pid);
	return Integer.parseInt(product.getQuantity());
	
	

}
public CartItem getCartItemById( String username,String pid) {
	// TODO Auto-generated method stub
	try {
		Session session = HibernateUtil.getSessionFactory().openSession();
		 session.beginTransaction();
		
		Query query= session.createQuery("from CartItem c where c.username= :username1 and c.PID= :pid1 ");
		query.setParameter("pid1", pid);
		query.setParameter("username1",username);


		List<CartItem> cartItemlist =query.list();
		session.getTransaction().commit();
		 System.out.println("list.. QUARY FIRED.......................");
	     for (Iterator iterator =cartItemlist .iterator(); iterator.hasNext();){
	        CartItem cartitem= (CartItem) iterator.next(); 
	        return cartitem;         
	     }
		

		}catch(Exception e){		 
			e.printStackTrace();
			
		}
	
	
	
	return null;
}
public boolean cartUpdateQuantityByPIDAndUserName(String userName, String pid,String resultQty) {
	// TODO Auto-generated method stub
	try {
	    Session session = HibernateUtil.getSessionFactory().openSession();
	    //Transaction tx = null;
	   
	      
	    session.beginTransaction();
	   
	   
	        
         Query query=session.createQuery("update CartItem c set c.itemQuantity= :resultQty1 where c.username= :username and c.PID= :pid1 ");
         query.setParameter("resultQty1", resultQty);
         query.setParameter("pid1", pid);
         query.setParameter("username", userName);
         int i=query.executeUpdate();
	      // List <User> employees = session.createQuery("FROM USER").list(); 
	       System.out.println("list.. QUARY FIRED.........Product Quantity is updated..ie reduced............");
	       System.out.println(i+" row updated.....  in cartitem table and same item is added to the cart..................");
	       session.getTransaction().commit();
	       return true;
	    }  
 
		 catch(Exception e){		 
				e.printStackTrace();
				
			}
	
	
	return false;
}
public boolean updateProductByPID(String pid, String result) {
	// TODO Auto-generated method stub
	

	try {
	    Session session = HibernateUtil.getSessionFactory().openSession();
	    //Transaction tx = null;
	  
	      
	    session.beginTransaction();
	  
	   
	        
         Query query=session.createQuery("update Product p  set p.quantity= :qty where p.pId= :pid1 ");
         query.setParameter("qty", result);
         query.setParameter("pid1", pid);
         int i=query.executeUpdate();
	      // List <User> employees = session.createQuery("FROM USER").list(); 
	       System.out.println("list.. QUARY FIRED.........Product Quantity is updated. by admin.ie ...........");
	       System.out.println(i+" row updated..... ..................");
	       session.getTransaction().commit();
	       return true;
	    }  
 
		 catch(Exception e){		 
				e.printStackTrace();
				
			}
	
	
	return false;
}

}
