package com.nisum.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nisum.dao.DatabaseConnector;
import com.nisum.entity.Product;
import com.nisum.entity.User;
import com.nisum.services.UserServices;

@Controller
public class AdminHandler{
	@RequestMapping("/admin")
	public void register(HttpServletRequest request,HttpServletResponse response) throws IOException {
	ModelAndView mv=new ModelAndView();
	//DatabaseConnector dbcon= new DatabaseConnector();
	UserServices userObj=new UserServices();
	PrintWriter out = response.getWriter();
	String pid= request.getParameter("P_ID");
	String quantity= request.getParameter("P_Quantity");
//	String email= request.getParameter("R_email");
//	String password= request.getParameter("R_password");
//	String phone= request.getParameter("R_phone");
	//password=userObj.encrypted(password);
	Product product=userObj.setvaluestoProductTable(pid,quantity);
	boolean isCreated = DatabaseConnector.createNewProduct(product);
	//mv.setViewName("login.jsp");
	if(isCreated){
		System.out.println("product created successfully !");
		//mv.addObject("registeringStatus","user created successfully !");
		out.println("product created successfully");
	}
	else{ 
		out.println("unable to create product");
		//mv.addObject("registeringStatus","Unable to create user please try again");
		    System.out.println("Unable to create user please try again");
			//mv.addObject("registrationStatus","Unable to create user please try again");
	}
	//return mv;  
}
}
