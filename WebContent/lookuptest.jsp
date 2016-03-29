<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>

<style>
input[type=text], select {
    width: 90%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 2px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
   }
   
   img {
    max-width: 100%;
    style=height:125px;
    width:200px;
    left: 370px;
    position: relative;
    }


input[type=password], select {
    width: 90%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 2px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
    
}

input[type=submit] {
    width: 45%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    
}

input[type=submit]:hover {
    background-color: #45a049;
}

div.relative {
    position: relative;
    border: 3px; 
    width: 30%;  
    background-color: #f2f2f2;
    padding: 30px;
    margin: auto;}

    </style>
 </head>
 
 <body>
  <img src="file:///C:\Users\mannu\Desktop\carpool.jpg" alt="Lets Ride" >
     <h1 style="text-align:center";"font-size:200%";"font-family:Monotype Corsiva"><i> Login your LetsRide Account</i></h1>

 <div class="container-fluid">
 
<div class="relative">
<div>
  <form action="action_page.php">
    <label for="fname";style="color:blue"><b> Login</b></label> <br>
    <input type="text" id="fname" name="firstname" required="required" placeholder="Enter E-mail">
    <br> 
    <p>
    <label for="lname"><b>Password</b></label>  <br>
    <input type="password" id="lname" name="lastname" required="required" placeholder="Enter Password">
    <br>
        <input type="submit" value="Submit">
  </form>
</div>
</div>
</div>


</body>
</html>