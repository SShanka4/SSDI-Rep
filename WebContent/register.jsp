<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script language="javascript">
function validation()
{
	if (document.signup.firstname.value == "") 
	{
    	document.getElementById('errors').innerHTML="*Please enter a username*";
    	return false;
	}
}
</script>
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
      <form name="signup" action="/LetsRide/login" method="post" onsubmit="return validation();">  
        <fieldset style="width: 300px">  
            <legend> Sign UP </legend>  
            <table align="center">  
            <div class="form-group">
                <tr>  
                    <td>Firstname</td>  
                    <td><input type="text" name="firstname" required="required" /></td>  
                </tr>  
                </div>
                <div class="form-group">
                  <tr>  
                    <td>Lastname</td>  
                    <td><input type="text" name="lastname" required="required" /></td>  
                </tr> 
                </div>
                <div class="form-group">
                  <tr>  
                    <td>Email ID</td>  
                    <td><input type="text" name="email" required="required" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$" /></td>  
                </tr> 
                </div>
                <div class="form-group">
                  <tr>  
                    <td>Sex</td>  
                    <td>               <select name="sex">
  											<option value="male">Male</option>
 											 <option value="female">Female</option>
										</select>
				 </td>  
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
                    <td>Confirm Password</td>  
                    <td><input type="password" name="confirmpass" required="required" /></td>  
                </tr> 
                </div>
                <div class="form-group">
                 <tr>  
                    <td>Phone</td>  
                    <td><input type="text" name="phone" required="required" /></td>  
                </tr> 
                </div>
                <div class="form-group">
                <tr>  
                    <td>Age</td>  
                    <td><input type="text" name="age" required="required" /></td>  
                </tr> 
                </div>
                <div class="form-group">
                <tr>  
                    <td>Address</td>  
                    <td><input type="text" name="address" required="required" /></td>  
                </tr>
                </div>
                <div class="form-group">
                <tr>  
                    <td>City</td>  
                    <td><input type="text" name="city" required="required" /></td>  
                </tr>  
                </div>
                <div class="form-group">
                <tr>  
                    <td>Zip</td>  
                    <td><input type="text" name="zip" required="required" /></td>  
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
</body>
</html>