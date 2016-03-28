package com.services;

import java.util.ArrayList;

import com.dao.SearchDao;
import com.domain.Travel;

public class SearchService {

	public Travel searchByName(String pid,String destination) {
		// TODO Auto-generated method stub
		Travel travel=new Travel();
		SearchDao searchDao=new SearchDao();
		travel=searchDao.searchByName(pid,destination);
		return travel;
		
	}

}
