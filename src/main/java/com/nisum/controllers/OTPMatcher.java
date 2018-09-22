package com.nisum.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class OTPMatcher {
	static int countotp=0;
	@RequestMapping("/otpmatch")
	public ModelAndView otpmat(HttpServletRequest request,HttpServletResponse response) throws IOException {
		//static int count;
		ModelAndView mv=new ModelAndView();
    	HttpSession session1=request.getSession();
    	String userotp=request.getParameter("userOTP");
    	
    	
    	
    	String sessionotp=(String) session1.getAttribute("senderotp");
    	System.out.println(  "user otp="+userotp     +"  sessionotp     " +sessionotp);
    	
    	if(sessionotp.equals(userotp)) {
    		mv.setViewName("resetPassword");
    		
    		session1.removeAttribute("senderotp");
    		countotp=0;
    		return mv;
    		
    		
    		
    	}
    	else {
    		if(countotp<3) {
    			
    			
    		countotp++;
    		mv.setViewName("otpchecker");
    		mv.addObject("otpMessage","otp is not matched");
    		return mv;
    		}
    		else {
    			mv.setViewName("login");
    			session1.removeAttribute("senderotp");
    			mv.addObject("registeringStatus","You have exceeded the limit. not a valid user? please register");
        		return mv;
    		}
    	}
	
	}
}
    
