package com.nisum.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nisum.dao.DatabaseConnector;
import com.nisum.entity.User;
import com.nisum.services.UserServices;

@Controller
public class RegisterHandler {
	@RequestMapping("/registerProcess")
	public ModelAndView register(HttpServletRequest request,HttpServletResponse response) throws IOException {
		ModelAndView mv=new ModelAndView();
		//DatabaseConnector dbcon= new DatabaseConnector();
		UserServices userObj=new UserServices();
		DatabaseConnector dbcon=new DatabaseConnector();
		PrintWriter out = response.getWriter();
		String fullname= request.getParameter("R_name");
		String userName= request.getParameter("R_username");
		String email= request.getParameter("R_email");
		String password= request.getParameter("R_password");
		String phone= request.getParameter("R_phone");
		boolean isAlreadyCreated=dbcon.checkUserByUsername(email);
		if(isAlreadyCreated) {
			mv.setViewName("login");
			mv.addObject("registeringStatus","email already exist please login");
			return mv;
		}
		password=userObj.MD5EncryptionMethod(password);
		User user=userObj.setValues(fullname, userName, email, password, phone);
		boolean isCreated = DatabaseConnector.createNewUser(user);
		mv.setViewName("login");
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
		
		
		
	
	
	

