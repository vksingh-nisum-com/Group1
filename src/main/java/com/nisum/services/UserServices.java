package com.nisum.services;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.nisum.dao.DatabaseConnector;
import com.nisum.entity.CartItem;
import com.nisum.entity.Order;
import com.nisum.entity.Order1;
import com.nisum.entity.Product;
import com.nisum.entity.ShippingDetails;
import com.nisum.entity.User;

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
		System.out.println("");
		// TODO Auto-generated method stub
		return password;
	}
	public String dycrypted(String password) {
		String password1="";
		for(int i=0;i<password.length();i++) {
			password1 +=(char)(password.charAt(i)+6);
		}
		// TODO Auto-generated method stub
		return password;
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
	public ShippingDetails setValues(String country, String firstName, String lastName, String address, String city,
			String email, String phone) {
		// TODO Auto-generated method stub
		ShippingDetails sd = new ShippingDetails();
		sd.setCountry(country);
		sd.setFirstName(firstName);
		sd.setLastName(lastName);
		sd.setAddress(address);
		sd.setCity(city);
		sd.setEmail(email);
		sd.setPhone(phone);	
		return sd;
	}
	public static CartItem setValuesftoCart(String string, String string2, String string3, String string4, String string5,
			String string6, String string7) {
		// TODO Auto-generated method stub
        CartItem cartItem=new CartItem();
		cartItem.setItemImage(string3);
		cartItem.setItemName(string4);
		cartItem.setItemPrice(string6);
		cartItem.setItemQuantity(string5);	
		cartItem.setUsername(string);
		cartItem.setItemSize(string7);
		cartItem.setPID(string2);	
		return cartItem;
	}
	//Incomplete... has to be done by vikram;
	public Product setvaluestoProductTable(String pid, String quantity) {
		// TODO Auto-generated method stub
	    Product product=new Product();
	    product.setCatagory("fashion");
	    product.setDescrip("best jeans");
	    product.setImg("fmtl.jpg");
	    product.setImg2("fmtl.jpg");
	    product.setImg3("fmtl.jpg");
	    product.setImg4("fmtl.jpg");
	    product.setImg5("fmtl.jpg");
	    product.setName("fdsaf");
	    product.setPrice("543");
	    product.setSubCatagory("men");
	    
	    product.setpId(pid);
	    product.setQuantity(quantity);
	    return product;
	}
	public static Product getProductBypID(String pid) {
		// TODO Auto-generated method 
		DatabaseConnector dbcon= new DatabaseConnector();
		List<Product> dbobj=dbcon.listProducts();
		
		for (Iterator iterator = dbobj.iterator(); iterator.hasNext();){
	           Product product = (Product) iterator.next(); 
	          if(product.getpId().equals(pid))
	        	  return product;
		
		
	    }
		System.out.println("pid="+pid+ "   not found in the data base");
		return null;

    }
	public boolean deletecartByusername(String string) {
		// TODO Auto-generated method stub
		
		return false;
	}
	public Order1 saveOrder(String username, String amount, String format,String orderDetail) {
		// TODO Auto-generated method stub
		Order1 order=new Order1();
		order.setAmount(amount);
		order.setUserName(username);
		order.setDate(format);
		order.setOrderDetail(orderDetail);
		return order;
	}
	public  Product setValuesToProduct(String pid, String productName,
			String productPrice, String productDecription, String fileName1, String fileName2, String fileName3,
			String fileName32, String fileName4, String fileName5, String productQuantity, String productCategory,
			String productSubCategory) {
		Product product=new Product();
		product.setpId(pid);
		product.setName(productName);
		product.setPrice(productPrice);
		product.setDescrip(productDecription);
		product.setImg(fileName1);
		product.setImg2(fileName2);
		product.setImg3(fileName3);
		product.setImg4(fileName4);
		product.setImg5(fileName5);
		
		product.setQuantity(productPrice);
		product.setCatagory(productCategory);
		product.setSubCatagory(productSubCategory);
		
		// TODO Auto-generated method stub
		return product;
	}
	public boolean checkValidUserForResetPassword(String username) {
		// TODO Auto-generated method stub
		
		DatabaseConnector dbcon= new DatabaseConnector();
		List<User> dbobj=dbcon.listEmployees();
		for (Iterator iterator = dbobj.iterator(); iterator.hasNext();){
	          User user = (User) iterator.next(); 
	          if(user.getEmail().equals(username)) {
	        	  return true;
	          }
	          
	         // System.out.print("Email: " + user.getEmail()); 
	          //System.out.print("  password: " + user.getPassword()); 
	       }
		return false;
	
	}
	 public  String MD5EncryptionMethod(String password) {
	        final byte[] defaultBytes = password.getBytes();
	        try {
	            final MessageDigest md5MsgDigest = MessageDigest.getInstance("MD5");
	            md5MsgDigest.reset();
	            md5MsgDigest.update(defaultBytes);
	            final byte messageDigest[] = md5MsgDigest.digest();
	            final StringBuffer hexString = new StringBuffer();
	            for (final byte element : messageDigest) {
	                final String hex = Integer.toHexString(0xFF & element);
	                if (hex.length() == 1) {
	                    hexString.append('0');
	                }
	                hexString.append(hex);
	            }
	            password = hexString + "";
	        } catch (final NoSuchAlgorithmException nsae) {
	            nsae.printStackTrace();
	        }
	        return password;
	    }
	public int generate6DigitRandomValue() {
		// TODO Auto-generated method stub
		Random r=new Random();
		   int otp1=r.nextInt(999999);
		   if(otp1<100000) {
			   otp1+=100000;
		   } 
		   return otp1;
		
	}
	public boolean sendMessage(String username, String otp) {
		// TODO Auto-generated method stub
		
		
		
		    String to = username;

	      // Sender's email ID needs to be mentioned
	      String from = "vikram19977@gmail.com";
	     // final String username = "vikram19977@gmail.com";//change accordingly
	      final String password = "Gmail@#india";//change accordingly

	      // Assuming you are sending email through relay.jangosmtp.net
	      //String host = "relay.jangosmtp.net";
	      Properties props = new Properties();
	      props.put("mail.smtp.auth", "true");
	      props.put("mail.smtp.starttls.enable", "true");
	      props.put("mail.smtp.host", "smtp.gmail.com");
	      props.put("mail.smtp.port", "587");

	      // Get the Session object.
	      Session session = Session.getInstance(props,
	         new javax.mail.Authenticator() {
	            protected PasswordAuthentication getPasswordAuthentication() {
	               return new PasswordAuthentication(from, password);
		   }
	         });

	      try {
		   // Create a default MimeMessage object.
	   	   Message message = new MimeMessage(session);
		
		   // Set From: header field of the header.
		   message.setFrom(new InternetAddress(from));
		
		   // Set To: header field of the header.
		   message.setRecipients(Message.RecipientType.TO,
	               InternetAddress.parse(to));
		
		   // Set Subject: header field
		   message.setSubject("Group1 Project related Message");
		
		   // Now set the actual message
		  		   
		   message.setText(otp);

		   // Send message
		   Transport.send(message);
		   System.out.println("message sent successfully....");
		   return true;

	      } catch (MessagingException e) {
	    	  
	         throw new RuntimeException(e);
	      }
		//return false;
	}
	public void setImages(CommonsMultipartFile fileImage1, CommonsMultipartFile fileImage2,
			CommonsMultipartFile fileImage3, CommonsMultipartFile fileImage4, CommonsMultipartFile fileImage5 ,String fileName1,String fileName2,String fileName3,String fileName4,String fileName5) throws IOException {
		// TODO Auto-generated method stub
        Map<String, CommonsMultipartFile > map = new HashMap<String, CommonsMultipartFile>(); 

		map.put(fileName1,fileImage1);		
		map.put(fileName2,fileImage2);
		map.put(fileName3,fileImage3);
		map.put(fileName4,fileImage4);
		map.put(fileName5,fileImage5);

		for (Map.Entry<String,CommonsMultipartFile> entry : map.entrySet()) { 
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue()); 
            
            if (!entry.getValue().isEmpty()) 
    		{
    		BufferedImage image = ImageIO.read(new ByteArrayInputStream(entry.getValue().getBytes()));
    		String path="C:/opt/product_details/"+entry.getKey();
    		File destination = new File(path); 
    		ImageIO.write(image,"jpg",destination);
    		String path2="F:/Group11/src/main/webapp/resources/img/product/product-details/"+entry.getKey();
    		File destination2 = new File(path2); 
    		ImageIO.write(image,"jpg",destination2);
    		String path3="F:/Group11/src/main/webapp/resources/img/product/two-column/"+entry.getKey();
    		File destination3 = new File(path3); 
    		ImageIO.write(image,"jpg",destination3);
    		  }
         } 
	}	
}

