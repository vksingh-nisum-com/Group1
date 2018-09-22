package com.nisum.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nisum.dao.CartItem;
import com.nisum.dao.Product;
import com.nisum.dto.DatabaseConnector;

@Controller
public class FilterController {
	@RequestMapping("/filter")
	public ModelAndView filteroperation(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		DatabaseConnector dbcon= new DatabaseConnector();
		String catagory= request.getParameter("catagory");
		String subcatagory= request.getParameter("subcatagory");
		List<Product> productItems=dbcon.getListOfProductByFilter(catagory,subcatagory);
		mv.setViewName("FashionBoyLowers");
		mv.addObject("productItems", productItems);
		return mv;  
		
	}

}
