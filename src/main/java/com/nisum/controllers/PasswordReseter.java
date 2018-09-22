package com.nisum.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nisum.dto.DatabaseConnector;
import com.nisum.services.UserServices;

@Controller
public class PasswordReseter {
	@RequestMapping("/passwordreset")
	public ModelAndView reset(HttpServletRequest request,HttpServletResponse response) throws IOException {
		System.out.println("password reset process started..........");
		ModelAndView mv=new ModelAndView();
    	HttpSession session=request.getSession();
		UserServices userObj=new UserServices();
		PrintWriter out = response.getWriter();
		String username = (String) session.getAttribute("usernameforreset");
		String password= request.getParameter("loginPassword");
		String rePassword=request.getParameter("confirmloginPassword");		
		if(!password.equals(rePassword)){
			mv.setViewName("resetPassword");
			mv.addObject("resetMessage", "password and confirm Password is not matched");
			return mv;
		}
		password=userObj.MD5EncryptionMethod(password);
		DatabaseConnector dbcon=new DatabaseConnector();
		boolean status=dbcon.resetPasswordByUsername(username,password);
		if(status) {
			session.removeAttribute("usernameforreset");
			mv.addObject("loginMessage", "password is updated");
			mv.setViewName("login");
			return mv;			
		}
		else {
			mv.addObject("loginMessage", "sorry some db problem occured.... again click forgot password");
			System.out.println("password is not updated......reset ");
			mv.setViewName("login");
			return mv;	
		}
		
		
		
		

}
}
