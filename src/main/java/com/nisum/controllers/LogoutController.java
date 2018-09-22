package com.nisum.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class LogoutController {
	@RequestMapping("/logout")
	protected ModelAndView logout(HttpServletRequest request, HttpServletResponse response) throws  IOException {
	HttpSession session=request.getSession();
	session.removeAttribute("username");
	//session.invalidate();
	ModelAndView mv=new ModelAndView();
	mv.setViewName("login");
	return mv;	
 }
}
