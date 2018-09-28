package com.nisum.controllers;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nisum.dao.DatabaseConnector;
import com.nisum.entity.CartItem;
import com.nisum.entity.Product;
import com.nisum.services.UserServices;


@Controller
public class AddToCartController {
	@RequestMapping("/addtocart")
	public ModelAndView getUserSpecificPage(HttpServletRequest req,HttpServletResponse res) throws IOException
	{  
		
		DatabaseConnector dbcon=new DatabaseConnector();
		String pid=req.getParameter("pid"); 
		String productQuantity=req.getParameter("qty");
		String prodectSize=req.getParameter("size");
		Product product=UserServices.getProductBypID(pid);
		String productName=product.getDescrip();
	    String productImage=product.getImg();
	    String productPrice=product.getPrice();
		ModelAndView mv=new ModelAndView();
		HttpSession session=req.getSession();
		String userName;
		if(session.getAttribute("username")==null){
			session.setAttribute("orderStatus","without");
			mv.setViewName("login");
		    mv.addObject("loginMessage","Please log in first ");
		    session.setAttribute("productObj", product);

			return mv;
		}
	    userName=(String) session.getAttribute("username");
	    CartItem  cartitem=dbcon.getCartItemById(userName,pid);
	    if(cartitem!=null) {
	    	int preQty=Integer.parseInt(cartitem.getItemQuantity());
	    	int resultQty=preQty+Integer.parseInt(productQuantity);
	    	String resultQuantity=String.valueOf(resultQty);
	    	boolean cartUpdateStatus=dbcon.cartUpdateQuantityByPIDAndUserName(userName,pid,resultQuantity);
	    	
	    }
	    
	   
	    else{
		CartItem cartobj =UserServices.setValuesftoCart(userName, pid ,productImage,productName,productQuantity,productPrice, prodectSize );
		PrintWriter out = res.getWriter();
		System.out.println("before creating the db...");
		
		boolean isCreated = DatabaseConnector.addtocart(cartobj);
		System.out.println("before creating the db...");
		if(isCreated){
			System.out.println("added to cart !");
			//mv.addObject("registeringStatus","user created successfully !");
		}
		else{ 
			//mv.addObject("registeringStatus","Unable to create user please try again");
			    System.out.println("not added to cart");
				mv.setViewName("login");
		}
	    }
		//DatabaseConnector dbcon= new DatabaseConnector();
		List<CartItem> cartItems=dbcon.listItemsByName(userName);
		int cartItemCount=cartItems.size();
		System.out.println();
		session.setAttribute("cartItemCount", cartItemCount);
		mv.setViewName("shoppingCart");
		mv.addObject("cartItems", cartItems);
		return mv;  
	}
}
		
		
		