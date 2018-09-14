package com.nisum.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nisum.dao.User;
import com.nisum.dto.DatabaseConnector;
import com.nisum.services.UserServices;
@Controller
public class LoginHandler {
	@RequestMapping("/loginProcess")
	public ModelAndView loggingfunction(HttpServletRequest request,HttpServletResponse response) throws IOException {
		System.out.println("login process started..........");
		ModelAndView mv=new ModelAndView();
		UserServices userObj=new UserServices();
		PrintWriter out = response.getWriter();
		String username= request.getParameter("loginUsername");
		String password= request.getParameter("loginPassword");
		password=userObj.dycrypted(password);
		
		boolean loginStatus=userObj.checkvaliduser(username,password);
		mv.setViewName("login.jsp");
        if(loginStatus){		
			System.out.println("user logged in successfully !");
			mv.addObject("loginMessage","user logged in successfully !");
		} 
        
		else{ 
			    mv.addObject("loginMessage","Unable to Login user please try again");
			    System.out.println("Unable to login please try again");
				//mv.addObject("registrationStatus","Unable to create user please try again");
		}
		return mv; 
		
		// mv.setViewName("login.jsp");
		// mv.addObject("loginStatus","user created successfully !");
	   
	}
	
	

}
