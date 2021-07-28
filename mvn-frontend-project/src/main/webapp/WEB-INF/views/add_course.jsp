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
<title>add course</title>
</head>
<body>
     <h2 align = center>Course Registration</h2>
	<hr>
	
	<br><br>
	
	<div align =center>
	<form:form action="course_register" method="POST" modelAttribute="model">
		
		<pre>
        Id         : <form:input path="id" /><br>
        Name       : <form:input path="name"/><br>
        Desp       : <form:input path="desp" /><br>
        Fees       : <form:input path="fees" /><br>
        Resource   : <form:input path="resource" /><br><br>
                    <input type="submit" value="Register" /><br> 
                    <input type="reset" value="Reset" />
        </pre>
	</form:form>
	
	</div>

</body>
</html>