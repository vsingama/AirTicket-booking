<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.air.domain.TicketDetails, java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Booking Details</title>

<%@include file="header.jsp" %>

<div id="abc">

<form name="login-form" class="login-form12" action="flightdetails.jsp" method="post">

    <div class="header12">
   <h2 style="color:#0094FF;" align="center">Your Ticket Details </h2>
    </div>

<% TicketDetails tds = (TicketDetails)request.getAttribute("display"); %>
	
<p align="center">Hello, <b style="color:green;"><%= tds.getRegister().getFirstname().toUpperCase() %> <%= tds.getRegister().getLastname().toUpperCase() %></b>..! </p>
<br />
	<div align="center"> 
	<input type="text" class="textstyle" value="  Your Booking ref ID : <%= tds.getBookingDetails().getConfirmationID() %>" />
	</div>
    <br /><br />
  <div style="width: 900px; margin: 0 auto;">
  
  <p style="color:#0094FF;">Ticket  &nbsp;&nbsp; <b><%= tds.getFlightDetails().getCarrier() %>  &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
  &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;Journey Date : <%= tds.getBookingDetails().getDate() %></b></p>
  <hr /><br />
  <table>
  <tr>
  <td>
  <img src="<%= tds.getFlightDetails().getImage() %>" alt="pic not found" width="100" height="50"/>
  </td>
  <td>
  <b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Flight Number : <%= tds.getFlightDetails().getFlightid() %> </b>
  </td>
  <td>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b> <%= tds.getFlightDetails().getStarting() %>  </b>
  </td>
  <td>
  &nbsp;&nbsp;&nbsp;&nbsp; <img src="./images/icon.jpg" alt="pic not found" width="40" height="20"/>
  </td>
  <td>
  &nbsp;&nbsp;&nbsp;&nbsp;<b> <%= tds.getFlightDetails().getDestination() %>  </b>
  </td>
   <td>
   <b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Departure : <%= tds.getFlightDetails().getTimeofdeparture() %> </b>
   </td>
   <td>
   <b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Arrival : <%= tds.getFlightDetails().getDestinationTime() %> </b>
   </td>
   </tr>
   </table>
   <br />
   <br />
    <p style="color:#0094FF;"><b>Number of Passengers : <%= tds.getBookingDetails().getPasscount() %></b> </p> <br /><br />
   <p style="color:#0094FF;"><b>Passengers :</b> </p> <br />
   <p style="text-transform: uppercase;"><b> 1. &nbsp;&nbsp;&nbsp; <%= tds.getRegister().getFirstname() %>&nbsp; <%= tds.getRegister().getLastname() %> </b> 
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; (Adult)   </p> <br /><br />
   <hr /><br />
   <p style="text-align:right;color:#0094FF;"> <b>Total Price : $ <%= tds.getFlightDetails().getFare() %> </b> </p>
  	<br />
   <hr /><br /><br />
	<b><p style="color:#0094FF;">Please Note:</p><br />
 	<div style="width: 800px; margin: 0 auto;">
 		<p> 1. You can use the confirmation ID at airline counters at the airport or airline offices of your city. </p>
 		<p> 2. We will courier you the physical ticket at the address given by you for shipment.</p>
 		<p> 3. In case if the ticket doesn't reach on time, please contact us immediately. </p>
 		<p> 4. you can contact us contactus@bookmyticket.com for any information.</p>
 	</div>
 	<br /><br />
 <p style="color:#0094FF;">Wish you a happy journey  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="text" name="submit" value="Book Another Ticket" type="submit" class="book" onClick="flightdetails.jsp"/>
 <br /><br /><br /><br />
 </b>
 </div>
  </form>
  
</div> 
<br /> <br /><br /><br /> <br /><br /> <br /> <br /><br /> <br /> <br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /> <br /> <br /><br /> <br /> <br /><br /> <br /> <br />
<br /> <br /><br /><br /> <br /><br /> <br /><br /> <br /><br />
<%@include file="footer.jsp" %>

</body>
</html>