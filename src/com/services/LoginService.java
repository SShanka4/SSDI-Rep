package com.services;

import com.dao.LoginDao;
import com.domain.User;

public class LoginService {

	public User validate(String n, String p) {
		// TODO Auto-generated method stub
		User user =new User();
		user=LoginDao.validate(n, p);
		return user;
	}
	
	public boolean registerUser(User user) {
		// TODO Auto-generated method stub
		boolean isRegistered=LoginDao.registerUser(user);
		return isRegistered;
	}
	
	

}
