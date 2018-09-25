package com.nisum.controllers;




import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nisum.dao.DatabaseConnector;




@Controller
public class AdminDeleteProduct {
	
	@RequestMapping("/adminDeleteProduct")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response) throws IOException{
		System.out.println("adminDeleteProduct");
		ModelAndView mv=new ModelAndView();
		
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
			 mv.setViewName("admin");
			 mv.addObject("adminMessage1", "deleted Successful !");
			 System.out.println("admin has deleted the product");
			 return mv;
		 }
			 
		 
		 
		 
		 
	
		 else {
			 System.out.println("admin is not able to delete...... or pid not found");

			 
			 mv.setViewName("admin");
			 mv.addObject("adminMessage1", "Something Went Wrong!");
			 return mv;
		
		
		
	}

}
}
