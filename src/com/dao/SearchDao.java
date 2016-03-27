package com.dao;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;

import com.services.SearchService;

public class SearchDao {

	public ArrayList searchByName(String pid) {
		// TODO Auto-generated method stub
		
 
        Statement st;
        Connect connect=new Connect();
        Connection conn=connect.initiateConnction();
 
            ArrayList al = null;
            ArrayList pid_list = new ArrayList();
            String query = "select * from users where firstname='" + pid + "' ";
 
            System.out.println("query " + query);
            
            try{
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
 
            while (rs.next()) {
                al = new ArrayList();
 
//                out.println(rs.getString(1));
//                out.println(rs.getString(2));
//                out.println(rs.getString(3));
//                out.println(rs.getString(4));
                al.add(rs.getString(1));
                al.add(rs.getString(2));
                al.add(rs.getString(3));
                al.add(rs.getString(4));
 
                System.out.println("al :: " + al);
                pid_list.add(al);
            }
            conn.close();
            System.out.println("Disconnected!");
            return pid_list;
            }
            
            catch (Exception e) {
                e.printStackTrace();
            }
            
            
            
          return null;
 
		
		
	}

}
