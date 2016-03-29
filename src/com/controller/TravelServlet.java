package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.domain.Travel;
import com.domain.User;
import com.services.LoginService;
import com.services.TravelService;

/**
 * Servlet implementation class TravelServlet
 */
@WebServlet("/postiti")
public class TravelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TravelServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");    
        PrintWriter out = response.getWriter();    
        
        //Look at this piece of code everytime you run
        
        int id=8;
        //HttpSession session = request.getSession(); 
        //User user =(User) session.getAttribute("name");
        //User user=(User) request.getSession(false).getAttribute("name");
        //System.out.println(user.getId());
        //System.out.println(user.getFirstname());
        TravelService travelService=new TravelService();
        String firstname=request.getParameter("sessionId");
        int userid=travelService.fetchUserID(firstname);
        System.out.println("this is the userId:"+userid);
        String source=request.getParameter("source");    
        String destination=request.getParameter("destination");  
        int price=Integer.parseInt(request.getParameter("price"));    
        Long distance=Long.parseLong(request.getParameter("distance")); 
        int capacity=Integer.parseInt(request.getParameter("capacity")); 
        
              
        Travel travel=new Travel();
        
        travel.setSource(source);
        travel.setDestination(destination);
        travel.setPrice(price);
        travel.setDistance(distance);
        travel.setUserid(userid);
        travel.setId(id);
        
        
        
        boolean userInserted=travelService.postTravel(travel);
        if(userInserted)
        {
        	out.print("<p style=\"color:red\">User successfully registered! You can login now!</p>");
        	RequestDispatcher rd=request.getRequestDispatcher("registerSuccess.jsp");
        	rd.forward(request, response);
        }
        
      
        else
        {
        	out.print("<p style=\"color:red\">Passwords do not match!</p>");
        	RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
        }
  
        out.close();    
		
		
	}

}
