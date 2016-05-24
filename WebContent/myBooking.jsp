<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View My Booking</title>

<%@include file="header.jsp" %>

<div id="abc" align="center">

<form name="login-form" class="login-form12" action="MyBooking" method="post">

    <div class="header12">
    <h1 style="color:#0094FF;" align="center">Check your Booking</h1>
    </div>
    
    <div align= "center">    
    Email ID   &nbsp;&nbsp;&nbsp;   :  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="emailID" type="text" class="textstyle1" /> 	 <br /><br />
    Confirmation Number  :  &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;<input name="confirmation" type="text" class="textstyle1"/><br /><br />
	</div>
	
 <div class="footer12">
	<input type="submit" name="submit" value="Retrieve Ticket" class="button" />
    </div>
</form>
</div> 
 <br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br />
   <br />

<%@include file="footer.jsp" %>


</body>
</html>