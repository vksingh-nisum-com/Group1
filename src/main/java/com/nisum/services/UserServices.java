package com.nisum.services;

import com.nisum.dao.User;

public class UserServices {
	public <T> T setValues( T user,String fullname,String userName,String email,String passsword,String phone,String re) {
		((User) user).setFullName(fullname);
		user.setUserName(userName);
		user.setEmail(email);
		user.setPassword(password);
		user.setPhone(phone);
		user.setRePassword(repassword);
		return user;
		
	}

}
