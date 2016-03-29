package com.dao;

import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.PreparedStatement;  
import java.sql.ResultSet;  
import java.sql.SQLException;

import com.domain.User;
import com.mysql.jdbc.Statement;  
  
public class LoginDao {  
    public static User validate(String name, String pass) {          
        boolean status = false;  
        Connection conn = null;  
        PreparedStatement pst = null;  
        ResultSet rs = null;  
  
        String url = "jdbc:mysql://localhost:3306/";  
        String dbName = "letsride";  
        String driver = "com.mysql.jdbc.Driver";  
        String userName = "root";  
        String password = "root";  
        try {  
            Class.forName(driver).newInstance();  
            conn = DriverManager  
                    .getConnection(url + dbName, userName, password);  
  
            User user=new User();
            pst = conn.prepareStatement("select * from users where firstname=? and password=?");  
            pst.setString(1, name);  
            pst.setString(2, pass); 
           
  
            rs = pst.executeQuery(); 
            
            while(rs.next())
            {
                   user.setFirstname(rs.getString(2));
                   user.setLastname(rs.getString(3));
                   user.setRole(rs.getString(12));
            }
            //status = rs.next(); 
            return user; 
  
        } catch (Exception e) {  
            System.out.println(e);  
        } finally {  
            if (conn != null) {  
                try {  
                    conn.close();  
                } catch (SQLException e) {  
                    e.printStackTrace();  
                }  
            }  
            if (pst != null) {  
                try {  
                    pst.close();  
                } catch (SQLException e) {  
                    e.printStackTrace();  
                }  
            }  
            if (rs != null) {  
                try {  
                    rs.close();  
                } catch (SQLException e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
        return null;
         
    }

	public static boolean registerUser(User user) {
		// TODO Auto-generated method stub
		boolean status = false;  
        Connection conn = null;  
        PreparedStatement pst = null;  
        int rs;  
  
        String url = "jdbc:mysql://localhost:3306/";  
        String dbName = "letsride";  
        String driver = "com.mysql.jdbc.Driver";  
        String userName = "root";  
        String password = "root";  
        try { 
        	
        	int i=3;
            Class.forName(driver).newInstance();  
            conn = DriverManager  
                    .getConnection(url + dbName, userName, password);  
            
            Statement st=(Statement) conn.createStatement();
            String sql="select max(id) from users";
            ResultSet maxId=st.executeQuery(sql);
            while(maxId.next())
            {
            	user.setId(maxId.getInt(1)+1);
            }
  
            pst = conn.prepareStatement("insert into users values(?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setInt(1, user.getId());
            pst.setString(2, user.getFirstname());  
            pst.setString(3, user.getLastname()); 
            pst.setString(4, user.getPassword());
            pst.setInt(5, user.getAge());
            pst.setString(6, user.getEmail());
            pst.setLong(7, user.getPhone());
            pst.setString(8, user.getSex());
            pst.setString(9, user.getAddress());
            pst.setString(10, user.getCity());
            pst.setLong(11, user.getZip());
            pst.setString(12, user.getRole());
            
            
            
           
  
            rs = pst.executeUpdate();  
              
  
        } catch (Exception e) {  
            System.out.println(e);  
        } finally {  
            if (conn != null) {  
                try {  
                    conn.close();  
                } catch (SQLException e) {  
                    e.printStackTrace();  
                }  
            }  
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