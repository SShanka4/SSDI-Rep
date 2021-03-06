package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.domain.Travel;
import com.services.SearchService;
 
public class SearchServlet extends HttpServlet {
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            System.out.println("Connected!");
            String pid = request.getParameter("pid");
            String destination = request.getParameter("destination");
            
            
            
 
            Travel travel=new Travel();
            SearchService searchService=new SearchService();
            travel=searchService.searchByName(pid,destination);            
            request.setAttribute("piList", travel);
            RequestDispatcher view = request.getRequestDispatcher("/searchview.jsp");
            view.forward(request, response);

    }
 
    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
