<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.domain.User" %>
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
  <%
    User user =(User) session.getAttribute("name");
	%>    
<title>Welcome <%=session.getAttribute("name")%></title>  
</head>  
<body>  
<img class="img-responsive" img src="file:///C:\Users\Vishal\Desktop\unnamed.jpg" alt="Lets Ride" align="center" style="height:150px;width:200px">
     <h3>Login successful!!!</h3>
  
    <h4>  
        Hello, <%=user.getFirstname()%></h4> 
     <form action="${pageContext.request.contextPath}/logout" method="post">
    <input type="submit" value="Logout" />
</form>
        
   <div class="container-fluid">
 
<div class="relative">      
 <form method="post" name="frm" action="Search" class="form">
 
      <table border="0" width="300" align="center" bgcolor="#e9f">
      <div class="form-group"> 
        <tr><td colspan=2 style="font-size:12pt;" align="center">
        <h3>Search rides</h3></td></tr>
        </div>
        <div class="form-group"> 
        <tr><td ><b>Source</b></td>
        <td>: <input  type="text" name="pid" id="pid">
        <tr><td ><b>Destination</b></td>
          <td>: <input  type="text" name="destination" id="destination">
        </td></tr>    </div>
        <div class="form-group">     
        <tr><td colspan=2 align="center">
        <input  type="submit" name="submit" value="Search"></td></tr></div>
      </table>
    </form>
</body>
</html>
</body>  
</html>  