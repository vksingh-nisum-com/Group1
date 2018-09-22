package com.nisum.controllers;




import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nisum.dto.DatabaseConnector;




@Controller
public class AdminDeleteProduct {
	
	@RequestMapping("/adminDeleteProduct")
	public void add(HttpServletRequest request,HttpServletResponse response) throws IOException{
		System.out.println("adminDeleteProduct");
		
		String pid=request.getParameter("pid");
		//int quantity =Integer.parseInt(request.getParameter("pid"));
		
		/*
		 * 
		 * 
		 *   deleteProductBy(pid);
		 *  	
		 * 
		 */
		DatabaseConnector dbcon=new DatabaseConnector();
	 boolean status= dbcon.deleteProductByPid(pid);
		 if(status) {
		 System.out.println("admin has deleted the product");}
		 else {
			 System.out.println("admin is not able to delete...... or pid not found");
		 }
		
		
		
	}

}
