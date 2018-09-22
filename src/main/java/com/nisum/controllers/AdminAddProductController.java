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

import com.nisum.dao.Product;
import com.nisum.dto.DatabaseConnector;
import com.nisum.services.UserServices;


@Controller
public class AdminAddProductController {

	@RequestMapping(value = "/adminAddProduct", method = RequestMethod.POST )
	public void addNewProduct(HttpServletRequest request,HttpServletResponse response, @RequestParam CommonsMultipartFile fileImage1,@RequestParam CommonsMultipartFile fileImage2,@RequestParam CommonsMultipartFile fileImage3,@RequestParam CommonsMultipartFile fileImage4,@RequestParam CommonsMultipartFile fileImage5) throws IOException 
	{
	
		
	
		ModelAndView mv=new ModelAndView();
	
	String fileName1 = fileImage1.getOriginalFilename(); 
	String fileName2 = fileImage2.getOriginalFilename(); 
	String fileName3 = fileImage3.getOriginalFilename(); 
	String fileName4 = fileImage4.getOriginalFilename(); 
	String fileName5 = fileImage5.getOriginalFilename(); 
	
	//set in db filename1.jpg

	
	if (!fileImage1.isEmpty()) 
	{
	BufferedImage image = ImageIO.read(new ByteArrayInputStream(fileImage1.getBytes()));
	String path="C:/opt/product_details/"+fileName1;
	File destination = new File(path); 
	ImageIO.write(image,"jpg",destination);
	
	String path2="F:/Group11/src/main/webapp/resources/img/product/product-details/"+fileName1;
	File destination2 = new File(path2); 
	ImageIO.write(image,"jpg",destination2);
	String path3="F:/Group11/src/main/webapp/resources/img/product/two-column/"+fileName1;
	File destination3 = new File(path3); 
	ImageIO.write(image,"jpg",destination3);
	}
	if (!fileImage2.isEmpty()) 
	{
	BufferedImage image = ImageIO.read(new ByteArrayInputStream(fileImage2.getBytes()));
	String path="C:/opt/product_details/"+fileName2;
	File destination = new File(path); 
	ImageIO.write(image,"jpg",destination);
	
	String path2="C:/Users/Nisum/Desktop/Group11/src/main/webapp/resources/img/product/product-details/"+fileName2;
	File destination2 = new File(path2); 
	ImageIO.write(image,"jpg",destination2);
	}
	
	if (!fileImage3.isEmpty()) 
	{
	BufferedImage image = ImageIO.read(new ByteArrayInputStream(fileImage3.getBytes()));
	String path="C:/opt/product_details/"+fileName3;
	File destination = new File(path); 
	ImageIO.write(image,"jpg",destination);
	
	String path2="C:/Users/Nisum/Desktop/Group11/src/main/webapp/resources/img/product/product-details/"+fileName3;
	File destination2 = new File(path2); 
	ImageIO.write(image,"jpg",destination2);
	}
	
	if (!fileImage4.isEmpty()) 
	{
	BufferedImage image = ImageIO.read(new ByteArrayInputStream(fileImage4.getBytes()));
	String path="C:/opt/product_details/"+fileName4;
	File destination = new File(path); 
	ImageIO.write(image,"jpg",destination);
	
	String path2="C:/Users/Nisum/Desktop/Group11/src/main/webapp/resources/img/product/product-details/"+fileName4;
	File destination2 = new File(path2); 
	ImageIO.write(image,"jpg",destination2);
	}
	
	if (!fileImage5.isEmpty()) 
	{
	BufferedImage image = ImageIO.read(new ByteArrayInputStream(fileImage5.getBytes()));
	String path="C:/opt/product_details/"+fileName5;
	File destination = new File(path); 
	ImageIO.write(image,"jpg",destination);
	
	String path2="C:/Users/Nisum/Desktop/Group11/src/main/webapp/resources/img/product/product-details/"+fileName5;
	File destination2 = new File(path2); 
	ImageIO.write(image,"jpg",destination2);
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
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
		 System.out.println("product saved by admin....................................################");
		 out.println("saved to database...................###################");
	 }
	 else {
		 System.out.println("Product not saved by admin........******$######################");
	 }
	}
}

	
	
	
	/*
	 * Save to DB
	 * 
	 * 1. Create Product prod; object
	 * 2. set values
	 * 3. save to product Table
	 * 
	 */
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	
	
	


	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	




