<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<style>
	table td{
		font-family:verdana;
		font-size:12px;
	}
</style>
</head>
<body>
<font face="verdana" size="2">Welcome<b>${lfobj.user}</b>,<br>
Validation Success..!<br><br>
<u>You Entered</u><br>
</font>

<table>
	<tr><td>Email</td><td>${lfobj.email}</td></tr>
	<tr><td>Phone</td><td>${lfobj.phone}</td></tr>
	

</table>
</body>
</html>