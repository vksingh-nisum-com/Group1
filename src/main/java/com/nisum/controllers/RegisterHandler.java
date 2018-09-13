package com.nisum.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nisum.dao.User;
import com.nisum.util.HibernateUtil;

@Controller
public class RegisterHandler {
	@RequestMapping("/registerProcess")
	public ModelAndView register(HttpServletRequest request,HttpServletResponse response) throws IOException {
		ModelAndView mv=new ModelAndView();
		PrintWriter out = response.getWriter();
		String fullname= request.getParameter("R_name");
		String userName= request.getParameter("R_username");
		String email= request.getParameter("R_email");
		String password= request.getParameter("R_password");
		String repassword= request.getParameter("R_repassword");
		String phone= request.getParameter("R_phone");
		User user = new User();
		
			//user.setCreatedBy(addedBy);
		boolean isCreated = createNewUser(user);
		if(isCreated){
				out.println("user created successfully !");
				//response.sendRedirect(welcome.jsp);
		}
		else{
				out.println("Unable to create user please try again");
		}
		return mv;   
	}
	private boolean createNewUser(User user){
		
		if(!user.equals(null)){
			try{
				Session session = HibernateUtil.getSessionFactory().openSession();
				session.beginTransaction();
				session.save(user);
			    session.getTransaction().commit();
			    return true;
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		return false;
	}
}
		
		
		
	
	
	

