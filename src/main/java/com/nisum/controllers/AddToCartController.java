package com.nisum.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nisum.dto.CartItem;

@Controller
public class AddToCartController {
	@RequestMapping("/addtocart")
	public ModelAndView getUserSpecificPage(HttpServletRequest req,HttpServletResponse res)
	{
	   
		String itemImage=req.getParameter("img");
		String itemName=req.getParameter("productName");
		String itemQuantity=req.getParameter("qty");
		String itemsPrice=req.getParameter("price");
		String itemSize=req.getParameter("size");	
		
		System.out.println("In AddToCartController");
		System.out.println(itemImage+" "+itemName+" "+itemQuantity+" "+itemSize+" "+itemsPrice);
		
		CartItem cart=new CartItem();
		
		cart.setItemImage(itemImage);
		cart.setItemName(itemName);
		cart.setItemQuantity(itemQuantity);
		cart.setItemsPrice(itemsPrice);
		cart.setItemSize(itemSize);
		
		
		
		
		//return cart.jsp
		
		return null;
	}
	

}
