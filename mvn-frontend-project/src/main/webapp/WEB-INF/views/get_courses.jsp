<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
    
    <%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>get courses</title>
</head>
<body>
         <h2 align = center>Courses List</h2>
    <hr>
    <br><br>
    <div align= center>
    <table border="1">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Desp</th>
			<th>Fees</th>
			<th>Resource</th>
		</tr>

		<c:forEach var="model" items="${list }">
			<tr>
				<td>${model.id }</td>
				<td>${model.name }</td>
				<td>${model.desp }</td>
				<td>${model.fees }</td>
				<td>${model.resource }</td>
				<td><a href="<c:url value='/delete_course/${model.id }'/>">Delete</a>
					| <a href="<c:url value='/update_course/${model.id }'/>">Update</a></td>
			</tr>
		</c:forEach>
	</table>
	
	<br>
	<br>

    <a href="course_page">back</a><br>
    <a href="index">home-page</a>
	</div>

</body>
</html>