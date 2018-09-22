package com.nisum.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class  GotoLoginController {
	@RequestMapping("/signin")
	public ModelAndView log(HttpServletRequest request,HttpServletResponse response) throws IOException {
		System.out.println("login process started..........");
		ModelAndView mv=new ModelAndView();
		mv.setViewName("login");
		return mv;


	}

}
