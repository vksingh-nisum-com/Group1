package com.nisum.controllers;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nisum.dao.DatabaseConnector;
import com.nisum.entity.CartItem;
@Controller
public class ProceedToCheckoutController {
	@RequestMapping("/proceedToCheckout")
	public ModelAndView getUserSpecificPage(HttpServletRequest request,HttpServletResponse response)
	{
		ModelAndView mv=new ModelAndView();
		
		mv.setViewName("billingDetails");
		
		
		
		DatabaseConnector dbcon= new DatabaseConnector();
		HttpSession session=request.getSession();
		String userName=(String) session.getAttribute("username");    
		List<CartItem> cartItems=dbcon.listItemsByName(userName);
		mv.addObject("cartItems", cartItems);
		
		return mv;
	}
	

}
