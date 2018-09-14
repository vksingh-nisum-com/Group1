package com.nisum.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nisum.dao.ShippingDetails;
import com.nisum.util.HibernateUtil;

@Controller
public class ShippingHandler {
	@RequestMapping("/billingDetails")
	public ModelAndView register(HttpServletRequest request,HttpServletResponse response) throws IOException {
		ModelAndView mv=new ModelAndView();
		PrintWriter out = response.getWriter();
		String country= request.getParameter("S_country");
		String firstName= request.getParameter("S_firstname");
		String lastName= request.getParameter("S_lastname");
		String address= request.getParameter("S_address");
		String city= request.getParameter("S_city");
		String email= request.getParameter("S_email");
		String phone= request.getParameter("S_phone");
		ShippingDetails sd = new ShippingDetails();
		sd.setCountry(country);
		sd.setFirstName(firstName);
		sd.setLastName(lastName);
		sd.setAddress(address);
		sd.setCity(city);
		sd.setEmail(email);
		sd.setPhone(phone);
		
			//sd.setCreatedBy(addedBy);
		boolean isOrder = orderPlace(sd);
		if(isOrder){
				out.println(" Order Placed Successfully!");
		}
		else{
				out.println(".....");
		}
		return mv;   
	}
	private boolean orderPlace(ShippingDetails sd){
		
		if(!sd.equals(null)){
			try{
				Session session = HibernateUtil.getSessionFactory().openSession();
				session.beginTransaction();
				session.save(sd);
			    session.getTransaction().commit();
			    return true;
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		return false;
	}
}
