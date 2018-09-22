package com.nisum.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class  FashionController {
	@RequestMapping("/fashion")
	public ModelAndView gotofashionpage(HttpServletRequest request,HttpServletResponse response) throws IOException {
		System.out.println("fashion product is ready to sell..........");
		ModelAndView mv=new ModelAndView();
		mv.setViewName("homeCarousel");
		return mv;


	}

}