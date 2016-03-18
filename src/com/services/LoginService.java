package com.services;

import com.dao.LoginDao;

public class LoginService {

	public boolean validate(String n, String p) {
		// TODO Auto-generated method stub
		boolean isValid=LoginDao.validate(n, p);
		return isValid;
	}

}
