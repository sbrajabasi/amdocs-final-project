<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page isELIgnored="false" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update contact</title>
</head>
<body>

         <h2 align = "center">Update Contact</h2>
	<hr>
	
	<br><br>
	
	<div align = "center">
	<c:url var="updateUrl" value="/update_contact"></c:url>
	<form:form action="${updateUrl }" method="post" modelAttribute="model">
        <pre>
        Contact Id    : <form:input path="contactId" /><br>
        User Id       : <form:input path="userId"/><br>
        Name          : <form:input path="name" /><br>
        Email         : <form:input path="email" /><br>
        Phone         : <form:input path="phoneNo" /><br>
        Message       : <form:input path="message" /><br><br>
                    <input type="submit" value="update contact" /><br> 
                    <input type="reset" value="Reset" />
        </pre>
	</form:form>
	</div>

</body>
</html>