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
<title>add feedback</title>
</head>
<body>
     <h2 align = center>Feedback Form</h2>
	<hr>
	
	<br><br>
	
	<div align =center>
	<form:form action="feedback_register" method="POST" modelAttribute="model">
		
		<pre>
        Feedback Id   : <form:input path="feedbackId" /><br>
        User Id       : <form:input path="userId"/><br>
        Name          : <form:input path="name" /><br>
        Email         : <form:input path="email" /><br>
        Feedback      : <form:input path="feedback" /><br><br>
                    <input type="submit" value="Register" /><br> 
                    <input type="reset" value="Reset" />
        </pre>
	</form:form>
	
	</div>
</body>
</html>