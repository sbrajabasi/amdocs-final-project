<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
        <%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>get contacts</title>
</head>
<body>
     
              <h2 align = center>Contacts List</h2>
    <hr>
    <br><br>
    
    <div align= center>
    <table border="1">
		<tr>
			<th>Contact ID</th>
			<th>User Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Phone</th>
			
			<th>Message</th>
		</tr>

		<c:forEach var="model" items="${list }">
			<tr>
				<td>${model.contactId }</td>
				<td>${model.userId }</td>
				<td>${model.name }</td>
				<td>${model.email }</td>
				<td>${model.phoneNo }</td>
				<td>${model.message }</td>
				<td><a href="<c:url value='/delete_contact/${model.contactId }'/>">Delete</a>
					| <a href="<c:url value='/update_contact/${model.contactId}'/>">Update</a></td>
			</tr>
		</c:forEach>
	</table>
	
	<br>
	<br>

    <a href="contact_page">back</a><br>
    <a href="index">home-page</a>
	</div>
</body>
</html>