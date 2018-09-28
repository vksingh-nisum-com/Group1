package com.nisum.junitTest;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.nisum.entity.User;
import com.nisum.services.UserServices;

public class ServiceTest1 extends UserServices {
	User user=null;
    @Before
	public void setUp() {
	  user=new User();
	}
	@Test
	public User setValues(String fullname,String username, String email,String password,String phone) {
	    Assert.assertNotNull(user);
		user.setFullName(fullname);
		user.setUserName(username);
		user.setEmail(email);
		user.setPassword(password);
		user.setPhone(phone);
		return user;
	}
	

}
