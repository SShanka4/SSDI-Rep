package com.dao;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;

import com.domain.Travel;
import com.services.SearchService;

public class SearchDao {

	public Travel searchByName(String pid,String destination) {
		// TODO Auto-generated method stub
		
 
        Statement st;
        Connect connect=new Connect();
        Connection conn=connect.initiateConnction();
 
            ArrayList al = null;
            ArrayList pid_list = new ArrayList();
            String query = "select * from travel where source='" + pid + "' and destination='" + destination + "' ";
 
            System.out.println("query " + query);
            
            try{
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            Travel travel=new Travel();
 
            while (rs.next()) {
                al = new ArrayList();
 
//                out.println(rs.getString(1));
//                out.println(rs.getString(2));
//                out.println(rs.getString(3));
//                out.println(rs.getString(4));
                travel.setId(Integer.parseInt(rs.getString(1))); 
                travel.setSource(rs.getString(2)); 
                travel.setDestination(rs.getString(3));
                travel.setDistance(Long.parseLong(rs.getString(4)));
                travel.setPrice(Integer.parseInt(rs.getString(5)));
                travel.setUserid(Integer.parseInt(rs.getString(6)));
 
               // System.out.println("al :: " + al);
                //pid_list.add(al);
            }
            conn.close();
            System.out.println("Disconnected!");
            return travel;
            }
            
            catch (Exception e) {
                e.printStackTrace();
            }
            
            
            
          return null;
 
		
		
	}

}
