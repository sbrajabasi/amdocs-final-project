<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update course</title>
</head>
<body>
     <h2 align = "center">Update Course</h2>
	<hr>
	
	<br><br>
	
	<div align = "center">
	<c:url var="updateUrl" value="/update_course"></c:url>
	<form:form action="${updateUrl }" method="post" modelAttribute="model">
            <pre>
        Id         : <form:input path="id" /><br>
        Name       : <form:input path="name"/><br>
        Desp       : <form:input path="desp" /><br>
        Fees       : <form:input path="fees" /><br>
        Resource   : <form:input path="resource" /><br><br>
                    <input type="submit" value="update course" /><br> 
                    <input type="reset" value="Reset" />
        </pre>
	</form:form>
	</div>
      
      
</body>
</html>