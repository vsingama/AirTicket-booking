<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Account</title>

<%@include file="header.jsp" %>
 
 <div id="abc">

<form name="login-form" class="login-form12" action="" method="post">

    <div class="header12">
    <h1 style="color:#0094FF;" align="center">Welcome to your account</h1> <br />
    <hr />
    </div>
	<% String name= session.getAttribute("userid").toString(); %>
    <div class="content12">
	<h1> &nbsp;&nbsp;&nbsp;<a href= "MyHistory?userid=<%= name %>" > Booking History </a>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	 <a href= "CancelTicket?userid=<%= name %>" > Cancel a ticket </a> </h1>
	 <h1 align="center"><a href= "editProfile.jsp" >Edit Profile</a></h1>
	</div>
	<br />
</form>
</div> 

 	<br /><br /><br /><br /><br /><br /> <br /> <br /><br /> <br /> <br /><br /> <br /> <br /><br />
   <hr />
   
   <%@include file="footer.jsp" %>
   
</body>
</html>