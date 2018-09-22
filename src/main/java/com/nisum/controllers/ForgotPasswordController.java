package com.nisum.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Random;
import java.util.stream.IntStream;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.nisum.services.UserServices;
@Controller
public class ForgotPasswordController {
	@RequestMapping("/forgotPass")
	public ModelAndView checkingvalidgmail(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		ModelAndView mv=new ModelAndView();
    	HttpSession session1=request.getSession();
    	String username=request.getParameter("loginUsername");
    	session1.setAttribute("usernameforreset", username);
    	UserServices userObj=new UserServices();
		PrintWriter out = response.getWriter();
    	boolean status=userObj.checkValidUserForResetPassword(username);
    	
    	if(status) {
    		int otp1=userObj.generate6DigitRandomValue();
    		  String str2 = Integer.toString(otp1);
  		      session1.setAttribute("senderotp", str2);
  		      String otp="Your otp for change password is:"+str2;
  		      boolean otpStatus=userObj.sendMessage(username,otp);
  		      if(otpStatus) {
  		    	mv.setViewName("otpchecker");
  	    		return mv;
  		    	  
  		      }
  		      else
  		      {
  		    	  mv.setViewName("login");
  		    	  mv.addObject("loginMessage", "Mail API Authentication Problem Occured re-try");
  		    	  return mv;
  		    	  
  		      }
    	}
    	else {
    		mv.setViewName("login");
    		mv.addObject("registeringStatus","you are not a valid user please register");
    		return mv;
    	}
}
}
