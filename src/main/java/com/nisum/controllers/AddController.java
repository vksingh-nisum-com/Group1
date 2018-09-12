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




@Controller
public class AddController {
	
	@RequestMapping("/add")
	public void add(HttpServletRequest request,HttpServletResponse response) throws IOException{
		System.out.println("hi");
		System.out.println("hellooooo");
		
	}

}
