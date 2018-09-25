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
import com.nisum.entity.Product;
import com.nisum.entity.User;
import com.nisum.services.UserServices;
@Controller
public class LoginHandler {
	@RequestMapping("/loginProcess")
	public ModelAndView loggingfunction(HttpServletRequest request,HttpServletResponse response) throws IOException {
		System.out.println("login process started..........");
		ModelAndView mv=new ModelAndView();
    	HttpSession session=request.getSession();

		UserServices userObj=new UserServices();
		PrintWriter out = response.getWriter();
		String username= request.getParameter("loginUsername");
		String password= request.getParameter("loginPassword");
		if(username.equals("vksingh@nisum.com") && password.equals("root")) {
			mv.setViewName("admin");
			DatabaseConnector dbcon=new DatabaseConnector();
			List<Product> productList=dbcon.allProductList();
			mv.addObject("products", productList);
			
			return mv;
		}
		
		password=userObj.MD5EncryptionMethod(password);
		boolean loginStatus=userObj.checkvaliduser(username,password);
        if(loginStatus){
        	session.setAttribute("username", username);
        	if(session.getAttribute("orderStatus")=="without") {
    			session.removeAttribute("orderStatus");
    			mv.setViewName("productDetailsTemplate");
    			Product product=(Product) session.getAttribute("productObj");
                mv.addObject("productObj", product);
                session.removeAttribute("productObj");
                return mv;
    		}
			
    		mv.setViewName("index");
			System.out.println("user logged in successfully !");
			String msg="hi"+username;
			mv.addObject("loginMessage",msg);
		}         
		else{ 
			mv.setViewName("login");

			    mv.addObject("loginMessage","Unable to Login user please try again");
			    System.out.println("Unable to login please try again");
				//mv.addObject("registrationStatus","Unable to create user please try again");
		}
		return mv; 
		
		// mv.setViewName("login.jsp");
		// mv.addObject("loginStatus","user created successfully !");
	   
	}
	
	

}
