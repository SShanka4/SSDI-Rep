package com.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.domain.Travel;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;

public class TravelDao {

	public static boolean postTravel(Travel travel)
	{
		Connection conn;
		int rs;
		PreparedStatement pst = null;
		try 
		{ 		
		   Connect connect=new Connect();
		   conn=connect.initiateConnction();		
		   
		   pst = conn.prepareStatement("insert into travel values (?,?,?,?,?,?,?)");
		   pst.setInt(1, travel.getId());  
           pst.setString(2, travel.getSource()); 
           pst.setString(3, travel.getDestination());
           pst.setLong(4, travel.getDistance());
           pst.setInt(5, travel.getPrice());
           pst.setInt(6, travel.getUserid());
           pst.setInt(7, travel.getCapacity());
           
           rs = pst.executeUpdate(); 
           
		}catch (Exception e) {  
            System.out.println(e);  
        } finally {  
               if (pst != null) {  
                try {  
                    pst.close();  
                } catch (SQLException e) {  
                    e.printStackTrace();  
                }  
            }  
            
        }  
		
		return true;
	}
}
