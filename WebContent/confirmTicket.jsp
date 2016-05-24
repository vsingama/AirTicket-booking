<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.air.domain.BookingDetails, java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ticket Confirmation</title>

<%@include file="header.jsp" %>
 
 <div id="abc">

<form name="login-form" class="login-form12" action="" method="post">

    <div class="header12">
    <h1 align="center">Ticket Confirmation Details</h1>
    </div>
	
    <div class="content12">
	<% BookingDetails fds = (BookingDetails)request.getAttribute("confirm"); %>
	
	<% long userid = fds.getUserid();  %>
	
	<p align ="center">Your flight ticket has been confirmed.! Your reservation ID <b style="color:green;"><%= fds.getConfirmationID() %></b>	 </p>
	<br />
	<p align="center">An email has been sent to the given mail ID..!! </p>
	<br /><br />
	
		<% if (session.getAttribute("fname") != null){%>
	<%}
	else{%>
			<p align="center"><i>To create an account <a href="createlogin.jsp?userid=<%= userid %>">click here</a></i></p>		
	<%}
	%>
	
</div>

<div class="footer12">
 <div class="footer123">
	<p align="center"style="color:#0094FF;"> <b>Use Email ID and Reservation ID to check/print your ticket status ..!!</b></p>
	 <a href="myBooking.jsp">View My Ticket</a>
    </div>
    </div>
</form>
</div> 
 <br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /> <br /> <br /><br /> <br /> <br /><br /> <br /> <br />
   <br />
   <hr />
   
   <%@include file="footer.jsp" %>
   
</body>
</html>
