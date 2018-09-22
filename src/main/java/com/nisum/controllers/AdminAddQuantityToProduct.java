package com.nisum.controllers;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nisum.dao.Product;
import com.nisum.dto.DatabaseConnector;

@Controller
public class AdminAddQuantityToProduct {
	
	@RequestMapping("/adminAddQuantity")
	public void add(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String pid=request.getParameter("pid");
		int quantity =Integer.parseInt(request.getParameter("P_Quantity"));
		

		/*
		 * 
		 * 	1. Product product= Fetch product By pid
		 * 	2. int oldQuantity=Integer.parseInt(product.getQuantity();
		 *      
		 *     int newQuantity= oldQuantity+quantity;
		 *     
		 *    updateproduct(pid,newQuantity);
		 * 
		 */
		DatabaseConnector dbcon=new DatabaseConnector();
		Product product=dbcon.getProductById(pid);
		String result=String.valueOf(Integer.parseInt(product.getQuantity())+quantity);
		boolean statusforadd=dbcon.updateProductByPID(pid,result);
		if(statusforadd) {
			System.out.println("product  quantity is  updated...ie... added");
		}
		
		
		
	}

}
