package com.nisum.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nisum.dao.User;
import com.nisum.dto.DatabaseConnector;
import com.nisum.services.UserServices;
import com.nisum.util.HibernateUtil;

@Controller
public class RegisterHandler {
	@RequestMapping("/registerProcess")
	public ModelAndView register(HttpServletRequest request,HttpServletResponse response) throws IOException {
		ModelAndView mv=new ModelAndView();
		DatabaseConnector dbcon= new DatabaseConnector();
		UserServices userObj=new UserServices();
		PrintWriter out = response.getWriter();
		String fullname= request.getParameter("R_name");
		String userName= request.getParameter("R_username");
		String email= request.getParameter("R_email");
		String password= request.getParameter("R_password");
		String phone= request.getParameter("R_phone");
		password=userObj.encrypted(password);
		User user=userObj.setValues(fullname, userName, email, password, phone);
		boolean isCreated = dbcon.createNewUser(user);
		mv.setViewName("login.jsp");
		if(isCreated){
			

			System.out.println("user created successfully !");
			mv.addObject("registeringStatus","user created successfully !");
		}
		else{ 
			mv.addObject("registeringStatus","Unable to create user please try again");
			    System.out.println("Unable to create user please try again");
				//mv.addObject("registrationStatus","Unable to create user please try again");
		}
		return mv;  
	}
	
}
		
		
		
	
	
	

