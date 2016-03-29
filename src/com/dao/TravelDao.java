package com.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.domain.Travel;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class TravelDao {

	public static boolean postTravel(Travel travel)
	{
		Connection conn;
		Statement st = null;
		int rs;
		PreparedStatement pst = null;
		ResultSet maxId;
		try 
		{ 		
		   Connect connect=new Connect();
		   conn=connect.initiateConnction();	
		    String sql="select max(id) from travel";
		    try{
		    	st = (Statement) conn.createStatement();
            maxId=(ResultSet) st.executeQuery(sql);
            while(maxId.next())
            {
            	travel.setId(maxId.getInt(1)+1);
            }
            System.out.println("max id fetched="+travel.getId());
		    }catch (Exception e)
		    {
		    	System.out.println("Inside catch of max Id");
		    }
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

	public static int fetchUserId(String firstname) {
		// TODO Auto-generated method stub
		java.sql.Statement st;
        Connect connect=new Connect();
        Connection conn=connect.initiateConnction();
		System.out.println("hey inside try"+firstname);
		String query = "select * from users where firstname='" + firstname + "'";
		 
        System.out.println("query " + query);
        
        try{
        System.out.println("inside try");
        st = conn.createStatement();
        java.sql.ResultSet rs = st.executeQuery(query);
        System.out.println("after query execution");
        
        while (rs.next()) {
        	System.out.println("yes");
           int userid=Integer.parseInt(rs.getString(1)); 
           return userid;

          
        }
        
        conn.close();
        System.out.println("Disconnected!");
        
        }
        
        catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
      return 0;
	}
}
