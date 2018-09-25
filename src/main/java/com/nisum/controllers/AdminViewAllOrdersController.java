package com.nisum.controllers;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nisum.dao.DatabaseConnector;
import com.nisum.entity.CartItem;
import com.nisum.entity.Order1;
@Controller
public class AdminViewAllOrdersController {
	@RequestMapping("/viewAllOrders")
	public ModelAndView getUserSpecificPage(HttpServletRequest request,HttpServletResponse response)
	{
		ModelAndView mv=new ModelAndView();
		
		mv.setViewName("testAdminViewAllOrder");

		
		DatabaseConnector dbcon= new DatabaseConnector();
		List<Order1> orders=dbcon.allOrderList();
		mv.addObject("orders", orders);
		return mv;
	}
	

}
