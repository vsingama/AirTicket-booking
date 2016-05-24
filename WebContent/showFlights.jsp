<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="com.air.domain.FlightDetails, java.util.*" %>
<%@ page import="java.text.SimpleDateFormat" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Flight Details</title>

<%@include file="header.jsp" %>

 <div id="abc">
 
	<form name="login-form" class="login-form12" action="FlightSearch" method="get">

    <div class="header12">
    <table class="center">
    <tr>
    <td align="right">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <img src="./images/flight.jpg" alt= "pic not found" width="100" height="50"></td>
    <td><h1 style="color:#0094FF;" align="left">&nbsp;Details</h1></td>
    </tr>
    </table>
    </div>
	
	<% List<FlightDetails> studs = (List)request.getAttribute("flights"); %>

	
	<table class="productTable" cellspacing="0" rules="all" border="1" style="border-collapse:collapse;">
		<tr>
			<th scope="col">Airlines</th>
			<th scope="col">From</th>
			<th scope="col">To</th>
			<th scope="col">Available Seats</th>
			<th scope="col">Class</th>
			<th scope="col">Departure Time</th>
			<th scope="col">Arrival Time</th>
			<th scope="col">Price</th>
			<th scope="col">Stops</th>
			<th scope="col">Journey Date</th>
			<th scope="col">Adults</th>
			<th scope="col">Select</th>
		</tr>
		<% if(studs!=null && studs.size()>0){
		for(FlightDetails fd:studs){	
	%>
		<tr>
			<td style="width:200px;" align="center"> <br /><img src="<%= fd.getImage()  %>" style="height:80px;width:100px;" /></td>
			<td align="center" style="width:150px;"><%= fd.getStarting() %></td>
			<td align="center" style="width:50px;"><%= fd.getDestination() %></td>
			<td align="center" style="width:50px;"><%= fd.getSeatscount() %></td>
			<td align="center" style="width:50px;"><%= fd.getTypeofClass() %></td>
			<td align="center" style="width:150px;"><%= fd.getTimeofdeparture() %></td>
			<td align="center" style="width:150px;"><%= fd.getDestinationTime() %></td>
			<td align="center" style="width:50px;">$<%= fd.getFare() %></td>
			<td align="center" style="width:100px;"><%= fd.getStops()  %></td>
			<td align="center" style="width:100px;"><%= fd.getJourneyDate() %></td>
			<td align="center" style="width:100px;"><%= fd.getPassCount()  %></td>
			<td align="center">
		<div class="footer123">
			 <a href="FlightSearch?flightID=<%= fd.getFlightid()  %>&seatCount=<%= fd.getPassCount() %>&date=<%= fd.getJourneyDate() %>&type=<%= fd.getTypeofClass() %> ">Book</a>
		</div></td>
			
		</tr>
<% }
} %>
</table> 
<br />
</form>
</div> 

   <br /><br /> <br /> <br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br />
   <br /> <br /> <br /><br /><br /><br /> <br /> <br /><br /><br />
   <hr />

<%@include file="footer.jsp" %>


</body>
</html>