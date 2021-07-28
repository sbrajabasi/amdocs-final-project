<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update feedback</title>
</head>
<body>
             <h2 align = "center">Update Feedback</h2>
	<hr>
	
	<br><br>
	
	<div align = "center">
	<c:url var="updateUrl" value="/update_feedback"></c:url>
	<form:form action="${updateUrl }" method="post" modelAttribute="model">
        <pre>
        Feedback Id   : <form:input path="feedbackId" /><br>
        User Id       : <form:input path="userId"/><br>
        Name          : <form:input path="name" /><br>
        Email         : <form:input path="email" /><br>
        Feedback      : <form:input path="feedback" /><br><br>
                        <input type="submit" value="update feedback" /><br> 
                       <input type="reset" value="Reset" />
        </pre>
	</form:form>
	</div>
</body>
</html>