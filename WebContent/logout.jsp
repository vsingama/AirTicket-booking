<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logout</title>
<%@include file="header.jsp" %>

<div id="abc">

<%session.invalidate(); %>

	<form name="login-form" class="login-form12" action="LoginServlet" method="post">

    <div class="header12">
    <h1 align="center">You have logged out...!! <br /> 
    
    Click <a href="userlogin.jsp"><b>here</b></a> to login again.
    </h1>
    </div>

</form>
</div> 
   <br /> <br /> <br /><br /><br /> <br /><br /><br /> <br /><br />
   <hr />

<%@include file="footer.jsp" %>


</body>
</html>