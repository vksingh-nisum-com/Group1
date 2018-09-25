package com.nisum.controllers;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.nisum.dao.*;
import com.nisum.entity.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class Form1Controller {
	
	@RequestMapping("/form1Ctrl")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("adminForm1");
		return mv;
	}

	@RequestMapping("/form2Ctrl")
	public ModelAndView delete(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		ModelAndView mv=new ModelAndView();
		DatabaseConnector dbcon=new DatabaseConnector();
		List<Product> products= dbcon.allProductList();
		
		
		mv.setViewName("adminForm2");
		mv.addObject("products", products);
		return mv;
	}
	
	@RequestMapping("/form3Ctrl")
	public ModelAndView update(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		ModelAndView mv=new ModelAndView();
		DatabaseConnector dbcon=new DatabaseConnector();
		List<Product> products= dbcon.allProductList();
		
		
		
		mv.setViewName("adminForm3");
		mv.addObject("products", products);
		return mv;
	}





}
