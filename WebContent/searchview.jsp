<%@page import="java.util.Iterator"%>
<%@ page import="java.util.*" %>
<%@ page import="com.domain.Travel" %>
 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
     <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>Welcome <%=session.getAttribute("name")%></title>  
</head>  
<body>  
<img class="img-responsive" img src="file:///C:\Users\mannu\Desktop\carpool.jpg" alt="Lets Ride" align="center" style="height:150px;width:200px">
    <h3>Having fun ha!!!</h3>  
    <h4>  
        Hello, enjoy our search 
        <%=session.getAttribute("name")%></h4>  
 

        <table width="700px" align="center"
               style="border:1px solid #000000;">
            <tr>
                <td colspan=4 align="center"
                    style="background-color:teal">
                    <b>User Record</b></td>
            </tr>
            <tr style="background-color:lightgrey;">
                <td><b>User Id</b></td>
                <td><b>Destination</b></td>
                <td><b>Source</b></td>
                <td><b>Price</b></td>
                <td><b>Distance</b></td>
            </tr>
            <%
                int count = 0;
                String color = "#F9EBB3";
                if (request.getAttribute("piList") != null) {
                    Travel al = (Travel) request.getAttribute("piList");
                    System.out.println(al);
                    //Iterator itr = al.iterator();
                   // while (itr.hasNext()) {
 
                     //   if ((count % 2) == 0) {
                       //     color = "#eeffee";
                      //  }
                       // count++;
                       // ArrayList pList = (ArrayList) itr.next();
            %>
            <tr style="background-color:<%=color%>;">
               <td><%=al.getUserid() %></td>
               <td><%=al.getDestination()%></td>
               <td><%=al.getSource()%></td>
                <td><%=al.getPrice()%></td>
                <td><%=al.getDistance()%></td>
            </tr>
            <%
                    }
                
                if (count == 0) {
            %>
            <tr>
                <td colspan=4 align="center"
                    style="background-color:#eeffee"><b>No Record Found..</b></td>
            </tr>
            <%            }
            %>
        </table>
    </body>
</html>