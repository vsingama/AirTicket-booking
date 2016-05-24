<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="com.air.domain.FlightDetails, java.util.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Details</title>

<%@include file="header.jsp" %>

<div id="abc">
 
	<form name="login-form" class="login-form12" action="BookingConfirmation" method="post">
	
	<div class="header12">
    <h3 style="color:#0094FF;" align= "center">You are just one step away..!!</h3>
	<br /><br /><hr />
    </div>
	
	<% FlightDetails fds = (FlightDetails)request.getAttribute("custom"); %>
	
    <div class="content12" >
	<div align ="center">
	<h2 style="color:#0094FF;">Your Flight Details </h2><br />
	<img src="<%= fds.getImage() %>" alt="pic not found" width="75" height="50" /><br /><br />
	<p><b>&nbsp;&nbsp;&nbsp;&nbsp;From : <%= fds.getStarting() %>   &nbsp;&nbsp;&nbsp; To:  <%= fds.getDestination() %> </b><br /><br />
	<b>&nbsp;&nbsp;&nbsp;&nbsp;Flight Number : <%= fds.getFlightid() %> </b><br /><br /> 
	<b>&nbsp;&nbsp;&nbsp;&nbsp;Departure Time : <%= fds.getTimeofdeparture() %> </b> <b>&nbsp;&nbsp;&nbsp;&nbsp;Arrival Time : <%= fds.getDestinationTime() %> </b><br />
	<br /><b>&nbsp;&nbsp;&nbsp;&nbsp;Class : <%= fds.getTypeofClass() %> </b><br />
	<br /><b>&nbsp;&nbsp;&nbsp;&nbsp;Number of Tickets : <%= fds.getPassCount() %> </b><br />
	<br /><b>&nbsp;&nbsp;&nbsp;&nbsp;Journey Date : <%= fds.getJourneyDate() %> </b><br /><br />
	</p>
	</div>
	<input type="hidden" name="flightID" value="<%= fds.getFlightid()%>" />
	<input type="hidden" name="type" value= " <%= fds.getTypeofClass() %>" />
	<input type="hidden" name="passCount" value= " <%= fds.getPassCount() %>" />
	<input type="hidden" name="jDate" value= " <%= fds.getJourneyDate() %>" />
	<hr /> <br /><br />
	<h3 align= "center" style="color:#0094FF;"> Fill in the personal details to book your ticket</h3> <br /><br />
	<div style="width: 800px; margin: 0 auto;">
	First Name : 
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="firstname" type="text" class="textstyle1" /> <br /> <br />
	Last Name  :
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="lastname" type="text" class="textstyle1" />   <br /> <br />
	Email ID     :
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="email" type="text" class="textstyle1" /> <br /><br />
	Gender   :
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="sex" value="male" checked>Male &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="radio" name="sex" value="female">Female
    <br /><br />
	Nationality : 
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="nationality" type="text" class="textstyle1" /> <br /> <br />
	Mobile Number: 
	<input name="phonenumber" type="text" class="textstyle1" /> <br /> <br />
	Passport : 
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="passport" type="text" class="textstyle1" /> <br /> <br />
	Address : 
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="address" type="text" class="textstyle1" /> <br /> <br />
	</div>
	<hr /> <br /><br />
	
	<% String name= session.getAttribute("userid").toString(); %>
	<input name="userid" type="hidden" value = "<%= name  %>" />
	
	<% int x=fds.getPassCount();  %>
	<% long y=fds.getFare(); %>
	<h3 align= "center" style="color:#0094FF;"> Payment Details </h3><br />
	<div align="right" style="color:red;"><b>&nbsp;&nbsp;&nbsp;&nbsp;Payment due : <%= x*y %> </b><br /><br /></div>
	<div align="center">
	
	<table class="productTable" border="1">
	<tr>
	<td> Card Number :  </td>
	<td> <input name="carnum" type="text" class="textstyle1" /></td>
	<td> &nbsp;&nbsp;&nbsp;<select name="cards" class="textstyle2">
		<option value="visa" selected>Visa</option>
		<option value="Master">Master</option>
		</select>
	</td>
	<tr>
	<td align="left" > <br />Expiration Date : </td>
	<td align="left" > <select name="Month" class="textstyle2">
		<option value="one" selected>Jan</option>
		<option value="two">Feb</option>
		<option value="three" >Mar</option>
		<option value="Four">Apr</option>
		<option value="Five" >May</option>
		<option value="Six">Jun</option>
		<option value="Seven" >Jul</option>
		<option value="Eight">Aug</option>
		<option value="Nine" >Sep</option>
		<option value="Tem">Oct</option>
		<option value="Eleven" >Nov</option>
		<option value="Twelve">Dec</option>
		</select> 
		&nbsp;&nbsp;&nbsp;
		<select name="Year" class="textstyle2">
		<option value="one" selected>2015</option>
		<option value="two">2016</option>
		<option value="three" >2017</option>
		<option value="Four">2018</option>
		<option value="Five" >2019</option>
		</select> 
	</td>
	</tr>
	
	<tr>
	<td> <br />Security : </td>
	<td> <input name="cvv" type="text" class="textstyle1"/> </td>
	</tr>
	</table>
	</div>

	</div>
    
    <div class="footer12">
   	<input name="submit" value="Book Ticket" type="submit" class="button"/> 
    </div>

    
</form>
</div> 

  <br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br />
   <br /> <br /> <br /><br /><br /><br /> <br /> <br /><br /><br /><br /> <br /> <br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br />
   <br /> <br /> <br /><br /><br /><br /> <br /> <br /><br /><br /><br /> <br /> <br /><br /><br /><br /> <br /> <br /><br /><br />
   <hr />

   <%@include file="footer.jsp" %>
   
</body>
</html>