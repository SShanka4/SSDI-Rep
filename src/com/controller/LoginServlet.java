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

import com.dao.LoginDao;
import com.domain.User;
import com.services.LoginService;

/**
 * Servlet implementation class Login
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");    
        PrintWriter out = response.getWriter();    
          
        String n=request.getParameter("username");    
        String p=request.getParameter("userpass");   
          
        HttpSession session = request.getSession(false);  
        if(session!=null)  
        session.setAttribute("name", n);  
  
        LoginService loginService=new LoginService();
        boolean isValid=loginService.validate(n,p);
        
        if(isValid){    
            RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");    
            rd.forward(request,response);    
        }    
        else{    
            out.print("<p style=\"color:red\">Sorry username or password error</p>");    
            RequestDispatcher rd=request.getRequestDispatcher("index.jsp");    
            rd.include(request,response);    
        }    
  
        out.close();
    
	}
	
	
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");    
        PrintWriter out = response.getWriter();    
          
        String firstname=request.getParameter("firstname");    
        String lastname=request.getParameter("lastname");  
        String email=request.getParameter("email");    
        String sex=request.getParameter("sex"); 
        String password=request.getParameter("userpass");    
        String phone=request.getParameter("phone"); 
        String age=request.getParameter("age");    
        String address=request.getParameter("address"); 
        String city=request.getParameter("city");    
        String zip=request.getParameter("zip"); 
        
        User user=new User();
        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setEmail(email);
        user.setPassword(password);
        user.setPhone(Long.parseLong(phone));
        user.setAge(Integer.parseInt(age));
        user.setAddress(address);
        user.setCity(city);
        user.setZip(Long.parseLong(zip));
        
        
        LoginService loginService=new LoginService();
        boolean userInserted=loginService.registerUser(user);
        if(userInserted)
        {
        	out.print("<p style=\"color:red\">User successfully registered! You can login now!</p>");
        	RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
        }
  
        out.close();    
	}


}
