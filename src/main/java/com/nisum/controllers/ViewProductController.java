package com.nisum.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nisum.dao.Product;
import com.nisum.dao.User;
import com.nisum.dto.DatabaseConnector;
import com.nisum.services.UserServices;



@Controller
public class ViewProductController{
	@RequestMapping("/viewCtrl")
	public ModelAndView dynamicJSP(HttpServletRequest req,HttpServletResponse res)
	{   
		ModelAndView mv= new ModelAndView();
		String pid=(String) req.getParameter("pid");
		mv.setViewName("productDetailsTemplate");
		Product product=UserServices.getProductBypID(pid);
		mv.addObject("productObj", product);
//	    String productName=product.getName();
//	    String productImage=product.getImg();
//	    String productImage2=product.getImg2();
//	    String productImage3=product.getImg3();
//	    String productImage4=product.getImg4();  
//	    String productImage5=product.getImg5();
//	    String productDescription=product.getDescrip();
//        String productPrice=product.getPrice();
//		
//		mv.addObject("productImage",productImage);
//		mv.addObject("productImage2",productImage2);
//		mv.addObject("productImage3",productImage3);
//		mv.addObject("productImage4",productImage4);
//		mv.addObject("productImage5",productImage5);
//        mv.addObject("productName", productName);
//	    mv.addObject("productPrice", productPrice);
//	    mv.addObject("productDescription", productDescription);
//		mv.addObject("pid", pid);
		System.out.println("IN ....ViewController pid=" +product.getpId());

		return mv;			
	}
		
		
		
		
		
		///TESTING END
		
	}
	


