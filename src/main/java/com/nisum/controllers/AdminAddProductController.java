package com.nisum.controllers;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.nisum.dao.DatabaseConnector;
import com.nisum.entity.Product;
import com.nisum.services.UserServices;


@Controller
public class AdminAddProductController {

	@RequestMapping(value = "/adminAddProduct", method = RequestMethod.POST )
	public ModelAndView addNewProduct(HttpServletRequest request,HttpServletResponse response, @RequestParam CommonsMultipartFile fileImage1,@RequestParam CommonsMultipartFile fileImage2,@RequestParam CommonsMultipartFile fileImage3,@RequestParam CommonsMultipartFile fileImage4,@RequestParam CommonsMultipartFile fileImage5) throws IOException 
	{
		ModelAndView mv=new ModelAndView();
		UserServices userObj=new UserServices();

	String fileName1 = fileImage1.getOriginalFilename(); 
	String fileName2 = fileImage2.getOriginalFilename(); 
	String fileName3 = fileImage3.getOriginalFilename(); 
	String fileName4 = fileImage4.getOriginalFilename(); 
	String fileName5 = fileImage5.getOriginalFilename(); 
    userObj.setImages(fileImage1,fileImage2,fileImage3,fileImage4,fileImage5,fileName1,fileName2,fileName3,fileName4,fileName5);
	String pid =request.getParameter("P_ID");
	String productQuantity=request.getParameter("P_Quantity");
	String productDecription =request.getParameter("Name"); //CAUTION:::::::::::::::=>>>>>>
	String productPrice=request.getParameter("Price");
	String productName=request.getParameter("Descriptiony");//Caution
	String productCategory=request.getParameter("Category");
	String productSubCategory=request.getParameter("Sub-Category");
	UserServices us=new UserServices();
	 Product product=us.setValuesToProduct(pid,productName,productPrice,productDecription,fileName1,fileName2,fileName3,fileName3,fileName4,fileName5,productQuantity,productCategory,productSubCategory);
	 DatabaseConnector dbcon=new DatabaseConnector();
	 boolean status=dbcon.createNewProduct(product);
	 PrintWriter out=response.getWriter();
	 if(status) {
		 mv.setViewName("admin");
		 mv.addObject("adminMessage", "added Successful !");
		 System.out.println("product saved by admin....................................################");
		 out.println("saved to database...................###################");
		 return mv;
	 }
	 else {
		 System.out.println("Product not saved by admin........******$######################");
		 mv.setViewName("admin");
		 mv.addObject("adminMessage", "Something Went Wrong!");
		 return mv;
	 }
	}
}
