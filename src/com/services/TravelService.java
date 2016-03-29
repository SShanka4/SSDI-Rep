package com.services;

import com.dao.TravelDao;
import com.domain.Travel;

public class TravelService {
	
	public boolean postTravel(Travel travel)
	{
		boolean posted;
		System.out.println(travel.getUserid());
		posted=TravelDao.postTravel(travel);
		return posted;
	}

	public int fetchUserID(String firstname) {
		// TODO Auto-generated method stub
		
		System.out.println("Service travel::"+firstname);
		int userid=TravelDao.fetchUserId(firstname);
		return userid;
	}

}
