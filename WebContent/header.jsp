<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<link rel="shortcut icon" href="./images/favicon.ico" type="image/x-icon" />
    <link href="./css/main.css" rel="stylesheet" type="text/css" />
     <link rel="stylesheet" type="text/css" href="./css/product.css"/>
     <link rel="stylesheet" type="text/css" href="./css/my1.css"/>
	  <link href="./css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div style="width: 1000px; margin: 0 auto;" class="container1">
<br />
 <div id="border"> 
   	<marquee onmouseover="stop();" onmouseout="start();" scrollAmount="30" scrollDelay="350" direction="side" width="100%"  style="margin-top: 0px">
   <a href="./flightdetails.jsp" class="new1">	<b>British Airways Flight 218 Delayed</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Download Mobile App Beta Version for flight tracking
   	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</marquee>
 	</a></div>

	<div id="wrapper">
	<table style="background-color:#3399FF;">
		<td><a href="./index.jsp"><img src="./images/logo.jpg" alt="pic not found" height="80" width="230" /></a></td>
		<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
		<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
		<td>
			<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="./images/cc.jpg" alt="pic not found" height="50" width="60" />
			<text style="font:18px trebuchet ms; color:#2566b2;">(+1) 617-378-1238 <br /></text>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<text style=" text-align:right;font:12px trebuchet ms; color:#2566b2;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;9AM-11PM Mon-Sun</text>
			</p>
		</td>
	
	</table>
	</div>
	<br />
			
	<div id="banner">
	<table id="bar">
	<tr>
		<td>&nbsp;<a href="index.jsp"><img src="./images/home.jpg" alt="pic not found" height="30" width="30" /></a></td>
		<td></td><td></td><td></td><td></td>
		<td></td><td></td><td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
		<td><p><a href="flightdetails.jsp" class="new">Pre Booking</a></p></td>
		<td></td><td></td><td></td><td></td>
		<td></td>
		<td></td><td></td><td></td><td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
		<td><p><a href="myBooking.jsp" class="new">View My Booking</a></p></td>
		<td></td><td></td><td></td><td></td>
		<td></td>
		<td></td><td></td><td></td><td>&nbsp;&nbsp;&nbsp;&nbsp;</td>	
		<td><p><a href="#" class="new">Holiday Deals</a></p></td>
		<td></td><td></td><td></td><td></td>
		<td></td>
		<td>&nbsp;&nbsp;</td>
		<td><p><a href="#" class="new">Hotel Reservations</a></p></td>
		<td></td><td></td><td></td><td>&nbsp;&nbsp;&nbsp;&nbsp; </td>
		<td></td>
		<td><p><a href="#" class="new">Car Booking</a></p></td>
		<td></td><td></td><td></td><td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
		<td><p style="font:18px trebuchet ms; color:#0094FF; Background-color:white;">	
	
	<% if (session.getAttribute("fname") != null){%>
<% String name= session.getAttribute("fname").toString(); %>
<p style="font:18px trebuchet ms; color:#0094FF; Background-color:white;">Welcome,  <%= name %> | <a href="LogoutServlet" class="br">Logout </a></p>
<%}
else{%>
<p style="font:18px trebuchet ms; color:#0094FF; Background-color:white;"><a href="./userlogin.jsp" class="br">&nbsp;&nbsp;Sign In </a> | <a href="./registration.jsp" class="br">Register </a></p>
<%}
%>

</td>
</tr>
	</table>
	</div>
	<br />
   <div id="banner1">
	<table id="bar">
	<tr>
	<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Band of Trust</td>
	<td></td><td></td><td></td><td></td>
	<td></td><td></td><td></td><td></td>
	<td></td>
	<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Best Airliners</td>
	<td></td><td></td><td></td><td></td>
	<td></td><td></td><td></td><td></td>
	<td></td>
	<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Best Prices</td>
	<td></td><td></td><td></td><td></td>
	<td></td>
	<td></td><td></td><td></td><td></td>
	<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Best Service</td>
	<td></td><td></td><td></td><td></td>
	<td></td>
	<td></td><td></td><td></td><td></td>
	<td></td><td></td><td></td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
	<td><p style="font:18px trebuchet ms; color:White; Background-color:#CC6600;">Mobile App Offers </p></td>
	<td></td><td></td><td></td><td></td>
	<td></td><td></td><td></td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
	<td>
		<td><p style="font:18px trebuchet ms; color:#0094FF; Background-color:white;">	
	
	<% if (session.getAttribute("fname") != null){%>
<% String name= session.getAttribute("fname").toString(); %>
<p style="font:18px trebuchet ms; color:#0094FF; Background-color:white;"> <a href="myAccount.jsp" class="br"> My Account  </a></p>
<%}
else{%>

<%}
%>

</td>
	</td>
	<td></td><td></td><td></td><td></td>
	</tr>
    </div>
	</table>
     <br/>
</body>
</html>