package com.nisum.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nisum.dao.ProductDao;
import com.nisum.dto.Product;

@Controller
public class ViewProductController{
	@RequestMapping("/temp")
	public ModelAndView dynamicJSP(HttpServletRequest req,HttpServletResponse res)
	{
		//String pid=req.getParameter("pid");
		
		Product prod=new Product(); //Get Product from DB ; #makeNull
		
		
		//Testing 
		prod.setPName("Urbano Fashion Men's Printed Regular Fit T-Shirt");
		prod.setPrice("$49");
		prod.setDescrip("lorem Ipsum Dolor consectetur adipiscing st sit amet aliquet adipiscing st sit amet aliquet adipiscing st sit amet aliquetadipiscing st sit amet aliquet");
		prod.setImg("fmtl.jpg");
		
		
		
		String productName=prod.getPName();
	    String productImage=prod.getImg();
	    String productDescription=prod.getDescrip();
	    String productPrice=prod.getPrice();
		
		
		ModelAndView mv= new ModelAndView();
		mv.setViewName("TestProductDetailsTemplate.jsp");
		
		
		mv.addObject("productImage",productImage);
		mv.addObject("productName", productName);
		mv.addObject("productPrice", productPrice);
		mv.addObject("productDescription", productDescription);
		
		System.out.println("IN ViewController");
		System.out.println(productImage+productName+productPrice+productDescription);
		return mv;
	}
	

}
