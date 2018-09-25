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
import org.springframework.web.servlet.ModelAndView;

import com.nisum.dao.DatabaseConnector;
import com.nisum.entity.Product;




@Controller
public class AdminDeleteQuantityProduct {
	
	@RequestMapping("adminDeleteQuantity")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		String pid=request.getParameter("pid");
		int quantity =Integer.parseInt(request.getParameter("P_Quantity"));
		DatabaseConnector dbcon=new DatabaseConnector();
		ModelAndView mv=new ModelAndView();

		
		/*
		 * 
		 * 	1. Product product= Fetch product By pid
		 * 	2. int oldQuantity=Integer.parseInt(product.getQuantity();
		 *      
		 *     int newQuantity= oldQuantity-quantity;
		 *     
		 *     if(newQuantity<0)
		 *     {
		 *     
		 *     //Redirect message(Unable to delete! Only oldQuantity  available in stock) to admin.jsp
		 *     
		 *     }
		 *     
		 *     else
		 *     {
		 *     
		 *     	updateproduct(pid,newQuantity)
		 *     
		 *     }
		 * 
		 * 
		 */
		Product product=dbcon.getProductById(pid);
		int oldQuantity=Integer.parseInt(product.getQuantity());
		int result=oldQuantity-quantity;
		String resultString=String.valueOf(result);
		if(result>0) {
			boolean status=dbcon.updateProductByPID(pid, resultString);
			if(status) {
				System.out.println("quantity removed successfully");
				
				
				 mv.setViewName("admin");
				 mv.addObject("adminMessage2", "Updated !");
				//System.out.println(" the product");
				 return mv;
			}
			else {
				System.out.println("Sommething Went Wrong !!");
				
				 mv.setViewName("admin");
				 mv.addObject("adminMessage2", " Sommething Went Wrong !!");
				 //System.out.println("admin has deleted the product");
				 return mv;

			}
		}
			else {
			

			 mv.setViewName("admin");
			 mv.addObject("adminMessage2", " Quantity is 0 or less!!");
			 //System.out.println("admin has deleted the product");
			 return mv;
			
			
		}
		
		
	}

}
