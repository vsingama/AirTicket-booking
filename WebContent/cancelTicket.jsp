<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="com.air.domain.TicketDetails, java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cancel Ticket</title>

<%@include file="header.jsp" %>
 
 <div id="abc">

<form name="login-form" class="login-form12" action="" method="post">

    <div class="header12">
    <h1 style="color:#0094FF;" align="center"> Your Booking History </h1>
    </div>
	<div align="center">
    <div class="content12">
    
	<% List<TicketDetails> tickets = (List)request.getAttribute("display"); %>
	
	<table class="productTable" cellspacing="0" rules="all" border="1" style="border-collapse:collapse;">
		<tr>
			<th scope="col">Airlines</th>
			<th scope="col">From </th>
			<th scope="col">To</th>
			<th scope="col">Email ID</th>
			<th scope="col">Confirmation ID</th>
			<th scope="col">Select</th>
		</tr>
		<% if(tickets!=null && tickets.size()>0){
		for(TicketDetails tds:tickets){	
	%>
		<tr>
			<td style="width:200px;" align="center"> <br /><img src="<%= tds.getFlightDetails().getImage()  %>" style="height:80px;width:100px;" /></td>
			<td align="center" style="width:150px;"><%= tds.getFlightDetails().getStarting() %></td>
			<td align="center" style="width:50px;"><%= tds.getFlightDetails().getDestination() %></td>
			<td align="center" style="width:50px;"><%= tds.getBookingDetails().getEmailID() %></td>
			<td align="center" style="width:50px;"><%= tds.getBookingDetails().getConfirmationID() %></td>
			<td align="center">
		<div class="footer123">
			 <a href="RemoveTicket?confirmation=<%= tds.getBookingDetails().getConfirmationID() %>">Cancel</a>
		</div></td>
			
		</tr>
<% }
} %><% else { %>
	<h1 align="center"> No tickets found</h1><br />
<% } %>

</table>
	</div>
	</div>
</form>
</div> 
 <br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /> <br /> <br /><br /> <br /> <br /><br /> <br /> <br /><br /> <br /> <br />
   <br />
   <hr />
   
   <%@include file="footer.jsp" %>
   
</body>
</html>