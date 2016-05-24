<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.util.*" import="java.text.DateFormat" import="java.text.SimpleDateFormat" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Flight Details</title>

<%@include file="header.jsp" %>

<div id="abc">

	<form name="login-form" class="login-form12" action="FlightSearch" method="post">

    <div class="header12">
    <h1 style="color:#0094FF;" align="center">Flight Search</h1>
  </div>
	
	<p style="visibility: hidden;">
	<% Date theDate = new java.util.Date(); %>
	<% DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); %>
	<% String formattedDate = df.format(theDate); %> </p>
	
	<div class="content12">
	From     :
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="starting" type="text" class="textstyle1" /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	To       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="dest" type="text" class="textstyle1"   /><br /><br />
	 Journey Date  :       
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="startdate" type="date" class="textstyle1" min=<%= formattedDate %>  />  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	 Return : 
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="return" type="date" class="textstyle1" min=<%= formattedDate %>  />  (Optional) <br /><br />
	 Select Class :  
	 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select name="classType" class="textstyle3"> 
		<option value="Economy" selected>Economy</option>
		<option value="Business">Business</option>
		</select><br /><br />
	Persons : 
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="person" type="number" class="textstyle1" min="1" max="5"  />  <br /><br />
	</div>
    
    <div class="footer12">
	<input type="submit" name="submit" value="Search" class="button" />
    </div>
</form>
</div> 
 <br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /> <br /> <br /><br /> <br /> <br /><br /> <br /> <br />
   <br />
   <hr />
   
<%@include file="footer.jsp" %>

</body>
</html>