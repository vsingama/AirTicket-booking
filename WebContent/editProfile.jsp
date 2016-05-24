<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Profile</title>

<%@include file="header.jsp" %>
 
 <div id="abc">

<form name="login-form" class="login-form12" action="" method="post">

    <div class="header12">
    <h1 style="color:#0094FF;" align="center">Welcome to your account</h1> <br />
    <hr />
    </div>

    <div class="content12">
	<h1 style="color:#0094FF;"> &nbsp;&nbsp;&nbsp;<a href= "MyHistory?userid=<%= session.getAttribute("userid") %>" > Booking History </a>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	 <a href= "cancelTicket.jsp" > Cancel a ticket </a> </h1>
	 <h1 align="center" style="color:#0094FF;"><a href= "editProfile.jsp" >Edit Profile</a></h1>
	</div>

<div class="footer12">
  <input type="submit" name="submit" value="Create Login" class="button" />
    </div>
</form>
</div> 
 <br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /> <br /> <br /><br /> <br /> <br /><br /> <br /> <br /><br />
   <hr />
   
   <%@include file="footer.jsp" %>
   
</body>
</html>