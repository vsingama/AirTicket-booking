<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Login</title>

<%@include file="header.jsp" %>
 
 <div id="abc">

<form name="login-form" class="login-form12" action="CreateLogin" method="post">

    <div class="header12">
    <h1 style="color:#0094FF;" align="center">Password Details</h1>
    </div>
	<div align="center">
    <div class="content12">
<% String str= request.getParameter("userid"); %>
<% long userid = Integer.parseInt(str); %>
	Password   :
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="password" type="password" class="textstyle1"   /> <br /> <br />
	Confirm Pass :
    &nbsp;&nbsp;<input name="cpassword" type="password" class="textstyle1" /> <br /><br />
	</div>
	<input type="hidden" name="custid" value="<%= userid %>" />
	</div>

<div class="footer12">
  <input type="submit" name="submit" value="Create Login" class="button" />
    </div>
</form>
</div> 
 <br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /> <br /> <br /><br /> <br /> <br /><br /> <br /> <br />
   <br />
   <hr />
   
   <%@include file="footer.jsp" %>
   
</body>
</html>