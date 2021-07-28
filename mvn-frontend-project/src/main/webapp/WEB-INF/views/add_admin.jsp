<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add admin</title>

</head>
<body>
     
     
    <h2 align = center>Admin Registration</h2>
	<hr>
	
	<br><br>
	
	<div align =center>
	<form:form action="admin_register" method="POST" modelAttribute="admin">
		
		<pre>
        Id        : <form:input path="id" /><br>
        Username  : <form:input path="username"/><br>
        Password  : <form:password path="password" /><br>
        Email     : <form:input path="email" /><br><br>
                    <input type="submit" value="Register" /><br> 
                    <input type="reset" value="Reset" />
        </pre>
	</form:form>
	
	</div>
	
</body>
</html>