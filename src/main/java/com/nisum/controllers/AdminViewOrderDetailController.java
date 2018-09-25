package com.nisum.controllers;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nisum.dao.DatabaseConnector;
import com.nisum.entity.CartItem;
import com.nisum.entity.Product;
import com.nisum.entity.ShippingDetails;
import com.nisum.services.UserServices;




@Controller
public class AdminViewOrderDetailController {
	
	@RequestMapping("/adminViewOrderDetailCtrl")
	public ModelAndView orderDetailPopUp(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("adminOrderDetailPopUp"); 
		
		
		String orderId=request.getParameter("orderId");
		String userName=request.getParameter("userName");
		String orderDetail=request.getParameter("orderDetail");
//////////////////////////////Shipping Address/////////////////////////////////////////////////////////////////		
		DatabaseConnector dbcon= new DatabaseConnector();
		List<ShippingDetails> shippingDetailsList=dbcon.listShipByName(userName);
		ShippingDetails shippingDetails=shippingDetailsList.get(0);
		
/////////////////////////////// Ordered Prdouct Details/////////////////////////////////////////////////////////////		
		CartItem cartItem=null;
		List<CartItem> cartItems=new ArrayList<CartItem> ();
		
		
		
			String str =  orderDetail;
			String[] commas = str.split(","); 
	  
	        for (String a : commas) 
	        {
	        	String[] colons=a.split(":");
	        	String pid=colons[0];
	        	String qty=colons[1];
	        
	        	Product product=UserServices.getProductBypID(pid);
	        	cartItem=new CartItem();
	        		cartItem.setItemImage(product.getImg());
	        		cartItem.setItemName(product.getDescrip());
	        		cartItem.setItemPrice(product.getPrice());
	        		cartItem.setItemQuantity(qty);
	        		cartItem.setPID(pid);
	        	cartItems.add(cartItem);
	        	
	        }

	        
		
		mv.addObject("shippingDetails", shippingDetails);
		mv.addObject("userName", userName);
		mv.addObject("orderId", orderId);
		mv.addObject("cartItems", cartItems);
		
		
		return mv;
			
	}

}




