package com.services;

import com.dao.LoginDao;
import com.domain.User;

public class LoginService {

	public boolean validate(String n, String p) {
		// TODO Auto-generated method stub
		boolean isValid=LoginDao.validate(n, p);
		return isValid;
	}
	
	public boolean registerUser(User user) {
		// TODO Auto-generated method stub
		boolean isRegistered=LoginDao.registerUser(user);
		return isRegistered;
	}
	
	

}
