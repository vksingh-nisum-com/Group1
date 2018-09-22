package com.nisum.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nisum.dao.CartItem;
import com.nisum.dao.Order;
import com.nisum.dao.Order1;
import com.nisum.dao.ShippingDetails;
import com.nisum.dto.DatabaseConnector;
import com.nisum.services.UserServices;

@Controller
public class PlaceOrderController {
	
	@RequestMapping("/placeOrder")
	public ModelAndView shiping(HttpServletRequest request,HttpServletResponse response) throws IOException {
		ModelAndView mv=new ModelAndView();
		UserServices userObj=new UserServices();
		HttpSession session=null;
		session=request.getSession();
		String userName=(String) session.getAttribute("username"); 
		PrintWriter out = response.getWriter();
		String country= request.getParameter("country");
		String firstName= request.getParameter("name");
		String lastName= request.getParameter("last");
		String address= request.getParameter("address");
		String city= request.getParameter("town");
		String email= request.getParameter("email");
		String phone= request.getParameter("phone");
		//fname changed to userName;;;;;;;;;;;;;;;
		
		ShippingDetails sd=userObj.setValues(country,userName,lastName, address,city,email,phone);
		boolean isOrder = DatabaseConnector.registeringDetails(sd);		
		if(isOrder){
				System.out.println(" Address updated successfully");
		}
		else{
			System.out.println("not updated");
				out.println("Not updated");
		} 	
		DatabaseConnector dbcon= new DatabaseConnector();
		
		String orderDetail=null;
		StringBuffer sbuff =new StringBuffer("");
		int i=1;
		String amount=null;
		int subTotal=0;
		List<CartItem> cartItems=dbcon.listItemsByName(userName); 
		
		

		for(CartItem cartItem:cartItems)
		{  
			boolean status=dbcon.reduceProductQuantityByProductId(cartItem.getPID(),cartItem.getItemQuantity());
			
			int price=Integer.parseInt(cartItem.getItemPrice());
			int qty=Integer.parseInt(cartItem.getItemQuantity());
			int itemsPrice=price*qty;
			subTotal=subTotal+itemsPrice;
			amount= String.valueOf(subTotal);
			
			
		//	System.out.println("***"+cartItem.getPID()+cartItem.getItemQuantity()+"***");
			if(i==cartItems.size())
			{	sbuff=sbuff.append(cartItem.getPID()+":"+cartItem.getItemQuantity());
				//orderDetail=cartItem.getPID()+":"+cartItem.getItemQuantity();
			 
			}
			else
				
				{sbuff=sbuff.append(cartItem.getPID()+":"+cartItem.getItemQuantity()+",");
				 
				}
			i++;
			System.out.println(sbuff);
		}
		orderDetail=sbuff.toString();
		
		
		
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate localDate = LocalDate.now();
		System.out.println(dtf.format(localDate)); //2016/11/16
		
		
		  
		Order1 order=userObj.saveOrder(userName,amount,dtf.format(localDate),orderDetail );
		boolean status=DatabaseConnector.saveOrder(order);
		if(status) {
		boolean placeOrderStatus=userObj.sendMessage(userName, " Hi there,Your Order is placed successfully"); 
		System.out.println("saved into ordertable.........................");
		}
		else {
			System.out.println("not saved into order table");
		}	
		
	
		

		boolean deleteStatus=dbcon.deletecartByusername(userName);
		if(deleteStatus){ 
			session.removeAttribute("cartItems");
			session.invalidate();
			
			System.out.println("product deleted from cartitem table successfully !");
			
			out.println("product deleted successfully");
		}
		else{ 
			out.println("unable to delete product");
			
			    System.out.println("Unable to delete the cartitem please try again");
				
		}
		
		

		List<Order1> orders=dbcon.orderListByUserName(userName);
		mv.setViewName("userOrderHistory");
		mv.addObject("orders", orders);
		return mv;
	}

}
