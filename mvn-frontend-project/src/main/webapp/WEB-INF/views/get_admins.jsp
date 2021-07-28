<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>view Admins</title>
</head>
<body>

    <h2 align = center>Admins List</h2>
    <hr>
    <br><br>
    <div align= center>
    <table border="1">
		<tr>
			<th>ID</th>
			<th>Username</th>
			<th>Email</th>
			<th>Actions</th>
		</tr>

		<c:forEach var="admin" items="${list }">
			<tr>
				<td>${admin.id }</td>
				<td>${admin.username }</td>
				<td>${admin.email }</td>
				<td><a href="<c:url value='/delete_admin/${admin.id }'/>">Delete</a>
					| <a href="<c:url value='/update_admin/${admin.id }'/>">Update</a></td>
			</tr>
		</c:forEach>
	</table>
	
	<br>
	<br>

    <a href="admin_page">back</a><br>
    <a href="index">home-page</a>
	</div>
	
</body>
</html>