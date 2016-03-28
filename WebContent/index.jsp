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
<title>Lets Ride</title>
</head>
 
<body>  
<img class="img-responsive" img src="file:///C:\Users\mannu\Desktop\carpool.jpg" alt="Lets Ride" align="center" style="height:150px;width:200px">
<h1 style="text-align:center";"font-size:200%";"font-family:Monotype Corsiva"><i> Create your LetsRide Account</i></h1>
  <div class="container-fluid">
   <div class="jumbotron">
       <form action="/LetsRide/login" method="get" class="form">
          <fieldset style="width: 300px">  
            <legend> Login to App </legend>  
            <table align="center">  
            <div class="form-group"> 
                <tr>  
                    <td>User ID</td>  
                    <td><input type="text" name="username" required="required" /></td>  
                </tr>  
                </div>
                <div class="form-group"> 
                <tr>  
                    <td>Password</td>  
                    <td><input type="password" name="userpass" required="required" /></td>  
                </tr>  
                </div>
                <div class="form-group"> 
                <tr>  
                    <td><input type="submit" value="Login" /></td>  
                </tr>  
                </div>
            </table>  
        </fieldset>  
    </form> 
    
<a href=register.jsp> Sign Up</a>

  </body>  
</html>  