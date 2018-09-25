package com.nisum.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nisum.dao.DatabaseConnector;
import com.nisum.entity.ShippingDetails;
import com.nisum.entity.User;
import com.nisum.services.UserServices;
import com.nisum.util.HibernateUtil;

@Controller
public class ShippingHandler {
	@RequestMapping("/shippingDetails")
	public void shiping(HttpServletRequest request,HttpServletResponse response) throws IOException {
		ModelAndView mv=new ModelAndView();
		UserServices userObj=new UserServices();
		PrintWriter out = response.getWriter();
		String country= request.getParameter("country");
		String firstName= request.getParameter("name");
		String lastName= request.getParameter("last");
		String address= request.getParameter("address");
		String city= request.getParameter("town");
		String email= request.getParameter("email");
		String phone= request.getParameter("phone");
		ShippingDetails sd=userObj.setValues(country,firstName,lastName, address,city,email,phone);
		boolean isOrder = DatabaseConnector.registeringDetails(sd);		
		if(isOrder){
				System.out.println(" Address updated successfully");
		}
		else{
			System.out.println("not updated");
				out.println("Not updated");
		}  
	}	
}

