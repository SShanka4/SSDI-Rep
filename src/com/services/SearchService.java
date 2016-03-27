package com.services;

import java.util.ArrayList;

import com.dao.SearchDao;

public class SearchService {

	public ArrayList searchByName(String pid) {
		// TODO Auto-generated method stub
		ArrayList pid_list = new ArrayList();
		SearchDao searchDao=new SearchDao();
		pid_list=searchDao.searchByName(pid);
		return pid_list;
		
	}

}
